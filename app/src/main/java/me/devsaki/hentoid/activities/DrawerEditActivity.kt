package me.devsaki.hentoid.activities

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.adapters.ItemAdapter
import com.mikepenz.fastadapter.drag.ItemTouchCallback
import com.mikepenz.fastadapter.drag.SimpleDragCallback
import com.mikepenz.fastadapter.utils.DragDropUtil.onMove
import me.devsaki.hentoid.R
import me.devsaki.hentoid.databinding.ActivityDrawerEditBinding
import me.devsaki.hentoid.enums.Site
import me.devsaki.hentoid.util.Preferences
import me.devsaki.hentoid.util.ThemeHelper
import me.devsaki.hentoid.viewholders.IDraggableViewHolder
import me.devsaki.hentoid.viewholders.SiteItem

/**
 * Activity to edit the left drawer where the sources are
 */
class DrawerEditActivity : BaseActivity(), ItemTouchCallback {
    private var binding: ActivityDrawerEditBinding? = null
    private lateinit var recyclerView: RecyclerView
    private val itemAdapter = ItemAdapter<SiteItem>()
    private val fastAdapter: FastAdapter<SiteItem> = FastAdapter.with(itemAdapter)

    @SuppressLint("NonConstantResourceId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ThemeHelper.applyTheme(this)

        binding = ActivityDrawerEditBinding.inflate(layoutInflater)
        binding?.let {
            setContentView(it.root)

            // Toolbar
            it.toolbar.setNavigationOnClickListener { onBackPressedDispatcher.onBackPressed() }
            it.toolbar.setOnMenuItemClickListener { clickedMenuItem: MenuItem ->
                when (clickedMenuItem.itemId) {
                    R.id.action_check_all -> onCheckAll()
                    R.id.action_uncheck_all -> onUncheckAll()
                    else -> {}
                }
                true
            }
        }

        // Activate drag & drop
        val dragCallback = SimpleDragCallback(this)
        dragCallback.notifyAllDrops = true
        val touchHelper = ItemTouchHelper(dragCallback)

        // Recycler
        val items: MutableList<SiteItem> = ArrayList()
        val activeSites = Preferences.getActiveSites()

        // First add active sites
        for (s in activeSites) if (s.isVisible) items.add(SiteItem(s, true, touchHelper))
        // Then add the others
        for (s in Site.values())  // We don't want to show these
            if (s.isVisible && !activeSites.contains(s)) items.add(SiteItem(s, false, touchHelper))
        itemAdapter.add(items)
        recyclerView = findViewById(R.id.drawer_edit_list)
        recyclerView.adapter = fastAdapter
        recyclerView.setHasFixedSize(true)
        touchHelper.attachToRecyclerView(recyclerView)

        // OK button
        val okBtn = findViewById<View>(R.id.drawer_edit_ok_btn)
        okBtn.setOnClickListener { onValidateClick() }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    private fun onCheckAll() {
        for (s in itemAdapter.adapterItems) s.isSelected = true
        fastAdapter.notifyDataSetChanged()
    }

    private fun onUncheckAll() {
        for (s in itemAdapter.adapterItems) s.isSelected = false
        fastAdapter.notifyDataSetChanged()
    }

    private fun onValidateClick() {
        val newSites: MutableList<Site> = ArrayList()
        for (s in itemAdapter.adapterItems) if (s.isSelected) newSites.add(s.site)
        Preferences.setActiveSites(newSites)
        onBackPressedDispatcher.onBackPressed()
    }

    override fun itemTouchOnMove(oldPosition: Int, newPosition: Int): Boolean {
        onMove(itemAdapter, oldPosition, newPosition) // change position
        return true
    }

    override fun itemTouchDropped(oldPosition: Int, newPosition: Int) {
        val vh = recyclerView.findViewHolderForAdapterPosition(newPosition)
        if (vh is IDraggableViewHolder) {
            (vh as IDraggableViewHolder).onDropped()
        }
    }

    override fun itemTouchStartDrag(viewHolder: RecyclerView.ViewHolder) {
        if (viewHolder is IDraggableViewHolder) {
            (viewHolder as IDraggableViewHolder).onDragged()
        }
    }

    override fun itemTouchStopDrag(viewHolder: RecyclerView.ViewHolder) {
        // Nothing
    }
}