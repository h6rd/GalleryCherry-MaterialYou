package me.devsaki.hentoid.fragments.tools;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 42\u00020\u0001:\u00014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\fH\u0016J\u001a\u0010\u001d\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010$\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010%\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020&H\u0007J\u001a\u0010\'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u00152\b\u0010)\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010*\u001a\u00020\fH\u0002J@\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u0006H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lme/devsaki/hentoid/fragments/tools/MetaImportDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "binding", "Lme/devsaki/hentoid/databinding/DialogToolsMetaImportBinding;", "isServiceGracefulClose", "", "pickFile", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "checkFile", "", "jsonFile", "Landroidx/documentfile/provider/DocumentFile;", "deserialiseJson", "Lme/devsaki/hentoid/json/JsonContentCollection;", "importEvent", "event", "Lme/devsaki/hentoid/events/ProcessEvent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedState", "Landroid/os/Bundle;", "onDestroyView", "onFileDeserialized", "collection", "onFilePickerResult", "resultCode", "uri", "Landroid/net/Uri;", "onImportEvent", "onImportStickyEvent", "onServiceDestroyed", "Lme/devsaki/hentoid/events/ServiceDestroyedEvent;", "onViewCreated", "rootView", "savedInstanceState", "refreshDisplay", "runImport", "jsonUri", "", "add", "importLibrary", "emptyBooksOption", "importQueue", "importCustomGroups", "importBookmarks", "Companion", "app_debug"})
public final class MetaImportDialogFragment extends androidx.fragment.app.DialogFragment {
    private me.devsaki.hentoid.databinding.DialogToolsMetaImportBinding binding;
    private boolean isServiceGracefulClose = false;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.Integer> pickFile = null;
    @org.jetbrains.annotations.NotNull
    public static final me.devsaki.hentoid.fragments.tools.MetaImportDialogFragment.Companion Companion = null;
    public static final int DONT_IMPORT = 0;
    public static final int IMPORT_AS_EMPTY = 1;
    public static final int IMPORT_AS_STREAMED = 2;
    public static final int IMPORT_AS_ERROR = 3;
    
    public MetaImportDialogFragment() {
        super();
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
    
    private final void onFilePickerResult(int resultCode, android.net.Uri uri) {
    }
    
    private final void checkFile(androidx.documentfile.provider.DocumentFile jsonFile) {
    }
    
    private final void onFileDeserialized(me.devsaki.hentoid.json.JsonContentCollection collection, androidx.documentfile.provider.DocumentFile jsonFile) {
    }
    
    private final void refreshDisplay() {
    }
    
    private final me.devsaki.hentoid.json.JsonContentCollection deserialiseJson(androidx.documentfile.provider.DocumentFile jsonFile) {
        return null;
    }
    
    private final void runImport(java.lang.String jsonUri, boolean add, boolean importLibrary, int emptyBooksOption, boolean importQueue, boolean importCustomGroups, boolean importBookmarks) {
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lme/devsaki/hentoid/fragments/tools/MetaImportDialogFragment$Companion;", "", "()V", "DONT_IMPORT", "", "IMPORT_AS_EMPTY", "IMPORT_AS_ERROR", "IMPORT_AS_STREAMED", "invoke", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void invoke(@org.jetbrains.annotations.NotNull
        androidx.fragment.app.FragmentManager fragmentManager) {
        }
    }
}