package me.devsaki.hentoid.fragments.reader;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 /2\u00020\u0001:\u0001/B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J$\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010&\u001a\u00020\u0017H\u0016J\b\u0010\'\u001a\u00020\u0017H\u0002J\u001a\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u000bH\u0002J\u0010\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u000fH\u0002J\u0010\u0010.\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u000bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lme/devsaki/hentoid/fragments/reader/ReaderContentBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "_binding", "Lme/devsaki/hentoid/databinding/IncludeReaderContentBottomPanelBinding;", "binding", "getBinding", "()Lme/devsaki/hentoid/databinding/IncludeReaderContentBottomPanelBinding;", "contentId", "", "currentRating", "", "glideRequestOptions", "Lcom/bumptech/glide/request/RequestOptions;", "openOnTap", "", "stars", "", "Landroid/widget/ImageView;", "[Landroid/widget/ImageView;", "viewModel", "Lme/devsaki/hentoid/viewmodels/ReaderViewModel;", "onAttach", "", "context", "Landroid/content/Context;", "onContentChanged", "content", "Lme/devsaki/hentoid/database/domains/Content;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onFavouriteClick", "onViewCreated", "view", "setRating", "rating", "updateFavouriteDisplay", "isFavourited", "updateRatingDisplay", "Companion", "app_release"})
public final class ReaderContentBottomSheetFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private me.devsaki.hentoid.viewmodels.ReaderViewModel viewModel;
    private me.devsaki.hentoid.databinding.IncludeReaderContentBottomPanelBinding _binding;
    private final android.widget.ImageView[] stars = null;
    private long contentId = -1L;
    private boolean openOnTap = false;
    private int currentRating = -1;
    private final com.bumptech.glide.request.RequestOptions glideRequestOptions = null;
    @org.jetbrains.annotations.NotNull
    public static final me.devsaki.hentoid.fragments.reader.ReaderContentBottomSheetFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CONTENT_ID = "content_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String OPEN_ON_TAP = "open_on_tap";
    
    public ReaderContentBottomSheetFragment() {
        super();
    }
    
    private final me.devsaki.hentoid.databinding.IncludeReaderContentBottomPanelBinding getBinding() {
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
    
    private final void onContentChanged(me.devsaki.hentoid.database.domains.Content content) {
    }
    
    private final void updateFavouriteDisplay(boolean isFavourited) {
    }
    
    private final void updateRatingDisplay(int rating) {
    }
    
    private final void setRating(int rating) {
    }
    
    private final void onFavouriteClick() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lme/devsaki/hentoid/fragments/reader/ReaderContentBottomSheetFragment$Companion;", "", "()V", "CONTENT_ID", "", "OPEN_ON_TAP", "invoke", "", "context", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "contentId", "", "openOnTap", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void invoke(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        androidx.fragment.app.FragmentManager fragmentManager, long contentId, boolean openOnTap) {
        }
    }
}