package me.devsaki.hentoid.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0004ABCDB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<J\u000e\u0010=\u001a\u00020:2\u0006\u0010>\u001a\u00020?J\u000e\u0010@\u001a\u00020:2\u0006\u0010>\u001a\u00020?R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R+\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010R+\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R+\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0010R+\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\"\u0010\u0012\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\u0010R\u000e\u0010#\u001a\u00020$X\u0082.\u00a2\u0006\u0002\n\u0000R+\u0010%\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b(\u0010\u0012\u001a\u0004\b&\u0010\u000e\"\u0004\b\'\u0010\u0010R+\u0010)\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b,\u0010\u0012\u001a\u0004\b*\u0010\u000e\"\u0004\b+\u0010\u0010R+\u0010-\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b0\u0010\u0012\u001a\u0004\b.\u0010\u000e\"\u0004\b/\u0010\u0010R+\u00101\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b4\u0010\u0012\u001a\u0004\b2\u0010\u000e\"\u0004\b3\u0010\u0010R+\u00105\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b8\u0010\u0012\u001a\u0004\b6\u0010\u000e\"\u0004\b7\u0010\u0010\u00a8\u0006E"}, d2 = {"Lme/devsaki/hentoid/util/Settings;", "", "()V", "<set-?>", "", "isResizeEnabled", "()Z", "setResizeEnabled", "(Z)V", "isResizeEnabled$delegate", "Lme/devsaki/hentoid/util/Settings$BoolSetting;", "", "resizeMethod", "getResizeMethod", "()I", "setResizeMethod", "(I)V", "resizeMethod$delegate", "Lme/devsaki/hentoid/util/Settings$IntSetting;", "resizeMethod1Ratio", "getResizeMethod1Ratio", "setResizeMethod1Ratio", "resizeMethod1Ratio$delegate", "resizeMethod2Height", "getResizeMethod2Height", "setResizeMethod2Height", "resizeMethod2Height$delegate", "resizeMethod2Width", "getResizeMethod2Width", "setResizeMethod2Width", "resizeMethod2Width$delegate", "resizeMethod3Ratio", "getResizeMethod3Ratio", "setResizeMethod3Ratio", "resizeMethod3Ratio$delegate", "sharedPreferences", "Landroid/content/SharedPreferences;", "transcodeEncoderAll", "getTranscodeEncoderAll", "setTranscodeEncoderAll", "transcodeEncoderAll$delegate", "transcodeEncoderLossless", "getTranscodeEncoderLossless", "setTranscodeEncoderLossless", "transcodeEncoderLossless$delegate", "transcodeEncoderLossy", "getTranscodeEncoderLossy", "setTranscodeEncoderLossy", "transcodeEncoderLossy$delegate", "transcodeMethod", "getTranscodeMethod", "setTranscodeMethod", "transcodeMethod$delegate", "transcodeQuality", "getTranscodeQuality", "setTranscodeQuality", "transcodeQuality$delegate", "init", "", "context", "Landroid/content/Context;", "registerPrefsChangedListener", "listener", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "unregisterPrefsChangedListener", "BoolSetting", "IntSetting", "Key", "StringSetting", "app_release"})
public final class Settings {
    @org.jetbrains.annotations.NotNull
    public static final me.devsaki.hentoid.util.Settings INSTANCE = null;
    private static android.content.SharedPreferences sharedPreferences;
    @org.jetbrains.annotations.NotNull
    private static final me.devsaki.hentoid.util.Settings.BoolSetting isResizeEnabled$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final me.devsaki.hentoid.util.Settings.IntSetting resizeMethod$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final me.devsaki.hentoid.util.Settings.IntSetting resizeMethod1Ratio$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final me.devsaki.hentoid.util.Settings.IntSetting resizeMethod2Height$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final me.devsaki.hentoid.util.Settings.IntSetting resizeMethod2Width$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final me.devsaki.hentoid.util.Settings.IntSetting resizeMethod3Ratio$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final me.devsaki.hentoid.util.Settings.IntSetting transcodeMethod$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final me.devsaki.hentoid.util.Settings.IntSetting transcodeEncoderAll$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final me.devsaki.hentoid.util.Settings.IntSetting transcodeEncoderLossless$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final me.devsaki.hentoid.util.Settings.IntSetting transcodeEncoderLossy$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final me.devsaki.hentoid.util.Settings.IntSetting transcodeQuality$delegate = null;
    
    private Settings() {
        super();
    }
    
