package me.devsaki.hentoid.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0019\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J1\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\nH\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lme/devsaki/hentoid/viewmodels/PreferencesViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "dao", "Lme/devsaki/hentoid/database/CollectionDAO;", "(Landroid/app/Application;Lme/devsaki/hentoid/database/CollectionDAO;)V", "getDao", "()Lme/devsaki/hentoid/database/CollectionDAO;", "detach", "", "location", "Lme/devsaki/hentoid/enums/StorageLocation;", "merge2to1", "nbBooks", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mergeTo1", "contentId", "", "nbOK", "Ljava/util/concurrent/atomic/AtomicInteger;", "nbKO", "(JLjava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "app_debug"})
public final class PreferencesViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private final me.devsaki.hentoid.database.CollectionDAO dao = null;
    
    public PreferencesViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application, @org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.database.CollectionDAO dao) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.devsaki.hentoid.database.CollectionDAO getDao() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void detach(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.enums.StorageLocation location) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object merge2to1(int nbBooks, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object mergeTo1(long contentId, java.util.concurrent.atomic.AtomicInteger nbOK, java.util.concurrent.atomic.AtomicInteger nbKO, int nbBooks, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}