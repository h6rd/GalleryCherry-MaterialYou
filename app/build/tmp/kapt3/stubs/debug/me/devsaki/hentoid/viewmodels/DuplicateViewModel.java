package me.devsaki.hentoid.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J,\u0010\u001a\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0019J\b\u0010!\u001a\u00020\u0017H\u0014J\u0014\u0010\"\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020#0\u000bJ6\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020+J\u0016\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u0011J\u000e\u0010/\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u001cJ\u000e\u00100\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u0011R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013\u00a8\u00062"}, d2 = {"Lme/devsaki/hentoid/viewmodels/DuplicateViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "dao", "Lme/devsaki/hentoid/database/CollectionDAO;", "duplicatesDao", "Lme/devsaki/hentoid/database/DuplicatesDAO;", "(Landroid/app/Application;Lme/devsaki/hentoid/database/CollectionDAO;Lme/devsaki/hentoid/database/DuplicatesDAO;)V", "allDuplicates", "Landroidx/lifecycle/LiveData;", "", "Lme/devsaki/hentoid/database/domains/DuplicateEntry;", "getAllDuplicates", "()Landroidx/lifecycle/LiveData;", "firstUse", "Landroidx/lifecycle/MutableLiveData;", "", "getFirstUse", "()Landroidx/lifecycle/MutableLiveData;", "selectedDuplicates", "getSelectedDuplicates", "applyChoices", "", "onComplete", "Ljava/lang/Runnable;", "mergeContents", "contentList", "Lme/devsaki/hentoid/database/domains/Content;", "newTitle", "", "deleteAfterMerging", "onSuccess", "onCleared", "remove", "", "scanForDuplicates", "useTitle", "useCover", "useArtist", "sameLanguageOnly", "ignoreChapters", "sensitivity", "", "setBookChoice", "content", "choice", "setContent", "setFirstUse", "value", "app_debug"})
public final class DuplicateViewModel extends androidx.lifecycle.AndroidViewModel {
    private final me.devsaki.hentoid.database.CollectionDAO dao = null;
    private final me.devsaki.hentoid.database.DuplicatesDAO duplicatesDao = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<me.devsaki.hentoid.database.domains.DuplicateEntry>> allDuplicates = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<me.devsaki.hentoid.database.domains.DuplicateEntry>> selectedDuplicates = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> firstUse = null;
    
    public DuplicateViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application, @org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.database.CollectionDAO dao, @org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.database.DuplicatesDAO duplicatesDao) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<me.devsaki.hentoid.database.domains.DuplicateEntry>> getAllDuplicates() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<me.devsaki.hentoid.database.domains.DuplicateEntry>> getSelectedDuplicates() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getFirstUse() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void setFirstUse(boolean value) {
    }
    
    public final void scanForDuplicates(boolean useTitle, boolean useCover, boolean useArtist, boolean sameLanguageOnly, boolean ignoreChapters, int sensitivity) {
    }
    
    public final void setContent(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.database.domains.Content content) {
    }
    
    public final void setBookChoice(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.database.domains.Content content, boolean choice) {
    }
    
    public final void applyChoices(@org.jetbrains.annotations.NotNull
    java.lang.Runnable onComplete) {
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> contentList) {
    }
    
    public final void mergeContents(@org.jetbrains.annotations.NotNull
    java.util.List<? extends me.devsaki.hentoid.database.domains.Content> contentList, @org.jetbrains.annotations.NotNull
    java.lang.String newTitle, boolean deleteAfterMerging, @org.jetbrains.annotations.NotNull
    java.lang.Runnable onSuccess) {
    }
}