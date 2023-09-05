package me.devsaki.hentoid.fragments.preferences;

import java.lang.System;

/**
 * Launcher dialog for the following features :
 * - Set/replace download folder
 * - Library refresh
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 @2\u00020\u0001:\u0002@AB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0003J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\u0012\u0010 \u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J$\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010*\u001a\u00020\u001cH\u0016J\u0018\u0010+\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0010\u0010/\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0018\u00100\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u000204H\u0007J\u001a\u00105\u001a\u00020\u001c2\u0006\u00106\u001a\u00020$2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010\u0014\u001a\u00020\u001cH\u0002JB\u00107\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u00108\u001a\u00020\u000e2\b\b\u0002\u00109\u001a\u00020\u000e2\b\b\u0002\u0010:\u001a\u00020\u000e2\b\b\u0002\u0010;\u001a\u00020\u000e2\b\b\u0002\u0010<\u001a\u00020\u000eH\u0002J\u0018\u0010=\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010?\u001a\u00020\u001cH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00110\u00110\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006B"}, d2 = {"Lme/devsaki/hentoid/fragments/preferences/LibRefreshDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "_binding1", "Lme/devsaki/hentoid/databinding/DialogPrefsRefreshBinding;", "_binding2", "Lme/devsaki/hentoid/databinding/IncludeImportStepsBinding;", "binding1", "getBinding1", "()Lme/devsaki/hentoid/databinding/DialogPrefsRefreshBinding;", "binding2", "getBinding2", "()Lme/devsaki/hentoid/databinding/IncludeImportStepsBinding;", "chooseFolder", "", "isServiceGracefulClose", "location", "Lme/devsaki/hentoid/enums/StorageLocation;", "parent", "Lme/devsaki/hentoid/fragments/preferences/LibRefreshDialogFragment$Parent;", "pickFolder", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "showOptions", "getMessage", "", "resultCode", "importEvent", "", "event", "Lme/devsaki/hentoid/events/ProcessEvent;", "onCancelExistingLibraryDialog", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedState", "onDestroyView", "onFolderPickerResult", "uri", "Landroid/net/Uri;", "onImportEvent", "onImportStickyEvent", "onScanHentoidFolderResult", "rootUri", "", "onServiceDestroyed", "Lme/devsaki/hentoid/events/ServiceDestroyedEvent;", "onViewCreated", "rootView", "runImport", "rename", "removePlaceholders", "renumberPages", "cleanAbsent", "cleanNoImages", "showImportProgressLayout", "askFolder", "updateOnSelectFolder", "Companion", "Parent", "app_release"})
public final class LibRefreshDialogFragment extends androidx.fragment.app.DialogFragment {
    private me.devsaki.hentoid.databinding.DialogPrefsRefreshBinding _binding1;
    private me.devsaki.hentoid.databinding.IncludeImportStepsBinding _binding2;
    private boolean showOptions = false;
    private boolean chooseFolder = false;
    private me.devsaki.hentoid.enums.StorageLocation location = me.devsaki.hentoid.enums.StorageLocation.NONE;
    private me.devsaki.hentoid.fragments.preferences.LibRefreshDialogFragment.Parent parent;
    private boolean isServiceGracefulClose = false;
    private final androidx.activity.result.ActivityResultLauncher<me.devsaki.hentoid.enums.StorageLocation> pickFolder = null;
    @org.jetbrains.annotations.NotNull
    public static final me.devsaki.hentoid.fragments.preferences.LibRefreshDialogFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SHOW_OPTIONS = "show_options";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CHOOSE_FOLDER = "choose_folder";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String LOCATION = "location";
    
    public LibRefreshDialogFragment() {
        super();
    }
    
    private final me.devsaki.hentoid.databinding.DialogPrefsRefreshBinding getBinding1() {
        return null;
    }
    
    private final me.devsaki.hentoid.databinding.IncludeImportStepsBinding getBinding2() {
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
    
    private final void runImport(me.devsaki.hentoid.enums.StorageLocation location, boolean rename, boolean removePlaceholders, boolean renumberPages, boolean cleanAbsent, boolean cleanNoImages) {
    }
    
    private final void showImportProgressLayout(boolean askFolder, me.devsaki.hentoid.enums.StorageLocation location) {
    }
    
    private final void pickFolder() {
    }
    
    private final void onFolderPickerResult(int resultCode, android.net.Uri uri) {
    }
    
    private final void onScanHentoidFolderResult(@me.devsaki.hentoid.util.ImportHelper.ProcessFolderResult
    int resultCode, java.lang.String rootUri) {
    }
    
    @androidx.annotation.StringRes
    private final int getMessage(@me.devsaki.hentoid.util.ImportHelper.ProcessFolderResult
    int resultCode) {
        return 0;
    }
    
    private final void onCancelExistingLibraryDialog() {
    }
    
    private final void updateOnSelectFolder() {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onImportEvent(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.events.ProcessEvent event) {
    }
    
    @org.greenrobot.eventbus.Subscribe(sticky = true, threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onImportStickyEvent(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.events.ProcessEvent event) {
    }
    
    private final void importEvent(me.devsaki.hentoid.events.ProcessEvent event) {
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lme/devsaki/hentoid/fragments/preferences/LibRefreshDialogFragment$Parent;", "", "onFolderSuccess", "", "app_release"})
    public static abstract interface Parent {
        
        public abstract void onFolderSuccess();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lme/devsaki/hentoid/fragments/preferences/LibRefreshDialogFragment$Companion;", "", "()V", "CHOOSE_FOLDER", "", "LOCATION", "SHOW_OPTIONS", "invoke", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "showOptions", "", "chooseFolder", "location", "Lme/devsaki/hentoid/enums/StorageLocation;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void invoke(@org.jetbrains.annotations.NotNull
        androidx.fragment.app.FragmentManager fragmentManager, boolean showOptions, boolean chooseFolder, @org.jetbrains.annotations.NotNull
        me.devsaki.hentoid.enums.StorageLocation location) {
        }
    }
}