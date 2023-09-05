package me.devsaki.hentoid.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0006\u0010\u0018\u001a\u00020\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u000bJ\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bJ\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000bJ\u0006\u0010\u001d\u001a\u00020\u0016J\u0016\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 J\u0014\u0010\"\u001a\u00020\u00162\f\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\fJ\u0014\u0010$\u001a\u00020\u00162\f\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\fJ\b\u0010%\u001a\u00020\u0016H\u0014J\u0010\u0010&\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020\rH\u0002JT\u0010(\u001a\u00020\u00162\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020 2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00160.2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00160.J\u0006\u00101\u001a\u00020\u0016J\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020 0\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\fH\u0002J\u0014\u00103\u001a\u00020\u00162\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0006\u00104\u001a\u00020\u0016J\u0012\u00105\u001a\u00020\u00162\n\b\u0002\u00106\u001a\u0004\u0018\u000107J\u0012\u00108\u001a\u00020\u00162\n\b\u0002\u00106\u001a\u0004\u0018\u000107J\u000e\u00109\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\tJ\u001c\u0010;\u001a\u00020\u00162\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010=\u001a\u00020 J\u0014\u0010>\u001a\u00020\u00162\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\t0\fJ\u0006\u0010@\u001a\u00020\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lme/devsaki/hentoid/viewmodels/QueueViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "dao", "Lme/devsaki/hentoid/database/CollectionDAO;", "(Landroid/app/Application;Lme/devsaki/hentoid/database/CollectionDAO;)V", "contentHashToShowFirst", "Landroidx/lifecycle/MutableLiveData;", "", "currentErrorsSource", "Landroidx/lifecycle/LiveData;", "", "Lme/devsaki/hentoid/database/domains/Content;", "currentQueueSource", "Lme/devsaki/hentoid/database/domains/QueueRecord;", "errors", "Landroidx/lifecycle/MediatorLiveData;", "newSearch", "", "queue", "cancel", "", "contents", "cancelAll", "getContentHashToShowFirst", "getErrors", "getNewSearch", "getQueue", "invertQueue", "moveAbsolute", "oldPosition", "", "newPosition", "moveBottom", "relativePositions", "moveTop", "onCleared", "purgeItem", "content", "redownloadContent", "contentList", "reparseContent", "reparseImages", "position", "onSuccess", "Lkotlin/Function1;", "onError", "", "refresh", "relativeToAbsolutePositions", "remove", "removeAll", "searchErrorContentUniversal", "query", "", "searchQueueUniversal", "setContentToShowFirst", "hash", "setDownloadMode", "contentIds", "downloadMode", "toogleFreeze", "recordId", "unpauseQueue", "app_release"})
public final class QueueViewModel extends androidx.lifecycle.AndroidViewModel {
    private final me.devsaki.hentoid.database.CollectionDAO dao = null;
    private androidx.lifecycle.LiveData<java.util.List<me.devsaki.hentoid.database.domains.QueueRecord>> currentQueueSource;
    private final androidx.lifecycle.MediatorLiveData<java.util.List<me.devsaki.hentoid.database.domains.QueueRecord>> queue = null;
    private androidx.lifecycle.LiveData<java.util.List<me.devsaki.hentoid.database.domains.Content>> currentErrorsSource;
    private final androidx.lifecycle.MediatorLiveData<java.util.List<me.devsaki.hentoid.database.domains.Content>> errors = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> contentHashToShowFirst = null;
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> newSearch = null;
    
    public QueueViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application, @org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.database.CollectionDAO dao) {
        super(null);
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<me.devsaki.hentoid.database.domains.QueueRecord>> getQueue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<me.devsaki.hentoid.database.domains.Content>> getErrors() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getNewSearch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Long> getContentHashToShowFirst() {
        return null;
    }
    
    /**
     * Perform a new search
     */
    public final void refresh() {
    }
    
    public final void searchQueueUniversal(@org.jetbrains.annotations.Nullable
    java.lang.String query) {
    }
    
    public final void searchErrorContentUniversal(@org.jetbrains.annotations.Nullable
    java.lang.String query) {
    }
    
    public final void moveAbsolute(int oldPosition, int newPosition) {
    }
    
    /**
     * Move all items at given positions to top of the list
     *
     * @param relativePositions Adapter positions of the items to move
     */
    public final void moveTop(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Integer> relativePositions) {
    }
    
    /**
     * Move all items at given positions to bottom of the list
     *
     * @param relativePositions Adapter positions of the items to move
     */
    public final void moveBottom(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Integer> relativePositions) {
    }
    
    private final java.util.List<java.lang.Integer> relativeToAbsolutePositions(java.util.List<java.lang.Integer> relativePositions) {
        return null;
    }
    
    public final void unpauseQueue() {
    }
    
    public final void invertQueue() {
    }
    
    /**
     * Cancel download of designated Content
     * NB : Contrary to Pause command, Cancel removes the Content from the download queue
     *
     * @param contents Contents whose download has to be canceled
     */
    public final void cancel(@org.jetbrains.annotations.NotNull
    java.util.List<? extends me.devsaki.hentoid.database.domains.Content> contents) {
    }
    
    public final void removeAll() {
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull
    java.util.List<? extends me.devsaki.hentoid.database.domains.Content> contentList) {
    }
    
    private final void purgeItem(me.devsaki.hentoid.database.domains.Content content) {
    }
    
    public final void cancelAll() {
    }
    
    /**
     * Redownload the given list of Content according to the given parameters
     * NB : Used by both the regular redownload and redownload from scratch
     *
     * @param contentList    List of content to be redownloaded
     * @param reparseContent True if the content (general metadata) has to be re-parsed from the site; false to keep
     * @param reparseImages  True if the images have to be re-detected and redownloaded from the site; false to keep
     * @param position       Position of the new item to redownload, either QUEUE_NEW_DOWNLOADS_POSITION_TOP or QUEUE_NEW_DOWNLOADS_POSITION_BOTTOM
     * @param onSuccess      Handler for process success; consumes the number of books successfuly redownloaded
     * @param onError        Handler for process error; consumes the exception
     */
    public final void redownloadContent(@org.jetbrains.annotations.NotNull
    java.util.List<? extends me.devsaki.hentoid.database.domains.Content> contentList, boolean reparseContent, boolean reparseImages, int position, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError) {
    }
    
    public final void setContentToShowFirst(long hash) {
    }
    
    public final void setDownloadMode(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> contentIds, int downloadMode) {
    }
    
    public final void toogleFreeze(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> recordId) {
    }
}