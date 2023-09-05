package me.devsaki.hentoid.workers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\b\u0010\u0017\u001a\u00020\u0010H\u0014J\b\u0010\u0018\u001a\u00020\u0010H\u0014J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J&\u0010\u001e\u001a\u00020\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J0\u0010\'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\nH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lme/devsaki/hentoid/workers/TransformWorker;", "Lme/devsaki/hentoid/workers/BaseWorker;", "context", "Landroid/content/Context;", "parameters", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "dao", "Lme/devsaki/hentoid/database/CollectionDAO;", "nbKO", "", "nbOK", "totalItems", "getStartNotification", "Lme/devsaki/hentoid/util/notification/Notification;", "getToWork", "", "input", "Landroidx/work/Data;", "nextKO", "nextOK", "notifyProcessEnd", "notifyProcessProgress", "onClear", "onInterrupt", "transform", "contentIds", "", "params", "Lme/devsaki/hentoid/util/image/ImageTransform$Params;", "transformChapter", "imgs", "", "Lme/devsaki/hentoid/database/domains/ImageFile;", "contentFolder", "Landroidx/documentfile/provider/DocumentFile;", "transformContent", "content", "Lme/devsaki/hentoid/database/domains/Content;", "transformImage", "img", "nbManhwa", "Ljava/util/concurrent/atomic/AtomicInteger;", "nbPages", "app_debug"})
public final class TransformWorker extends me.devsaki.hentoid.workers.BaseWorker {
    private final me.devsaki.hentoid.database.CollectionDAO dao = null;
    private int totalItems = 0;
    private int nbOK = 0;
    private int nbKO = 0;
    
    public TransformWorker(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    androidx.work.WorkerParameters parameters) {
        super(null, null, 0, null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected me.devsaki.hentoid.util.notification.Notification getStartNotification() {
        return null;
    }
    
    @java.lang.Override
    protected void onInterrupt() {
    }
    
    @java.lang.Override
    protected void onClear() {
    }
    
    @java.lang.Override
    protected void getToWork(@org.jetbrains.annotations.NotNull
    androidx.work.Data input) {
    }
    
    private final void transform(long[] contentIds, me.devsaki.hentoid.util.image.ImageTransform.Params params) {
    }
    
    private final void transformContent(me.devsaki.hentoid.database.domains.Content content, me.devsaki.hentoid.util.image.ImageTransform.Params params) {
    }
    
    private final void transformChapter(java.util.List<? extends me.devsaki.hentoid.database.domains.ImageFile> imgs, androidx.documentfile.provider.DocumentFile contentFolder, me.devsaki.hentoid.util.image.ImageTransform.Params params) {
    }
    
    @kotlin.Suppress(names = {"ReplaceArrayEqualityOpWithArraysEquals"})
    private final void transformImage(me.devsaki.hentoid.database.domains.ImageFile img, androidx.documentfile.provider.DocumentFile contentFolder, me.devsaki.hentoid.util.image.ImageTransform.Params params, java.util.concurrent.atomic.AtomicInteger nbManhwa, int nbPages) {
    }
    
    private final void nextOK() {
    }
    
    private final void nextKO() {
    }
    
    private final void notifyProcessProgress() {
    }
    
    private final void notifyProcessEnd() {
    }
}