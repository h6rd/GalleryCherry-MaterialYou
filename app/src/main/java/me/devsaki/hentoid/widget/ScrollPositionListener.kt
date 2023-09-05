package me.devsaki.hentoid.widget

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import me.devsaki.hentoid.util.Debouncer

class ScrollPositionListener(private val onPositionChangeListener: (Int) -> Unit) :
    RecyclerView.OnScrollListener() {
    private var isScrollEnabled = true

    private var mInitialOffsetY = -1
    var totalScrolledX = 0
        private set
    var totalScrolledY = 0
        private set

    // Out of bounds scrolling detection
    private var isSettlingX = false
    private var isSettlingY = false

    private var dragStartPositionX = -1
    private var dragStartPositionY = -1

    private var deltaEventDebouncer: Debouncer<Int>? = null

    private var onStartOutOfBoundScroll: Runnable? = null
    private var onEndOutOfBoundScroll: Runnable? = null


    fun setDeltaYListener(context: Context, deltaYListener: (Int) -> Unit) {
        deltaEventDebouncer = Debouncer(context, 75) { i: Int ->
            deltaYListener.invoke(i - mInitialOffsetY)
            mInitialOffsetY = -1
        }
    }

    fun setOnStartOutOfBoundScrollListener(onStartOutOfBoundScrollListener: Runnable?) {
        onStartOutOfBoundScroll = onStartOutOfBoundScrollListener
    }

    fun setOnEndOutOfBoundScrollListener(onEndOutOfBoundScrollListener: Runnable?) {
        onEndOutOfBoundScroll = onEndOutOfBoundScrollListener
    }

    override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
        super.onScrolled(recyclerView, dx, dy)
        if (mInitialOffsetY < 0) mInitialOffsetY = totalScrolledY
        totalScrolledY += dy
        totalScrolledX += dx
        deltaEventDebouncer?.submit(totalScrolledY)
        val llm = recyclerView.layoutManager as LinearLayoutManager?
        if (llm != null) {
            val firstVisibleItemPosition = llm.findFirstVisibleItemPosition()
            val lastCompletelyVisibleItemPosition = llm.findLastCompletelyVisibleItemPosition()
            onPositionChangeListener.invoke(
                firstVisibleItemPosition.coerceAtLeast(lastCompletelyVisibleItemPosition)
            )
        }
    }

    override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
        super.onScrollStateChanged(recyclerView, newState)
        if (!isScrollEnabled) {
            recyclerView.stopScroll()
            return
        }
        val llm = recyclerView.layoutManager as LinearLayoutManager?
        if (llm != null) {
            if (RecyclerView.SCROLL_STATE_DRAGGING == newState) {
                dragStartPositionX = recyclerView.computeHorizontalScrollOffset()
                dragStartPositionY = recyclerView.computeVerticalScrollOffset()
                isSettlingX = false
                isSettlingY = false
            } else if (RecyclerView.SCROLL_STATE_SETTLING == newState) {
                // If the settling position is different from the original position, ignore that scroll
                // (e.g. snapping back to the original position after a small scroll)
                if (recyclerView.computeHorizontalScrollOffset() != dragStartPositionX)
                    isSettlingX = true
                if (recyclerView.computeVerticalScrollOffset() != dragStartPositionY)
                    isSettlingY = true
            } else if (RecyclerView.SCROLL_STATE_IDLE == newState) {
                // Don't do anything if we're not on a boundary
                if (!(llm.findLastVisibleItemPosition() == llm.itemCount - 1 || 0 == llm.findFirstVisibleItemPosition())) return
                val onEndOut = onEndOutOfBoundScroll
                val onStartOut = onStartOutOfBoundScroll
                if (null == onEndOut || null == onStartOut) return
                var scrollDirection = 0
                if (llm is PrefetchLinearLayoutManager) scrollDirection = llm.rawDeltaPx
                if (recyclerView.computeHorizontalScrollOffset() == dragStartPositionX && !isSettlingX && llm.canScrollHorizontally()) {
                    if (!llm.reverseLayout && scrollDirection >= 0 || llm.reverseLayout && scrollDirection < 0) onEndOut.run() else onStartOut.run()
                }
                if (recyclerView.computeVerticalScrollOffset() == dragStartPositionY && !isSettlingY && llm.canScrollVertically()) {
                    if (!llm.reverseLayout && scrollDirection >= 0 || llm.reverseLayout && scrollDirection < 0) onEndOut.run() else onStartOut.run()
                }
            }
        }
    }

    fun disableScroll() {
        isScrollEnabled = false
    }

    fun enableScroll() {
        isScrollEnabled = true
    }
}