package me.devsaki.hentoid.fragments.reader;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 42\u00020\u0001:\u00014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0002J$\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u0019H\u0002J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010\'\u001a\u00020\u0019H\u0016J\b\u0010(\u001a\u00020\u0019H\u0002J\u0016\u0010)\u001a\u00020\u00192\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0+H\u0002J\b\u0010,\u001a\u00020\u0019H\u0002J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020/H\u0002J\u001a\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u00102\u001a\u00020\u00192\u0006\u00103\u001a\u00020/H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lme/devsaki/hentoid/fragments/reader/ReaderImageBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "_binding", "Lme/devsaki/hentoid/databinding/IncludeReaderImageBottomPanelBinding;", "binding", "getBinding", "()Lme/devsaki/hentoid/databinding/IncludeReaderImageBottomPanelBinding;", "glideRequestOptions", "Lcom/bumptech/glide/request/RequestOptions;", "image", "Lme/devsaki/hentoid/database/domains/ImageFile;", "imageIndex", "", "scale", "", "viewModel", "Lme/devsaki/hentoid/viewmodels/ReaderViewModel;", "getImageDimensions", "Landroid/graphics/Point;", "context", "Landroid/content/Context;", "uri", "", "onAttach", "", "onCopyClick", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteClick", "onDeleteError", "t", "", "onDestroyView", "onFavouriteClick", "onImagesChanged", "images", "", "onShareClick", "onToggleFavouriteSuccess", "newState", "", "onViewCreated", "view", "updateFavouriteDisplay", "isFavourited", "Companion", "app_debug"})
public final class ReaderImageBottomSheetFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private me.devsaki.hentoid.viewmodels.ReaderViewModel viewModel;
    private me.devsaki.hentoid.databinding.IncludeReaderImageBottomPanelBinding _binding;
    private int imageIndex = -1;
    private float scale = -1.0F;
    private me.devsaki.hentoid.database.domains.ImageFile image;
    private final com.bumptech.glide.request.RequestOptions glideRequestOptions = null;
    @org.jetbrains.annotations.NotNull
    public static final me.devsaki.hentoid.fragments.reader.ReaderImageBottomSheetFragment.Companion Companion = null;
    
    public ReaderImageBottomSheetFragment() {
        super();
    }
    
    private final me.devsaki.hentoid.databinding.IncludeReaderImageBottomPanelBinding getBinding() {
        return null;
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
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Observer for changes in the book's list of images
     *
     * @param images Book's list of images
     */
    private final void onImagesChanged(java.util.List<? extends me.devsaki.hentoid.database.domains.ImageFile> images) {
    }
    
    /**
     * Handle click on "Favourite" action button
     */
    private final void onFavouriteClick() {
    }
    
    /**
     * Success callback when the new favourite'd state has been successfully persisted
     */
    private final void onToggleFavouriteSuccess(boolean newState) {
    }
    
    /**
     * Update the display of the "favourite page" action button
     *
     * @param isFavourited True if the button has to represent a favourite page; false instead
     */
    private final void updateFavouriteDisplay(boolean isFavourited) {
    }
    
    /**
     * Handle click on "Copy" action button
     */
    private final void onCopyClick() {
    }
    
    /**
     * Handle click on "Share" action button
     */
    private final void onShareClick() {
    }
    
    /**
     * Handle click on "Delete" action button
     */
    private final void onDeleteClick() {
    }
    
    /**
     * Return the given image's dimensions
     *
     * @param context Context to be used
     * @param uri     Uri of the image to be read
     * @return Dimensions (x,y) of the given image
     */
    private final android.graphics.Point getImageDimensions(android.content.Context context, java.lang.String uri) {
        return null;
    }
    
    /**
     * Callback for the failure of the "delete item" action
     */
    private final void onDeleteError(java.lang.Throwable t) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u00a8\u0006\r"}, d2 = {"Lme/devsaki/hentoid/fragments/reader/ReaderImageBottomSheetFragment$Companion;", "", "()V", "invoke", "", "context", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "imageIndex", "", "currentScale", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void invoke(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        androidx.fragment.app.FragmentManager fragmentManager, int imageIndex, float currentScale) {
        }
    }
}