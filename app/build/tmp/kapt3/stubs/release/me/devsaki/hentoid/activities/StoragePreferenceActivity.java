package me.devsaki.hentoid.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\"\u0010\r\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0012\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u000eH\u0014J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010!\u001a\u00020\u000eH\u0016J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$H\u0007J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\u000eH\u0002J\b\u0010*\u001a\u00020\u000eH\u0014J\b\u0010+\u001a\u00020\u000eH\u0014J\b\u0010,\u001a\u00020\u000eH\u0014J\b\u0010-\u001a\u00020\u000eH\u0016J\b\u0010.\u001a\u00020\u000eH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lme/devsaki/hentoid/activities/StoragePreferenceActivity;", "Lme/devsaki/hentoid/activities/BaseActivity;", "Lme/devsaki/hentoid/fragments/preferences/DownloadStrategyDialogFragment$Parent;", "Lme/devsaki/hentoid/fragments/preferences/LibRefreshDialogFragment$Parent;", "()V", "binding", "Lme/devsaki/hentoid/databinding/ActivityPrefsStorageBinding;", "binding1", "Lme/devsaki/hentoid/databinding/IncludePrefsStorageVolumeBinding;", "binding2", "bindingExt", "viewModel", "Lme/devsaki/hentoid/viewmodels/PreferencesViewModel;", "bindLocation", "", "location", "Lme/devsaki/hentoid/enums/StorageLocation;", "uriStr", "", "bindUI", "confirmDetach", "confirmMerge", "nbBooks", "", "importLocation", "onActionClick", "anchor", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onDetachSelected", "onFolderSuccess", "onImportEventComplete", "event", "Lme/devsaki/hentoid/events/ProcessEvent;", "onMenuItemSelected", "", "item", "Landroid/view/MenuItem;", "onMergeToPrimaryOne", "onResume", "onStart", "onStop", "onStrategySelected", "refreshDisplay", "app_release"})
public final class StoragePreferenceActivity extends me.devsaki.hentoid.activities.BaseActivity implements me.devsaki.hentoid.fragments.preferences.DownloadStrategyDialogFragment.Parent, me.devsaki.hentoid.fragments.preferences.LibRefreshDialogFragment.Parent {
    private me.devsaki.hentoid.viewmodels.PreferencesViewModel viewModel;
    private me.devsaki.hentoid.databinding.ActivityPrefsStorageBinding binding;
    private me.devsaki.hentoid.databinding.IncludePrefsStorageVolumeBinding binding1;
    private me.devsaki.hentoid.databinding.IncludePrefsStorageVolumeBinding binding2;
    private me.devsaki.hentoid.databinding.IncludePrefsStorageVolumeBinding bindingExt;
    
    public StoragePreferenceActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
    
    @java.lang.Override
    protected void onStart() {
    }
    
    @java.lang.Override
    protected void onStop() {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    private final void bindUI() {
    }
    
    private final void refreshDisplay() {
    }
    
    private final void bindLocation(me.devsaki.hentoid.databinding.IncludePrefsStorageVolumeBinding binding, me.devsaki.hentoid.enums.StorageLocation location, java.lang.String uriStr) {
    }
    
    private final void importLocation(me.devsaki.hentoid.enums.StorageLocation location) {
    }
    
    private final void onActionClick(me.devsaki.hentoid.enums.StorageLocation location, android.view.View anchor) {
    }
    
    private final void onDetachSelected(me.devsaki.hentoid.enums.StorageLocation location) {
    }
    
    private final void confirmDetach(me.devsaki.hentoid.enums.StorageLocation location) {
    }
    
    private final void onMergeToPrimaryOne() {
    }
    
    private final void confirmMerge(long nbBooks) {
    }
    
    private final boolean onMenuItemSelected(android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override
    public void onStrategySelected() {
    }
    
    @java.lang.Override
    public void onFolderSuccess() {
    }
    
    @org.greenrobot.eventbus.Subscribe(sticky = true, threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onImportEventComplete(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.events.ProcessEvent event) {
    }
}