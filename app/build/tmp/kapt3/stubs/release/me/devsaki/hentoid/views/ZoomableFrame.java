package me.devsaki.hentoid.views;

import java.lang.System;

/**
 * Frame layout which contains a [ZoomableRecyclerView]. It's needed to handle touch events,
 * because the recyclerview is scaled and its touch events are translated, which breaks the
 * detectors.
 * <p>
 * Credits for this go to the Tachiyomi team
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0006\u0010\u0018\u001a\u00020\u0014J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0010H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lme/devsaki/hentoid/views/ZoomableFrame;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "enabled", "", "flingDetector", "Landroid/view/GestureDetector;", "recycler", "Lme/devsaki/hentoid/views/ZoomableRecyclerView;", "scaleDetector", "Landroid/view/ScaleGestureDetector;", "disable", "", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "enable", "getRecycler", "FlingListener", "ScaleListener", "app_release"})
public final class ZoomableFrame extends android.widget.FrameLayout {
    private boolean enabled = true;
    
    /**
     * Scale detector, either with pinch or quick scale.
     */
    private final android.view.ScaleGestureDetector scaleDetector = null;
    
    /**
     * Fling detector.
     */
    private final android.view.GestureDetector flingDetector = null;
    
    /**
     * Recycler view added in this frame.
     */
    private me.devsaki.hentoid.views.ZoomableRecyclerView recycler;
    
    public ZoomableFrame(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    public ZoomableFrame(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public ZoomableFrame(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    private final me.devsaki.hentoid.views.ZoomableRecyclerView getRecycler() {
        return null;
    }
    
    /**
     * Dispatches a touch event to the detectors.
     */
    @java.lang.Override
    public boolean dispatchTouchEvent(@org.jetbrains.annotations.NotNull
    android.view.MotionEvent ev) {
        return false;
    }
    
    public final void enable() {
    }
    
    public final void disable() {
    }
    
    /**
     * Scale listener used to delegate events to the recycler view.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\n"}, d2 = {"Lme/devsaki/hentoid/views/ZoomableFrame$ScaleListener;", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "(Lme/devsaki/hentoid/views/ZoomableFrame;)V", "onScale", "", "detector", "Landroid/view/ScaleGestureDetector;", "onScaleBegin", "onScaleEnd", "", "app_release"})
    public final class ScaleListener extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener {
        
        public ScaleListener() {
            super();
        }
        
        @java.lang.Override
        public boolean onScaleBegin(@org.jetbrains.annotations.NotNull
        android.view.ScaleGestureDetector detector) {
            return false;
        }
        
        @java.lang.Override
        public boolean onScale(@org.jetbrains.annotations.NotNull
        android.view.ScaleGestureDetector detector) {
            return false;
        }
        
        @java.lang.Override
        public void onScaleEnd(@org.jetbrains.annotations.NotNull
        android.view.ScaleGestureDetector detector) {
        }
    }
    
    /**
     * Fling listener used to delegate events to the recycler view.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J(\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016\u00a8\u0006\r"}, d2 = {"Lme/devsaki/hentoid/views/ZoomableFrame$FlingListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "(Lme/devsaki/hentoid/views/ZoomableFrame;)V", "onDown", "", "e", "Landroid/view/MotionEvent;", "onFling", "e1", "e2", "velocityX", "", "velocityY", "app_release"})
    public final class FlingListener extends android.view.GestureDetector.SimpleOnGestureListener {
        
        public FlingListener() {
            super();
        }
        
        @java.lang.Override
        public boolean onFling(@org.jetbrains.annotations.NotNull
        android.view.MotionEvent e1, @org.jetbrains.annotations.NotNull
        android.view.MotionEvent e2, float velocityX, float velocityY) {
            return false;
        }
        
        @java.lang.Override
        public boolean onDown(@org.jetbrains.annotations.NotNull
        android.view.MotionEvent e) {
            return false;
        }
    }
}