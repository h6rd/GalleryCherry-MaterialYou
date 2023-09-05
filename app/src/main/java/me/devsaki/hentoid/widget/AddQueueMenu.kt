package me.devsaki.hentoid.widget

import android.content.Context
import android.graphics.Typeface
import android.view.View
import androidx.core.content.ContextCompat
import androidx.lifecycle.LifecycleOwner
import com.skydoves.powermenu.MenuAnimation
import com.skydoves.powermenu.OnMenuItemClickListener
import com.skydoves.powermenu.PowerMenu
import com.skydoves.powermenu.PowerMenuItem
import me.devsaki.hentoid.R
import me.devsaki.hentoid.util.Helper

class AddQueueMenu {

    companion object {
        fun show(
            context: Context,
            anchor: View,
            lifecycle: LifecycleOwner,
            listener: OnMenuItemClickListener<PowerMenuItem?>
        ) {
            val res = context.resources
            val powerMenu = PowerMenu.Builder(context)
                .addItem(
                    PowerMenuItem(
                        res.getString(R.string.queue_add_top),
                        false,
                        R.drawable.ic_action_top
                    )
                )
                .addItem(
                    PowerMenuItem(
                        res.getString(R.string.queue_add_bottom),
                        false,
                        R.drawable.ic_action_bottom
                    )
                )
                .setAnimation(MenuAnimation.SHOWUP_TOP_LEFT)
                .setMenuRadius(10f)
                .setLifecycleOwner(lifecycle)
                .setTextColor(ContextCompat.getColor(context, R.color.white_opacity_87))
                .setTextTypeface(Typeface.DEFAULT)
                .setMenuColor(ContextCompat.getColor(context, R.color.dark_gray))
                .setTextSize(Helper.dimensAsDp(context, R.dimen.text_subtitle_1))
                .setWidth(res.getDimension(R.dimen.popup_menu_width).toInt())
                .setAutoDismiss(true)
                .build()
            powerMenu.onMenuItemClickListener = listener
            powerMenu.setIconColor(ContextCompat.getColor(context, R.color.white_opacity_87))
            powerMenu.showAtCenter(anchor)
        }
    }
}