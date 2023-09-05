package me.devsaki.hentoid.widget;

import java.lang.System;

/**
 * Zoned tap listener for the reader
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0016H\u0017J\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lme/devsaki/hentoid/widget/OnZoneTapListener;", "Landroid/view/View$OnTouchListener;", "view", "Landroid/view/View;", "tapZoneScale", "", "(Landroid/view/View;I)V", "gestureDetector", "Landroidx/core/view/GestureDetectorCompat;", "onLeftZoneTapListener", "Ljava/lang/Runnable;", "onLongTapListener", "onMiddleZoneTapListener", "onRightZoneTapListener", "pagerTapZoneWidth", "getView", "()Landroid/view/View;", "onLongPressAction", "", "onSingleTapConfirmedAction", "", "e", "Landroid/view/MotionEvent;", "onTouch", "v", "event", "setOnLeftZoneTapListener", "setOnLongTapListener", "setOnMiddleZoneTapListener", "setOnRightZoneTapListener", "OnGestureListener", "app_debug"})
public final class OnZoneTapListener implements android.view.View.OnTouchListener {
    @org.jetbrains.annotations.NotNull
    private final android.view.View view = null;
    
    /**
     * This view's dimensions are used to determine which zone a tap belongs to
     */
    private final androidx.core.view.GestureDetectorCompat gestureDetector = null;
    private int pagerTapZoneWidth = 0;
    private java.lang.Runnable onLeftZoneTapListener;
    private java.lang.Runnable onRightZoneTapListener;
    private java.lang.Runnable onMiddleZoneTapListener;
    private java.lang.Runnable onLongTapListener;
    
    public OnZoneTapListener(@org.jetbrains.annotations.NotNull
    android.view.View view, int tapZoneScale) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.view.View getView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.devsaki.hentoid.widget.OnZoneTapListener setOnLeftZoneTapListener(@org.jetbrains.annotations.Nullable
    java.lang.Runnable onLeftZoneTapListener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.devsaki.hentoid.widget.OnZoneTapListener setOnRightZoneTapListener(@org.jetbrains.annotations.Nullable
    java.lang.Runnable onRightZoneTapListener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.devsaki.hentoid.widget.OnZoneTapListener setOnMiddleZoneTapListener(@org.jetbrains.annotations.Nullable
    java.lang.Runnable onMiddleZoneTapListener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.devsaki.hentoid.widget.OnZoneTapListener setOnLongTapListener(@org.jetbrains.annotations.Nullable
    java.lang.Runnable onLongTapListener) {
        return null;
    }
    
    public final boolean onSingleTapConfirmedAction(@org.jetbrains.annotations.NotNull
    android.view.MotionEvent e) {
        return false;
    }
    
    public final void onLongPressAction() {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @java.lang.Override
    public boolean onTouch(@org.jetbrains.annotations.NotNull
    android.view.View v, @org.jetbrains.annotations.NotNull
    android.view.MotionEvent event) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\t"}, d2 = {"Lme/devsaki/hentoid/widget/OnZoneTapListener$OnGestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "(Lme/devsaki/hentoid/widget/OnZoneTapListener;)V", "onLongPress", "", "e", "Landroid/view/MotionEvent;", "onSingleTapConfirmed", "", "app_debug"})
    public final class OnGestureListener extends android.view.GestureDetector.SimpleOnGestureListener {
        
        public OnGestureListener() {
            super();
        }
        
        @java.lang.Override
        public boolean onSingleTapConfirmed(@org.jetbrains.annotations.NotNull
        android.view.MotionEvent e) {
            return false;
        }
        
        @java.lang.Override
        public void onLongPress(@org.jetbrains.annotations.NotNull
        android.view.MotionEvent e) {
        }
    }
}