package me.devsaki.hentoid.adapters;

import java.lang.System;

/**
 * Adapter for the selected attributes list displayed in the advanced search screen
 * <p>
 * Can only be removed when prerequisites are met : see comments in {@link me.devsaki.hentoid.fragments.SearchBottomSheetFragment}
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lme/devsaki/hentoid/adapters/SelectedAttributeAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lme/devsaki/hentoid/database/domains/Attribute;", "Lme/devsaki/hentoid/viewholders/AttributeViewHolder;", "()V", "onClickListener", "Landroid/view/View$OnClickListener;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnClickListener", "listener", "Companion", "app_debug"})
public final class SelectedAttributeAdapter extends androidx.recyclerview.widget.ListAdapter<me.devsaki.hentoid.database.domains.Attribute, me.devsaki.hentoid.viewholders.AttributeViewHolder> {
    private android.view.View.OnClickListener onClickListener;
    @org.jetbrains.annotations.NotNull
    public static final me.devsaki.hentoid.adapters.SelectedAttributeAdapter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<me.devsaki.hentoid.database.domains.Attribute> DIFF_CALLBACK = null;
    
    public SelectedAttributeAdapter() {
        super(null);
    }
    
    public final void setOnClickListener(@org.jetbrains.annotations.Nullable
    android.view.View.OnClickListener listener) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public me.devsaki.hentoid.viewholders.AttributeViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.viewholders.AttributeViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lme/devsaki/hentoid/adapters/SelectedAttributeAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lme/devsaki/hentoid/database/domains/Attribute;", "getDIFF_CALLBACK", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<me.devsaki.hentoid.database.domains.Attribute> getDIFF_CALLBACK() {
            return null;
        }
    }
}