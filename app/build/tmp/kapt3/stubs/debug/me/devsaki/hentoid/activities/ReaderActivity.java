package me.devsaki.hentoid.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\bH\u0014J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lme/devsaki/hentoid/activities/ReaderActivity;", "Lme/devsaki/hentoid/activities/BaseActivity;", "()V", "readerKeyListener", "Lme/devsaki/hentoid/widget/ReaderKeyListener;", "viewModel", "Lme/devsaki/hentoid/viewmodels/ReaderViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onKeyDown", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onStop", "registerKeyListener", "listener", "unregisterKeyListener", "Companion", "ReaderActivityMulti", "app_debug"})
public class ReaderActivity extends me.devsaki.hentoid.activities.BaseActivity {
    private me.devsaki.hentoid.widget.ReaderKeyListener readerKeyListener;
    private me.devsaki.hentoid.viewmodels.ReaderViewModel viewModel;
    @org.jetbrains.annotations.NotNull
    public static final me.devsaki.hentoid.activities.ReaderActivity.Companion Companion = null;
    private static boolean isRunning = false;
    
    public ReaderActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public boolean onKeyDown(int keyCode, @org.jetbrains.annotations.NotNull
    android.view.KeyEvent event) {
        return false;
    }
    
    @java.lang.Override
    protected void onStop() {
    }
    
    public final void registerKeyListener(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.widget.ReaderKeyListener listener) {
    }
    
    public final void unregisterKeyListener() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lme/devsaki/hentoid/activities/ReaderActivity$ReaderActivityMulti;", "Lme/devsaki/hentoid/activities/ReaderActivity;", "()V", "app_debug"})
    public static final class ReaderActivityMulti extends me.devsaki.hentoid.activities.ReaderActivity {
        
        public ReaderActivityMulti() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lme/devsaki/hentoid/activities/ReaderActivity$Companion;", "", "()V", "isRunning", "", "setRunning", "", "value", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.Synchronized
        private final synchronized void setRunning(boolean value) {
        }
        
        @kotlin.jvm.Synchronized
        public final synchronized boolean isRunning() {
            return false;
        }
    }
}