    public final void init(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public final boolean isResizeEnabled() {
        return false;
    }
    
    public final void setResizeEnabled(boolean p0) {
    }
    
    public final int getResizeMethod() {
        return 0;
    }
    
    public final void setResizeMethod(int p0) {
    }
    
    public final int getResizeMethod1Ratio() {
        return 0;
    }
    
    public final void setResizeMethod1Ratio(int p0) {
    }
    
    public final int getResizeMethod2Height() {
        return 0;
    }
    
    public final void setResizeMethod2Height(int p0) {
    }
    
    public final int getResizeMethod2Width() {
        return 0;
    }
    
    public final void setResizeMethod2Width(int p0) {
    }
    
    public final int getResizeMethod3Ratio() {
        return 0;
    }
    
    public final void setResizeMethod3Ratio(int p0) {
    }
    
    public final int getTranscodeMethod() {
        return 0;
    }
    
    public final void setTranscodeMethod(int p0) {
    }
    
    public final int getTranscodeEncoderAll() {
        return 0;
    }
    
    public final void setTranscodeEncoderAll(int p0) {
    }
    
    public final int getTranscodeEncoderLossless() {
        return 0;
    }
    
    public final void setTranscodeEncoderLossless(int p0) {
    }
    
    public final int getTranscodeEncoderLossy() {
        return 0;
    }
    
    public final void setTranscodeEncoderLossy(int p0) {
    }
    
    public final int getTranscodeQuality() {
        return 0;
    }
    
    public final void setTranscodeQuality(int p0) {
    }
    
    public final void registerPrefsChangedListener(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences.OnSharedPreferenceChangeListener listener) {
    }
    
    public final void unregisterPrefsChangedListener(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences.OnSharedPreferenceChangeListener listener) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0086\u0002J\'\u0010\u000f\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0011\u001a\u00020\u0005H\u0086\u0002R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0012"}, d2 = {"Lme/devsaki/hentoid/util/Settings$IntSetting;", "", "key", "", "default", "", "(Ljava/lang/String;I)V", "getDefault", "()I", "getKey", "()Ljava/lang/String;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "setValue", "", "value", "app_release"})
    static final class IntSetting {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String key = null;
        
        public IntSetting(@org.jetbrains.annotations.NotNull
        java.lang.String key, int p1_772401952) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getKey() {
            return null;
        }
        
        public final int getDefault() {
            return 0;
        }
        
        public final int getValue(@org.jetbrains.annotations.Nullable
        java.lang.Object thisRef, @org.jetbrains.annotations.NotNull
        kotlin.reflect.KProperty<?> property) {
            return 0;
        }
        
        public final void setValue(@org.jetbrains.annotations.Nullable
        java.lang.Object thisRef, @org.jetbrains.annotations.NotNull
        kotlin.reflect.KProperty<?> property, int value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0086\u0002J\'\u0010\u000f\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0011\u001a\u00020\u0005H\u0086\u0002R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0012"}, d2 = {"Lme/devsaki/hentoid/util/Settings$BoolSetting;", "", "key", "", "default", "", "(Ljava/lang/String;Z)V", "getDefault", "()Z", "getKey", "()Ljava/lang/String;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "setValue", "", "value", "app_release"})
    static final class BoolSetting {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String key = null;
        
        public BoolSetting(@org.jetbrains.annotations.NotNull
        java.lang.String key, boolean p1_772401952) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getKey() {
            return null;
        }
        
        public final boolean getDefault() {
            return false;
        }
        
        public final boolean getValue(@org.jetbrains.annotations.Nullable
        java.lang.Object thisRef, @org.jetbrains.annotations.NotNull
        kotlin.reflect.KProperty<?> property) {
            return false;
        }
        
        public final void setValue(@org.jetbrains.annotations.Nullable
        java.lang.Object thisRef, @org.jetbrains.annotations.NotNull
        kotlin.reflect.KProperty<?> property, boolean value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0086\u0002J\'\u0010\r\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u0003H\u0086\u0002R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0010"}, d2 = {"Lme/devsaki/hentoid/util/Settings$StringSetting;", "", "key", "", "default", "(Ljava/lang/String;Ljava/lang/String;)V", "getDefault", "()Ljava/lang/String;", "getKey", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "setValue", "", "value", "app_release"})
    static final class StringSetting {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String key = null;
        
        public StringSetting(@org.jetbrains.annotations.NotNull
        java.lang.String key, @org.jetbrains.annotations.NotNull
        java.lang.String p1_772401952) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getKey() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getDefault() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getValue(@org.jetbrains.annotations.Nullable
        java.lang.Object thisRef, @org.jetbrains.annotations.NotNull
        kotlin.reflect.KProperty<?> property) {
            return null;
        }
        
        public final void setValue(@org.jetbrains.annotations.Nullable
        java.lang.Object thisRef, @org.jetbrains.annotations.NotNull
        kotlin.reflect.KProperty<?> property, @org.jetbrains.annotations.NotNull
        java.lang.String value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lme/devsaki/hentoid/util/Settings$Key;", "", "()V", "TRANSFORM_RESIZE_ENABLED", "", "TRANSFORM_RESIZE_METHOD", "TRANSFORM_RESIZE_WIDTH", "app_release"})
    public static final class Key {
        @org.jetbrains.annotations.NotNull
        public static final me.devsaki.hentoid.util.Settings.Key INSTANCE = null;
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String TRANSFORM_RESIZE_ENABLED = "TRANSFORM_RESIZE_ENABLED";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String TRANSFORM_RESIZE_METHOD = "TRANSFORM_RESIZE_METHOD";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String TRANSFORM_RESIZE_WIDTH = "TRANSFORM_RESIZE_WIDTH";
        
        private Key() {
            super();
        }
    }
}