package me.devsaki.hentoid.views;

import java.lang.System;

/**
 * Zoomable RecyclerView that supports gestures
 * To be used inside a {@link ZoomableFrame}
 * <p>
 * Credits go to the Tachiyomi team
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 S2\u00020\u0001:\u0004STUVB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010(\u001a\u00020\fH\u0002J\b\u0010)\u001a\u00020\fH\u0002J\u0010\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020 H\u0002J\u0010\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020 H\u0002J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J\u0018\u00102\u001a\u00020/2\u0006\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020\tH\u0014J\u000e\u00105\u001a\u00020/2\u0006\u00106\u001a\u00020 J\u0006\u00107\u001a\u00020/J\u0006\u00108\u001a\u00020/J\u0010\u00109\u001a\u00020/2\u0006\u0010:\u001a\u00020\tH\u0016J\u0018\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\tH\u0016J\u0010\u0010>\u001a\u00020\f2\u0006\u0010?\u001a\u00020@H\u0016J\u0006\u0010A\u001a\u00020/J\u0010\u0010B\u001a\u00020/2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010C\u001a\u00020/2\u0006\u0010\u001d\u001a\u00020\fJ\u0016\u0010D\u001a\u00020/2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012J\u0016\u0010E\u001a\u00020/2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u0012J\u0010\u0010F\u001a\u00020/2\u0006\u0010G\u001a\u00020 H\u0002J\u000e\u0010H\u001a\u00020/2\u0006\u0010&\u001a\u00020\'J8\u0010I\u001a\u00020/2\u0006\u0010J\u001a\u00020 2\u0006\u0010K\u001a\u00020 2\u0006\u0010L\u001a\u00020 2\u0006\u0010M\u001a\u00020 2\u0006\u0010N\u001a\u00020 2\u0006\u0010O\u001a\u00020 H\u0002J\u0016\u0010P\u001a\u00020\f2\u0006\u0010Q\u001a\u00020\t2\u0006\u0010R\u001a\u00020\tR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00060\u000fR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00060\u001aR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 @BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006W"}, d2 = {"Lme/devsaki/hentoid/views/ZoomableRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "atFirstPosition", "", "atLastPosition", "detector", "Lme/devsaki/hentoid/views/ZoomableRecyclerView$Detector;", "firstVisibleItemPosition", "getMaxDimensionsListener", "Landroidx/core/util/Consumer;", "Landroid/graphics/Point;", "halfHeight", "halfWidth", "isLongTapZooming", "isZooming", "lastVisibleItemPosition", "listener", "Lme/devsaki/hentoid/views/ZoomableRecyclerView$GestureListener;", "longTapListener", "Lme/devsaki/hentoid/views/ZoomableRecyclerView$LongTapListener;", "longTapZoomEnabled", "maxBitmapDimensions", "<set-?>", "", "scale", "getScale", "()F", "scaleListener", "", "tapListener", "Lme/devsaki/hentoid/widget/OnZoneTapListener;", "canMoveHorizontally", "canMoveVertically", "getPositionX", "positionX", "getPositionY", "positionY", "onDraw", "", "c", "Landroid/graphics/Canvas;", "onMeasure", "widthSpec", "heightSpec", "onScale", "scaleFactor", "onScaleBegin", "onScaleEnd", "onScrollStateChanged", "state", "onScrolled", "dx", "dy", "onTouchEvent", "e", "Landroid/view/MotionEvent;", "resetScale", "setLongTapListener", "setLongTapZoomEnabled", "setOnGetMaxDimensionsListener", "setOnScaleListener", "setScaleRate", "rate", "setTapListener", "zoom", "fromScale", "toScale", "fromX", "toX", "fromY", "toY", "zoomFling", "velocityX", "velocityY", "Companion", "Detector", "GestureListener", "LongTapListener", "app_debug"})
public final class ZoomableRecyclerView extends androidx.recyclerview.widget.RecyclerView {
    private boolean isZooming = false;
    private boolean isLongTapZooming = false;
    private boolean atFirstPosition = false;
    private boolean atLastPosition = false;
    private int halfWidth = 0;
    private int halfHeight = 0;
    private int firstVisibleItemPosition = 0;
    private int lastVisibleItemPosition = 0;
    private float scale = 1.0F;
    private final me.devsaki.hentoid.views.ZoomableRecyclerView.GestureListener listener = null;
    private androidx.core.util.Consumer<java.lang.Double> scaleListener;
    private final me.devsaki.hentoid.views.ZoomableRecyclerView.Detector detector = null;
    private androidx.core.util.Consumer<android.graphics.Point> getMaxDimensionsListener;
    private me.devsaki.hentoid.widget.OnZoneTapListener tapListener;
    private me.devsaki.hentoid.views.ZoomableRecyclerView.LongTapListener longTapListener;
    private android.graphics.Point maxBitmapDimensions;
    private boolean longTapZoomEnabled = true;
    @org.jetbrains.annotations.NotNull
    public static final me.devsaki.hentoid.views.ZoomableRecyclerView.Companion Companion = null;
    public static final long ANIMATOR_DURATION_TIME = 200L;
    public static final float DEFAULT_SCALE = 1.0F;
    public static final float MAX_SCALE = 3.0F;
    
    public final float getScale() {
        return 0.0F;
    }
    
    public ZoomableRecyclerView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    public ZoomableRecyclerView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public ZoomableRecyclerView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @java.lang.Override
    public void onDraw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas c) {
    }
    
    public final void setOnGetMaxDimensionsListener(@org.jetbrains.annotations.Nullable
    androidx.core.util.Consumer<android.graphics.Point> getMaxDimensionsListener) {
    }
    
    public final void setTapListener(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.widget.OnZoneTapListener tapListener) {
    }
    
    public final void setLongTapListener(@org.jetbrains.annotations.Nullable
    me.devsaki.hentoid.views.ZoomableRecyclerView.LongTapListener longTapListener) {
    }
    
    public final void setOnScaleListener(@org.jetbrains.annotations.Nullable
    androidx.core.util.Consumer<java.lang.Double> scaleListener) {
    }
    
    public final void setLongTapZoomEnabled(boolean longTapZoomEnabled) {
    }
    
    @java.lang.Override
    protected void onMeasure(int widthSpec, int heightSpec) {
    }
    
    @java.lang.Override
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull
    android.view.MotionEvent e) {
        return false;
    }
    
    @java.lang.Override
    public void onScrolled(int dx, int dy) {
    }
    
    @java.lang.Override
    public void onScrollStateChanged(int state) {
    }
    
    private final float getPositionX(float positionX) {
        return 0.0F;
    }
    
    private final float getPositionY(float positionY) {
        return 0.0F;
    }
    
    public final void resetScale() {
    }
    
    private final void zoom(float fromScale, float toScale, float fromX, float toX, float fromY, float toY) {
    }
    
    private final boolean canMoveHorizontally() {
        return false;
    }
    
    private final boolean canMoveVertically() {
        return false;
    }
    
    public final boolean zoomFling(int velocityX, int velocityY) {
        return false;
    }
    
    private final void setScaleRate(float rate) {
    }
    
    public final void onScale(float scaleFactor) {
    }
    
    public final void onScaleBegin() {
    }
    
    public final void onScaleEnd() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lme/devsaki/hentoid/views/ZoomableRecyclerView$LongTapListener;", "", "onListen", "", "ev", "Landroid/view/MotionEvent;", "app_debug"})
    public static abstract interface LongTapListener {
        
        public abstract boolean onListen(@org.jetbrains.annotations.Nullable
        android.view.MotionEvent ev);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016\u00a8\u0006\r"}, d2 = {"Lme/devsaki/hentoid/views/ZoomableRecyclerView$GestureListener;", "Lme/devsaki/hentoid/widget/ViewZoomGestureListener$Listener;", "(Lme/devsaki/hentoid/views/ZoomableRecyclerView;)V", "longTapZoom", "", "ev", "Landroid/view/MotionEvent;", "onDoubleTap", "", "e", "onDoubleTapConfirmed", "onLongTapConfirmed", "onSingleTapConfirmed", "app_debug"})
    public final class GestureListener extends me.devsaki.hentoid.widget.ViewZoomGestureListener.Listener {
        
        public GestureListener() {
            super();
        }
        
        @java.lang.Override
        public boolean onDoubleTap(@org.jetbrains.annotations.NotNull
        android.view.MotionEvent e) {
            return false;
        }
        
        @java.lang.Override
        public boolean onSingleTapConfirmed(@org.jetbrains.annotations.NotNull
        android.view.MotionEvent e) {
            return false;
        }
        
        @java.lang.Override
        public void onLongTapConfirmed(@org.jetbrains.annotations.NotNull
        android.view.MotionEvent ev) {
        }
        
        private final void longTapZoom(android.view.MotionEvent ev) {
        }
        
        @java.lang.Override
        public void onDoubleTapConfirmed(@org.jetbrains.annotations.NotNull
        android.view.MotionEvent ev) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\bH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lme/devsaki/hentoid/views/ZoomableRecyclerView$Detector;", "Lme/devsaki/hentoid/widget/ViewZoomGestureListener;", "context", "Landroid/content/Context;", "listener", "Lme/devsaki/hentoid/widget/ViewZoomGestureListener$Listener;", "(Lme/devsaki/hentoid/views/ZoomableRecyclerView;Landroid/content/Context;Lme/devsaki/hentoid/widget/ViewZoomGestureListener$Listener;)V", "downX", "", "downY", "isDoubleTapping", "", "()Z", "setDoubleTapping", "(Z)V", "isQuickScaling", "setQuickScaling", "isZoomDragging", "scrollPointerId", "touchSlop", "motionActionCancel", "", "motionActionDownLocal", "ev", "Landroid/view/MotionEvent;", "motionActionMoveLocal", "motionActionPointerDown", "actionIndex", "motionActionUpLocal", "onTouchEvent", "zoomScrollBy", "dx", "dy", "app_debug"})
    public final class Detector extends me.devsaki.hentoid.widget.ViewZoomGestureListener {
        private int scrollPointerId = 0;
        private int downX = 0;
        private int downY = 0;
        private final int touchSlop = 0;
        private boolean isZoomDragging = false;
        private boolean isDoubleTapping = false;
        private boolean isQuickScaling = false;
        
        public Detector(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        me.devsaki.hentoid.widget.ViewZoomGestureListener.Listener listener) {
            super(null, null);
        }
        
        public final boolean isDoubleTapping() {
            return false;
        }
        
        public final void setDoubleTapping(boolean p0) {
        }
        
        public final boolean isQuickScaling() {
            return false;
        }
        
        public final void setQuickScaling(boolean p0) {
        }
        
        @java.lang.Override
        public boolean onTouchEvent(@org.jetbrains.annotations.NotNull
        android.view.MotionEvent ev) {
            return false;
        }
        
        private final void motionActionDownLocal(android.view.MotionEvent ev) {
        }
        
        private final void motionActionPointerDown(android.view.MotionEvent ev, int actionIndex) {
        }
        
        private final boolean motionActionMoveLocal(android.view.MotionEvent ev) {
            return false;
        }
        
        private final void motionActionUpLocal(android.view.MotionEvent ev) {
        }
        
        private final void motionActionCancel() {
        }
        
        private final void zoomScrollBy(int dx, int dy) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lme/devsaki/hentoid/views/ZoomableRecyclerView$Companion;", "", "()V", "ANIMATOR_DURATION_TIME", "", "DEFAULT_SCALE", "", "MAX_SCALE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}