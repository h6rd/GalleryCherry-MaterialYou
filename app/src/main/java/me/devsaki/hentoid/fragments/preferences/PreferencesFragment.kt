package me.devsaki.hentoid.fragments.preferences

import android.content.SharedPreferences
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.webkit.CookieManager
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.preference.EditTextPreference
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.PreferenceScreen
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.devsaki.hentoid.R
import me.devsaki.hentoid.activities.DrawerEditActivity
import me.devsaki.hentoid.activities.PinPreferenceActivity
import me.devsaki.hentoid.activities.StoragePreferenceActivity
import me.devsaki.hentoid.core.startLocalActivity
import me.devsaki.hentoid.core.withArguments
import me.devsaki.hentoid.retrofit.GithubServer
import me.devsaki.hentoid.retrofit.sources.LusciousServer
import me.devsaki.hentoid.services.UpdateCheckService
import me.devsaki.hentoid.util.Preferences
import me.devsaki.hentoid.util.ThemeHelper
import me.devsaki.hentoid.util.ToastHelper
import me.devsaki.hentoid.util.download.DownloadSpeedLimiter
import me.devsaki.hentoid.util.download.RequestQueueManager
import me.devsaki.hentoid.util.file.FileHelper
import me.devsaki.hentoid.util.network.WebkitPackageHelper
import me.devsaki.hentoid.viewmodels.PreferencesViewModel
import me.devsaki.hentoid.viewmodels.ViewModelFactory
import me.devsaki.hentoid.workers.UpdateDownloadWorker
import kotlin.properties.Delegates


