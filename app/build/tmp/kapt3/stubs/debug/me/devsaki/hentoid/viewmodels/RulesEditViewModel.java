package me.devsaki.hentoid.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0011J\u001e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0011J\u0006\u0010\u001e\u001a\u00020\u0017J\b\u0010\u001f\u001a\u00020\u0017H\u0014J\u0014\u0010 \u001a\u00020\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000eJ\u000e\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\tJ\u000e\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006&"}, d2 = {"Lme/devsaki/hentoid/viewmodels/RulesEditViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "dao", "Lme/devsaki/hentoid/database/CollectionDAO;", "(Landroid/app/Application;Lme/devsaki/hentoid/database/CollectionDAO;)V", "attributeTypeFilter", "Landroidx/lifecycle/MutableLiveData;", "Lme/devsaki/hentoid/enums/AttributeType;", "getAttributeTypeFilter", "()Landroidx/lifecycle/MutableLiveData;", "currentRulesSource", "Landroidx/lifecycle/LiveData;", "", "Lme/devsaki/hentoid/database/domains/RenamingRule;", "query", "", "rulesList", "Landroidx/lifecycle/MediatorLiveData;", "getRulesList", "()Landroidx/lifecycle/MediatorLiveData;", "createRule", "", "type", "source", "target", "editRule", "id", "", "loadRules", "onCleared", "removeRules", "itemIds", "setAttributeType", "attributeType", "setQuery", "data", "app_debug"})
public final class RulesEditViewModel extends androidx.lifecycle.AndroidViewModel {
    private final me.devsaki.hentoid.database.CollectionDAO dao = null;
    private java.lang.String query = "";
    private androidx.lifecycle.LiveData<java.util.List<me.devsaki.hentoid.database.domains.RenamingRule>> currentRulesSource;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MediatorLiveData<java.util.List<me.devsaki.hentoid.database.domains.RenamingRule>> rulesList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<me.devsaki.hentoid.enums.AttributeType> attributeTypeFilter = null;
    
    public RulesEditViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application, @org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.database.CollectionDAO dao) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MediatorLiveData<java.util.List<me.devsaki.hentoid.database.domains.RenamingRule>> getRulesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<me.devsaki.hentoid.enums.AttributeType> getAttributeTypeFilter() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void setAttributeType(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.enums.AttributeType attributeType) {
    }
    
    public final void setQuery(@org.jetbrains.annotations.NotNull
    java.lang.String data) {
    }
    
    public final void loadRules() {
    }
    
    public final void createRule(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.enums.AttributeType type, @org.jetbrains.annotations.NotNull
    java.lang.String source, @org.jetbrains.annotations.NotNull
    java.lang.String target) {
    }
    
    public final void editRule(long id, @org.jetbrains.annotations.NotNull
    java.lang.String source, @org.jetbrains.annotations.NotNull
    java.lang.String target) {
    }
    
    public final void removeRules(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> itemIds) {
    }
}