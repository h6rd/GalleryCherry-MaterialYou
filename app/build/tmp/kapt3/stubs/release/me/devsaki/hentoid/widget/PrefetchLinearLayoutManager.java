package me.devsaki.hentoid.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000fH\u0014J(\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0018\u00010\u0013R\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J(\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0018\u00010\u0013R\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lme/devsaki/hentoid/widget/PrefetchLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "extraLayoutSpace", "", "<set-?>", "rawDeltaPx", "getRawDeltaPx", "()I", "calculateExtraLayoutSpace", "", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "", "scrollHorizontallyBy", "dx", "recycler", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "Landroidx/recyclerview/widget/RecyclerView;", "scrollVerticallyBy", "dy", "setExtraLayoutSpace", "app_release"})
public final class PrefetchLinearLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    private int extraLayoutSpace = -1;
    private int rawDeltaPx = 0;
    
    public PrefetchLinearLayoutManager(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    public final int getRawDeltaPx() {
        return 0;
    }
    
    public final void setExtraLayoutSpace(int extraLayoutSpace) {
    }
    
    @java.lang.Override
    protected void calculateExtraLayoutSpace(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.State state, @org.jetbrains.annotations.NotNull
    int[] extraLayoutSpace) {
    }
    
    @java.lang.Override
    public int scrollHorizontallyBy(int dx, @org.jetbrains.annotations.Nullable
    androidx.recyclerview.widget.RecyclerView.Recycler recycler, @org.jetbrains.annotations.Nullable
    androidx.recyclerview.widget.RecyclerView.State state) {
        return 0;
    }
    
    @java.lang.Override
    public int scrollVerticallyBy(int dy, @org.jetbrains.annotations.Nullable
    androidx.recyclerview.widget.RecyclerView.Recycler recycler, @org.jetbrains.annotations.Nullable
    androidx.recyclerview.widget.RecyclerView.State state) {
        return 0;
    }
}