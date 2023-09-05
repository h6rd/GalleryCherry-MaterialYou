package me.devsaki.hentoid.notification.download;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lme/devsaki/hentoid/notification/download/DownloadErrorNotification;", "Lme/devsaki/hentoid/util/notification/Notification;", "content", "Lme/devsaki/hentoid/database/domains/Content;", "(Lme/devsaki/hentoid/database/domains/Content;)V", "getDefaultIntent", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "getDeleteIntent", "onCreateNotification", "Landroid/app/Notification;", "app_release"})
public final class DownloadErrorNotification implements me.devsaki.hentoid.util.notification.Notification {
    private final me.devsaki.hentoid.database.domains.Content content = null;
    
    public DownloadErrorNotification(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.database.domains.Content content) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.app.Notification onCreateNotification(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    private final android.app.PendingIntent getDefaultIntent(android.content.Context context) {
        return null;
    }
    
    private final android.app.PendingIntent getDeleteIntent(android.content.Context context) {
        return null;
    }
}