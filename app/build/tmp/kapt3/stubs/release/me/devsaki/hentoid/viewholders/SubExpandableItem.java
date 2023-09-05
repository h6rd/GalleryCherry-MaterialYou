package me.devsaki.hentoid.viewholders;

import java.lang.System;

/**
 * Inspired by mikepenz
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\f\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00000\u00042\b\u0012\u0004\u0012\u00020\u00030\u00052\b\u0012\u0004\u0012\u00020\u00030\u00062\b\u0012\u0004\u0012\u00020\u00030\u0007:\u0002PQB\u001f\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\rJ\u001e\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u00032\f\u0010D\u001a\b\u0012\u0004\u0012\u00020F0EH\u0016J\u0010\u0010G\u001a\u00020\'2\u0006\u0010H\u001a\u00020\u0003H\u0016J\b\u0010I\u001a\u00020\"H\u0016J\u0010\u0010J\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\'H\u0016J\u0010\u0010K\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0003H\u0016J\u0016\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0001\u0010M\u001a\u00020\"J\u0014\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000e\u001a\u00020\u000bJ\u0014\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001d\u001a\u00020\u0015J\u0014\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0016\u001a\u00020\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00158V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\u001c\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010$R\u0091\u0001\u0010%\u001a\u0084\u0001\u0012\u0015\u0012\u0013\u0018\u00010\'\u00a2\u0006\f\b(\u0012\b\b\n\u0012\u0004\b\b()\u0012\u001f\u0012\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000*\u00a2\u0006\f\b(\u0012\b\b\n\u0012\u0004\b\b(+\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0000\u00a2\u0006\f\b(\u0012\b\b\n\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110\"\u00a2\u0006\f\b(\u0012\b\b\n\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u0015\u0018\u00010&j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u0001`.X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0018R\u00b1\u0002\u00101\u001a\u0084\u0001\u0012\u0015\u0012\u0013\u0018\u00010\'\u00a2\u0006\f\b(\u0012\b\b\n\u0012\u0004\b\b()\u0012\u001f\u0012\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000*\u00a2\u0006\f\b(\u0012\b\b\n\u0012\u0004\b\b(+\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0000\u00a2\u0006\f\b(\u0012\b\b\n\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110\"\u00a2\u0006\f\b(\u0012\b\b\n\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u0015\u0018\u00010&j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u0001`.2\u0089\u0001\u00100\u001a\u0084\u0001\u0012\u0015\u0012\u0013\u0018\u00010\'\u00a2\u0006\f\b(\u0012\b\b\n\u0012\u0004\b\b()\u0012\u001f\u0012\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000*\u00a2\u0006\f\b(\u0012\b\b\n\u0012\u0004\b\b(+\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0000\u00a2\u0006\f\b(\u0012\b\b\n\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110\"\u00a2\u0006\f\b(\u0012\b\b\n\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u0015\u0018\u00010&j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u0001`.@VX\u0096\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u00ab\u0002\u00109\u001a\u0084\u0001\u0012\u0015\u0012\u0013\u0018\u00010\'\u00a2\u0006\f\b(\u0012\b\b\n\u0012\u0004\b\b()\u0012\u001f\u0012\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000*\u00a2\u0006\f\b(\u0012\b\b\n\u0012\u0004\b\b(+\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0000\u00a2\u0006\f\b(\u0012\b\b\n\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110\"\u00a2\u0006\f\b(\u0012\b\b\n\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u0015\u0018\u00010&j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u0001`.2\u0089\u0001\u00108\u001a\u0084\u0001\u0012\u0015\u0012\u0013\u0018\u00010\'\u00a2\u0006\f\b(\u0012\b\b\n\u0012\u0004\b\b()\u0012\u001f\u0012\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000*\u00a2\u0006\f\b(\u0012\b\b\n\u0012\u0004\b\b(+\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0000\u00a2\u0006\f\b(\u0012\b\b\n\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110\"\u00a2\u0006\f\b(\u0012\b\b\n\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u0015\u0018\u00010&j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u0001`.8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b:\u00105\"\u0004\b;\u00107R\u0014\u0010<\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\"8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b@\u0010$\u00a8\u0006R"}, d2 = {"Lme/devsaki/hentoid/viewholders/SubExpandableItem;", "T", "Lcom/mikepenz/fastadapter/expandable/items/AbstractExpandableItem;", "Lme/devsaki/hentoid/viewholders/SubExpandableItem$ViewHolder;", "Lcom/mikepenz/fastadapter/IClickable;", "Lcom/mikepenz/fastadapter/ISubItem;", "Lcom/mikepenz/fastadapter/drag/IExtendedDraggable;", "Lme/devsaki/hentoid/viewholders/INestedItem;", "mTouchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "name", "", "entity", "(Landroidx/recyclerview/widget/ItemTouchHelper;Ljava/lang/String;Ljava/lang/Object;)V", "description", "Lcom/mikepenz/fastadapter/ui/utils/StringHolder;", "getDescription", "()Lcom/mikepenz/fastadapter/ui/utils/StringHolder;", "setDescription", "(Lcom/mikepenz/fastadapter/ui/utils/StringHolder;)V", "draggable", "", "header", "getHeader", "()Ljava/lang/String;", "setHeader", "(Ljava/lang/String;)V", "isDraggable", "()Z", "value", "isSelectable", "setSelectable", "(Z)V", "layoutRes", "", "getLayoutRes", "()I", "mOnClickListener", "Lkotlin/Function4;", "Landroid/view/View;", "Lkotlin/ParameterName;", "v", "Lcom/mikepenz/fastadapter/IAdapter;", "adapter", "item", "position", "Lcom/mikepenz/fastadapter/ClickListener;", "getName", "onClickListener", "onItemClickListener", "getOnItemClickListener$annotations", "()V", "getOnItemClickListener", "()Lkotlin/jvm/functions/Function4;", "setOnItemClickListener", "(Lkotlin/jvm/functions/Function4;)V", "<anonymous parameter 0>", "onPreItemClickListener", "getOnPreItemClickListener", "setOnPreItemClickListener", "touchHelper", "getTouchHelper", "()Landroidx/recyclerview/widget/ItemTouchHelper;", "type", "getType", "bindView", "", "holder", "payloads", "", "", "getDragView", "viewHolder", "getLevel", "getViewHolder", "unbindView", "withDescription", "descriptionRes", "withDraggable", "withHeader", "DragHandlerTouchEvent", "ViewHolder", "app_release"})
public final class SubExpandableItem<T extends java.lang.Object> extends com.mikepenz.fastadapter.expandable.items.AbstractExpandableItem<me.devsaki.hentoid.viewholders.SubExpandableItem.ViewHolder> implements com.mikepenz.fastadapter.IClickable<me.devsaki.hentoid.viewholders.SubExpandableItem<T>>, com.mikepenz.fastadapter.ISubItem<me.devsaki.hentoid.viewholders.SubExpandableItem.ViewHolder>, com.mikepenz.fastadapter.drag.IExtendedDraggable<me.devsaki.hentoid.viewholders.SubExpandableItem.ViewHolder>, me.devsaki.hentoid.viewholders.INestedItem<me.devsaki.hentoid.viewholders.SubExpandableItem.ViewHolder> {
    private final androidx.recyclerview.widget.ItemTouchHelper mTouchHelper = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable
    private java.lang.String header;
    @org.jetbrains.annotations.Nullable
    private com.mikepenz.fastadapter.ui.utils.StringHolder description;
    private boolean draggable = false;
    private kotlin.jvm.functions.Function4<? super android.view.View, ? super com.mikepenz.fastadapter.IAdapter<me.devsaki.hentoid.viewholders.SubExpandableItem<T>>, ? super me.devsaki.hentoid.viewholders.SubExpandableItem<T>, ? super java.lang.Integer, java.lang.Boolean> mOnClickListener;
    
    /**
     * we overwrite the item specific click listener so we can automatically animate within the item
     *
     * @return
     */
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function4<? super android.view.View, ? super com.mikepenz.fastadapter.IAdapter<me.devsaki.hentoid.viewholders.SubExpandableItem<T>>, ? super me.devsaki.hentoid.viewholders.SubExpandableItem<T>, ? super java.lang.Integer, java.lang.Boolean> onItemClickListener;
    
    public SubExpandableItem(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.ItemTouchHelper mTouchHelper, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.Nullable
    T entity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHeader() {
        return null;
    }
    
    public final void setHeader(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.mikepenz.fastadapter.ui.utils.StringHolder getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable
    com.mikepenz.fastadapter.ui.utils.StringHolder p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public kotlin.jvm.functions.Function4<android.view.View, com.mikepenz.fastadapter.IAdapter<me.devsaki.hentoid.viewholders.SubExpandableItem<T>>, me.devsaki.hentoid.viewholders.SubExpandableItem<T>, java.lang.Integer, java.lang.Boolean> getOnItemClickListener() {
        return null;
    }
    
    /**
     * we overwrite the item specific click listener so we can automatically animate within the item
     *
     * @return
     */
    @kotlin.Suppress(names = {"SetterBackingFieldAssignment"})
    @java.lang.Override
    @java.lang.Deprecated
    public static void getOnItemClickListener$annotations() {
    }
    
    @java.lang.Override
    public void setOnItemClickListener(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function4<? super android.view.View, ? super com.mikepenz.fastadapter.IAdapter<me.devsaki.hentoid.viewholders.SubExpandableItem<T>>, ? super me.devsaki.hentoid.viewholders.SubExpandableItem<T>, ? super java.lang.Integer, java.lang.Boolean> onClickListener) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public kotlin.jvm.functions.Function4<android.view.View, com.mikepenz.fastadapter.IAdapter<me.devsaki.hentoid.viewholders.SubExpandableItem<T>>, me.devsaki.hentoid.viewholders.SubExpandableItem<T>, java.lang.Integer, java.lang.Boolean> getOnPreItemClickListener() {
        return null;
    }
    
    @java.lang.Override
    public void setOnPreItemClickListener(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function4<? super android.view.View, ? super com.mikepenz.fastadapter.IAdapter<me.devsaki.hentoid.viewholders.SubExpandableItem<T>>, ? super me.devsaki.hentoid.viewholders.SubExpandableItem<T>, ? super java.lang.Integer, java.lang.Boolean> $noName_0) {
    }
    
    @java.lang.Override
    public boolean isSelectable() {
        return false;
    }
    
    @java.lang.Override
    public void setSelectable(boolean value) {
    }
    
    @java.lang.Override
    public int getType() {
        return 0;
    }
    
    @java.lang.Override
    public int getLayoutRes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.devsaki.hentoid.viewholders.SubExpandableItem<T> withHeader(@org.jetbrains.annotations.NotNull
    java.lang.String header) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.devsaki.hentoid.viewholders.SubExpandableItem<T> withDescription(@org.jetbrains.annotations.NotNull
    java.lang.String description) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.devsaki.hentoid.viewholders.SubExpandableItem<T> withDescription(@androidx.annotation.StringRes
    int descriptionRes) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.devsaki.hentoid.viewholders.SubExpandableItem<T> withDraggable(boolean value) {
        return null;
    }
    
    /**
     * binds the data of this item onto the viewHolder
     *
     * @param holder the viewHolder of this item
     */
    @java.lang.Override
    public void bindView(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.viewholders.SubExpandableItem.ViewHolder holder, @org.jetbrains.annotations.NotNull
    java.util.List<? extends java.lang.Object> payloads) {
    }
    
    @java.lang.Override
    public void unbindView(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.viewholders.SubExpandableItem.ViewHolder holder) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public me.devsaki.hentoid.viewholders.SubExpandableItem.ViewHolder getViewHolder(@org.jetbrains.annotations.NotNull
    android.view.View v) {
        return null;
    }
    
    @java.lang.Override
    public boolean isDraggable() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.recyclerview.widget.ItemTouchHelper getTouchHelper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View getDragView(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.viewholders.SubExpandableItem.ViewHolder viewHolder) {
        return null;
    }
    
    @java.lang.Override
    public int getLevel() {
        return 0;
    }
    
    /**
     * our ViewHolder
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u0019"}, d2 = {"Lme/devsaki/hentoid/viewholders/SubExpandableItem$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "description", "Landroid/widget/TextView;", "getDescription", "()Landroid/widget/TextView;", "setDescription", "(Landroid/widget/TextView;)V", "dragHandle", "Landroid/widget/ImageView;", "getDragHandle", "()Landroid/widget/ImageView;", "setDragHandle", "(Landroid/widget/ImageView;)V", "icon", "getIcon", "setIcon", "name", "getName", "setName", "getView", "()Landroid/view/View;", "app_release"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.view.View view = null;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView name;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView description;
        @org.jetbrains.annotations.NotNull
        private android.widget.ImageView icon;
        @org.jetbrains.annotations.NotNull
        private android.widget.ImageView dragHandle;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.view.View getView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getDescription() {
            return null;
        }
        
        public final void setDescription(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getIcon() {
            return null;
        }
        
        public final void setIcon(@org.jetbrains.annotations.NotNull
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getDragHandle() {
            return null;
        }
        
        public final void setDragHandle(@org.jetbrains.annotations.NotNull
        android.widget.ImageView p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B(\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016JB\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00062\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0016R,\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001a"}, d2 = {"Lme/devsaki/hentoid/viewholders/SubExpandableItem$DragHandlerTouchEvent;", "T", "Lcom/mikepenz/fastadapter/listeners/TouchEventHook;", "Lme/devsaki/hentoid/viewholders/SubExpandableItem;", "action", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "position", "", "(Lkotlin/jvm/functions/Function1;)V", "getAction", "()Lkotlin/jvm/functions/Function1;", "onBind", "Landroid/view/View;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onTouch", "", "v", "event", "Landroid/view/MotionEvent;", "fastAdapter", "Lcom/mikepenz/fastadapter/FastAdapter;", "item", "app_release"})
    public static final class DragHandlerTouchEvent<T extends java.lang.Object> extends com.mikepenz.fastadapter.listeners.TouchEventHook<me.devsaki.hentoid.viewholders.SubExpandableItem<T>> {
        @org.jetbrains.annotations.NotNull
        private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> action = null;
        
        public DragHandlerTouchEvent(@org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> action) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getAction() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        @java.lang.Override
        public android.view.View onBind(@org.jetbrains.annotations.NotNull
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            return null;
        }
        
        @java.lang.Override
        public boolean onTouch(@org.jetbrains.annotations.NotNull
        android.view.View v, @org.jetbrains.annotations.NotNull
        android.view.MotionEvent event, int position, @org.jetbrains.annotations.NotNull
        com.mikepenz.fastadapter.FastAdapter<me.devsaki.hentoid.viewholders.SubExpandableItem<T>> fastAdapter, @org.jetbrains.annotations.NotNull
        me.devsaki.hentoid.viewholders.SubExpandableItem<T> item) {
            return false;
        }
    }
}