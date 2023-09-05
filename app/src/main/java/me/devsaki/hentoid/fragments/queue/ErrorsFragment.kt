package me.devsaki.hentoid.fragments.queue

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.activity.addCallback
import androidx.appcompat.widget.SearchView
import androidx.core.view.inputmethod.EditorInfoCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.IAdapter
import com.mikepenz.fastadapter.ISelectionListener
import com.mikepenz.fastadapter.adapters.ItemAdapter
import com.mikepenz.fastadapter.diff.FastAdapterDiffUtil.set
import com.mikepenz.fastadapter.drag.ItemTouchCallback
import com.mikepenz.fastadapter.listeners.ClickEventHook
import com.mikepenz.fastadapter.select.getSelectExtension
import com.mikepenz.fastadapter.swipe.SimpleSwipeDrawerCallback
import io.reactivex.disposables.CompositeDisposable
import me.devsaki.hentoid.R
import me.devsaki.hentoid.activities.QueueActivity
import me.devsaki.hentoid.database.domains.Content
import me.devsaki.hentoid.databinding.FragmentQueueErrorsBinding
import me.devsaki.hentoid.events.ProcessEvent
import me.devsaki.hentoid.fragments.ProgressDialogFragment
import me.devsaki.hentoid.util.*
import me.devsaki.hentoid.viewholders.ContentItem
import me.devsaki.hentoid.viewholders.ISwipeableViewHolder
import me.devsaki.hentoid.viewmodels.QueueViewModel
import me.devsaki.hentoid.viewmodels.ViewModelFactory
import me.devsaki.hentoid.widget.FastAdapterPreClickSelectHelper
import me.zhanghai.android.fastscroll.FastScrollerBuilder
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import timber.log.Timber
import java.lang.ref.WeakReference
import java.util.*

/**
 * Presents the list of downloads with errors
 */
