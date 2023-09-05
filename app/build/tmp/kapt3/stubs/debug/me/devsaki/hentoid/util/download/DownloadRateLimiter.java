package me.devsaki.hentoid.util.download;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lme/devsaki/hentoid/util/download/DownloadRateLimiter;", "", "()V", "bucket", "Lio/github/bucket4j/BlockingBucket;", "setRateLimit", "", "perSecond", "", "take", "", "app_debug"})
public final class DownloadRateLimiter {
    @org.jetbrains.annotations.NotNull
    public static final me.devsaki.hentoid.util.download.DownloadRateLimiter INSTANCE = null;
    private static io.github.bucket4j.BlockingBucket bucket;
    
    private DownloadRateLimiter() {
        super();
    }
    
    public final void setRateLimit(long perSecond) {
    }
    
    public final boolean take() {
        return false;
    }
}