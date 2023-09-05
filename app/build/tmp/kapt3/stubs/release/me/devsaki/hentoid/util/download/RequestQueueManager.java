package me.devsaki.hentoid.util.download;

import java.lang.System;

/**
 * Manager class for image download queue
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\u0018\u0000 82\u00020\u0001:\u00018B7\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0005\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u0011\u0010\u001b\u001a\u00020\u001aH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ#\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020 H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010#\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\"\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020 2\b\b\u0002\u0010\'\u001a\u00020 H\u0002J\u001e\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020 J\b\u0010+\u001a\u00020 H\u0002J\u0010\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u0006H\u0002J\u0018\u0010.\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\tH\u0002J\u0018\u00100\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0007H\u0002J\u000e\u00102\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0006J\b\u00103\u001a\u00020\u001aH\u0002J\u000e\u00104\u001a\u00020\u001a2\u0006\u0010\'\u001a\u00020 J\u000e\u00105\u001a\u00020\u001a2\u0006\u00106\u001a\u00020\u000eJ\u0006\u00107\u001a\u00020\u001aR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00069"}, d2 = {"Lme/devsaki/hentoid/util/download/RequestQueueManager;", "", "context", "Landroid/content/Context;", "onSuccess", "Lcom/annimon/stream/function/BiConsumer;", "Lme/devsaki/hentoid/util/download/RequestOrder;", "Landroid/net/Uri;", "onError", "Lme/devsaki/hentoid/util/download/RequestOrder$NetworkError;", "(Landroid/content/Context;Lcom/annimon/stream/function/BiConsumer;Lcom/annimon/stream/function/BiConsumer;)V", "activeRequests", "", "<set-?>", "", "downloadThreadCap", "getDownloadThreadCap", "()I", "downloadThreadCount", "mRequestQueue", "Lme/devsaki/hentoid/util/download/RequestQueue;", "nbActiveRequests", "getNbActiveRequests", "waitingRequestQueue", "Ljava/util/LinkedList;", "cancelQueue", "", "doRefill", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeRequest", "order", "insert", "", "(Lme/devsaki/hentoid/util/download/RequestOrder;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMemoryClass", "getPreferredThreadCount", "getSuggestedThreadCount", "init", "resetActiveRequests", "resetOkHttp", "initUsingDownloadThreadCount", "ctx", "nbDlThreads", "isNewRequestAllowed", "onRequestCompleted", "request", "onRequestError", "err", "onRequestSuccess", "resultFileUri", "queueRequest", "refill", "resetRequestQueue", "setNbRequestsPerSecond", "value", "start", "Companion", "app_release"})
public final class RequestQueueManager {
    private final com.annimon.stream.function.BiConsumer<me.devsaki.hentoid.util.download.RequestOrder, android.net.Uri> onSuccess = null;
    private final com.annimon.stream.function.BiConsumer<me.devsaki.hentoid.util.download.RequestOrder, me.devsaki.hentoid.util.download.RequestOrder.NetworkError> onError = null;
    private me.devsaki.hentoid.util.download.RequestQueue mRequestQueue;
    private int downloadThreadCap = -1;
    private int downloadThreadCount = 0;
    private final java.util.LinkedList<me.devsaki.hentoid.util.download.RequestOrder> waitingRequestQueue = null;
    private final java.util.Set<me.devsaki.hentoid.util.download.RequestOrder> activeRequests = null;
    @org.jetbrains.annotations.NotNull
    public static final me.devsaki.hentoid.util.download.RequestQueueManager.Companion Companion = null;
    @kotlin.jvm.Volatile
    private static volatile me.devsaki.hentoid.util.download.RequestQueueManager instance;
    
    private RequestQueueManager(android.content.Context context, com.annimon.stream.function.BiConsumer<me.devsaki.hentoid.util.download.RequestOrder, android.net.Uri> onSuccess, com.annimon.stream.function.BiConsumer<me.devsaki.hentoid.util.download.RequestOrder, me.devsaki.hentoid.util.download.RequestOrder.NetworkError> onError) {
        super();
    }
    
    public final int getDownloadThreadCap() {
        return 0;
    }
    
    /**
     * Initialize the request queue
     *
     * @param cancelQueue     True if queued requests should be canceled; false if it should be kept intact
     * @param resetOkHttp     If true, also reset the underlying OkHttp connections
     */
    private final void init(boolean resetActiveRequests, boolean cancelQueue, boolean resetOkHttp) {
    }
    
    /**
     * Initialize the request queue
     *
     * @param ctx         Context to use
     * @param nbDlThreads Number of parallel downloads to use; -1 to use automated recommendation
     * @param cancelQueue True if queued requests should be canceled; false if it should be kept intact
     */
    public final void initUsingDownloadThreadCount(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, int nbDlThreads, boolean cancelQueue) {
    }
    
    /**
     * Reset the entire queue
     *
     * @param resetOkHttp If true, also reset the underlying OkHttp connections
     */
    public final void resetRequestQueue(boolean resetOkHttp) {
    }
    
    /**
     * Cancel the app's request queue : cancel all requests remaining in the queue
     */
    public final void cancelQueue() {
    }
    
    public final void start() {
    }
    
    /**
     * Add a request to the app's queue
     *
     * @param order Request to add to the queue
     */
    public final void queueRequest(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.util.download.RequestOrder order) {
    }
    
    /**
     * Indicates whether a new request can be executed or not
     * NB : This call might _block_ the calling thread according to the current download rate limit
     */
    private final boolean isNewRequestAllowed() {
        return false;
    }
    
    /**
     * Refill the queue with the allowed number of requests
     */
    private final void refill() {
    }
    
    /**
     * Refill the queue with the allowed number of requests
     */
    private final java.lang.Object doRefill(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Execute the given request order at the given timestamp
     * NB : if we're here, that means all quota checks have already passed
     *
     * @param order Request order to execute
     */
    private final java.lang.Object executeRequest(me.devsaki.hentoid.util.download.RequestOrder order, boolean insert, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Generic handler called when a request is completed
     *
     * @param request Completed request
     */
    private final void onRequestCompleted(me.devsaki.hentoid.util.download.RequestOrder request) {
    }
    
    private final void onRequestSuccess(me.devsaki.hentoid.util.download.RequestOrder request, android.net.Uri resultFileUri) {
    }
    
    private final void onRequestError(me.devsaki.hentoid.util.download.RequestOrder request, me.devsaki.hentoid.util.download.RequestOrder.NetworkError err) {
    }
    
    public final void setNbRequestsPerSecond(int value) {
    }
    
    private final int getNbActiveRequests() {
        return 0;
    }
    
    /**
     * Return the number of parallel downloads (download thread count) chosen by the user
     *
     * @param context Context to use
     * @return Number of parallel downloads (download thread count) chosen by the user
     */
    private final int getPreferredThreadCount(android.content.Context context) {
        return 0;
    }
    
    /**
     * Return the automatic download thread count calculated from the device's memory capacity
     *
     * @param context Context to use
     * @return automatic download thread count calculated from the device's memory capacity
     */
    private final int getSuggestedThreadCount(android.content.Context context) {
        return 0;
    }
    
    /**
     * Return the device's per-app memory capacity
     *
     * @param context Context to use
     * @return Device's per-app memory capacity
     */
    private final int getMemoryClass(android.content.Context context) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J6\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lme/devsaki/hentoid/util/download/RequestQueueManager$Companion;", "", "()V", "instance", "Lme/devsaki/hentoid/util/download/RequestQueueManager;", "getInstance", "context", "Landroid/content/Context;", "onSuccess", "Lcom/annimon/stream/function/BiConsumer;", "Lme/devsaki/hentoid/util/download/RequestOrder;", "Landroid/net/Uri;", "onError", "Lme/devsaki/hentoid/util/download/RequestOrder$NetworkError;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Get the instance of the RequestQueueManager singleton
         *
         * @param context Context to use
         * @return Instance of the RequestQueueManager singleton
         */
        @org.jetbrains.annotations.NotNull
        public final me.devsaki.hentoid.util.download.RequestQueueManager getInstance(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        com.annimon.stream.function.BiConsumer<me.devsaki.hentoid.util.download.RequestOrder, android.net.Uri> onSuccess, @org.jetbrains.annotations.NotNull
        com.annimon.stream.function.BiConsumer<me.devsaki.hentoid.util.download.RequestOrder, me.devsaki.hentoid.util.download.RequestOrder.NetworkError> onError) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final me.devsaki.hentoid.util.download.RequestQueueManager getInstance() {
            return null;
        }
    }
}