class PreferencesFragment : PreferenceFragmentCompat(),
    SharedPreferences.OnSharedPreferenceChangeListener {

    lateinit var viewModel: PreferencesViewModel

    companion object {
        private const val KEY_ROOT = "root"

        fun newInstance(rootKey: String?): PreferencesFragment {
            val fragment = PreferencesFragment()
            if (rootKey != null) {
                val args = Bundle()
                args.putCharSequence(KEY_ROOT, rootKey)
                fragment.arguments = args
            }
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val arguments = arguments
        if (arguments != null && arguments.containsKey(KEY_ROOT)) {
            val root = arguments.getCharSequence(KEY_ROOT)
            if (root != null) preferenceScreen = findPreference(root)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val vmFactory = ViewModelFactory(requireActivity().application)
        viewModel =
            ViewModelProvider(requireActivity(), vmFactory)[PreferencesViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        preferenceScreen.sharedPreferences?.registerOnSharedPreferenceChangeListener(this)
    }

    override fun onDestroy() {
        preferenceScreen.sharedPreferences?.unregisterOnSharedPreferenceChangeListener(this)
        super.onDestroy()
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey)
        onExternalFolderChanged()

        // Numbers-only on delay input
        val editTextPreference =
            preferenceManager.findPreference<EditTextPreference>(Preferences.Key.DL_HTTP_429_DEFAULT_DELAY)
        editTextPreference?.setOnBindEditTextListener { editText ->
            editText.inputType = InputType.TYPE_CLASS_NUMBER
        }
    }

    override fun onSharedPreferenceChanged(sharedPreferences: SharedPreferences, key: String) {
        when (key) {
            Preferences.Key.COLOR_THEME -> onPrefColorThemeChanged()
            Preferences.Key.DL_THREADS_QUANTITY_LISTS,
            Preferences.Key.APP_PREVIEW,
            Preferences.Key.FORCE_ENGLISH,
            Preferences.Key.ANALYTICS_PREFERENCE -> onPrefRequiringRestartChanged()

            Preferences.Key.EXTERNAL_LIBRARY_URI -> onExternalFolderChanged()
            Preferences.Key.BROWSER_DNS_OVER_HTTPS -> onDoHChanged()
        }
    }

    override fun onPreferenceTreeClick(preference: Preference): Boolean =
        when (preference.key) {
            Preferences.Key.DRAWER_SOURCES -> {
                requireContext().startLocalActivity<DrawerEditActivity>()
                true
            }

            Preferences.Key.STORAGE_MANAGEMENT -> {
                requireContext().startLocalActivity<StoragePreferenceActivity>()
                true
            }

            Preferences.Key.VIEWER_RENDERING -> {
                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M)
                    ToastHelper.toast(R.string.pref_viewer_rendering_no_android5)
                true
            }

            Preferences.Key.APP_LOCK -> {
                requireContext().startLocalActivity<PinPreferenceActivity>()
                true
            }

            Preferences.Key.CHECK_UPDATE_MANUAL -> {
                onCheckUpdatePrefClick()
                true
            }

            Preferences.Key.DL_SPEED_CAP -> {
                DownloadSpeedLimiter.setSpeedLimitKbps(Preferences.getDlSpeedCap())
                true
            }

            Preferences.Key.BROWSER_CLEAR_COOKIES -> {
                onClearCookies()
                true
            }

            else -> super.onPreferenceTreeClick(preference)
        }

    override fun onNavigateToScreen(preferenceScreen: PreferenceScreen) {
        val preferenceFragment = PreferencesFragment().withArguments {
            putString(ARG_PREFERENCE_ROOT, preferenceScreen.key)
        }

        parentFragmentManager.commit(true) {
            replace(android.R.id.content, preferenceFragment)
            addToBackStack(null) // This triggers a memory leak in LeakCanary but is _not_ a leak : see https://stackoverflow.com/questions/27913009/memory-leak-in-fragmentmanager
        }
    }

    private fun onCheckUpdatePrefClick() {
        if (!UpdateDownloadWorker.isRunning(requireContext())) {
            val intent = UpdateCheckService.makeIntent(requireContext(), true)
            requireContext().startService(intent)
        }
    }

    private fun onPrefRequiringRestartChanged() {
        ToastHelper.toast(R.string.restart_needed)
    }

    private fun onExternalFolderChanged() {
        val storageFolderPref: Preference? =
            findPreference(Preferences.Key.EXTERNAL_LIBRARY) as Preference?
        val uri = Uri.parse(Preferences.getExternalLibraryUri())
        storageFolderPref?.summary = FileHelper.getFullPathFromTreeUri(requireContext(), uri)
        // Enable/disable sub-prefs
        val deleteExternalLibrary: Preference? =
            findPreference(Preferences.Key.EXTERNAL_LIBRARY_DELETE) as Preference?
        deleteExternalLibrary?.isEnabled = (uri.toString().isNotEmpty())
        val detachExternalLibrary: Preference? =
            findPreference(Preferences.Key.EXTERNAL_LIBRARY_DETACH) as Preference?
        detachExternalLibrary?.isEnabled = (uri.toString().isNotEmpty())
    }

    private fun onPrefColorThemeChanged() {
        ThemeHelper.applyTheme(requireActivity() as AppCompatActivity)
    }

    private fun onDoHChanged() {
        if (Preferences.getDnsOverHttps() > -1 && listView != null) {
            val snack = Snackbar.make(
                listView,
                R.string.doh_warning,
                BaseTransientBottomBar.LENGTH_INDEFINITE
            )
            snack.view.findViewById<TextView>(com.google.android.material.R.id.snackbar_text).maxLines =
                5
            snack.setAction(R.string.ok) { snack.dismiss() }
            snack.show()
        }
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                // Reset connection pool used by the downloader (includes an OkHttp instance reset)
                RequestQueueManager.getInstance()?.resetRequestQueue(true)
                // Reset all retrofit clients
                GithubServer.init()
                LusciousServer.init()
            }
        }
    }

    private fun onClearCookies() {
        fun showSnackBar(caption: Int) {
            val snack = Snackbar.make(
                listView,
                caption,
                BaseTransientBottomBar.LENGTH_SHORT
            )
            snack.show()
        }

        var caption by Delegates.notNull<Int>()

        if (!WebkitPackageHelper.getWebViewAvailable()) {
            caption = R.string.pref_browser_clear_cookies_missing_webview
            showSnackBar(caption)
            return
        } else if (WebkitPackageHelper.getWebViewUpdating()) {
            caption = R.string.pref_browser_clear_cookies_updating_webview
            showSnackBar(caption)
            return
        } else {
            CookieManager.getInstance().removeAllCookies {
                caption = R.string.pref_browser_clear_cookies_ok
                if (!it) caption = R.string.pref_browser_clear_cookies_ko
                showSnackBar(caption)
            }
        }
    }
}