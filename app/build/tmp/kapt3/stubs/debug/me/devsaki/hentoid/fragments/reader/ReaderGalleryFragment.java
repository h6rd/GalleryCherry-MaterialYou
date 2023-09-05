package me.devsaki.hentoid.fragments.reader;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00d2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u001c\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001uB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u00100\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020403H\u0002J\u0010\u00105\u001a\u0002012\u0006\u00106\u001a\u000204H\u0002J\b\u00107\u001a\u00020\u001bH\u0002J\u0018\u00108\u001a\u0002012\u0006\u00109\u001a\u00020+2\u0006\u0010:\u001a\u00020+H\u0016J\u0018\u0010;\u001a\u00020\u001b2\u0006\u00109\u001a\u00020+2\u0006\u0010:\u001a\u00020+H\u0016J\u0010\u0010<\u001a\u0002012\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010?\u001a\u0002012\u0006\u0010=\u001a\u00020>H\u0016J\u0018\u0010@\u001a\u0002012\u0006\u0010A\u001a\u00020+2\u0006\u0010B\u001a\u00020\u001bH\u0002J\u0010\u0010C\u001a\u0002012\u0006\u0010D\u001a\u00020EH\u0016J\b\u0010F\u001a\u000201H\u0002J\b\u0010G\u001a\u000201H\u0002J\b\u0010H\u001a\u000201H\u0002J\u0012\u0010I\u001a\u0002012\b\u0010J\u001a\u0004\u0018\u00010KH\u0002J$\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010Q2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\u0010\u0010T\u001a\u0002012\u0006\u0010U\u001a\u00020VH\u0002J\b\u0010W\u001a\u000201H\u0016J\b\u0010X\u001a\u000201H\u0002J\u0016\u0010Y\u001a\u0002012\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020403H\u0002J\u0010\u0010[\u001a\u00020\u001b2\u0006\u00106\u001a\u00020\u0019H\u0002J\u0014\u0010\\\u001a\u00020\u001b2\n\u00106\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002J\b\u0010]\u001a\u000201H\u0002J\u0010\u0010^\u001a\u00020\u001b2\u0006\u0010_\u001a\u00020\bH\u0003J\u0010\u0010`\u001a\u0002012\u0006\u0010a\u001a\u00020\u001bH\u0002J\u0010\u0010b\u001a\u0002012\u0006\u0010c\u001a\u00020\u001bH\u0002J\b\u0010d\u001a\u000201H\u0016J\u0010\u0010e\u001a\u0002012\u0006\u0010f\u001a\u00020+H\u0002J\b\u0010g\u001a\u000201H\u0016J\u001a\u0010h\u001a\u0002012\u0006\u0010i\u001a\u00020M2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\u0010\u0010j\u001a\u0002012\u0006\u0010k\u001a\u00020\u000fH\u0002J\b\u0010l\u001a\u000201H\u0002J\u0010\u0010m\u001a\u0002012\u0006\u0010n\u001a\u00020\u001bH\u0002J\u0010\u0010o\u001a\u0002012\u0006\u0010p\u001a\u00020\u001bH\u0002J\u0010\u0010q\u001a\u0002012\u0006\u0010r\u001a\u00020sH\u0002J\b\u0010t\u001a\u000201H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00190\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006v"}, d2 = {"Lme/devsaki/hentoid/fragments/reader/ReaderGalleryFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/mikepenz/fastadapter/drag/ItemTouchCallback;", "()V", "activity", "Ljava/lang/ref/WeakReference;", "Lme/devsaki/hentoid/activities/ReaderActivity;", "addChapterMenu", "Landroid/view/MenuItem;", "binding", "Lme/devsaki/hentoid/databinding/FragmentReaderGalleryBinding;", "cancelReorderMenu", "confirmReorderMenu", "editChaptersMenu", "editMode", "Lme/devsaki/hentoid/fragments/reader/ReaderGalleryFragment$EditMode;", "expandableExtension", "Lcom/mikepenz/fastadapter/expandable/ExpandableExtension;", "Lme/devsaki/hentoid/viewholders/INestedItem;", "Lme/devsaki/hentoid/viewholders/SubExpandableItem$ViewHolder;", "expandableFastAdapter", "Lcom/mikepenz/fastadapter/FastAdapter;", "expandableItemAdapter", "Lcom/mikepenz/fastadapter/adapters/ItemAdapter;", "fastAdapter", "Lme/devsaki/hentoid/viewholders/ImageFileItem;", "filterFavouritesState", "", "firstMoveDone", "imageDiffCallback", "Lcom/mikepenz/fastadapter/diff/DiffCallback;", "isContentDynamic", "isReorderingChapters", "itemAdapter", "itemSetCoverMenu", "mDragSelectTouchListener", "Lme/devsaki/hentoid/widget/DragSelectTouchListener;", "removeChaptersMenu", "selectExtension", "Lcom/mikepenz/fastadapter/select/SelectExtension;", "showFavouritePagesMenu", "shuffledState", "startIndex", "", "touchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "viewModel", "Lme/devsaki/hentoid/viewmodels/ReaderViewModel;", "askDeleteSelected", "", "items", "", "Lme/devsaki/hentoid/database/domains/ImageFile;", "askSetSelectedCover", "item", "hasFavourite", "itemTouchDropped", "oldPosition", "newPosition", "itemTouchOnMove", "itemTouchStartDrag", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemTouchStopDrag", "moveToIndex", "index", "force", "onAttach", "context", "Landroid/content/Context;", "onBackClick", "onCancelChapterReordering", "onConfirmChapterReordering", "onContentChanged", "content", "Lme/devsaki/hentoid/database/domains/Content;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteError", "t", "", "onDestroy", "onFavouriteSuccess", "onImagesChanged", "images", "onItemClick", "onNestedItemClick", "onSelectionChanged2", "onSelectionMenuItemClicked", "menuItem", "onShowFavouriteChanged", "showFavouriteOnly", "onShuffledChanged", "shuffled", "onStart", "onStartingIndexChanged", "startingIndex", "onStop", "onViewCreated", "view", "setChapterEditMode", "mode", "stripChapters", "updateFavouriteDisplay", "showFavouritePages", "updateListAdapter", "isChapterEditMode", "updateSelectionToolbar", "selectedCount", "", "updateToolbar", "EditMode", "app_debug"})
public final class ReaderGalleryFragment extends androidx.fragment.app.Fragment implements com.mikepenz.fastadapter.drag.ItemTouchCallback {
    private me.devsaki.hentoid.viewmodels.ReaderViewModel viewModel;
    private java.lang.ref.WeakReference<me.devsaki.hentoid.activities.ReaderActivity> activity;
    private me.devsaki.hentoid.databinding.FragmentReaderGalleryBinding binding;
    private android.view.MenuItem itemSetCoverMenu;
    private android.view.MenuItem showFavouritePagesMenu;
    private android.view.MenuItem editChaptersMenu;
    private android.view.MenuItem addChapterMenu;
    private android.view.MenuItem removeChaptersMenu;
    private android.view.MenuItem confirmReorderMenu;
    private android.view.MenuItem cancelReorderMenu;
    private final com.mikepenz.fastadapter.adapters.ItemAdapter<me.devsaki.hentoid.viewholders.ImageFileItem> itemAdapter = null;
    private final com.mikepenz.fastadapter.FastAdapter<me.devsaki.hentoid.viewholders.ImageFileItem> fastAdapter = null;
    private final com.mikepenz.fastadapter.select.SelectExtension<me.devsaki.hentoid.viewholders.ImageFileItem> selectExtension = null;
    private final com.mikepenz.fastadapter.adapters.ItemAdapter<me.devsaki.hentoid.viewholders.INestedItem<me.devsaki.hentoid.viewholders.SubExpandableItem.ViewHolder>> expandableItemAdapter = null;
    private final com.mikepenz.fastadapter.FastAdapter<me.devsaki.hentoid.viewholders.INestedItem<me.devsaki.hentoid.viewholders.SubExpandableItem.ViewHolder>> expandableFastAdapter = null;
    private final com.mikepenz.fastadapter.expandable.ExpandableExtension<me.devsaki.hentoid.viewholders.INestedItem<me.devsaki.hentoid.viewholders.SubExpandableItem.ViewHolder>> expandableExtension = null;
    private androidx.recyclerview.widget.ItemTouchHelper touchHelper;
    private me.devsaki.hentoid.widget.DragSelectTouchListener mDragSelectTouchListener;
    private int startIndex = 0;
    private boolean firstMoveDone = false;
    private boolean isContentDynamic = false;
    private me.devsaki.hentoid.fragments.reader.ReaderGalleryFragment.EditMode editMode = me.devsaki.hentoid.fragments.reader.ReaderGalleryFragment.EditMode.NONE;
    private boolean isReorderingChapters = false;
    private boolean filterFavouritesState = false;
    private boolean shuffledState = false;
    private final com.mikepenz.fastadapter.diff.DiffCallback<me.devsaki.hentoid.viewholders.ImageFileItem> imageDiffCallback = null;
    
    public ReaderGalleryFragment() {
        super();
    }
    
    @java.lang.Override
    public void onAttach(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
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
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    @java.lang.Override
    public void onStart() {
    }
    
    private final void onBackClick() {
    }
    
    @java.lang.Override
    public void onStop() {
    }
    
    private final void updateListAdapter(boolean isChapterEditMode) {
    }
    
    private final void onContentChanged(me.devsaki.hentoid.database.domains.Content content) {
    }
    
    private final void onImagesChanged(java.util.List<? extends me.devsaki.hentoid.database.domains.ImageFile> images) {
    }
    
    private final void onStartingIndexChanged(int startingIndex) {
    }
    
    private final void onShowFavouriteChanged(boolean showFavouriteOnly) {
    }
    
    private final void onShuffledChanged(boolean shuffled) {
    }
    
    @android.annotation.SuppressLint(value = {"NonConstantResourceId"})
    private final boolean onSelectionMenuItemClicked(android.view.MenuItem menuItem) {
        return false;
    }
    
    private final void updateToolbar() {
    }
    
    private final void updateSelectionToolbar(long selectedCount) {
    }
    
    private final boolean onItemClick(me.devsaki.hentoid.viewholders.ImageFileItem item) {
        return false;
    }
    
    private final boolean onNestedItemClick(me.devsaki.hentoid.viewholders.INestedItem<?> item) {
        return false;
    }
    
    private final void onFavouriteSuccess() {
    }
    
    private final void updateFavouriteDisplay(boolean showFavouritePages) {
    }
    
    /**
     * Returns true if the current book has at least a favourite
     *
     * @return True if the current book has at least a favourite
     */
    private final boolean hasFavourite() {
        return false;
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
    private final void askDeleteSelected(java.util.List<? extends me.devsaki.hentoid.database.domains.ImageFile> items) {
    }
    
    /**
     * Callback for the failure of the "delete item" action
     */
    private final void onDeleteError(java.lang.Throwable t) {
    }
    
    /**
     * Move the list to make the currently viewed image visible
     */
    private final void moveToIndex(int index, boolean force) {
    }
    
    /**
     * Display the yes/no dialog to make sure the user really wants to set the cover
     *
     * @param item Item that contains the image to set as a cover
     */
    private final void askSetSelectedCover(me.devsaki.hentoid.database.domains.ImageFile item) {
    }
    
    /**
     * Switch the screen into the given edit mode
     *
     * @param mode Edit mode to switch the screen to
     */
    private final void setChapterEditMode(me.devsaki.hentoid.fragments.reader.ReaderGalleryFragment.EditMode mode) {
    }
    
    /**
     * Strip all chapters from the current content
     */
    private final void stripChapters() {
    }
    
    @java.lang.Override
    public void itemTouchDropped(int oldPosition, int newPosition) {
    }
    
    @java.lang.Override
    public boolean itemTouchOnMove(int oldPosition, int newPosition) {
        return false;
    }
    
    @java.lang.Override
    public void itemTouchStartDrag(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
    }
    
    @java.lang.Override
    public void itemTouchStopDrag(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
    }
    
    private final void onConfirmChapterReordering() {
    }
    
    private final void onCancelChapterReordering() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lme/devsaki/hentoid/fragments/reader/ReaderGalleryFragment$EditMode;", "", "(Ljava/lang/String;I)V", "NONE", "EDIT_CHAPTERS", "ADD_CHAPTER", "app_debug"})
    public static enum EditMode {
        /*public static final*/ NONE /* = new NONE() */,
        /*public static final*/ EDIT_CHAPTERS /* = new EDIT_CHAPTERS() */,
        /*public static final*/ ADD_CHAPTER /* = new ADD_CHAPTER() */;
        
        EditMode() {
        }
    }
}