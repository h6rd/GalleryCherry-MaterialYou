package me.devsaki.hentoid.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0002J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J@\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J8\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0002\u00a8\u0006\u001f"}, d2 = {"Lme/devsaki/hentoid/widget/BottomNavigationBehaviour;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Lcom/google/android/material/bottomappbar/BottomAppBar;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "hideBottomBar", "", "view", "layoutDependsOn", "", "parent", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "child", "dependency", "Landroid/view/View;", "onNestedPreScroll", "coordinatorLayout", "target", "dx", "", "dy", "consumed", "", "type", "onStartNestedScroll", "directTargetChild", "nestedScrollAxes", "showBottomBar", "app_release"})
public final class BottomNavigationBehaviour extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<com.google.android.material.bottomappbar.BottomAppBar> {
    
    public BottomNavigationBehaviour(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.util.AttributeSet attrs) {
        super();
    }
    
    @java.lang.Override
    public boolean layoutDependsOn(@org.jetbrains.annotations.NotNull
    androidx.coordinatorlayout.widget.CoordinatorLayout parent, @org.jetbrains.annotations.NotNull
    com.google.android.material.bottomappbar.BottomAppBar child, @org.jetbrains.annotations.NotNull
    android.view.View dependency) {
        return false;
    }
    
    @java.lang.Override
    public boolean onStartNestedScroll(@org.jetbrains.annotations.NotNull
    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, @org.jetbrains.annotations.NotNull
    com.google.android.material.bottomappbar.BottomAppBar child, @org.jetbrains.annotations.NotNull
    android.view.View directTargetChild, @org.jetbrains.annotations.NotNull
    android.view.View target, int nestedScrollAxes, @androidx.core.view.ViewCompat.NestedScrollType
    int type) {
        return false;
    }
    
    @java.lang.Override
    public void onNestedPreScroll(@org.jetbrains.annotations.NotNull
    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, @org.jetbrains.annotations.NotNull
    com.google.android.material.bottomappbar.BottomAppBar child, @org.jetbrains.annotations.NotNull
    android.view.View target, int dx, int dy, @org.jetbrains.annotations.NotNull
    int[] consumed, @androidx.core.view.ViewCompat.NestedScrollType
    int type) {
    }
    
    private final void hideBottomBar(com.google.android.material.bottomappbar.BottomAppBar view) {
    }
    
    private final void showBottomBar(com.google.android.material.bottomappbar.BottomAppBar view) {
    }
}