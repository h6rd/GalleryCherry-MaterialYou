package me.devsaki.hentoid.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0014J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0006J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lme/devsaki/hentoid/widget/ReaderSmoothScroller;", "Landroidx/recyclerview/widget/LinearSmoothScroller;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "currentScrollY", "", "itemHeight", "speed", "", "calculateCurrentDistanceToPosition", "targetPosition", "calculateSpeedPerPixel", "displayMetrics", "Landroid/util/DisplayMetrics;", "computeScrollVectorForPosition", "Landroid/graphics/PointF;", "getVerticalSnapPreference", "setCurrentPositionY", "", "position", "setItemHeight", "height", "setSpeed", "updateActionForInterimTarget", "action", "Landroidx/recyclerview/widget/RecyclerView$SmoothScroller$Action;", "app_release"})
public final class ReaderSmoothScroller extends androidx.recyclerview.widget.LinearSmoothScroller {
    private float speed = 25.0F;
    private int currentScrollY = 0;
    private int itemHeight = 0;
    
    public ReaderSmoothScroller(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @java.lang.Override
    protected int getVerticalSnapPreference() {
        return 0;
    }
    
    @java.lang.Override
    protected float calculateSpeedPerPixel(@org.jetbrains.annotations.NotNull
    android.util.DisplayMetrics displayMetrics) {
        return 0.0F;
    }
    
    public final void setSpeed(float speed) {
    }
    
    public final void setCurrentPositionY(int position) {
    }
    
    public final void setItemHeight(int height) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.graphics.PointF computeScrollVectorForPosition(int targetPosition) {
        return null;
    }
    
    private final int calculateCurrentDistanceToPosition(int targetPosition) {
        return 0;
    }
    
    @java.lang.Override
    protected void updateActionForInterimTarget(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action action) {
    }
}