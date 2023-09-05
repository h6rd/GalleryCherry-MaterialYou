package me.devsaki.hentoid.widget;

import java.lang.System;

/**
 * Credits go to the Tachiyomi team
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fH\u0002J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fH\u0002J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u000fH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lme/devsaki/hentoid/widget/ViewZoomGestureListener;", "Landroid/view/GestureDetector;", "context", "Landroid/content/Context;", "listener", "Lme/devsaki/hentoid/widget/ViewZoomGestureListener$Listener;", "(Landroid/content/Context;Lme/devsaki/hentoid/widget/ViewZoomGestureListener$Listener;)V", "doubleTapTime", "", "downX", "", "downY", "handler", "Landroid/os/Handler;", "lastDownEvent", "Landroid/view/MotionEvent;", "lastUp", "", "longTapFn", "Ljava/lang/Runnable;", "longTapTime", "scaledTouchSlopslop", "motionActionCancelandPointerDown", "", "motionActionDown", "ev", "motionActionMove", "motionActionUp", "onTouchEvent", "", "Listener", "app_debug"})
public class ViewZoomGestureListener extends android.view.GestureDetector {
    private final me.devsaki.hentoid.widget.ViewZoomGestureListener.Listener listener = null;
    private final android.os.Handler handler = null;
    private int scaledTouchSlopslop = 0;
    private final int longTapTime = 0;
    private final int doubleTapTime = 0;
    private float downX = 0.0F;
    private float downY = 0.0F;
    private long lastUp = 0L;
    private android.view.MotionEvent lastDownEvent;
    
    /**
     * Runnable to execute when a long tap is confirmed.
     */
    private final java.lang.Runnable longTapFn = null;
    
    public ViewZoomGestureListener(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.widget.ViewZoomGestureListener.Listener listener) {
        super(null, null);
    }
    
    @java.lang.Override
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull
    android.view.MotionEvent ev) {
        return false;
    }
    
    private final void motionActionDown(android.view.MotionEvent ev) {
    }
    
    private final void motionActionMove(android.view.MotionEvent ev) {
    }
    
    private final void motionActionUp(android.view.MotionEvent ev) {
    }
    
    private final void motionActionCancelandPointerDown() {
    }
    
    /**
     * Custom listener to also include a long tap confirmed
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lme/devsaki/hentoid/widget/ViewZoomGestureListener$Listener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "()V", "onDoubleTapConfirmed", "", "ev", "Landroid/view/MotionEvent;", "onLongTapConfirmed", "app_debug"})
    public static class Listener extends android.view.GestureDetector.SimpleOnGestureListener {
        
        public Listener() {
            super();
        }
        
        /**
         * Notified when a long tap occurs with the initial on down [ev] that triggered it.
         */
        public void onLongTapConfirmed(@org.jetbrains.annotations.NotNull
        android.view.MotionEvent ev) {
        }
        
        public void onDoubleTapConfirmed(@org.jetbrains.annotations.NotNull
        android.view.MotionEvent ev) {
        }
    }
}