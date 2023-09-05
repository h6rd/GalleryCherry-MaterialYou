package me.devsaki.hentoid.adapters;

import java.lang.System;

/**
 * Adapter for the available attributes list displayed in the advanced search screen
 * <p>
 * Can only be removed when prerequisites are met : see comments in {@link me.devsaki.hentoid.fragments.SearchBottomSheetFragment}
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eJ\u0006\u0010\u000f\u001a\u00020\fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0006J\u000e\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\bJ\u000e\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lme/devsaki/hentoid/adapters/AvailableAttributeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lme/devsaki/hentoid/viewholders/AttributeViewHolder;", "()V", "dataset", "", "Lme/devsaki/hentoid/database/domains/Attribute;", "onClickListener", "Landroid/view/View$OnClickListener;", "onScrollToEndListener", "Ljava/lang/Runnable;", "add", "", "attrs", "", "clear", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "remove", "attribute", "setOnClickListener", "listener", "setOnScrollToEndListener", "Companion", "app_debug"})
public final class AvailableAttributeAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<me.devsaki.hentoid.viewholders.AttributeViewHolder> {
    private final java.util.List<me.devsaki.hentoid.database.domains.Attribute> dataset = null;
    private java.lang.Runnable onScrollToEndListener;
    private android.view.View.OnClickListener onClickListener;
    @org.jetbrains.annotations.NotNull
    public static final me.devsaki.hentoid.adapters.AvailableAttributeAdapter.Companion Companion = null;
    public static final int VISIBLE_THRESHOLD = 5;
    
    public AvailableAttributeAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public me.devsaki.hentoid.viewholders.AttributeViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public final void setOnScrollToEndListener(@org.jetbrains.annotations.NotNull
    java.lang.Runnable listener) {
    }
    
    public final void setOnClickListener(@org.jetbrains.annotations.NotNull
    android.view.View.OnClickListener listener) {
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.viewholders.AttributeViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void add(@org.jetbrains.annotations.NotNull
    java.util.List<? extends me.devsaki.hentoid.database.domains.Attribute> attrs) {
    }
    
    public final void clear() {
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.database.domains.Attribute attribute) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lme/devsaki/hentoid/adapters/AvailableAttributeAdapter$Companion;", "", "()V", "VISIBLE_THRESHOLD", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}