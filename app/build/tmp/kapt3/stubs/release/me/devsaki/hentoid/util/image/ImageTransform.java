package me.devsaki.hentoid.util.image;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\"B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J0\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\rH\u0002J \u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J \u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J \u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0004H\u0002J\u0016\u0010!\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007\u00a8\u0006#"}, d2 = {"Lme/devsaki/hentoid/util/image/ImageTransform;", "", "()V", "MAX_WEBP_DIMENSION", "", "screenHeight", "getScreenHeight", "()I", "screenWidth", "getScreenWidth", "determineEncoder", "Lme/devsaki/hentoid/enums/PictureEncoder;", "isLossless", "", "dims", "Landroid/graphics/Point;", "params", "Lme/devsaki/hentoid/util/image/ImageTransform$Params;", "resizeDims", "Landroid/graphics/Bitmap;", "source", "", "maxHeight", "maxWidth", "forceManhwa", "resizePlainRatio", "ratio", "", "resizeScreenRatio", "transcodeTo", "bitmap", "encoder", "quality", "transform", "Params", "app_release"})
public final class ImageTransform {
    @org.jetbrains.annotations.NotNull
    public static final me.devsaki.hentoid.util.image.ImageTransform INSTANCE = null;
    private static final int screenWidth = 0;
    private static final int screenHeight = 0;
    private static final int MAX_WEBP_DIMENSION = 16383;
    
    private ImageTransform() {
        super();
    }
    
    public final int getScreenWidth() {
        return 0;
    }
    
    public final int getScreenHeight() {
        return 0;
    }
    
    /**
     * Transform the given raw picture data using the given params
     */
    @org.jetbrains.annotations.NotNull
    public final byte[] transform(@org.jetbrains.annotations.NotNull
    byte[] source, @org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.util.image.ImageTransform.Params params) {
        return null;
    }
    
    private final android.graphics.Bitmap resizeScreenRatio(byte[] source, android.graphics.Point dims, float ratio) {
        return null;
    }
    
    private final android.graphics.Bitmap resizeDims(byte[] source, android.graphics.Point dims, int maxHeight, int maxWidth, boolean forceManhwa) {
        return null;
    }
    
    private final android.graphics.Bitmap resizePlainRatio(byte[] source, android.graphics.Point dims, float ratio) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.devsaki.hentoid.enums.PictureEncoder determineEncoder(boolean isLossless, @org.jetbrains.annotations.NotNull
    android.graphics.Point dims, @org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.util.image.ImageTransform.Params params) {
        return null;
    }
    
    private final byte[] transcodeTo(android.graphics.Bitmap bitmap, me.devsaki.hentoid.enums.PictureEncoder encoder, int quality) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\'\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\fH\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\fH\u00c6\u0003J\t\u0010.\u001a\u00020\fH\u00c6\u0003J\u0081\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00100\u001a\u00020\u00032\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u00020\u0005H\u00d6\u0001J\t\u00103\u001a\u000204H\u00d6\u0001R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\r\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010 \u00a8\u00065"}, d2 = {"Lme/devsaki/hentoid/util/image/ImageTransform$Params;", "", "resizeEnabled", "", "resizeMethod", "", "resize1Ratio", "resize2Height", "resize2Width", "resize3Ratio", "transcodeMethod", "transcoderAll", "Lme/devsaki/hentoid/enums/PictureEncoder;", "transcoderLossy", "transcoderLossless", "transcodeQuality", "forceManhwa", "(ZIIIIIILme/devsaki/hentoid/enums/PictureEncoder;Lme/devsaki/hentoid/enums/PictureEncoder;Lme/devsaki/hentoid/enums/PictureEncoder;IZ)V", "getForceManhwa", "()Z", "setForceManhwa", "(Z)V", "getResize1Ratio", "()I", "getResize2Height", "getResize2Width", "getResize3Ratio", "getResizeEnabled", "getResizeMethod", "getTranscodeMethod", "getTranscodeQuality", "getTranscoderAll", "()Lme/devsaki/hentoid/enums/PictureEncoder;", "getTranscoderLossless", "getTranscoderLossy", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "app_release"})
    @com.squareup.moshi.JsonClass(generateAdapter = true)
    public static final class Params {
        private final boolean resizeEnabled = false;
        private final int resizeMethod = 0;
        private final int resize1Ratio = 0;
        private final int resize2Height = 0;
        private final int resize2Width = 0;
        private final int resize3Ratio = 0;
        private final int transcodeMethod = 0;
        @org.jetbrains.annotations.NotNull
        private final me.devsaki.hentoid.enums.PictureEncoder transcoderAll = null;
        @org.jetbrains.annotations.NotNull
        private final me.devsaki.hentoid.enums.PictureEncoder transcoderLossy = null;
        @org.jetbrains.annotations.NotNull
        private final me.devsaki.hentoid.enums.PictureEncoder transcoderLossless = null;
        private final int transcodeQuality = 0;
        @kotlin.jvm.Transient
        private transient boolean forceManhwa;
        
        @org.jetbrains.annotations.NotNull
        public final me.devsaki.hentoid.util.image.ImageTransform.Params copy(boolean resizeEnabled, int resizeMethod, int resize1Ratio, int resize2Height, int resize2Width, int resize3Ratio, int transcodeMethod, @org.jetbrains.annotations.NotNull
        me.devsaki.hentoid.enums.PictureEncoder transcoderAll, @org.jetbrains.annotations.NotNull
        me.devsaki.hentoid.enums.PictureEncoder transcoderLossy, @org.jetbrains.annotations.NotNull
        me.devsaki.hentoid.enums.PictureEncoder transcoderLossless, int transcodeQuality, boolean forceManhwa) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public Params(boolean resizeEnabled, int resizeMethod, int resize1Ratio, int resize2Height, int resize2Width, int resize3Ratio, int transcodeMethod, @org.jetbrains.annotations.NotNull
        me.devsaki.hentoid.enums.PictureEncoder transcoderAll, @org.jetbrains.annotations.NotNull
        me.devsaki.hentoid.enums.PictureEncoder transcoderLossy, @org.jetbrains.annotations.NotNull
        me.devsaki.hentoid.enums.PictureEncoder transcoderLossless, int transcodeQuality, boolean forceManhwa) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean getResizeEnabled() {
            return false;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getResizeMethod() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getResize1Ratio() {
            return 0;
        }
        
        public final int component4() {
            return 0;
        }
        
        public final int getResize2Height() {
            return 0;
        }
        
        public final int component5() {
            return 0;
        }
        
        public final int getResize2Width() {
            return 0;
        }
        
        public final int component6() {
            return 0;
        }
        
        public final int getResize3Ratio() {
            return 0;
        }
        
        public final int component7() {
            return 0;
        }
        
        public final int getTranscodeMethod() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final me.devsaki.hentoid.enums.PictureEncoder component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final me.devsaki.hentoid.enums.PictureEncoder getTranscoderAll() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final me.devsaki.hentoid.enums.PictureEncoder component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final me.devsaki.hentoid.enums.PictureEncoder getTranscoderLossy() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final me.devsaki.hentoid.enums.PictureEncoder component10() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final me.devsaki.hentoid.enums.PictureEncoder getTranscoderLossless() {
            return null;
        }
        
        public final int component11() {
            return 0;
        }
        
        public final int getTranscodeQuality() {
            return 0;
        }
        
        public final boolean component12() {
            return false;
        }
        
        public final boolean getForceManhwa() {
            return false;
        }
        
        public final void setForceManhwa(boolean p0) {
        }
    }
}