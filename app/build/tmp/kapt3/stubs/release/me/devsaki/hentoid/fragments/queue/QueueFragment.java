package me.devsaki.hentoid.fragments.queue;

import java.lang.System;

/**
 * Downloads queue screen
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00fa\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u00104\u001a\u000205H\u0002J\u0016\u00106\u001a\u0002052\f\u00107\u001a\b\u0012\u0004\u0012\u00020908H\u0002J\b\u0010:\u001a\u000205H\u0002J\u0016\u0010;\u001a\u0002052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\b\u0010<\u001a\u000205H\u0002J\b\u0010=\u001a\u000205H\u0002J\u0010\u0010>\u001a\u0002052\u0006\u0010?\u001a\u00020@H\u0002J\u0010\u0010A\u001a\u00020#2\u0006\u0010B\u001a\u00020#H\u0003J\u001a\u0010A\u001a\u00020+2\u0006\u0010B\u001a\u00020#2\b\u0010C\u001a\u0004\u0018\u00010+H\u0002J\b\u0010D\u001a\u00020#H\u0002J\b\u0010E\u001a\u000205H\u0002J\b\u0010F\u001a\u000205H\u0002J\b\u0010G\u001a\u00020\u001dH\u0002J\b\u0010H\u001a\u00020\u001dH\u0002J\u0018\u0010I\u001a\u0002052\u0006\u0010J\u001a\u00020#2\u0006\u0010K\u001a\u00020#H\u0016J\u0018\u0010L\u001a\u0002052\u0006\u0010M\u001a\u00020#2\u0006\u0010N\u001a\u00020#H\u0016J\u0018\u0010O\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020#2\u0006\u0010N\u001a\u00020#H\u0016J\u0010\u0010P\u001a\u0002052\u0006\u0010Q\u001a\u00020RH\u0016J\u0010\u0010S\u001a\u0002052\u0006\u0010Q\u001a\u00020RH\u0016J\u0010\u0010T\u001a\u0002052\u0006\u0010J\u001a\u00020#H\u0016J\b\u0010U\u001a\u000205H\u0002J\u0010\u0010V\u001a\u0002052\u0006\u0010W\u001a\u00020XH\u0016J\b\u0010Y\u001a\u000205H\u0002J\u0016\u0010Z\u001a\u0002052\f\u0010[\u001a\b\u0012\u0004\u0012\u00020908H\u0002J\b\u0010\\\u001a\u000205H\u0002J\u0010\u0010]\u001a\u0002052\u0006\u0010^\u001a\u00020\u001bH\u0002J\u0012\u0010_\u001a\u0002052\b\u0010`\u001a\u0004\u0018\u00010aH\u0016J$\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020e2\b\u0010f\u001a\u0004\u0018\u00010g2\b\u0010`\u001a\u0004\u0018\u00010aH\u0016J\b\u0010h\u001a\u000205H\u0016J\u0010\u0010i\u001a\u0002052\u0006\u0010?\u001a\u00020@H\u0007J\u0010\u0010j\u001a\u00020\u001d2\u0006\u0010^\u001a\u00020\u001bH\u0002J\u0010\u0010k\u001a\u0002052\u0006\u0010l\u001a\u00020#H\u0002J\u0010\u0010m\u001a\u0002052\u0006\u0010?\u001a\u00020nH\u0007J\u0010\u0010o\u001a\u0002052\u0006\u0010?\u001a\u00020pH\u0007J\u0016\u0010q\u001a\u0002052\f\u0010r\u001a\b\u0012\u0004\u0012\u00020s08H\u0002J\u0010\u0010t\u001a\u0002052\u0006\u0010/\u001a\u00020#H\u0002J\b\u0010u\u001a\u000205H\u0016J\b\u0010v\u001a\u000205H\u0002J\u0010\u0010w\u001a\u00020\u001d2\u0006\u0010x\u001a\u00020yH\u0003J\u0010\u0010z\u001a\u0002052\u0006\u0010?\u001a\u00020{H\u0007J\b\u0010|\u001a\u000205H\u0002J\u001a\u0010}\u001a\u0002052\u0006\u0010~\u001a\u00020c2\b\u0010`\u001a\u0004\u0018\u00010aH\u0016J3\u0010\u007f\u001a\u0002052\r\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020#082\u001a\u0010\u0081\u0001\u001a\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020#08\u0012\u0004\u0012\u0002050\u0082\u0001H\u0002J\u001b\u0010\u0083\u0001\u001a\u0002052\u0007\u0010\u0084\u0001\u001a\u00020#2\u0007\u0010\u0085\u0001\u001a\u00020#H\u0002J\u0018\u0010\u0083\u0001\u001a\u0002052\r\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020#08H\u0002J\t\u0010\u0086\u0001\u001a\u000205H\u0002J-\u0010\u0087\u0001\u001a\u0002052\t\b\u0002\u0010\u0088\u0001\u001a\u00020#2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010+2\u000b\b\u0002\u0010\u0089\u0001\u001a\u0004\u0018\u000109H\u0002J\u0012\u0010\u008a\u0001\u001a\u0002052\u0007\u0010\u008b\u0001\u001a\u00020\u001dH\u0002J&\u0010\u008a\u0001\u001a\u0002052\u0007\u0010\u0089\u0001\u001a\u0002092\u0007\u0010\u008b\u0001\u001a\u00020\u001d2\t\b\u0002\u0010\u008c\u0001\u001a\u00020\u001dH\u0002JH\u0010\u008a\u0001\u001a\u0002052\u0007\u0010\u0089\u0001\u001a\u0002092\u0007\u0010\u008d\u0001\u001a\u00020#2\u0007\u0010\u008e\u0001\u001a\u00020#2\u0007\u0010\u008f\u0001\u001a\u00020#2\u0007\u0010\u0090\u0001\u001a\u00020#2\u0007\u0010\u0091\u0001\u001a\u00020\u00172\u0007\u0010\u0092\u0001\u001a\u00020\u001dH\u0002J\u0012\u0010\u0093\u0001\u001a\u0002052\u0007\u0010\u0094\u0001\u001a\u00020\u0017H\u0002J\u0012\u0010\u0095\u0001\u001a\u0002052\u0007\u0010\u0096\u0001\u001a\u00020\u001dH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020#0%X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020#0%X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001b0.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0097\u0001"}, d2 = {"Lme/devsaki/hentoid/fragments/queue/QueueFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/mikepenz/fastadapter/drag/ItemTouchCallback;", "Lcom/mikepenz/fastadapter/swipe/SimpleSwipeDrawerCallback$ItemSwipeCallback;", "()V", "_binding", "Lme/devsaki/hentoid/databinding/FragmentQueueBinding;", "_bottomBarBinding", "Lme/devsaki/hentoid/databinding/IncludeQueueBottomBarBinding;", "activity", "Ljava/lang/ref/WeakReference;", "Lme/devsaki/hentoid/activities/QueueActivity;", "binding", "getBinding", "()Lme/devsaki/hentoid/databinding/FragmentQueueBinding;", "bottomBarBinding", "getBottomBarBinding", "()Lme/devsaki/hentoid/databinding/IncludeQueueBottomBarBinding;", "callback", "Landroidx/activity/OnBackPressedCallback;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "contentHashToDisplayFirst", "", "contentId", "fastAdapter", "Lcom/mikepenz/fastadapter/FastAdapter;", "Lme/devsaki/hentoid/viewholders/ContentItem;", "invalidateNextQueryTextChange", "", "isCancelingAll", "isPreparingDownload", "itemAdapter", "Lcom/mikepenz/fastadapter/adapters/ItemAdapter;", "itemToRefreshIndex", "", "listRefreshDebouncer", "Lme/devsaki/hentoid/util/DebouncerK;", "llm", "Landroidx/recyclerview/widget/LinearLayoutManager;", "newSearch", "offsetTop", "query", "", "searchClearDebouncer", "selectExtension", "Lcom/mikepenz/fastadapter/select/SelectExtension;", "topItemPosition", "touchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "viewModel", "Lme/devsaki/hentoid/viewmodels/QueueViewModel;", "addCustomBackControl", "", "askDeleteSelected", "items", "", "Lme/devsaki/hentoid/database/domains/Content;", "askRedownloadSelectedScratch", "attachButtons", "customBackPress", "differEndCallback", "displayMotive", "event", "Lme/devsaki/hentoid/events/DownloadEvent;", "formatStep", "step", "log", "getTopItemPosition", "initSelectionToolbar", "initToolbar", "isEmpty", "isPaused", "itemSwiped", "position", "direction", "itemTouchDropped", "oldPosition", "newPosition", "itemTouchOnMove", "itemTouchStartDrag", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemTouchStopDrag", "itemUnswiped", "leaveSelectionMode", "onAttach", "context", "Landroid/content/Context;", "onCancelAll", "onCancelBooks", "c", "onCancelComplete", "onCancelSwipedBook", "item", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDownloadEvent", "onItemClick", "onNewModeSelected", "downloadMode", "onPrepDownloadEvent", "Lme/devsaki/hentoid/events/DownloadPreparationEvent;", "onProcessStickyEvent", "Lme/devsaki/hentoid/events/ProcessEvent;", "onQueueChanged", "result", "Lme/devsaki/hentoid/database/domains/QueueRecord;", "onRecyclerUpdated", "onResume", "onSelectionChanged2", "onSelectionMenuItemClicked", "menuItem", "Landroid/view/MenuItem;", "onServiceDestroyed", "Lme/devsaki/hentoid/events/ServiceDestroyedEvent;", "onSettingsClick", "onViewCreated", "view", "processMove", "positions", "consumer", "Lkotlin/Function1;", "recordMoveFromFirstPos", "from", "to", "showErrorStats", "updateControlBar", "preparationStep", "content", "updateProgress", "isPausedevent", "isIndividual", "pagesOK", "pagesKO", "totalPages", "numberRetries", "downloadedSizeB", "forceDisplay", "updateSelectionToolbar", "selectedCount", "updateSelectionToolbarVis", "vis", "app_release"})
public final class QueueFragment extends androidx.fragment.app.Fragment implements com.mikepenz.fastadapter.drag.ItemTouchCallback, com.mikepenz.fastadapter.swipe.SimpleSwipeDrawerCallback.ItemSwipeCallback {
    private me.devsaki.hentoid.databinding.FragmentQueueBinding _binding;
    private me.devsaki.hentoid.databinding.IncludeQueueBottomBarBinding _bottomBarBinding;
    private androidx.recyclerview.widget.LinearLayoutManager llm;
    private androidx.activity.OnBackPressedCallback callback;
    private me.devsaki.hentoid.viewmodels.QueueViewModel viewModel;
    private java.lang.ref.WeakReference<me.devsaki.hentoid.activities.QueueActivity> activity;
    private final com.mikepenz.fastadapter.adapters.ItemAdapter<me.devsaki.hentoid.viewholders.ContentItem> itemAdapter = null;
    private final com.mikepenz.fastadapter.FastAdapter<me.devsaki.hentoid.viewholders.ContentItem> fastAdapter = null;
    private final com.mikepenz.fastadapter.select.SelectExtension<me.devsaki.hentoid.viewholders.ContentItem> selectExtension = null;
    private androidx.recyclerview.widget.ItemTouchHelper touchHelper;
    private boolean isPreparingDownload = false;
    private boolean isCancelingAll = false;
    private long contentId = -1L;
    private java.lang.String query = "";
    private boolean invalidateNextQueryTextChange = false;
    private long contentHashToDisplayFirst = 0L;
    private me.devsaki.hentoid.util.DebouncerK<java.lang.Integer> listRefreshDebouncer;
    private int itemToRefreshIndex = -1;
    private me.devsaki.hentoid.util.DebouncerK<java.lang.Integer> searchClearDebouncer;
    private int topItemPosition = -1;
    private int offsetTop = 0;
    private boolean newSearch = false;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    
    public QueueFragment() {
        super();
    }
    
    private final me.devsaki.hentoid.databinding.FragmentQueueBinding getBinding() {
        return null;
    }
    
    private final me.devsaki.hentoid.databinding.IncludeQueueBottomBarBinding getBottomBarBinding() {
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
    
    private final void addCustomBackControl() {
    }
    
    private final void customBackPress() {
    }
    
    private final void initToolbar() {
    }
    
    private final void initSelectionToolbar() {
    }
    
    private final void updateSelectionToolbarVis(boolean vis) {
    }
    
    private final void processMove(java.util.List<java.lang.Integer> positions, kotlin.jvm.functions.Function1<? super java.util.List<java.lang.Integer>, kotlin.Unit> consumer) {
    }
    
    private final void attachButtons(com.mikepenz.fastadapter.FastAdapter<me.devsaki.hentoid.viewholders.ContentItem> fastAdapter) {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Download event handler
     *
     * @param event Broadcasted event
     */
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onDownloadEvent(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.events.DownloadEvent event) {
    }
    
    private final void displayMotive(me.devsaki.hentoid.events.DownloadEvent event) {
    }
    
    private final java.lang.String formatStep(@me.devsaki.hentoid.events.DownloadEvent.Step
    int step, java.lang.String log) {
        return null;
    }
    
    @androidx.annotation.StringRes
    private final int formatStep(@me.devsaki.hentoid.events.DownloadEvent.Step
    int step) {
        return 0;
    }
    
    /**
     * Download preparation event handler
     *
     * @param event Broadcasted event
     */
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onPrepDownloadEvent(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.events.DownloadPreparationEvent event) {
    }
    
    /**
     * Service destroyed event handler
     *
     * @param event Broadcasted event
     */
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onServiceDestroyed(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.events.ServiceDestroyedEvent event) {
    }
    
    /**
     * Update main progress bar and bottom progress panel for current (1st in queue) book
     *
     * @param pagesOK         Number of pages successfully downloaded for current (1st in queue) book
     * @param pagesKO         Number of pages whose download has failed for current (1st in queue) book
     * @param totalPages      Total pages of current (1st in queue) book
     * @param numberRetries   Current number of download auto-retries for current (1st in queue) book
     * @param downloadedSizeB Current size of downloaded content (in bytes)
     * @param forceDisplay    True to force display even if the queue is paused
     */
    private final void updateProgress(me.devsaki.hentoid.database.domains.Content content, int pagesOK, int pagesKO, int totalPages, int numberRetries, long downloadedSizeB, boolean forceDisplay) {
    }
    
    private final boolean isPaused() {
        return false;
    }
    
    private final boolean isEmpty() {
        return false;
    }
    
    private final void onQueueChanged(java.util.List<? extends me.devsaki.hentoid.database.domains.QueueRecord> result) {
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
    
    private final void updateControlBar(@me.devsaki.hentoid.events.DownloadEvent.Step
    int preparationStep, java.lang.String log, me.devsaki.hentoid.database.domains.Content content) {
    }
    
    private final void showErrorStats() {
    }
    
    private final void updateProgress(boolean isPausedevent) {
    }
    
    private final void updateProgress(me.devsaki.hentoid.database.domains.Content content, boolean isPausedevent, boolean isIndividual) {
    }
    
    private final boolean onItemClick(me.devsaki.hentoid.viewholders.ContentItem item) {
        return false;
    }
    
    private final void onCancelSwipedBook(me.devsaki.hentoid.viewholders.ContentItem item) {
    }
    
    private final void onCancelBooks(java.util.List<? extends me.devsaki.hentoid.database.domains.Content> c) {
    }
    
    private final void onCancelAll() {
    }
    
    @org.greenrobot.eventbus.Subscribe(sticky = true, threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onProcessStickyEvent(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.events.ProcessEvent event) {
    }
    
    private final void onCancelComplete() {
    }
    
    /**
     * Calculate the position of the top visible item of the book list
     *
     * @return position of the top visible item of the book list
     */
    private final int getTopItemPosition() {
        return 0;
    }
    
    /**
     * DRAG, DROP & SWIPE METHODS
     */
    private final void recordMoveFromFirstPos(int from, int to) {
    }
    
    private final void recordMoveFromFirstPos(java.util.List<java.lang.Integer> positions) {
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
    
    @java.lang.Override
    public void itemSwiped(int position, int direction) {
    }
    
    @java.lang.Override
    public void itemUnswiped(int position) {
    }
    
    /**
     * Show the viewer settings dialog
     */
    private final void onSettingsClick() {
    }
    
    @android.annotation.SuppressLint(value = {"NonConstantResourceId"})
    private final boolean onSelectionMenuItemClicked(android.view.MenuItem menuItem) {
        return false;
    }
    
    private final void leaveSelectionMode() {
    }
    
    private final void onNewModeSelected(int downloadMode) {
    }
    
    private final void updateSelectionToolbar(long selectedCount) {
    }
    
    /**
     * Callback for any selection change (item added to or removed from selection)
     */
    private final void onSelectionChanged2() {
    }
    
    /**
     * Display the yes/no dialog to make sure the user really wants to delete selected items
     *
     * @param items Items to be deleted if the answer is yes
     */
    private final void askDeleteSelected(java.util.List<? extends me.devsaki.hentoid.database.domains.Content> items) {
    }
    
    private final void askRedownloadSelectedScratch() {
    }
}