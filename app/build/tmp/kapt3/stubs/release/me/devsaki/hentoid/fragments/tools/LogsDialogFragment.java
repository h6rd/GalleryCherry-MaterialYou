package me.devsaki.hentoid.fragments.tools;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0016\u0010\u001a\u001a\u00020\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0002J\u0016\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u001a\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\u0017H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006#"}, d2 = {"Lme/devsaki/hentoid/fragments/tools/LogsDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "binding", "Lme/devsaki/hentoid/databinding/DialogToolsAppLogsBinding;", "fastadapter", "Lcom/mikepenz/fastadapter/FastAdapter;", "Lme/devsaki/hentoid/viewholders/TextItem;", "Landroidx/documentfile/provider/DocumentFile;", "getFastadapter", "()Lcom/mikepenz/fastadapter/FastAdapter;", "itemAdapter", "Lcom/mikepenz/fastadapter/adapters/ItemAdapter;", "getLogs", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedState", "Landroid/os/Bundle;", "onDestroyView", "", "onGetSuccess", "files", "onItemClick", "", "item", "onViewCreated", "rootView", "savedInstanceState", "Companion", "app_release"})
public final class LogsDialogFragment extends androidx.fragment.app.DialogFragment {
    private me.devsaki.hentoid.databinding.DialogToolsAppLogsBinding binding;
    private final com.mikepenz.fastadapter.adapters.ItemAdapter<me.devsaki.hentoid.viewholders.TextItem<androidx.documentfile.provider.DocumentFile>> itemAdapter = null;
    @org.jetbrains.annotations.NotNull
    private final com.mikepenz.fastadapter.FastAdapter<me.devsaki.hentoid.viewholders.TextItem<androidx.documentfile.provider.DocumentFile>> fastadapter = null;
    @org.jetbrains.annotations.NotNull
    public static final me.devsaki.hentoid.fragments.tools.LogsDialogFragment.Companion Companion = null;
    
    public LogsDialogFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.mikepenz.fastadapter.FastAdapter<me.devsaki.hentoid.viewholders.TextItem<androidx.documentfile.provider.DocumentFile>> getFastadapter() {
        return null;
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
    
    private final void onGetSuccess(java.util.List<? extends androidx.documentfile.provider.DocumentFile> files) {
    }
    
    private final java.lang.Object getLogs(kotlin.coroutines.Continuation<? super java.util.List<? extends androidx.documentfile.provider.DocumentFile>> continuation) {
        return null;
    }
    
    private final boolean onItemClick(me.devsaki.hentoid.viewholders.TextItem<androidx.documentfile.provider.DocumentFile> item) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lme/devsaki/hentoid/fragments/tools/LogsDialogFragment$Companion;", "", "()V", "invoke", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void invoke(@org.jetbrains.annotations.NotNull
        androidx.fragment.app.FragmentManager fragmentManager) {
        }
    }
}