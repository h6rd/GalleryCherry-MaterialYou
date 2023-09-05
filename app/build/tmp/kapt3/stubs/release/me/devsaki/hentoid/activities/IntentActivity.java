package me.devsaki.hentoid.activities;

import java.lang.System;

/**
 * Resole intents and send them where appropriate
 * <p>
 * Manages how the app receives a "share" intent
 * e.g. Click a link on reddit - it opens in my browser but I wanna download it in Hentoid
 * => tap share in the browser and select hentoid; that's when IntentActivity takes the lead
 * <p>
 * NB : This activity is transparent and not lockable; it should _not_ be a child of BaseActivity
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u00a8\u0006\u0013"}, d2 = {"Lme/devsaki/hentoid/activities/IntentActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onInitComplete", "onMainProgress", "f", "", "onSecondaryProgress", "parsePath", "", "site", "Lme/devsaki/hentoid/enums/Site;", "data", "Landroid/net/Uri;", "processIntent", "app_release"})
public final class IntentActivity extends androidx.appcompat.app.AppCompatActivity {
    
    public IntentActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void onMainProgress(float f) {
    }
    
    private final void onSecondaryProgress(float f) {
    }
    
    private final void onInitComplete() {
    }
    
    private final void processIntent(android.net.Uri data) {
    }
    
    private final java.lang.String parsePath(me.devsaki.hentoid.enums.Site site, android.net.Uri data) {
        return null;
    }
}