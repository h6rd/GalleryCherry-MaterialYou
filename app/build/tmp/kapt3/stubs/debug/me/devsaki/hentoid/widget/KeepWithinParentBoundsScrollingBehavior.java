package me.devsaki.hentoid.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016\u00a8\u0006\u000e"}, d2 = {"Lme/devsaki/hentoid/widget/KeepWithinParentBoundsScrollingBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onDependentViewChanged", "", "parent", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "child", "Landroid/view/View;", "dependency", "app_debug"})
public final class KeepWithinParentBoundsScrollingBehavior extends com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior {
    
    public KeepWithinParentBoundsScrollingBehavior(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.util.AttributeSet attrs) {
        super();
    }
    
    @java.lang.Override
    public boolean onDependentViewChanged(@org.jetbrains.annotations.NotNull
    androidx.coordinatorlayout.widget.CoordinatorLayout parent, @org.jetbrains.annotations.NotNull
    android.view.View child, @org.jetbrains.annotations.NotNull
    android.view.View dependency) {
        return false;
    }
}