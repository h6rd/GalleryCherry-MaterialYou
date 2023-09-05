package me.devsaki.hentoid.activities;

import java.lang.System;

/**
 * Activity to edit the left drawer where the sources are
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0002J\u0012\u0010\u0019\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0015J\b\u0010\u001c\u001a\u00020\u000eH\u0014J\b\u0010\u001d\u001a\u00020\u000eH\u0002J\b\u0010\u001e\u001a\u00020\u000eH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lme/devsaki/hentoid/activities/DrawerEditActivity;", "Lme/devsaki/hentoid/activities/BaseActivity;", "Lcom/mikepenz/fastadapter/drag/ItemTouchCallback;", "()V", "binding", "Lme/devsaki/hentoid/databinding/ActivityDrawerEditBinding;", "fastAdapter", "Lcom/mikepenz/fastadapter/FastAdapter;", "Lme/devsaki/hentoid/viewholders/SiteItem;", "itemAdapter", "Lcom/mikepenz/fastadapter/adapters/ItemAdapter;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "itemTouchDropped", "", "oldPosition", "", "newPosition", "itemTouchOnMove", "", "itemTouchStartDrag", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemTouchStopDrag", "onCheckAll", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onUncheckAll", "onValidateClick", "app_release"})
public final class DrawerEditActivity extends me.devsaki.hentoid.activities.BaseActivity implements com.mikepenz.fastadapter.drag.ItemTouchCallback {
    private me.devsaki.hentoid.databinding.ActivityDrawerEditBinding binding;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private final com.mikepenz.fastadapter.adapters.ItemAdapter<me.devsaki.hentoid.viewholders.SiteItem> itemAdapter = null;
    private final com.mikepenz.fastadapter.FastAdapter<me.devsaki.hentoid.viewholders.SiteItem> fastAdapter = null;
    
    public DrawerEditActivity() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"NonConstantResourceId"})
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
    
    private final void onCheckAll() {
    }
    
    private final void onUncheckAll() {
    }
    
    private final void onValidateClick() {
    }
    
    @java.lang.Override
    public boolean itemTouchOnMove(int oldPosition, int newPosition) {
        return false;
    }
    
    @java.lang.Override
    public void itemTouchDropped(int oldPosition, int newPosition) {
    }
    
    @java.lang.Override
    public void itemTouchStartDrag(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
    }
    
    @java.lang.Override
    public void itemTouchStopDrag(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
    }
}