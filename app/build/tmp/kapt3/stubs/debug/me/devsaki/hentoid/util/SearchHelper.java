package me.devsaki.hentoid.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lme/devsaki/hentoid/util/SearchHelper;", "", "()V", "AdvancedSearchCriteria", "AttributeQueryResult", "app_debug"})
public final class SearchHelper {
    
    public SearchHelper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lme/devsaki/hentoid/util/SearchHelper$AttributeQueryResult;", "", "attributes", "", "Lme/devsaki/hentoid/database/domains/Attribute;", "totalSelectedAttributes", "", "(Ljava/util/List;J)V", "getAttributes", "()Ljava/util/List;", "getTotalSelectedAttributes", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class AttributeQueryResult {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<me.devsaki.hentoid.database.domains.Attribute> attributes = null;
        private final long totalSelectedAttributes = 0L;
        
        @org.jetbrains.annotations.NotNull
        public final me.devsaki.hentoid.util.SearchHelper.AttributeQueryResult copy(@org.jetbrains.annotations.NotNull
        java.util.List<? extends me.devsaki.hentoid.database.domains.Attribute> attributes, long totalSelectedAttributes) {
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
        
        public AttributeQueryResult(@org.jetbrains.annotations.NotNull
        java.util.List<? extends me.devsaki.hentoid.database.domains.Attribute> attributes, long totalSelectedAttributes) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<me.devsaki.hentoid.database.domains.Attribute> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<me.devsaki.hentoid.database.domains.Attribute> getAttributes() {
            return null;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long getTotalSelectedAttributes() {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00c6\u0003J7\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0018\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010\'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\bH\u0003J\u0010\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020\bH\u0003J\t\u0010*\u001a\u00020\bH\u00d6\u0001J\u0006\u0010+\u001a\u00020!J\t\u0010,\u001a\u00020\u0006H\u00d6\u0001J\u000e\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\t\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006/"}, d2 = {"Lme/devsaki/hentoid/util/SearchHelper$AdvancedSearchCriteria;", "", "attributes", "", "Lme/devsaki/hentoid/database/domains/Attribute;", "query", "", "location", "", "contentType", "(Ljava/util/List;Ljava/lang/String;II)V", "getAttributes", "()Ljava/util/List;", "setAttributes", "(Ljava/util/List;)V", "getContentType", "()I", "setContentType", "(I)V", "getLocation", "setLocation", "getQuery", "()Ljava/lang/String;", "setQuery", "(Ljava/lang/String;)V", "clear", "", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "formatAttribute", "a", "res", "Landroid/content/res/Resources;", "formatContentType", "value", "formatLocation", "hashCode", "isEmpty", "toString", "context", "Landroid/content/Context;", "app_debug"})
    public static final class AdvancedSearchCriteria {
        @org.jetbrains.annotations.NotNull
        private java.util.List<me.devsaki.hentoid.database.domains.Attribute> attributes;
        @org.jetbrains.annotations.NotNull
        private java.lang.String query;
        private int location;
        private int contentType;
        
        @org.jetbrains.annotations.NotNull
        public final me.devsaki.hentoid.util.SearchHelper.AdvancedSearchCriteria copy(@org.jetbrains.annotations.NotNull
        java.util.List<me.devsaki.hentoid.database.domains.Attribute> attributes, @org.jetbrains.annotations.NotNull
        java.lang.String query, @me.devsaki.hentoid.util.ContentHelper.Location
        int location, @me.devsaki.hentoid.util.ContentHelper.Type
        int contentType) {
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
        
        public AdvancedSearchCriteria() {
            super();
        }
        
        public AdvancedSearchCriteria(@org.jetbrains.annotations.NotNull
        java.util.List<me.devsaki.hentoid.database.domains.Attribute> attributes, @org.jetbrains.annotations.NotNull
        java.lang.String query, @me.devsaki.hentoid.util.ContentHelper.Location
        int location, @me.devsaki.hentoid.util.ContentHelper.Type
        int contentType) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<me.devsaki.hentoid.database.domains.Attribute> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<me.devsaki.hentoid.database.domains.Attribute> getAttributes() {
            return null;
        }
        
        public final void setAttributes(@org.jetbrains.annotations.NotNull
        java.util.List<me.devsaki.hentoid.database.domains.Attribute> p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getQuery() {
            return null;
        }
        
        public final void setQuery(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getLocation() {
            return 0;
        }
        
        public final void setLocation(int p0) {
        }
        
        public final int component4() {
            return 0;
        }
        
        public final int getContentType() {
            return 0;
        }
        
        public final void setContentType(int p0) {
        }
        
        public final void clear() {
        }
        
        public final boolean isEmpty() {
            return false;
        }
        
        @androidx.annotation.StringRes
        private final int formatLocation(@me.devsaki.hentoid.util.ContentHelper.Location
        int value) {
            return 0;
        }
        
        @androidx.annotation.StringRes
        private final int formatContentType(@me.devsaki.hentoid.util.ContentHelper.Type
        int value) {
            return 0;
        }
        
        private final java.lang.String formatAttribute(me.devsaki.hentoid.database.domains.Attribute a, android.content.res.Resources res) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String toString(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}