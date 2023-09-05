package me.devsaki.hentoid.fragments.tools;

import java.lang.System;

/**
 * Dialog for the settings metadata import feature
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\fH\u0002J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\fH\u0016J\u001a\u0010\u001b\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u001a\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0010H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lme/devsaki/hentoid/fragments/tools/SettingsImportDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "binding", "Lme/devsaki/hentoid/databinding/DialogToolsSettingsImportBinding;", "dismissHandler", "Landroid/os/Handler;", "pickFile", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "checkFile", "", "jsonFile", "Landroidx/documentfile/provider/DocumentFile;", "deserialiseJson", "Lme/devsaki/hentoid/json/JsonSettings;", "finish", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedState", "Landroid/os/Bundle;", "onDestroyView", "onFileDeserialized", "collection", "onFilePickerResult", "resultCode", "uri", "Landroid/net/Uri;", "onViewCreated", "rootView", "savedInstanceState", "runImport", "settings", "Companion", "app_release"})
public final class SettingsImportDialogFragment extends androidx.fragment.app.DialogFragment {
    private me.devsaki.hentoid.databinding.DialogToolsSettingsImportBinding binding;
    private android.os.Handler dismissHandler;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.Integer> pickFile = null;
    @org.jetbrains.annotations.NotNull
    public static final me.devsaki.hentoid.fragments.tools.SettingsImportDialogFragment.Companion Companion = null;
    
    public SettingsImportDialogFragment() {
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
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View rootView, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    private final void onFilePickerResult(int resultCode, android.net.Uri uri) {
    }
    
    private final void checkFile(androidx.documentfile.provider.DocumentFile jsonFile) {
    }
    
    private final void onFileDeserialized(me.devsaki.hentoid.json.JsonSettings collection, androidx.documentfile.provider.DocumentFile jsonFile) {
    }
    
    private final me.devsaki.hentoid.json.JsonSettings deserialiseJson(androidx.documentfile.provider.DocumentFile jsonFile) {
        return null;
    }
    
    private final void runImport(me.devsaki.hentoid.json.JsonSettings settings) {
    }
    
    private final void finish() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lme/devsaki/hentoid/fragments/tools/SettingsImportDialogFragment$Companion;", "", "()V", "invoke", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void invoke(@org.jetbrains.annotations.NotNull
        androidx.fragment.app.FragmentManager fragmentManager) {
        }
    }
}