package me.devsaki.hentoid.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.work.WorkManager;

import me.devsaki.hentoid.R;

/**
 * Broadcast receiver for the stop button on duplicate detector notifications
 */
public class DuplicateNotificationStopReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        WorkManager.getInstance(context).cancelUniqueWork(Integer.toString(R.id.duplicate_detector_service));
    }
}
