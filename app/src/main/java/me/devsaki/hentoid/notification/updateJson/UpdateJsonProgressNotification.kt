package me.devsaki.hentoid.notification.updateJson

import android.content.Context
import androidx.core.app.NotificationCompat
import me.devsaki.hentoid.R
import me.devsaki.hentoid.util.ThemeHelper
import me.devsaki.hentoid.util.notification.Notification
import java.util.*

class UpdateJsonProgressNotification(
    private val progress: Int,
    private val max: Int
) : Notification {

    private val progressString: String = " %.2f%%".format(Locale.US, progress * 100.0 / max)

    override fun onCreateNotification(context: Context): android.app.Notification {
        return NotificationCompat.Builder(context, UpdateJsonNotificationChannel.ID)
            .setSmallIcon(R.drawable.ic_cherry_icon)
            .setContentTitle(context.getString(R.string.notif_json_progress))
            .setContentInfo(progressString)
            .setProgress(max, progress, false)
            .setColor(ThemeHelper.getColor(context, R.color.secondary_light))
            .setLocalOnly(true)
            .setOngoing(true)
            .setOnlyAlertOnce(true)
            .build()
    }
}
