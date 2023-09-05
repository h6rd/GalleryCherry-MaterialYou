package me.devsaki.hentoid.viewholders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002,-B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020+H\u0016R\u0019\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010\u001cR\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010\'\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b(\u0010\u001c\u00a8\u0006."}, d2 = {"Lme/devsaki/hentoid/viewholders/DrawerItem;", "Lcom/mikepenz/fastadapter/items/AbstractItem;", "Lme/devsaki/hentoid/viewholders/DrawerItem$ViewHolder;", "label", "", "icon", "", "activityClass", "Ljava/lang/Class;", "Landroidx/appcompat/app/AppCompatActivity;", "uniqueId", "", "(Ljava/lang/String;ILjava/lang/Class;J)V", "getActivityClass", "()Ljava/lang/Class;", "alertStatus", "Lme/devsaki/hentoid/enums/AlertStatus;", "getAlertStatus", "()Lme/devsaki/hentoid/enums/AlertStatus;", "setAlertStatus", "(Lme/devsaki/hentoid/enums/AlertStatus;)V", "flagNew", "", "getFlagNew", "()Z", "setFlagNew", "(Z)V", "getIcon", "()I", "getLabel", "()Ljava/lang/String;", "layoutRes", "getLayoutRes", "site", "Lme/devsaki/hentoid/enums/Site;", "getSite", "()Lme/devsaki/hentoid/enums/Site;", "setSite", "(Lme/devsaki/hentoid/enums/Site;)V", "type", "getType", "getViewHolder", "v", "Landroid/view/View;", "Companion", "ViewHolder", "app_release"})
public final class DrawerItem extends com.mikepenz.fastadapter.items.AbstractItem<me.devsaki.hentoid.viewholders.DrawerItem.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String label = null;
    private final int icon = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Class<? extends androidx.appcompat.app.AppCompatActivity> activityClass = null;
    @org.jetbrains.annotations.Nullable
    private me.devsaki.hentoid.enums.Site site;
    private boolean flagNew = false;
    @org.jetbrains.annotations.NotNull
    private me.devsaki.hentoid.enums.AlertStatus alertStatus = me.devsaki.hentoid.enums.AlertStatus.NONE;
    @org.jetbrains.annotations.NotNull
    public static final me.devsaki.hentoid.viewholders.DrawerItem.Companion Companion = null;
    
    public DrawerItem(@org.jetbrains.annotations.NotNull
    java.lang.String label, int icon, @org.jetbrains.annotations.NotNull
    java.lang.Class<? extends androidx.appcompat.app.AppCompatActivity> activityClass, long uniqueId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLabel() {
        return null;
    }
    
    public final int getIcon() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Class<? extends androidx.appcompat.app.AppCompatActivity> getActivityClass() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final me.devsaki.hentoid.enums.Site getSite() {
        return null;
    }
    
    public final void setSite(@org.jetbrains.annotations.Nullable
    me.devsaki.hentoid.enums.Site p0) {
    }
    
    public final boolean getFlagNew() {
        return false;
    }
    
    public final void setFlagNew(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.devsaki.hentoid.enums.AlertStatus getAlertStatus() {
        return null;
    }
    
    public final void setAlertStatus(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.enums.AlertStatus p0) {
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
    @java.lang.Override
    public me.devsaki.hentoid.viewholders.DrawerItem.ViewHolder getViewHolder(@org.jetbrains.annotations.NotNull
    android.view.View v) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lme/devsaki/hentoid/viewholders/DrawerItem$ViewHolder;", "Lcom/mikepenz/fastadapter/FastAdapter$ViewHolder;", "Lme/devsaki/hentoid/viewholders/DrawerItem;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "alert", "Landroid/widget/ImageView;", "icon", "title", "Landroid/widget/TextView;", "bindView", "", "item", "payloads", "", "", "unbindView", "app_release"})
    public static final class ViewHolder extends com.mikepenz.fastadapter.FastAdapter.ViewHolder<me.devsaki.hentoid.viewholders.DrawerItem> {
        private final android.widget.ImageView icon = null;
        private final android.widget.ImageView alert = null;
        private final android.widget.TextView title = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        @java.lang.Override
        public void bindView(@org.jetbrains.annotations.NotNull
        me.devsaki.hentoid.viewholders.DrawerItem item, @org.jetbrains.annotations.NotNull
        java.util.List<? extends java.lang.Object> payloads) {
        }
        
        @java.lang.Override
        public void unbindView(@org.jetbrains.annotations.NotNull
        me.devsaki.hentoid.viewholders.DrawerItem item) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lme/devsaki/hentoid/viewholders/DrawerItem$Companion;", "", "()V", "fromSite", "Lme/devsaki/hentoid/viewholders/DrawerItem;", "site", "Lme/devsaki/hentoid/enums/Site;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final me.devsaki.hentoid.viewholders.DrawerItem fromSite(@org.jetbrains.annotations.NotNull
        me.devsaki.hentoid.enums.Site site) {
            return null;
        }
    }
}