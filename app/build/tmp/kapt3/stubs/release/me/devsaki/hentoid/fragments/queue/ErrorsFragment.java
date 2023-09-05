package me.devsaki.hentoid.fragments.queue;

import java.lang.System;

/**
 * Presents the list of downloads with errors
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00c6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010(\u001a\u00020)H\u0002J\u0016\u0010*\u001a\u00020)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,H\u0002J\b\u0010.\u001a\u00020)H\u0002J\u0016\u0010/\u001a\u00020)2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\b\u00100\u001a\u00020)H\u0002J\b\u00101\u001a\u00020)H\u0002J\b\u00102\u001a\u00020)H\u0002J\b\u00103\u001a\u00020)H\u0002J\b\u00104\u001a\u00020)H\u0002J\u0018\u00105\u001a\u00020)2\u0006\u00106\u001a\u00020\u001e2\u0006\u00107\u001a\u00020\u001eH\u0016J\u0018\u00108\u001a\u00020)2\u0006\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u001eH\u0016J\u0018\u0010;\u001a\u00020\u00182\u0006\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u001eH\u0016J\u0010\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010?\u001a\u00020)2\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010@\u001a\u00020)2\u0006\u00106\u001a\u00020\u001eH\u0016J\u0010\u0010A\u001a\u00020)2\u0006\u0010B\u001a\u00020CH\u0016J\b\u0010D\u001a\u00020)H\u0002J\u0010\u0010E\u001a\u00020)2\u0006\u0010F\u001a\u00020\u0013H\u0002J\u0012\u0010G\u001a\u00020)2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J$\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010O2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\u0016\u0010P\u001a\u00020)2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020-0,H\u0002J\b\u0010R\u001a\u00020)H\u0002J\u0010\u0010S\u001a\u00020)2\u0006\u0010T\u001a\u00020\u0016H\u0002J\b\u0010U\u001a\u00020)H\u0016J\b\u0010V\u001a\u00020)H\u0016J\u0016\u0010W\u001a\u00020)2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020-0,H\u0002J\u0010\u0010Y\u001a\u00020\u00182\u0006\u0010T\u001a\u00020\u0016H\u0002J\u0010\u0010Z\u001a\u00020)2\u0006\u0010[\u001a\u00020\\H\u0007J\u0010\u0010]\u001a\u00020)2\u0006\u0010^\u001a\u00020\u001eH\u0002J\b\u0010_\u001a\u00020)H\u0002J\b\u0010`\u001a\u00020)H\u0016J\u0010\u0010a\u001a\u00020)2\u0006\u0010b\u001a\u00020IH\u0016J\b\u0010c\u001a\u00020)H\u0002J\u0010\u0010d\u001a\u00020\u00182\u0006\u0010e\u001a\u00020fH\u0003J\u001a\u0010g\u001a\u00020)2\u0006\u0010h\u001a\u00020K2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\u0012\u0010i\u001a\u00020)2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\b\u0010j\u001a\u00020)H\u0002J\u0010\u0010k\u001a\u00020)2\u0006\u0010l\u001a\u00020-H\u0016J\b\u0010m\u001a\u00020)H\u0002J\u0010\u0010n\u001a\u00020)2\u0006\u0010l\u001a\u00020-H\u0002J\u0010\u0010o\u001a\u00020)2\u0006\u0010p\u001a\u00020\u0013H\u0002J\u0010\u0010q\u001a\u00020)2\u0006\u0010r\u001a\u00020\u0018H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006s"}, d2 = {"Lme/devsaki/hentoid/fragments/queue/ErrorsFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/mikepenz/fastadapter/drag/ItemTouchCallback;", "Lme/devsaki/hentoid/fragments/queue/ErrorsDialogFragment$Parent;", "Lcom/mikepenz/fastadapter/swipe/SimpleSwipeDrawerCallback$ItemSwipeCallback;", "()V", "_binding", "Lme/devsaki/hentoid/databinding/FragmentQueueErrorsBinding;", "activity", "Ljava/lang/ref/WeakReference;", "Lme/devsaki/hentoid/activities/QueueActivity;", "binding", "getBinding", "()Lme/devsaki/hentoid/databinding/FragmentQueueErrorsBinding;", "callback", "Landroidx/activity/OnBackPressedCallback;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "contentHashToDisplayFirst", "", "fastAdapter", "Lcom/mikepenz/fastadapter/FastAdapter;", "Lme/devsaki/hentoid/viewholders/ContentItem;", "invalidateNextQueryTextChange", "", "isDeletingAll", "itemAdapter", "Lcom/mikepenz/fastadapter/adapters/ItemAdapter;", "listRefreshDebouncer", "Lme/devsaki/hentoid/util/DebouncerK;", "", "query", "", "searchClearDebouncer", "selectExtension", "Lcom/mikepenz/fastadapter/select/SelectExtension;", "touchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "viewModel", "Lme/devsaki/hentoid/viewmodels/QueueViewModel;", "addCustomBackControl", "", "askDeleteSelected", "items", "", "Lme/devsaki/hentoid/database/domains/Content;", "askRedownloadSelectedScratch", "attachButtons", "customBackPress", "differEndCallback", "doCancelAll", "initSelectionToolbar", "initToolbar", "itemSwiped", "position", "direction", "itemTouchDropped", "oldPosition", "newPosition", "itemTouchOnMove", "itemTouchStartDrag", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemTouchStopDrag", "itemUnswiped", "onAttach", "context", "Landroid/content/Context;", "onCancelAllClick", "onContentHashToShowFirstChanged", "contentHash", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDeleteBooks", "c", "onDeleteComplete", "onDeleteSwipedBook", "item", "onDestroy", "onDestroyView", "onErrorsChanged", "result", "onItemClick", "onProcessStickyEvent", "event", "Lme/devsaki/hentoid/events/ProcessEvent;", "onRecyclerUpdated", "topItemPosition", "onRedownloadAllClick", "onResume", "onSaveInstanceState", "outState", "onSelectionChanged2", "onSelectionMenuItemClicked", "menuItem", "Landroid/view/MenuItem;", "onViewCreated", "view", "onViewStateRestored", "redownloadAll", "redownloadContent", "content", "redownloadSelected", "showErrorLogDialog", "updateSelectionToolbar", "selectedCount", "updateSelectionToolbarVis", "vis", "app_release"})
public final class ErrorsFragment extends androidx.fragment.app.Fragment implements com.mikepenz.fastadapter.drag.ItemTouchCallback, me.devsaki.hentoid.fragments.queue.ErrorsDialogFragment.Parent, com.mikepenz.fastadapter.swipe.SimpleSwipeDrawerCallback.ItemSwipeCallback {
    private me.devsaki.hentoid.databinding.FragmentQueueErrorsBinding _binding;
    private androidx.activity.OnBackPressedCallback callback;
    private me.devsaki.hentoid.viewmodels.QueueViewModel viewModel;
    private java.lang.ref.WeakReference<me.devsaki.hentoid.activities.QueueActivity> activity;
    private final com.mikepenz.fastadapter.adapters.ItemAdapter<me.devsaki.hentoid.viewholders.ContentItem> itemAdapter = null;
    private final com.mikepenz.fastadapter.FastAdapter<me.devsaki.hentoid.viewholders.ContentItem> fastAdapter = null;
    private final com.mikepenz.fastadapter.select.SelectExtension<me.devsaki.hentoid.viewholders.ContentItem> selectExtension = null;
    private androidx.recyclerview.widget.ItemTouchHelper touchHelper;
    private long contentHashToDisplayFirst = 0L;
    private me.devsaki.hentoid.util.DebouncerK<java.lang.Integer> listRefreshDebouncer;
    private me.devsaki.hentoid.util.DebouncerK<java.lang.Integer> searchClearDebouncer;
    private boolean isDeletingAll = false;
    private java.lang.String query = "";
    private boolean invalidateNextQueryTextChange = false;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    
    public ErrorsFragment() {
        super();
    }
    
    private final me.devsaki.hentoid.databinding.FragmentQueueErrorsBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    public void onAttach(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull
    android.os.Bundle outState) {
    }
    
    @java.lang.Override
    public void onViewStateRestored(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void addCustomBackControl() {
    }
    
    private final void customBackPress() {
    }
    
    private final void initToolbar() {
    }
    
    private final void initSelectionToolbar() {
    }
    
    @android.annotation.SuppressLint(value = {"NonConstantResourceId"})
    private final boolean onSelectionMenuItemClicked(android.view.MenuItem menuItem) {
        return false;
    }
    
    private final void updateSelectionToolbar(long selectedCount) {
    }
    
    private final void updateSelectionToolbarVis(boolean vis) {
    }
    
    private final void attachButtons(com.mikepenz.fastadapter.FastAdapter<me.devsaki.hentoid.viewholders.ContentItem> fastAdapter) {
    }
    
    private final void showErrorLogDialog(me.devsaki.hentoid.database.domains.Content content) {
    }
    
    private final void onErrorsChanged(java.util.List<? extends me.devsaki.hentoid.database.domains.Content> result) {
    }
    
    /**
     * Callback for the end of item diff calculations
     * Activated when all _adapter_ items are placed on their definitive position
     */
    private final void differEndCallback() {
    }
    
    /**
     * Callback for the end of recycler updates
     * Activated when all _displayed_ items are placed on their definitive position
     */
    private final void onRecyclerUpdated(int topItemPosition) {
    }
    
    private final void onContentHashToShowFirstChanged(long contentHash) {
    }
    
    private final boolean onItemClick(me.devsaki.hentoid.viewholders.ContentItem item) {
        return false;
    }
    
    private final void onDeleteSwipedBook(me.devsaki.hentoid.viewholders.ContentItem item) {
    }
    
    private final void onDeleteBooks(java.util.List<? extends me.devsaki.hentoid.database.domains.Content> c) {
    }
    
    private final void doCancelAll() {
    }
    
    @org.greenrobot.eventbus.Subscribe(sticky = true, threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onProcessStickyEvent(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.events.ProcessEvent event) {
    }
    
    private final void onDeleteComplete() {
    }
    
    private final void onRedownloadAllClick() {
    }
    
    private final void onCancelAllClick() {
    }
    
    /**
     * DRAG, DROP & SWIPE METHODS
     */
    @java.lang.Override
    public boolean itemTouchOnMove(int oldPosition, int newPosition) {
        return false;
    }
    
    @java.lang.Override
    public void itemTouchDropped(int oldPosition, int newPosition) {
    }
    
    @java.lang.Override
    public void itemTouchStopDrag(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
    }
    
    @java.lang.Override
    public void itemSwiped(int position, int direction) {
    }
    
    @java.lang.Override
    public void itemUnswiped(int position) {
    }
    
    /**
     * Callback for any selection change (item added to or removed from selection)
     */
    private final void onSelectionChanged2() {
    }
    
    private final void askRedownloadSelectedScratch() {
    }
    
    private final void redownloadSelected() {
    }
    
    private final void redownloadAll() {
    }
    
    @java.lang.Override
    public void redownloadContent(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.database.domains.Content content) {
    }
    
    @java.lang.Override
    public void itemTouchStartDrag(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
    }
    
    /**
     * Display the yes/no dialog to make sure the user really wants to delete selected items
     *
     * @param items Items to be deleted if the answer is yes
     */
    private final void askDeleteSelected(java.util.List<? extends me.devsaki.hentoid.database.domains.Content> items) {
    }
}