package me.devsaki.hentoid.fragments.library;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 /2\u00020\u0001:\u0001/B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0002J\u0016\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019H\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0011H\u0002J\u0012\u0010\u001f\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J$\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010(\u001a\u0004\u0018\u00010!H\u0016J\b\u0010)\u001a\u00020\u001dH\u0016J\u001a\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020#2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010,\u001a\u00020\u001d2\b\b\u0002\u0010-\u001a\u00020\u0013H\u0002J\b\u0010.\u001a\u00020\u001dH\u0003R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lme/devsaki/hentoid/fragments/library/LibraryTransformDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "_binding", "Lme/devsaki/hentoid/databinding/DialogLibraryTransformBinding;", "binding", "getBinding", "()Lme/devsaki/hentoid/databinding/DialogLibraryTransformBinding;", "contentIds", "", "contentIndex", "", "glideRequestOptions", "Lcom/bumptech/glide/request/RequestOptions;", "maxPages", "pageIndex", "buildParams", "Lme/devsaki/hentoid/util/image/ImageTransform$Params;", "checkRange", "", "text", "Lcom/google/android/material/textfield/TextInputLayout;", "minValue", "maxValue", "getCurrentBitmap", "Lkotlin/Pair;", "", "", "onActionClick", "", "params", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedState", "onDestroyView", "onViewCreated", "rootView", "refreshControls", "applyValues", "refreshPreview", "Companion", "app_debug"})
public final class LibraryTransformDialogFragment extends androidx.fragment.app.DialogFragment {
    private me.devsaki.hentoid.databinding.DialogLibraryTransformBinding _binding;
    private long[] contentIds;
    private int contentIndex = 0;
    private int pageIndex = 0;
    private int maxPages = -1;
    private final com.bumptech.glide.request.RequestOptions glideRequestOptions = null;
    @org.jetbrains.annotations.NotNull
    public static final me.devsaki.hentoid.fragments.library.LibraryTransformDialogFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_CONTENTS = "contents";
    
    public LibraryTransformDialogFragment() {
        super();
    }
    
    private final me.devsaki.hentoid.databinding.DialogLibraryTransformBinding getBinding() {
        return null;
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
    android.os.Bundle savedState) {
        return null;
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View rootView, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void refreshControls(boolean applyValues) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @kotlin.Suppress(names = {"ReplaceArrayEqualityOpWithArraysEquals"})
    private final void refreshPreview() {
    }
    
    private final kotlin.Pair<java.lang.String, byte[]> getCurrentBitmap() {
        return null;
    }
    
    private final me.devsaki.hentoid.util.image.ImageTransform.Params buildParams() {
        return null;
    }
    
    private final void onActionClick(me.devsaki.hentoid.util.image.ImageTransform.Params params) {
    }
    
    private final boolean checkRange(com.google.android.material.textfield.TextInputLayout text, int minValue, int maxValue) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lme/devsaki/hentoid/fragments/library/LibraryTransformDialogFragment$Companion;", "", "()V", "KEY_CONTENTS", "", "invoke", "", "parent", "Landroidx/fragment/app/Fragment;", "contentList", "", "Lme/devsaki/hentoid/database/domains/Content;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void invoke(@org.jetbrains.annotations.NotNull
        androidx.fragment.app.Fragment parent, @org.jetbrains.annotations.NotNull
        java.util.List<? extends me.devsaki.hentoid.database.domains.Content> contentList) {
        }
    }
}