package me.devsaki.hentoid.util.exception;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tB\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lme/devsaki/hentoid/util/exception/ContentNotProcessedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "content", "Lme/devsaki/hentoid/database/domains/Content;", "message", "", "cause", "", "(Lme/devsaki/hentoid/database/domains/Content;Ljava/lang/String;Ljava/lang/Throwable;)V", "(Lme/devsaki/hentoid/database/domains/Content;Ljava/lang/String;)V", "getContent", "()Lme/devsaki/hentoid/database/domains/Content;", "app_debug"})
public class ContentNotProcessedException extends java.lang.Exception {
    @org.jetbrains.annotations.NotNull
    private final me.devsaki.hentoid.database.domains.Content content = null;
    
    @org.jetbrains.annotations.NotNull
    public final me.devsaki.hentoid.database.domains.Content getContent() {
        return null;
    }
    
    public ContentNotProcessedException(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.database.domains.Content content, @org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.NotNull
    java.lang.Throwable cause) {
        super();
    }
    
    public ContentNotProcessedException(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.database.domains.Content content, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
        super();
    }
}