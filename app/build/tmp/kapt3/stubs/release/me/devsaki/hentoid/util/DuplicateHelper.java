package me.devsaki.hentoid.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lme/devsaki/hentoid/util/DuplicateHelper;", "", "()V", "Companion", "DuplicateCandidate", "app_release"})
public final class DuplicateHelper {
    @org.jetbrains.annotations.NotNull
    public static final me.devsaki.hentoid.util.DuplicateHelper.Companion Companion = null;
    private static final double[] COVER_THRESHOLDS = {0.8, 0.85, 0.9};
    private static final double[] TEXT_THRESHOLDS = {0.78, 0.8, 0.85};
    private static final double[] TOTAL_THRESHOLDS = {0.8, 0.85, 0.9};
    private static final int COVER_WORK_RESOLUTION = 48;
    private static final java.util.List<java.lang.String> TITLE_CHAPTER_WORDS = null;
    
    public DuplicateHelper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R!\u0010\u0012\u001a\u0012\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010 \u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\"\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010$\u00a8\u0006\'"}, d2 = {"Lme/devsaki/hentoid/util/DuplicateHelper$DuplicateCandidate;", "", "content", "Lme/devsaki/hentoid/database/domains/Content;", "useTitle", "", "useArtist", "useLanguage", "useCover", "ignoreChapters", "forceCoverHash", "", "(Lme/devsaki/hentoid/database/domains/Content;ZZZZZJ)V", "artistsCleanup", "", "", "getArtistsCleanup", "()Ljava/util/List;", "countryCodes", "kotlin.jvm.PlatformType", "getCountryCodes", "coverHash", "getCoverHash", "()J", "id", "getId", "maxChapterBound", "", "getMaxChapterBound", "()I", "minChapterBound", "getMinChapterBound", "size", "getSize", "titleCleanup", "getTitleCleanup", "()Ljava/lang/String;", "titleNoDigits", "getTitleNoDigits", "app_release"})
    public static final class DuplicateCandidate {
        private final long id = 0L;
        private final long coverHash = 0L;
        private final long size = 0L;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String titleCleanup = null;
        @org.jetbrains.annotations.Nullable
        private final java.util.List<java.lang.String> artistsCleanup = null;
        @org.jetbrains.annotations.Nullable
        private final java.util.List<java.lang.String> countryCodes = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String titleNoDigits = null;
        private final int minChapterBound = 0;
        private final int maxChapterBound = 0;
        
        public DuplicateCandidate(@org.jetbrains.annotations.NotNull
        me.devsaki.hentoid.database.domains.Content content, boolean useTitle, boolean useArtist, boolean useLanguage, boolean useCover, boolean ignoreChapters, long forceCoverHash) {
            super();
        }
        
        public final long getId() {
            return 0L;
        }
        
        public final long getCoverHash() {
            return 0L;
        }
        
        public final long getSize() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTitleCleanup() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> getArtistsCleanup() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> getCountryCodes() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTitleNoDigits() {
            return null;
        }
        
        public final int getMinChapterBound() {
            return 0;
        }
        
        public final int getMaxChapterBound() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J(\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002J \u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J.\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u0006J(\u0010\"\u001a\u00020!2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002J\u0018\u0010%\u001a\u0004\u0018\u00010\u00112\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)J\u0010\u0010*\u001a\u0004\u0018\u00010\u00112\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020\u000fJ\u0010\u0010-\u001a\u00020\u000f2\b\b\u0002\u0010.\u001a\u00020\u0006J(\u0010/\u001a\u0002002\u0006\u0010&\u001a\u00020\'2\u0006\u00101\u001a\u0002022\u0006\u0010(\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002JN\u00103\u001a\u0002002\u0006\u0010&\u001a\u00020\'2\u0006\u00101\u001a\u0002022\u0006\u00104\u001a\u0002052\f\u00106\u001a\b\u0012\u0004\u0012\u00020)072\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006092\f\u0010:\u001a\b\u0012\u0004\u0012\u00020;07J \u0010<\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010=\u001a\u00020\u0013H\u0002JP\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020!2\u0006\u0010A\u001a\u00020!2\u0006\u0010B\u001a\u00020!2\u0006\u0010C\u001a\u00020!2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001cJ \u0010D\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060E2\u0006\u0010F\u001a\u00020\nJ(\u0010G\u001a\u0002002\u0006\u0010&\u001a\u00020\'2\u0006\u00101\u001a\u0002022\u0006\u0010(\u001a\u00020)2\u0006\u0010H\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006I"}, d2 = {"Lme/devsaki/hentoid/util/DuplicateHelper$Companion;", "", "()V", "COVER_THRESHOLDS", "", "COVER_WORK_RESOLUTION", "", "TEXT_THRESHOLDS", "TITLE_CHAPTER_WORDS", "", "", "TOTAL_THRESHOLDS", "calcPhash", "", "hashEngine", "Lme/devsaki/hentoid/util/image/ImagePHash;", "bitmap", "Landroid/graphics/Bitmap;", "computeArtistScore", "", "referenceArtistsCleanup", "candidateArtistsCleanup", "computeCoverScore", "referenceHash", "candidateHash", "sensitivity", "computeTitleScore", "textComparator", "Lme/devsaki/hentoid/util/string_similarity/StringSimilarity;", "reference", "Lme/devsaki/hentoid/util/DuplicateHelper$DuplicateCandidate;", "candidate", "ignoreChapters", "", "containsSameLanguage", "referenceCodes", "candidateCodes", "getCoverBitmapFromContent", "context", "Landroid/content/Context;", "content", "Lme/devsaki/hentoid/database/domains/Content;", "getCoverBitmapFromStream", "stream", "Ljava/io/InputStream;", "getHashEngine", "resolution", "indexContent", "", "dao", "Lme/devsaki/hentoid/database/CollectionDAO;", "indexCovers", "stopped", "Ljava/util/concurrent/atomic/AtomicBoolean;", "info", "Landroidx/core/util/Consumer;", "progress", "Lcom/annimon/stream/function/BiConsumer;", "error", "", "processChapterVariants", "similarity", "processContent", "Lme/devsaki/hentoid/database/domains/DuplicateEntry;", "useTitle", "useCover", "useSameArtist", "useSameLanguage", "sanitizeTitle", "Lkotlin/Triple;", "title", "savePhash", "pHash", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final me.devsaki.hentoid.util.image.ImagePHash getHashEngine() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final me.devsaki.hentoid.util.image.ImagePHash getHashEngine(int resolution) {
            return null;
        }
        
        public final void indexCovers(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        me.devsaki.hentoid.database.CollectionDAO dao, @org.jetbrains.annotations.NotNull
        java.util.concurrent.atomic.AtomicBoolean stopped, @org.jetbrains.annotations.NotNull
        androidx.core.util.Consumer<me.devsaki.hentoid.database.domains.Content> info, @org.jetbrains.annotations.NotNull
        com.annimon.stream.function.BiConsumer<java.lang.Integer, java.lang.Integer> progress, @org.jetbrains.annotations.NotNull
        androidx.core.util.Consumer<java.lang.Throwable> error) {
        }
        
        private final void indexContent(android.content.Context context, me.devsaki.hentoid.database.CollectionDAO dao, me.devsaki.hentoid.database.domains.Content content, me.devsaki.hentoid.util.image.ImagePHash hashEngine) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final android.graphics.Bitmap getCoverBitmapFromContent(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        me.devsaki.hentoid.database.domains.Content content) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final android.graphics.Bitmap getCoverBitmapFromStream(@org.jetbrains.annotations.NotNull
        java.io.InputStream stream) {
            return null;
        }
        
        public final long calcPhash(@org.jetbrains.annotations.NotNull
        me.devsaki.hentoid.util.image.ImagePHash hashEngine, @org.jetbrains.annotations.Nullable
        android.graphics.Bitmap bitmap) {
            return 0L;
        }
        
        private final void savePhash(android.content.Context context, me.devsaki.hentoid.database.CollectionDAO dao, me.devsaki.hentoid.database.domains.Content content, long pHash) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final me.devsaki.hentoid.database.domains.DuplicateEntry processContent(@org.jetbrains.annotations.NotNull
        me.devsaki.hentoid.util.DuplicateHelper.DuplicateCandidate reference, @org.jetbrains.annotations.NotNull
        me.devsaki.hentoid.util.DuplicateHelper.DuplicateCandidate candidate, boolean useTitle, boolean useCover, boolean useSameArtist, boolean useSameLanguage, boolean ignoreChapters, int sensitivity, @org.jetbrains.annotations.NotNull
        me.devsaki.hentoid.util.string_similarity.StringSimilarity textComparator) {
            return null;
        }
        
        private final boolean containsSameLanguage(java.util.List<java.lang.String> referenceCodes, java.util.List<java.lang.String> candidateCodes) {
            return false;
        }
        
        private final float computeCoverScore(long referenceHash, long candidateHash, int sensitivity) {
            return 0.0F;
        }
        
        public final float computeTitleScore(@org.jetbrains.annotations.NotNull
        me.devsaki.hentoid.util.string_similarity.StringSimilarity textComparator, @org.jetbrains.annotations.NotNull
        me.devsaki.hentoid.util.DuplicateHelper.DuplicateCandidate reference, @org.jetbrains.annotations.NotNull
        me.devsaki.hentoid.util.DuplicateHelper.DuplicateCandidate candidate, boolean ignoreChapters, int sensitivity) {
            return 0.0F;
        }
        
        private final float processChapterVariants(me.devsaki.hentoid.util.DuplicateHelper.DuplicateCandidate reference, me.devsaki.hentoid.util.DuplicateHelper.DuplicateCandidate candidate, float similarity) {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlin.Triple<java.lang.String, java.lang.Integer, java.lang.Integer> sanitizeTitle(@org.jetbrains.annotations.NotNull
        java.lang.String title) {
            return null;
        }
        
        private final float computeArtistScore(java.util.List<java.lang.String> referenceArtistsCleanup, java.util.List<java.lang.String> candidateArtistsCleanup) {
            return 0.0F;
        }
    }
}