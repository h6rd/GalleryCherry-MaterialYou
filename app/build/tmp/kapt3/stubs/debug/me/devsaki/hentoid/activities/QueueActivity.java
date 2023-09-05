package me.devsaki.hentoid.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u00014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u0012\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u000fH\u0014J\u0016\u0010\u001a\u001a\u00020\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J\u0012\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0015J\u0016\u0010!\u001a\u00020\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\"0\u001cH\u0002J\u0010\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%H\u0007J\u0018\u0010&\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u0018H\u0002J$\u0010+\u001a\u00020\u000f2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u0011J.\u0010+\u001a\u00020\u000f2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u00112\u0006\u0010\'\u001a\u00020(H\u0002J\u0018\u0010/\u001a\u00020\u000f2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lme/devsaki/hentoid/activities/QueueActivity;", "Lme/devsaki/hentoid/activities/BaseActivity;", "()V", "binding", "Lme/devsaki/hentoid/databinding/ActivityQueueBinding;", "cloudflareHelper", "Lme/devsaki/hentoid/util/network/CloudflareHelper;", "errorsTab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "queueTab", "reviveDisposable", "Lio/reactivex/disposables/Disposable;", "viewModel", "Lme/devsaki/hentoid/viewmodels/QueueViewModel;", "changeReviveUIVisibility", "", "visible", "", "clearReviveDownload", "getSelectionToolbar", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onErrorsChanged", "result", "", "Lme/devsaki/hentoid/database/domains/Content;", "onNewIntent", "intent", "Landroid/content/Intent;", "onQueueChanged", "Lme/devsaki/hentoid/database/domains/QueueRecord;", "onReviveDownload", "event", "Lme/devsaki/hentoid/events/DownloadReviveEvent;", "onTabSelected", "position", "", "processIntent", "extras", "redownloadContent", "contentList", "reparseContent", "reparseImages", "reviveDownload", "revivedSite", "Lme/devsaki/hentoid/enums/Site;", "oldCookie", "", "ScreenSlidePagerAdapter", "app_debug"})
public final class QueueActivity extends me.devsaki.hentoid.activities.BaseActivity {
    private me.devsaki.hentoid.viewmodels.QueueViewModel viewModel;
    private me.devsaki.hentoid.databinding.ActivityQueueBinding binding;
    private com.google.android.material.tabs.TabLayout.Tab queueTab;
    private com.google.android.material.tabs.TabLayout.Tab errorsTab;
    private me.devsaki.hentoid.util.network.CloudflareHelper cloudflareHelper;
    private io.reactivex.disposables.Disposable reviveDisposable;
    
    public QueueActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingSuperCall"})
    @java.lang.Override
    protected void onNewIntent(@org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
    }
    
    private final void processIntent(android.os.Bundle extras) {
    }
    
    private final void onTabSelected(me.devsaki.hentoid.databinding.ActivityQueueBinding binding, int position) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final androidx.appcompat.widget.Toolbar getToolbar() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final androidx.appcompat.widget.Toolbar getSelectionToolbar() {
        return null;
    }
    
    private final void onQueueChanged(java.util.List<? extends me.devsaki.hentoid.database.domains.QueueRecord> result) {
    }
    
    private final void onErrorsChanged(java.util.List<? extends me.devsaki.hentoid.database.domains.Content> result) {
    }
    
    /**
     * Redownload the given list of Content according to the given parameters
     * NB : Used by both the regular redownload and redownload from scratch
     *
     * @param contentList    List of content to be redownloaded
     * @param reparseContent True if the content (general metadata) has to be re-parsed from the site; false to keep
     * @param reparseImages  True if the images have to be re-detected and redownloaded from the site; false to keep
     */
    public final void redownloadContent(@org.jetbrains.annotations.NotNull
    java.util.List<? extends me.devsaki.hentoid.database.domains.Content> contentList, boolean reparseContent, boolean reparseImages) {
    }
    
    /**
     * Redownload the given list of Content according to the given parameters
     * NB : Used by both the regular redownload and redownload from scratch
     *
     * @param contentList    List of content to be redownloaded
     * @param reparseContent True if the content (general metadata) has to be re-parsed from the site; false to keep
     * @param reparseImages  True if the images have to be re-detected and redownloaded from the site; false to keep
     * @param position       Position of the new item to redownload, either QUEUE_NEW_DOWNLOADS_POSITION_TOP or QUEUE_NEW_DOWNLOADS_POSITION_BOTTOM
     */
    private final void redownloadContent(java.util.List<? extends me.devsaki.hentoid.database.domains.Content> contentList, boolean reparseContent, boolean reparseImages, int position) {
    }
    
    private final void changeReviveUIVisibility(boolean visible) {
    }
    
    /**
     * Revive event handler
     *
     * @param event Broadcasted event
     */
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onReviveDownload(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.events.DownloadReviveEvent event) {
    }
    
    private final void reviveDownload(me.devsaki.hentoid.enums.Site revivedSite, java.lang.String oldCookie) {
    }
    
    private final void clearReviveDownload() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016\u00a8\u0006\n"}, d2 = {"Lme/devsaki/hentoid/activities/QueueActivity$ScreenSlidePagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fa", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "app_debug"})
    static final class ScreenSlidePagerAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
        
        public ScreenSlidePagerAdapter(@org.jetbrains.annotations.Nullable
        androidx.fragment.app.FragmentActivity fa) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public androidx.fragment.app.Fragment createFragment(int position) {
            return null;
        }
        
        @java.lang.Override
        public int getItemCount() {
            return 0;
        }
    }
}