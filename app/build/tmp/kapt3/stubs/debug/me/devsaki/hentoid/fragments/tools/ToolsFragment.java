package me.devsaki.hentoid.fragments.tools;

import java.lang.System;

@kotlin.Suppress(names = {"PrivatePropertyName"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \'2\u00020\u00012\u00020\u0002:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u001c\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0005H\u0002J\u0018\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0016J\u001a\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lme/devsaki/hentoid/fragments/tools/ToolsFragment;", "Landroidx/preference/PreferenceFragmentCompat;", "Lme/devsaki/hentoid/fragments/tools/MassDeleteFragment$Companion$Parent;", "()V", "ACCESS_LATEST_LOGS", "", "ACCESS_RENAMING_RULES", "CLEAR_APP_CACHE", "CLEAR_BROWSER_CACHE", "DUPLICATE_DETECTOR_KEY", "EXPORT_LIBRARY", "EXPORT_SETTINGS", "IMPORT_LIBRARY", "IMPORT_SETTINGS", "rootView", "Landroid/view/View;", "getExportedSettings", "Lme/devsaki/hentoid/json/JsonSettings;", "onCreatePreferences", "", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "onDestroy", "onExportSettings", "onJsonSerialized", "json", "onMassDelete", "keepBookPrefs", "", "keepGroupPrefs", "onNavigateToScreen", "preferenceScreen", "Landroidx/preference/PreferenceScreen;", "onPreferenceTreeClick", "preference", "Landroidx/preference/Preference;", "onViewCreated", "view", "Companion", "app_debug"})
public final class ToolsFragment extends androidx.preference.PreferenceFragmentCompat implements me.devsaki.hentoid.fragments.tools.MassDeleteFragment.Companion.Parent {
    private final java.lang.String DUPLICATE_DETECTOR_KEY = "tools_duplicate_detector";
    private final java.lang.String EXPORT_LIBRARY = "export_library";
    private final java.lang.String IMPORT_LIBRARY = "import_library";
    private final java.lang.String EXPORT_SETTINGS = "export_settings";
    private final java.lang.String IMPORT_SETTINGS = "import_settings";
    private final java.lang.String ACCESS_RENAMING_RULES = "tools_renaming_rules";
    private final java.lang.String ACCESS_LATEST_LOGS = "tools_latest_logs";
    private final java.lang.String CLEAR_BROWSER_CACHE = "cache_browser";
    private final java.lang.String CLEAR_APP_CACHE = "cache_app";
    private android.view.View rootView;
    @org.jetbrains.annotations.NotNull
    public static final me.devsaki.hentoid.fragments.tools.ToolsFragment.Companion Companion = null;
    
    public ToolsFragment() {
        super();
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
    public void onCreatePreferences(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState, @org.jetbrains.annotations.Nullable
    java.lang.String rootKey) {
    }
    
    @java.lang.Override
    public boolean onPreferenceTreeClick(@org.jetbrains.annotations.NotNull
    androidx.preference.Preference preference) {
        return false;
    }
    
    @java.lang.Override
    public void onNavigateToScreen(@org.jetbrains.annotations.NotNull
    androidx.preference.PreferenceScreen preferenceScreen) {
    }
    
    private final void onExportSettings() {
    }
    
    private final me.devsaki.hentoid.json.JsonSettings getExportedSettings() {
        return null;
    }
    
    private final void onJsonSerialized(java.lang.String json) {
    }
    
    @java.lang.Override
    public void onMassDelete(boolean keepBookPrefs, boolean keepGroupPrefs) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lme/devsaki/hentoid/fragments/tools/ToolsFragment$Companion;", "", "()V", "newInstance", "Lme/devsaki/hentoid/fragments/tools/ToolsFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final me.devsaki.hentoid.fragments.tools.ToolsFragment newInstance() {
            return null;
        }
    }
}