package me.devsaki.hentoid.widget;

import java.lang.System;

/**
 * Manages page snapping for a RecyclerView
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00060\fR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lme/devsaki/hentoid/widget/PageSnapWidget;", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "(Landroidx/recyclerview/widget/RecyclerView;)V", "flingSensitivity", "", "isEnabled", "", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "snapHelper", "Lme/devsaki/hentoid/widget/PageSnapWidget$SnapHelper;", "isPageSnapEnabled", "setFlingSensitivity", "", "sensitivity", "setPageSnapEnabled", "pageSnapEnabled", "SnapHelper", "app_release"})
public final class PageSnapWidget {
    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.RecyclerView recyclerView = null;
    private final me.devsaki.hentoid.widget.PageSnapWidget.SnapHelper snapHelper = null;
    private float flingSensitivity = 0.0F;
    private boolean isEnabled = false;
    
    public PageSnapWidget(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return null;
    }
    
    public final void setPageSnapEnabled(boolean pageSnapEnabled) {
    }
    
    public final boolean isPageSnapEnabled() {
        return false;
    }
    
    /**
     * Sets the sensitivity of a fling.
     *
     * @param sensitivity floating point sensitivity where 0 means never fling and 1 means always
     * fling. Values beyond this range will have undefined behavior.
     */
    public final void setFlingSensitivity(float sensitivity) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lme/devsaki/hentoid/widget/PageSnapWidget$SnapHelper;", "Landroidx/recyclerview/widget/PagerSnapHelper;", "(Lme/devsaki/hentoid/widget/PageSnapWidget;)V", "onFling", "", "velocityX", "", "velocityY", "app_release"})
    public final class SnapHelper extends androidx.recyclerview.widget.PagerSnapHelper {
        
        public SnapHelper() {
            super();
        }
        
        @java.lang.Override
        public boolean onFling(int velocityX, int velocityY) {
            return false;
        }
    }
}