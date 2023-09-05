package me.devsaki.hentoid.util.image;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J2\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00180\u00170\u0016J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ(\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0018H\u0002J\u001c\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020#0\u00172\u0006\u0010$\u001a\u00020#H\u0002J \u0010%\u001a\u0004\u0018\u00010\u001c2\u0006\u0010&\u001a\u00020\'2\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0018J\u0018\u0010(\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010)\u001a\u00020\u0018J\u0018\u0010*\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010)\u001a\u00020\u0018J\b\u0010+\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u001aJ\u0018\u0010.\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010/\u001a\u00020\u0010J\u001e\u00100\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u000203J\u000e\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u001aJ\u000e\u00106\u001a\u0002032\u0006\u00107\u001a\u00020\u0007J\u000e\u00108\u001a\u0002032\u0006\u00105\u001a\u00020\u001aJ\u000e\u00109\u001a\u0002032\u0006\u0010:\u001a\u00020\u0007J&\u0010;\u001a\u0002032\u0006\u0010<\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\u00182\u0006\u0010>\u001a\u00020\u00182\u0006\u0010?\u001a\u00020\u0018J\u0016\u0010@\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020#J(\u0010@\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020\u00182\u0006\u0010D\u001a\u00020\u00182\u0006\u00102\u001a\u000203H\u0002J\u0018\u0010E\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020\u001c2\u0006\u0010F\u001a\u00020\u0018H\u0002J\u0018\u0010G\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010H\u001a\u00020\u0018R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006I"}, d2 = {"Lme/devsaki/hentoid/util/image/ImageHelper;", "", "()V", "CHARSET_LATIN_1", "Ljava/nio/charset/Charset;", "kotlin.jvm.PlatformType", "MIME_IMAGE_APNG", "", "MIME_IMAGE_GENERIC", "MIME_IMAGE_GIF", "MIME_IMAGE_JPEG", "MIME_IMAGE_PNG", "MIME_IMAGE_WEBP", "imageNamesFilter", "Lme/devsaki/hentoid/util/file/FileHelper$NameFilter;", "assembleGif", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "folder", "Ljava/io/File;", "frames", "", "Lorg/apache/commons/lang3/tuple/ImmutablePair;", "", "bitmapToWebp", "", "bitmap", "Landroid/graphics/Bitmap;", "calculateInSampleSize", "rawWidth", "rawHeight", "targetWidth", "targetHeight", "computeRescaleParams", "", "targetScale", "decodeSampledBitmapFromStream", "stream", "Ljava/io/InputStream;", "getBitmapFromResource", "drawableId", "getBitmapFromVectorDrawable", "getImageNamesFilter", "getMimeTypeFromPictureBinary", "binary", "getMimeTypeFromUri", "uri", "getScaledDownBitmap", "threshold", "noRecycle", "", "isImageAnimated", "data", "isImageExtensionSupported", "extension", "isImageLossless", "isSupportedImage", "fileName", "needsRotating", "screenWidth", "screenHeight", "width", "height", "sharpRescale", "src", "source", "newWidth", "newHeight", "successiveRescale", "resizeNum", "tintBitmap", "color", "app_release"})
public final class ImageHelper {
    @org.jetbrains.annotations.NotNull
    public static final me.devsaki.hentoid.util.image.ImageHelper INSTANCE = null;
    private static final java.nio.charset.Charset CHARSET_LATIN_1 = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MIME_IMAGE_GENERIC = "image/*";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MIME_IMAGE_WEBP = "image/webp";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MIME_IMAGE_JPEG = "image/jpeg";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MIME_IMAGE_GIF = "image/gif";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MIME_IMAGE_PNG = "image/png";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MIME_IMAGE_APNG = "image/apng";
    private static me.devsaki.hentoid.util.file.FileHelper.NameFilter imageNamesFilter;
    
    private ImageHelper() {
        super();
    }
    
    /**
     * Determine if the given image file extension is supported by the app
     *
     * @param extension File extension to test
     * @return True if the app supports the reading of images with the given file extension; false if not
     */
    public final boolean isImageExtensionSupported(@org.jetbrains.annotations.NotNull
    java.lang.String extension) {
        return false;
    }
    
    public final boolean isSupportedImage(@org.jetbrains.annotations.NotNull
    java.lang.String fileName) {
        return false;
    }
    
    /**
     * Build a [FileHelper.NameFilter] only accepting image files supported by the app
     *
     * @return [FileHelper.NameFilter] only accepting image files supported by the app
     */
    @org.jetbrains.annotations.Nullable
    public final me.devsaki.hentoid.util.file.FileHelper.NameFilter getImageNamesFilter() {
        return null;
    }
    
    /**
     * Determine the MIME-type of the given binary data if it's a picture
     *
     * @param binary Picture binary data to determine the MIME-type for
     * @return MIME-type of the given binary data; empty string if not supported
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMimeTypeFromPictureBinary(@org.jetbrains.annotations.NotNull
    byte[] binary) {
        return null;
    }
    
    /**
     * Analyze the given binary picture header to try and detect if the picture is animated.
     * If the format is supported by the app, returns true if animated (animated GIF, APNG, animated WEBP); false if not
     *
     * @param data Binary picture file header (400 bytes minimum)
     * @return True if the format is animated and supported by the app
     */
    public final boolean isImageAnimated(@org.jetbrains.annotations.NotNull
    byte[] data) {
        return false;
    }
    
    /**
     * Analyze the given binary picture header to try and detect if the picture is lossless.
     * If the format is supported by the app, returns true if lossless (PNG, lossless WEBP); false if not
     *
     * @param data Binary picture file header (16 bytes minimum)
     * @return True if the format is lossless and supported by the app
     */
    public final boolean isImageLossless(@org.jetbrains.annotations.NotNull
    byte[] data) {
        return false;
    }
    
    /**
     * Try to detect the mime-type of the picture file at the given URI
     *
     * @param context Context to use
     * @param uri     URI of the picture file to detect the mime-type for
     * @return Mime-type of the picture file at the given URI; MIME_IMAGE_GENERIC if no Mime-type detected
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMimeTypeFromUri(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
        return null;
    }
    
    /**
     * Convert the given Drawable ID into a Bitmap
     *
     * @param context    Context to be used
     * @param drawableId Drawable ID to get the Bitmap from
     * @return Given drawable ID rendered into a Bitmap
     */
    @org.jetbrains.annotations.NotNull
    public final android.graphics.Bitmap getBitmapFromResource(@org.jetbrains.annotations.NotNull
    android.content.Context context, @androidx.annotation.DrawableRes
    int drawableId) {
        return null;
    }
    
    /**
     * Convert the given Drawable ID into a Bitmap
     *
     * @param context    Context to be used
     * @param drawableId Drawable ID to get the Bitmap from
     * @return Given drawable ID rendered into a Bitmap
     */
    @org.jetbrains.annotations.NotNull
    public final android.graphics.Bitmap getBitmapFromVectorDrawable(@org.jetbrains.annotations.NotNull
    android.content.Context context, @androidx.annotation.DrawableRes
    int drawableId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final byte[] bitmapToWebp(@org.jetbrains.annotations.NotNull
    android.graphics.Bitmap bitmap) {
        return null;
    }
    
    /**
     * Tint the given Bitmap with the given color
     *
     * @param bitmap Bitmap to be tinted
     * @param color  Color to use as tint
     * @return Given Bitmap tinted with the given color
     */
    @org.jetbrains.annotations.NotNull
    public final android.graphics.Bitmap tintBitmap(@org.jetbrains.annotations.NotNull
    android.graphics.Bitmap bitmap, @androidx.annotation.ColorInt
    int color) {
        return null;
    }
    
    /**
     * Calculate sample size to load the picture with, according to raw and required dimensions
     *
     * @param rawWidth     Raw width of the picture, in pixels
     * @param rawHeight    Raw height of the picture, in pixels
     * @param targetWidth  Target width of the picture, in pixels
     * @param targetHeight Target height of the picture, in pixels
     * @return Sample size to use to load the picture with
     */
    private final int calculateInSampleSize(int rawWidth, int rawHeight, int targetWidth, int targetHeight) {
        return 0;
    }
    
    /**
     * Create a Bitmap from the given InputStream, optimizing resources according to the given required width and height
     *
     * @param stream       Stream to load the bitmap from
     * @param targetWidth  Target picture width, in pixels
     * @param targetHeight Target picture height, in pixels
     * @return Bitmap created from the given InputStream
     * @throws IOException If anything bad happens at load-time
     */
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    public final android.graphics.Bitmap decodeSampledBitmapFromStream(@org.jetbrains.annotations.NotNull
    java.io.InputStream stream, int targetWidth, int targetHeight) throws java.io.IOException {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class, java.lang.IllegalArgumentException.class})
    public final android.net.Uri assembleGif(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.io.File folder, @org.jetbrains.annotations.NotNull
    java.util.List<org.apache.commons.lang3.tuple.ImmutablePair<android.net.Uri, java.lang.Integer>> frames) {
        return null;
    }
    
    /**
     * @param bitmap                the Bitmap to be scaled
     * @param threshold             the maxium dimension (either width or height) of the scaled bitmap
     * @param noRecycle is it necessary to keep the original bitmap? If not recycle the original bitmap to prevent memory leak.
     */
    @org.jetbrains.annotations.NotNull
    public final android.graphics.Bitmap getScaledDownBitmap(@org.jetbrains.annotations.NotNull
    android.graphics.Bitmap bitmap, int threshold, boolean noRecycle) {
        return null;
    }
    
    private final android.graphics.Bitmap sharpRescale(android.graphics.Bitmap source, int newWidth, int newHeight, boolean noRecycle) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.Bitmap sharpRescale(@org.jetbrains.annotations.NotNull
    android.graphics.Bitmap src, float targetScale) {
        return null;
    }
    
    /**
     * Compute resizing parameters according to the given target scale
     *
     * @param targetScale target scale of the image to display (% of the raw dimensions)
     * @return Pair containing
     * - First : Number of half-resizes to perform
     * - Second : Corresponding scale
     */
    private final org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Integer, java.lang.Float> computeRescaleParams(float targetScale) {
        return null;
    }
    
    private final android.graphics.Bitmap successiveRescale(android.graphics.Bitmap src, int resizeNum) {
        return null;
    }
    
    /**
     * Indicates if the picture needs to be rotated 90°, according to the given picture proportions (auto-rotate feature)
     * The goal is to align the picture's proportions with the phone screen's proportions
     *
     * @param screenWidth  Screen width
     * @param screenHeight Screen height
     * @param width        Picture width
     * @param height       Picture height
     * @return True if the picture needs to be rotated 90°
     */
    public final boolean needsRotating(int screenWidth, int screenHeight, int width, int height) {
        return false;
    }
}