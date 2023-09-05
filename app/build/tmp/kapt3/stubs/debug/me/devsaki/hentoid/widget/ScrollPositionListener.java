package me.devsaki.hentoid.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0019\u001a\u00020\u0005J\u0006\u0010\u001a\u001a\u00020\u0005J\u0018\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0004H\u0016J \u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0016J\"\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003J\u0010\u0010&\u001a\u00020\u00052\b\u0010\'\u001a\u0004\u0018\u00010\u0011J\u0010\u0010(\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0011R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016\u00a8\u0006*"}, d2 = {"Lme/devsaki/hentoid/widget/ScrollPositionListener;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onPositionChangeListener", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "deltaEventDebouncer", "Lme/devsaki/hentoid/util/Debouncer;", "dragStartPositionX", "dragStartPositionY", "isScrollEnabled", "", "isSettlingX", "isSettlingY", "mInitialOffsetY", "onEndOutOfBoundScroll", "Ljava/lang/Runnable;", "onStartOutOfBoundScroll", "<set-?>", "totalScrolledX", "getTotalScrolledX", "()I", "totalScrolledY", "getTotalScrolledY", "disableScroll", "enableScroll", "onScrollStateChanged", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "onScrolled", "dx", "dy", "setDeltaYListener", "context", "Landroid/content/Context;", "deltaYListener", "setOnEndOutOfBoundScrollListener", "onEndOutOfBoundScrollListener", "setOnStartOutOfBoundScrollListener", "onStartOutOfBoundScrollListener", "app_debug"})
public final class ScrollPositionListener extends androidx.recyclerview.widget.RecyclerView.OnScrollListener {
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> onPositionChangeListener = null;
    private boolean isScrollEnabled = true;
    private int mInitialOffsetY = -1;
    private int totalScrolledX = 0;
    private int totalScrolledY = 0;
    private boolean isSettlingX = false;
    private boolean isSettlingY = false;
    private int dragStartPositionX = -1;
    private int dragStartPositionY = -1;
    private me.devsaki.hentoid.util.Debouncer<java.lang.Integer> deltaEventDebouncer;
    private java.lang.Runnable onStartOutOfBoundScroll;
    private java.lang.Runnable onEndOutOfBoundScroll;
    
    public ScrollPositionListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onPositionChangeListener) {
        super();
    }
    
    public final int getTotalScrolledX() {
        return 0;
    }
    
    public final int getTotalScrolledY() {
        return 0;
    }
    
    public final void setDeltaYListener(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> deltaYListener) {
    }
    
    public final void setOnStartOutOfBoundScrollListener(@org.jetbrains.annotations.Nullable
    java.lang.Runnable onStartOutOfBoundScrollListener) {
    }
    
    public final void setOnEndOutOfBoundScrollListener(@org.jetbrains.annotations.Nullable
    java.lang.Runnable onEndOutOfBoundScrollListener) {
    }
    
    @java.lang.Override
    public void onScrolled(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView, int dx, int dy) {
    }
    
    @java.lang.Override
    public void onScrollStateChanged(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView, int newState) {
    }
    
    public final void disableScroll() {
    }
    
    public final void enableScroll() {
    }
}