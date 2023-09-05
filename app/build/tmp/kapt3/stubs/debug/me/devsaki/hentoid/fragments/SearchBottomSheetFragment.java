package me.devsaki.hentoid.fragments;

import java.lang.System;

/**
 * Bottom fragment that displays the available attributes in the advanced search screen
 * <p>
 * TODO 1 : look into recyclerview.extensions.ListAdapter for a RecyclerView.Adapter that can issue
 * appropriate notify commands based on list diff
 * <p>
 * TODO 2 : Use PagedList and FastAdapter to reduce boilerplate code used to display the endless list of available attributes
 * NB : only possible when ObjectBox implements SELECT Object.Field, COUNT(Object.Field) GROUP BY Object.Field to handle
 * source selection in a native ObjectBox query.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 42\u00020\u0001:\u00014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\bH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%H\u0002J$\u0010&\u001a\u00020\"2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020\u001cH\u0016J\b\u0010.\u001a\u00020\u001cH\u0016J\u001a\u0010/\u001a\u00020\u001c2\u0006\u00100\u001a\u00020\"2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u00020\u0010H\u0002J \u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lme/devsaki/hentoid/fragments/SearchBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "attributeAdapter", "Lme/devsaki/hentoid/adapters/AvailableAttributeAdapter;", "binding", "Lme/devsaki/hentoid/databinding/IncludeSearchBottomPanelBinding;", "clearOnSuccess", "", "currentPage", "", "excludeAttr", "isInitialized", "mTotalSelectedCount", "searchMasterDataDebouncer", "Lme/devsaki/hentoid/util/DebouncerK;", "", "selectedAttributeTypes", "", "Lme/devsaki/hentoid/enums/AttributeType;", "viewModel", "Lme/devsaki/hentoid/viewmodels/SearchViewModel;", "getSearchableInfo", "Landroid/app/SearchableInfo;", "activity", "Landroid/app/Activity;", "isLastPage", "loadMore", "", "onAttach", "context", "Landroid/content/Context;", "onAttributeChosen", "button", "Landroid/view/View;", "onAttributesReady", "results", "Lme/devsaki/hentoid/util/SearchHelper$AttributeQueryResult;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onResume", "onViewCreated", "view", "searchMasterData", "filter", "displayLoadingImage", "Companion", "app_debug"})
public final class SearchBottomSheetFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private me.devsaki.hentoid.viewmodels.SearchViewModel viewModel;
    private me.devsaki.hentoid.databinding.IncludeSearchBottomPanelBinding binding;
    
    /**
     * Strings submitted to this will be debounced to [.searchMasterData] after the given
     * delay.
     *
     * @see Debouncer
     */
    private me.devsaki.hentoid.util.DebouncerK<java.lang.String> searchMasterDataDebouncer;
    private me.devsaki.hentoid.adapters.AvailableAttributeAdapter attributeAdapter;
    private boolean clearOnSuccess = false;
    private int currentPage = 0;
    private int mTotalSelectedCount = 0;
    private java.util.List<? extends me.devsaki.hentoid.enums.AttributeType> selectedAttributeTypes;
    private boolean isInitialized = false;
    private boolean excludeAttr = false;
    @org.jetbrains.annotations.NotNull
    public static final me.devsaki.hentoid.fragments.SearchBottomSheetFragment.Companion Companion = null;
    public static final int ATTRS_PER_PAGE = 40;
    
    public SearchBottomSheetFragment() {
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
    public void onResume() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    /**
     * Load the attributes corresponding to the given AttributeType, filtered with the given
     * string (applying "contains" filter)
     *
     * @param filter Filter to apply to the attributes name (only retrieve attributes with name like
     * %s%)
     */
    private final void searchMasterData(java.lang.String filter) {
    }
    
    /**
     * Search the attributes master data according to the given parameters
     *
     * @param filter              Filter to apply to the attributes name (only retrieve attributes with name like %s%)
     * @param displayLoadingImage True if a "loading..." image has to be displayed
     * @param clearOnSuccess      True if the currently displayed list should be clear when this call succeeds
     * (should be true for new searches; false for "load more" queries)
     */
    private final void searchMasterData(java.lang.String filter, boolean displayLoadingImage, boolean clearOnSuccess) {
    }
    
    /**
     * Observer for changes in the available attributes (= query results)
     *
     * @param results Available attributes according to current search query
     */
    private final void onAttributesReady(me.devsaki.hentoid.util.SearchHelper.AttributeQueryResult results) {
    }
    
    /**
     * Handler for Attribute button click
     *
     * @param button Button that has been clicked on
     */
    private final void onAttributeChosen(android.view.View button) {
    }
    
    /**
     * Utility method
     *
     * @param activity the activity to get the SearchableInfo from
     */
    private final android.app.SearchableInfo getSearchableInfo(android.app.Activity activity) {
        return null;
    }
    
    /**
     * Indicates if the current "page" of loaded attributes is the last one
     */
    private final boolean isLastPage() {
        return false;
    }
    
    /**
     * Callback when the recyclerview has reached the end of loaded items
     * Load the next set of items
     */
    private final void loadMore() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lme/devsaki/hentoid/fragments/SearchBottomSheetFragment$Companion;", "", "()V", "ATTRS_PER_PAGE", "", "invoke", "", "context", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "types", "", "Lme/devsaki/hentoid/enums/AttributeType;", "excludeClicked", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void invoke(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull
        java.util.List<? extends me.devsaki.hentoid.enums.AttributeType> types, boolean excludeClicked) {
        }
    }
}