class ErrorsFragment : Fragment(R.layout.fragment_queue_errors), ItemTouchCallback,
    ErrorsDialogFragment.Parent, SimpleSwipeDrawerCallback.ItemSwipeCallback {

    // == UI
    private var _binding: FragmentQueueErrorsBinding? = null
    private val binding get() = _binding!!

    // === COMMUNICATION
    private var callback: OnBackPressedCallback? = null
    private lateinit var viewModel: QueueViewModel

    // Activity
    private lateinit var activity: WeakReference<QueueActivity>


    // == FASTADAPTER COMPONENTS AND HELPERS
    private val itemAdapter = ItemAdapter<ContentItem>()
    private val fastAdapter = FastAdapter.with(itemAdapter)
    private val selectExtension = fastAdapter.getSelectExtension()

    // Helper for swiping items
    private lateinit var touchHelper: ItemTouchHelper


    // === VARIABLES
    // Used to show a given item at first display
    private var contentHashToDisplayFirst: Long = 0

    // Used to start processing when the recyclerView has finished updating
    private lateinit var listRefreshDebouncer: DebouncerK<Int>

    // Used to avoid closing search panel immediately when user uses backspace to correct what he typed
    private lateinit var searchClearDebouncer: DebouncerK<Int>

    // Indicate if the fragment is currently canceling all items
    private var isDeletingAll = false

    // Current text search query
    private var query = ""

    // Used to ignore native calls to onQueryTextChange
    private var invalidateNextQueryTextChange = false

    private val compositeDisposable = CompositeDisposable()


    override fun onAttach(context: Context) {
        super.onAttach(context)
        check(requireActivity() is QueueActivity) { "Parent activity has to be a QueueActivity" }
        activity = WeakReference(requireActivity() as QueueActivity)

        listRefreshDebouncer = DebouncerK(lifecycleScope, 75)
        { topItemPosition: Int -> this.onRecyclerUpdated(topItemPosition) }

        searchClearDebouncer = DebouncerK(lifecycleScope, 1500)
        {
            query = ""
            viewModel.searchErrorContentUniversal(query)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (!EventBus.getDefault().isRegistered(this)) EventBus.getDefault().register(this)
    }

    override fun onResume() {
        super.onResume()
        selectExtension.apply {
            deselect(selections.toMutableSet())
        }
        initSelectionToolbar()
    }

    override fun onDestroy() {
        if (EventBus.getDefault().isRegistered(this)) EventBus.getDefault().unregister(this)
        compositeDisposable.clear()
        super.onDestroy()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentQueueErrorsBinding.inflate(inflater, container, false)

        val initItem = ContentItem(ContentItem.ViewType.ERRORS)
        fastAdapter.registerItemFactory(initItem.type, initItem)

        selectExtension.apply {
            isSelectable = true
            multiSelect = true
            selectOnLongClick = true
            selectWithItemUpdate = true
            selectionListener = object : ISelectionListener<ContentItem> {
                override fun onSelectionChanged(item: ContentItem, selected: Boolean) {
                    onSelectionChanged2()
                }
            }
        }
        val helper = FastAdapterPreClickSelectHelper(selectExtension)
        fastAdapter.onPreClickListener =
            { v: View?, adapter: IAdapter<ContentItem>?, item: ContentItem, position: Int? ->
                helper.onPreClickListener(
                    v,
                    adapter,
                    item,
                    position
                )
            }
        fastAdapter.onPreLongClickListener =
            { v: View?, adapter: IAdapter<ContentItem>?, item: ContentItem, position: Int? ->
                helper.onPreLongClickListener(
                    v,
                    adapter,
                    item,
                    position
                )
            }

        binding.queueList.adapter = fastAdapter
        binding.queueList.setHasFixedSize(true)

        // Swiping
        val swipeCallback = SimpleSwipeDrawerCallback(ItemTouchHelper.LEFT, this)
            .withSwipeLeft(Helper.dimensAsDp(requireContext(), R.dimen.delete_drawer_width_list))
            .withSensitivity(1.5f)
            .withSurfaceThreshold(0.3f)

        touchHelper = ItemTouchHelper(swipeCallback)
        touchHelper.attachToRecyclerView(binding.queueList)

        // Item click listener
        fastAdapter.onClickListener =
            { _: View?, _: IAdapter<ContentItem>, i: ContentItem, _: Int? -> onItemClick(i) }

        // Fast scroller
        FastScrollerBuilder(binding.queueList).build()

        initToolbar()
        initSelectionToolbar()
        attachButtons(fastAdapter)

        addCustomBackControl()

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val vmFactory = ViewModelFactory(requireActivity().application)
        viewModel = ViewModelProvider(requireActivity(), vmFactory)[QueueViewModel::class.java]
        viewModel.getErrors().observe(viewLifecycleOwner)
        { result: List<Content> -> onErrorsChanged(result) }
        viewModel.getContentHashToShowFirst().observe(viewLifecycleOwner)
        { contentHash: Long -> onContentHashToShowFirstChanged(contentHash) }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        fastAdapter.saveInstanceState(outState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        if (null == savedInstanceState) return
        fastAdapter.withSavedInstanceState(savedInstanceState)
    }

    private fun addCustomBackControl() {
        callback?.remove()
        val localCallback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                customBackPress()
            }
        }
        activity.get()?.onBackPressedDispatcher?.addCallback(viewLifecycleOwner, localCallback)
        callback = localCallback
    }

    private fun customBackPress() {
        // If content is selected, deselect it
        if (selectExtension.selections.isNotEmpty()) {
            selectExtension.deselect(selectExtension.selections.toMutableSet())
            updateSelectionToolbarVis(false)
        } else {
            callback?.remove()
            activity.get()?.let { act ->
                act.onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
                    act.finish()
                }
            }
        }
    }

    private fun initToolbar() {
        activity.get()?.getToolbar()?.let {
            val searchMenu = it.menu.findItem(R.id.action_search)
            val mainSearchView = searchMenu?.actionView as SearchView?
            mainSearchView?.findViewById<View>(androidx.appcompat.R.id.search_close_btn)
                ?.setOnClickListener {
                    invalidateNextQueryTextChange = true
                    mainSearchView.setQuery("", false)
                    mainSearchView.isIconified = true
                    viewModel.searchErrorContentUniversal("")
                }
            searchMenu?.setOnActionExpandListener(
                object : MenuItem.OnActionExpandListener {
                    override fun onMenuItemActionExpand(item: MenuItem): Boolean {
                        invalidateNextQueryTextChange = true

                        // Re-sets the query on screen, since default behaviour removes it right after collapse _and_ expand
                        if (query.isNotEmpty()) // Use of handler allows to set the value _after_ the UI has auto-cleared it
                        // Without that handler the view displays with an empty value
                            Handler(Looper.getMainLooper()).postDelayed({
                                invalidateNextQueryTextChange = true
                                mainSearchView?.setQuery(query, false)
                            }, 100)
                        return true
                    }

                    override fun onMenuItemActionCollapse(item: MenuItem): Boolean {
                        invalidateNextQueryTextChange = true
                        return true
                    }
                })

            mainSearchView?.imeOptions = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING
            mainSearchView?.setIconifiedByDefault(true)
            mainSearchView?.queryHint = getString(R.string.library_search_hint)
            // Change display when text query is typed
            mainSearchView?.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
                override fun onQueryTextSubmit(s: String): Boolean {
                    query = s.trim()
                    viewModel.searchErrorContentUniversal(query)
                    mainSearchView.clearFocus()
                    return true
                }

                override fun onQueryTextChange(s: String): Boolean {
                    if (invalidateNextQueryTextChange) { // Should not happen when search panel is closing or opening
                        invalidateNextQueryTextChange = false
                    } else if (s.isEmpty()) {
                        searchClearDebouncer.submit(0)
                    } else searchClearDebouncer.clear();
                    return true
                }
            })
            it.menu.findItem(R.id.action_redownload_all).setOnMenuItemClickListener {
                onRedownloadAllClick()
                true
            }
            it.menu.findItem(R.id.action_cancel_all_errors).setOnMenuItemClickListener {
                onCancelAllClick()
                true
            }
            it.menu.findItem(R.id.action_invert_queue).setOnMenuItemClickListener {
                viewModel.invertQueue()
                true
            }
        }
    }

    private fun initSelectionToolbar() {
        activity.get()?.getSelectionToolbar()?.let {
            it.setNavigationOnClickListener { _ ->
                selectExtension.apply {
                    deselect(selections.toMutableSet())
                }
                it.visibility = View.GONE
            }
            it.setOnMenuItemClickListener { menuItem: MenuItem ->
                onSelectionMenuItemClicked(menuItem)
            }
        }
    }

    @SuppressLint("NonConstantResourceId")
    private fun onSelectionMenuItemClicked(menuItem: MenuItem): Boolean {
        var keepToolbar = false
        when (menuItem.itemId) {
            R.id.action_queue_delete -> {
                val selectedItems: Set<ContentItem> = selectExtension.selectedItems
                if (selectedItems.isNotEmpty()) {
                    val selectedContent = selectedItems.mapNotNull { ci -> ci.content }
                    askDeleteSelected(selectedContent)
                }
            }

            R.id.action_download -> redownloadSelected()
            R.id.action_download_scratch -> {
                askRedownloadSelectedScratch()
                keepToolbar = true
            }

            R.id.action_select_all -> {
                // Make certain _everything_ is properly selected (selectExtension.select() as doesn't get everything the 1st time it's called)
                var count = 0
                selectExtension.apply {
                    while (selections.size < itemAdapter.adapterItemCount && ++count < 5)
                        select(IntRange(0, itemAdapter.adapterItemCount - 1))
                }
                keepToolbar = true
            }

            else -> {
                activity.get()?.getSelectionToolbar()?.visibility = View.GONE
                return false
            }
        }
        if (!keepToolbar) activity.get()?.getSelectionToolbar()?.visibility = View.GONE
        return true
    }

    private fun updateSelectionToolbar(selectedCount: Long) {
        activity.get()?.getSelectionToolbar()?.title = resources.getQuantityString(
            R.plurals.items_selected,
            selectedCount.toInt(),
            selectedCount.toInt()
        )
    }

    private fun updateSelectionToolbarVis(vis: Boolean) {
        activity.get()?.getSelectionToolbar()?.visibility = if (vis) View.VISIBLE else View.GONE
    }

    private fun attachButtons(fastAdapter: FastAdapter<ContentItem>) {
        // Site button
        fastAdapter.addEventHook(object : ClickEventHook<ContentItem>() {
            override fun onClick(
                v: View,
                position: Int,
                fastAdapter: FastAdapter<ContentItem>,
                item: ContentItem
            ) {
                val c = item.content
                if (c != null) ContentHelper.viewContentGalleryPage(v.context, c)
            }

            override fun onBind(viewHolder: RecyclerView.ViewHolder): View? {
                return if (viewHolder is ContentItem.ContentViewHolder) {
                    viewHolder.siteButton
                } else super.onBind(viewHolder)
            }
        })

        // Info button
        fastAdapter.addEventHook(object : ClickEventHook<ContentItem>() {
            override fun onClick(
                v: View,
                position: Int,
                fastAdapter: FastAdapter<ContentItem>,
                item: ContentItem
            ) {
                val c = item.content
                c?.let { showErrorLogDialog(it) }
            }

            override fun onBind(viewHolder: RecyclerView.ViewHolder): View? {
                return if (viewHolder is ContentItem.ContentViewHolder) {
                    viewHolder.errorButton
                } else super.onBind(viewHolder)
            }
        })

        // Redownload button
        fastAdapter.addEventHook(object : ClickEventHook<ContentItem>() {
            override fun onClick(
                v: View,
                position: Int,
                fastAdapter: FastAdapter<ContentItem>,
                item: ContentItem
            ) {
                val c = item.content
                c?.let { redownloadContent(it) }
            }

            override fun onBind(viewHolder: RecyclerView.ViewHolder): View? {
                return if (viewHolder is ContentItem.ContentViewHolder) {
                    viewHolder.downloadButton
                } else super.onBind(viewHolder)
            }
        })
    }

    private fun showErrorLogDialog(content: Content) {
        ErrorsDialogFragment.invoke(this, content.id)
    }

    private fun onErrorsChanged(result: List<Content>) {
        Timber.i(">>Errors changed ! Size=%s", result.size)

        // Don't process changes while everything is being canceled, it usually kills the UI as too many changes are processed at the same time
        if (isDeletingAll && result.isNotEmpty()) return

        // Update list visibility
        binding.errorsEmptyTxt.visibility = if (result.isEmpty()) View.VISIBLE else View.GONE

        // Update displayed books
        val contentItems = result.map { c ->
            ContentItem(c, touchHelper, ContentItem.ViewType.ERRORS)
            { item: ContentItem -> onDeleteSwipedBook(item) }
        }.distinct()
        set(itemAdapter, contentItems)
        Handler(Looper.getMainLooper()).postDelayed({ differEndCallback() }, 150)
    }

    /**
     * Callback for the end of item diff calculations
     * Activated when all _adapter_ items are placed on their definitive position
     */
    private fun differEndCallback() {
        if (contentHashToDisplayFirst != 0L) {
            val targetPos = fastAdapter.getPosition(contentHashToDisplayFirst)
            if (targetPos > -1) listRefreshDebouncer.submit(targetPos)
            contentHashToDisplayFirst = 0
        }
    }

    /**
     * Callback for the end of recycler updates
     * Activated when all _displayed_ items are placed on their definitive position
     */
    private fun onRecyclerUpdated(topItemPosition: Int) {
        (binding.queueList.layoutManager as LinearLayoutManager).scrollToPositionWithOffset(
            topItemPosition,
            0
        ) // Used to restore position after activity has been stopped and recreated
    }

    private fun onContentHashToShowFirstChanged(contentHash: Long) {
        Timber.d(">>onContentIdToShowFirstChanged %s", contentHash)
        contentHashToDisplayFirst = contentHash
    }

    private fun onItemClick(item: ContentItem): Boolean {
        if (selectExtension.selections.isEmpty()) {
            val c = item.content
            if (c != null && !ContentHelper.openReader(
                    requireContext(),
                    c,
                    -1,
                    null,
                    false,
                    false
                )
            ) ToastHelper.toast(R.string.err_no_content)
            return true
        }
        return false
    }

    private fun onDeleteSwipedBook(item: ContentItem) {
        // Deleted book is the last selected books => disable selection mode
        selectExtension.let {
            if (item.isSelected) {
                it.deselect(item)
                if (it.selections.isEmpty()) updateSelectionToolbarVis(false)
            }
        }
        val content = item.content
        if (content != null) viewModel.remove(listOf(content))
    }

    private fun onDeleteBooks(c: List<Content>) {
        if (c.size > 2) {
            isDeletingAll = true
            ProgressDialogFragment.invoke(
                parentFragmentManager,
                resources.getString(R.string.cancel_queue_progress),
                R.plurals.book
            )
        }
        viewModel.remove(c)
    }

    private fun doCancelAll() {
        isDeletingAll = true
        ProgressDialogFragment.invoke(
            parentFragmentManager,
            resources.getString(R.string.cancel_queue_progress),
            R.plurals.book
        )
        viewModel.removeAll()
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    fun onProcessStickyEvent(event: ProcessEvent) {
        // Filter on cancel complete event
        if (R.id.generic_progress != event.processId) return
        if (event.eventType == ProcessEvent.EventType.COMPLETE) onDeleteComplete()
        EventBus.getDefault().removeStickyEvent(event)
    }

    private fun onDeleteComplete() {
        isDeletingAll = false
        viewModel.refresh()
        if (selectExtension.selections.isEmpty())
            updateSelectionToolbarVis(false)
    }

    private fun onRedownloadAllClick() {
        // Don't do anything if the queue is empty
        if (0 == itemAdapter.adapterItemCount) return

        // Just do it if the queue has a single item
        if (1 == itemAdapter.adapterItemCount) redownloadAll() else  // Ask if there's more than 1 item
            MaterialAlertDialogBuilder(
                requireContext(),
                ThemeHelper.getIdForCurrentTheme(requireContext(), R.style.Theme_Light_Dialog)
            )
                .setIcon(R.drawable.ic_warning)
                .setTitle(R.string.app_name)
                .setMessage(
                    resources.getQuantityString(
                        R.plurals.confirm_redownload_all,
                        fastAdapter.itemCount,
                        fastAdapter.itemCount
                    )
                )
                .setPositiveButton(
                    R.string.yes
                ) { dialog1, _ ->
                    dialog1.dismiss()
                    redownloadAll()
                }
                .setNegativeButton(
                    R.string.no
                ) { dialog12, _ -> dialog12.dismiss() }
                .create()
                .show()
    }

    private fun onCancelAllClick() {
        // Don't do anything if the queue is empty
        if (0 == itemAdapter.adapterItemCount) return

        // Just do it if the queue has a single item
        if (1 == itemAdapter.adapterItemCount) doCancelAll() else  // Ask if there's more than 1 item
            MaterialAlertDialogBuilder(
                requireContext(),
                ThemeHelper.getIdForCurrentTheme(requireContext(), R.style.Theme_Light_Dialog)
            )
                .setIcon(R.drawable.ic_warning)
                .setTitle(R.string.app_name)
                .setMessage(
                    resources.getQuantityString(
                        R.plurals.confirm_cancel_all_errors,
                        fastAdapter.itemCount,
                        fastAdapter.itemCount
                    )
                )
                .setPositiveButton(
                    R.string.yes
                ) { dialog1, _ ->
                    dialog1.dismiss()
                    doCancelAll()
                }
                .setNegativeButton(
                    R.string.no
                ) { dialog12, _ -> dialog12.dismiss() }
                .create()
                .show()
    }

    /**
     * DRAG, DROP & SWIPE METHODS
     */
    override fun itemTouchOnMove(oldPosition: Int, newPosition: Int): Boolean {
        // Nothing; error items are not draggable
        return false
    }

    override fun itemTouchDropped(oldPosition: Int, newPosition: Int) {
        // Nothing; error items are not draggable
    }

    override fun itemTouchStopDrag(viewHolder: RecyclerView.ViewHolder) {
        // Nothing; error items are not draggable
    }

    override fun itemSwiped(position: Int, direction: Int) {
        val vh: RecyclerView.ViewHolder? =
            binding.queueList.findViewHolderForAdapterPosition(position)
        if (vh is ISwipeableViewHolder) {
            (vh as ISwipeableViewHolder).onSwiped()
        }
    }

    override fun itemUnswiped(position: Int) {
        val vh: RecyclerView.ViewHolder? =
            binding.queueList.findViewHolderForAdapterPosition(position)
        if (vh is ISwipeableViewHolder) {
            (vh as ISwipeableViewHolder).onUnswiped()
        }
    }

    /**
     * Callback for any selection change (item added to or removed from selection)
     */
    private fun onSelectionChanged2() {
        selectExtension.apply {
            val selectedCount = selections.size
            if (0 == selectedCount) {
                updateSelectionToolbarVis(false)
                selectOnLongClick = true
            } else {
                updateSelectionToolbar(selectedCount.toLong())
                updateSelectionToolbarVis(true)
            }
        }
    }

    private fun askRedownloadSelectedScratch() {
        val selectedItems: Set<ContentItem> = selectExtension.selectedItems
        val contents: MutableList<Content> = ArrayList()
        for (ci in selectedItems) {
            val c = ci.content ?: continue
            contents.add(c)
        }
        val message = resources.getQuantityString(R.plurals.redownload_confirm, contents.size)
        MaterialAlertDialogBuilder(
            requireContext(),
            ThemeHelper.getIdForCurrentTheme(requireContext(), R.style.Theme_Light_Dialog)
        )
            .setIcon(R.drawable.ic_warning)
            .setCancelable(false)
            .setTitle(R.string.app_name)
            .setMessage(message)
            .setPositiveButton(
                R.string.yes
            ) { dialog1, _ ->
                dialog1.dismiss()
                activity.get()?.redownloadContent(
                    contents,
                    reparseContent = true,
                    reparseImages = true
                )
                selectExtension.apply {
                    deselect(selections.toMutableSet())
                }
                updateSelectionToolbarVis(false)
            }
            .setNegativeButton(
                R.string.no
            ) { dialog12, _ ->
                dialog12.dismiss()
                selectExtension.apply {
                    deselect(selections.toMutableSet())
                }
                updateSelectionToolbarVis(false)
            }
            .create()
            .show()
    }

    private fun redownloadSelected() {
        selectExtension.let {
            activity.get()?.redownloadContent(
                it.selectedItems.mapNotNull { obj: ContentItem -> obj.content },
                reparseContent = false,
                reparseImages = false
            )
        }
    }

    private fun redownloadAll() {
        val contents = itemAdapter.adapterItems.mapNotNull { obj: ContentItem -> obj.content }
        if (contents.isNotEmpty())
            activity.get()?.redownloadContent(
                contents,
                reparseContent = false,
                reparseImages = false
            )
    }

    override fun redownloadContent(content: Content) {
        val contentList: MutableList<Content> = ArrayList()
        contentList.add(content)
        activity.get()?.redownloadContent(
            contentList,
            reparseContent = false,
            reparseImages = false
        )
    }

    override fun itemTouchStartDrag(viewHolder: RecyclerView.ViewHolder) {
        // Nothing
    }

    /**
     * Display the yes/no dialog to make sure the user really wants to delete selected items
     *
     * @param items Items to be deleted if the answer is yes
     */
    private fun askDeleteSelected(items: List<Content>) {
        val context = getActivity() ?: return
        val builder = MaterialAlertDialogBuilder(context)
        val title = context.resources.getQuantityString(R.plurals.ask_cancel_multiple, items.size)
        builder.setMessage(title)
            .setPositiveButton(
                R.string.yes
            ) { _, _ ->
                selectExtension.apply {
                    deselect(selections.toMutableSet())
                }
                onDeleteBooks(items)
            }
            .setNegativeButton(
                R.string.no
            ) { _, _ ->
                selectExtension.apply {
                    deselect(selections.toMutableSet())
                }
            }
            .setOnCancelListener {
                selectExtension.apply {
                    deselect(selections.toMutableSet())
                }
            }
            .create().show()
    }
}