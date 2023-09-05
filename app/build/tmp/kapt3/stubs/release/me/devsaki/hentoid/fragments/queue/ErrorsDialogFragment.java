package me.devsaki.hentoid.fragments.queue;

import java.lang.System;

/**
 * Info dialog for download errors details
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\rH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lme/devsaki/hentoid/fragments/queue/ErrorsDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "_binding", "Lme/devsaki/hentoid/databinding/DialogLibraryErrorsBinding;", "binding", "getBinding", "()Lme/devsaki/hentoid/databinding/DialogLibraryErrorsBinding;", "parent", "Lme/devsaki/hentoid/fragments/queue/ErrorsDialogFragment$Parent;", "createLog", "Lme/devsaki/hentoid/util/LogHelper$LogInfo;", "content", "Lme/devsaki/hentoid/database/domains/Content;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedState", "Landroid/os/Bundle;", "onViewCreated", "", "rootView", "savedInstanceState", "redownload", "shareErrorLog", "showErrorLog", "updateStats", "Companion", "Parent", "app_release"})
public final class ErrorsDialogFragment extends androidx.fragment.app.DialogFragment {
    private me.devsaki.hentoid.databinding.DialogLibraryErrorsBinding _binding;
    private me.devsaki.hentoid.fragments.queue.ErrorsDialogFragment.Parent parent;
    @org.jetbrains.annotations.NotNull
    public static final me.devsaki.hentoid.fragments.queue.ErrorsDialogFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ID = "ID";
    
    public ErrorsDialogFragment() {
        super();
    }
    
    private final me.devsaki.hentoid.databinding.DialogLibraryErrorsBinding getBinding() {
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
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View rootView, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void updateStats(me.devsaki.hentoid.database.domains.Content content) {
    }
    
    private final me.devsaki.hentoid.util.LogHelper.LogInfo createLog(me.devsaki.hentoid.database.domains.Content content) {
        return null;
    }
    
    private final void showErrorLog(me.devsaki.hentoid.database.domains.Content content) {
    }
    
    private final void shareErrorLog(me.devsaki.hentoid.database.domains.Content content) {
    }
    
    private final void redownload(me.devsaki.hentoid.database.domains.Content content) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lme/devsaki/hentoid/fragments/queue/ErrorsDialogFragment$Parent;", "", "redownloadContent", "", "content", "Lme/devsaki/hentoid/database/domains/Content;", "app_release"})
    public static abstract interface Parent {
        
        public abstract void redownloadContent(@org.jetbrains.annotations.NotNull
        me.devsaki.hentoid.database.domains.Content content);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lme/devsaki/hentoid/fragments/queue/ErrorsDialogFragment$Companion;", "", "()V", "ID", "", "invoke", "", "parentFragment", "Landroidx/fragment/app/Fragment;", "id", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void invoke(@org.jetbrains.annotations.NotNull
        androidx.fragment.app.Fragment parentFragment, long id) {
        }
    }
}