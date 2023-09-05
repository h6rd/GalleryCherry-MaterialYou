package me.devsaki.hentoid.util;

import java.lang.System;

/**
 * Utility class for debouncing values to consumer functions (Kotlin variant that doesn't use Context)
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\r\u001a\u00020\tJ\u0013\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0010R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lme/devsaki/hentoid/util/DebouncerK;", "T", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "delayMs", "", "callback", "Lkotlin/Function1;", "", "(Lkotlinx/coroutines/CoroutineScope;JLkotlin/jvm/functions/Function1;)V", "taskJob", "Lkotlinx/coroutines/Job;", "clear", "submit", "t", "(Ljava/lang/Object;)V", "app_release"})
public final class DebouncerK<T extends java.lang.Object> {
    private final kotlinx.coroutines.CoroutineScope scope = null;
    private final long delayMs = 0L;
    private final kotlin.jvm.functions.Function1<T, kotlin.Unit> callback = null;
    private kotlinx.coroutines.Job taskJob;
    
    public DebouncerK(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope, long delayMs, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> callback) {
        super();
    }
    
    public final void clear() {
    }
    
    public final void submit(T t) {
    }
}