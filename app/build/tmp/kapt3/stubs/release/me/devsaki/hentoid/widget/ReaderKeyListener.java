package me.devsaki.hentoid.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u000bH\u0002J\b\u0010\u0015\u001a\u00020\u000bH\u0002J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J\"\u0010\u0019\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0016\u0010\u001e\u001a\u00020\u00002\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nJ\u0016\u0010\u001f\u001a\u00020\u00002\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nJ\u0016\u0010 \u001a\u00020\u00002\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nJ\u0016\u0010!\u001a\u00020\u00002\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nJ\u0016\u0010\"\u001a\u00020\u00002\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lme/devsaki/hentoid/widget/ReaderKeyListener;", "Landroid/view/View$OnKeyListener;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "longPressTimeout", "", "nextNotifyTime", "", "onBackListener", "Lcom/annimon/stream/function/Consumer;", "", "onKeyLeftListener", "onKeyRightListener", "onVolumeDownListener", "onVolumeUpListener", "simpleTapDebouncer", "Lme/devsaki/hentoid/util/DebouncerK;", "clear", "", "isDetectLongPress", "isTurboEnabled", "isVolumeKey", "keyCode", "targetKeyCode", "onKey", "v", "Landroid/view/View;", "event", "Landroid/view/KeyEvent;", "setOnBackListener", "setOnKeyLeftListener", "setOnKeyRightListener", "setOnVolumeDownListener", "setOnVolumeUpListener", "Companion", "app_release"})
public final class ReaderKeyListener implements android.view.View.OnKeyListener {
    private com.annimon.stream.function.Consumer<java.lang.Boolean> onVolumeDownListener;
    private com.annimon.stream.function.Consumer<java.lang.Boolean> onVolumeUpListener;
    private com.annimon.stream.function.Consumer<java.lang.Boolean> onKeyLeftListener;
    private com.annimon.stream.function.Consumer<java.lang.Boolean> onKeyRightListener;
    private com.annimon.stream.function.Consumer<java.lang.Boolean> onBackListener;
    private long nextNotifyTime = 9223372036854775807L;
    private final me.devsaki.hentoid.util.DebouncerK<com.annimon.stream.function.Consumer<java.lang.Boolean>> simpleTapDebouncer = null;
    private final int longPressTimeout = 0;
    @org.jetbrains.annotations.NotNull
    public static final me.devsaki.hentoid.widget.ReaderKeyListener.Companion Companion = null;
    public static final int COOLDOWN = 1000;
    public static final int TURBO_COOLDOWN = 500;
    
    public ReaderKeyListener(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.devsaki.hentoid.widget.ReaderKeyListener setOnVolumeDownListener(@org.jetbrains.annotations.Nullable
    com.annimon.stream.function.Consumer<java.lang.Boolean> onVolumeDownListener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.devsaki.hentoid.widget.ReaderKeyListener setOnVolumeUpListener(@org.jetbrains.annotations.Nullable
    com.annimon.stream.function.Consumer<java.lang.Boolean> onVolumeUpListener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.devsaki.hentoid.widget.ReaderKeyListener setOnKeyLeftListener(@org.jetbrains.annotations.Nullable
    com.annimon.stream.function.Consumer<java.lang.Boolean> onKeyLeftListener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.devsaki.hentoid.widget.ReaderKeyListener setOnKeyRightListener(@org.jetbrains.annotations.Nullable
    com.annimon.stream.function.Consumer<java.lang.Boolean> onKeyRightListener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.devsaki.hentoid.widget.ReaderKeyListener setOnBackListener(@org.jetbrains.annotations.Nullable
    com.annimon.stream.function.Consumer<java.lang.Boolean> onBackListener) {
        return null;
    }
    
    private final boolean isTurboEnabled() {
        return false;
    }
    
    private final boolean isDetectLongPress() {
        return false;
    }
    
    private final boolean isVolumeKey(int keyCode, int targetKeyCode) {
        return false;
    }
    
    @java.lang.Override
    public boolean onKey(@org.jetbrains.annotations.Nullable
    android.view.View v, int keyCode, @org.jetbrains.annotations.NotNull
    android.view.KeyEvent event) {
        return false;
    }
    
    public final void clear() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lme/devsaki/hentoid/widget/ReaderKeyListener$Companion;", "", "()V", "COOLDOWN", "", "TURBO_COOLDOWN", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}