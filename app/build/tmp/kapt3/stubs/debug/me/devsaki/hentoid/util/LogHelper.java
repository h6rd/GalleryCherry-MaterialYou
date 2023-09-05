package me.devsaki.hentoid.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lme/devsaki/hentoid/util/LogHelper;", "", "()V", "Companion", "LogEntry", "LogInfo", "app_debug"})
public final class LogHelper {
    @org.jetbrains.annotations.NotNull
    public static final me.devsaki.hentoid.util.LogHelper.Companion Companion = null;
    private static final java.lang.String LINE_SEPARATOR = null;
    
    public LogHelper() {
        super();
    }
    
    /**
     * Represents a log entry
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0006\"\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010\u0007B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nB\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\rB\u0017\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2 = {"Lme/devsaki/hentoid/util/LogHelper$LogEntry;", "", "message", "", "(Ljava/lang/String;)V", "formatArgs", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "isError", "", "(Ljava/lang/String;Z)V", "chapter", "", "(Ljava/lang/String;IZ)V", "timestamp", "Ljava/time/Instant;", "(Ljava/time/Instant;Ljava/lang/String;)V", "getChapter", "()I", "()Z", "getMessage", "()Ljava/lang/String;", "getTimestamp", "()Ljava/time/Instant;", "app_debug"})
    public static final class LogEntry {
        @org.jetbrains.annotations.NotNull
        private final java.time.Instant timestamp = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String message = null;
        private final boolean isError = false;
        
        /**
         * Chapter number can be used to organize entries in a non-chronological order
         * (e.g. general information entries before detailed entries, regardless of their timestamp)
         */
        private final int chapter = 0;
        
        @org.jetbrains.annotations.NotNull
        public final java.time.Instant getTimestamp() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getMessage() {
            return null;
        }
        
        public final boolean isError() {
            return false;
        }
        
        public final int getChapter() {
            return 0;
        }
        
        public LogEntry(@org.jetbrains.annotations.NotNull
        java.lang.String message) {
            super();
        }
        
        public LogEntry(@org.jetbrains.annotations.NotNull
        java.lang.String message, @org.jetbrains.annotations.NotNull
        java.lang.Object... formatArgs) {
            super();
        }
        
        public LogEntry(@org.jetbrains.annotations.NotNull
        java.lang.String message, boolean isError) {
            super();
        }
        
        public LogEntry(@org.jetbrains.annotations.NotNull
        java.lang.String message, int chapter, boolean isError) {
            super();
        }
        
        public LogEntry(@org.jetbrains.annotations.NotNull
        java.time.Instant timestamp, @org.jetbrains.annotations.NotNull
        java.lang.String message) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003J+\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0016\"\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0013J\u0006\u0010\u0019\u001a\u00020\u0003J\u0014\u0010\u001a\u001a\u00020\u00132\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0003J\u000e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0003J\u000e\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0003R*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001e\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r\u00a8\u0006 "}, d2 = {"Lme/devsaki/hentoid/util/LogHelper$LogInfo;", "", "fileName", "", "(Ljava/lang/String;)V", "<set-?>", "", "Lme/devsaki/hentoid/util/LogHelper$LogEntry;", "entries", "getEntries", "()Ljava/util/List;", "header", "getHeader", "()Ljava/lang/String;", "logName", "getLogName", "noDataMessage", "getNoDataMessage", "addEntry", "", "message", "formatArgs", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "clear", "getFileName", "setEntries", "setFileName", "setHeader", "setHeaderName", "headerName", "setNoDataMessage", "app_debug"})
    public static final class LogInfo {
        private java.lang.String fileName;
        @org.jetbrains.annotations.NotNull
        private java.lang.String logName = "";
        @org.jetbrains.annotations.NotNull
        private java.lang.String noDataMessage = "no data";
        @org.jetbrains.annotations.NotNull
        private java.lang.String header = "";
        @org.jetbrains.annotations.NotNull
        private java.util.List<me.devsaki.hentoid.util.LogHelper.LogEntry> entries;
        
        public LogInfo(@org.jetbrains.annotations.NotNull
        java.lang.String fileName) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getLogName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getNoDataMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getHeader() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<me.devsaki.hentoid.util.LogHelper.LogEntry> getEntries() {
            return null;
        }
        
        /**
         * Set the log file name, without the extension
         *
         * @param fileName Log file name
         */
        public final void setFileName(@org.jetbrains.annotations.NotNull
        java.lang.String fileName) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFileName() {
            return null;
        }
        
        /**
         * Set display name of the log, for use in its header
         *
         * @param headerName Display name
         */
        public final void setHeaderName(@org.jetbrains.annotations.NotNull
        java.lang.String headerName) {
        }
        
        /**
         * Set message to display when the log contains no data
         * (to avoid creating a totally empty log file)
         *
         * @param noDataMessage Message to display when the log contains no data
         */
        public final void setNoDataMessage(@org.jetbrains.annotations.NotNull
        java.lang.String noDataMessage) {
        }
        
        /**
         * Set message to display at the very beginning of the log
         *
         * @param header Message to display at the very beginning of the log
         */
        public final void setHeader(@org.jetbrains.annotations.NotNull
        java.lang.String header) {
        }
        
        /**
         * Set log entries
         *
         * @param entries Log entries
         */
        public final void setEntries(@org.jetbrains.annotations.NotNull
        java.util.List<me.devsaki.hentoid.util.LogHelper.LogEntry> entries) {
        }
        
        /**
         * Add the given message as a log entry
         *
         * @param message Message to add as a log entry
         */
        public final void addEntry(@org.jetbrains.annotations.NotNull
        java.lang.String message) {
        }
        
        /**
         * Add the given message as a log entry
         *
         * @param message    Message to add as a log entry
         * @param formatArgs Formatting arguments
         */
        public final void addEntry(@org.jetbrains.annotations.NotNull
        java.lang.String message, @org.jetbrains.annotations.NotNull
        java.lang.Object... formatArgs) {
        }
        
        /**
         * Clear all log entries
         */
        public final void clear() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lme/devsaki/hentoid/util/LogHelper$Companion;", "", "()V", "LINE_SEPARATOR", "", "kotlin.jvm.PlatformType", "buildLog", "info", "Lme/devsaki/hentoid/util/LogHelper$LogInfo;", "writeLog", "Landroidx/documentfile/provider/DocumentFile;", "context", "Landroid/content/Context;", "logInfo", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Build the log text using the given LogInfo
         *
         * @param info LogInfo to build the log with
         * @return Log text
         */
        private final java.lang.String buildLog(me.devsaki.hentoid.util.LogHelper.LogInfo info) {
            return null;
        }
        
        /**
         * Write the given log to the app's default storage location
         *
         * @param context Context to use
         * @param logInfo Log to write
         * @return DocumentFile of the created log file; null if it couldn't be created
         */
        @org.jetbrains.annotations.Nullable
        public final androidx.documentfile.provider.DocumentFile writeLog(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        me.devsaki.hentoid.util.LogHelper.LogInfo logInfo) {
            return null;
        }
    }
}