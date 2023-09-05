package me.devsaki.hentoid.util.download;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\fJ\u0006\u0010\u0011\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\fR\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lme/devsaki/hentoid/util/download/ContentQueueManager;", "", "()V", "<set-?>", "", "downloadCount", "getDownloadCount", "()I", "", "isQueuePaused", "()Z", "downloadComplete", "", "isQueueActive", "context", "Landroid/content/Context;", "pauseQueue", "resetDownloadCount", "resumeQueue", "unpauseQueue", "app_release"})
public final class ContentQueueManager {
    @org.jetbrains.annotations.NotNull
    public static final me.devsaki.hentoid.util.download.ContentQueueManager INSTANCE = null;
    private static boolean isQueuePaused = false;
    private static int downloadCount = 0;
    
    private ContentQueueManager() {
        super();
    }
    
    public final boolean isQueuePaused() {
        return false;
    }
    
    public final int getDownloadCount() {
        return 0;
    }
    
    public final void pauseQueue() {
    }
    
    public final void unpauseQueue() {
    }
    
    public final boolean isQueueActive(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
    
    public final void resumeQueue(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public final void resetDownloadCount() {
    }
    
    /**
     * Signals a new completed download
     */
    public final void downloadComplete() {
    }
}