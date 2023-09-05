package me.devsaki.hentoid.widget

import android.view.KeyEvent
import android.view.View
import android.view.ViewConfiguration
import com.annimon.stream.function.Consumer
import kotlinx.coroutines.CoroutineScope
import me.devsaki.hentoid.util.DebouncerK
import me.devsaki.hentoid.util.Preferences

class ReaderKeyListener(scope: CoroutineScope) : View.OnKeyListener {
    private var onVolumeDownListener: Consumer<Boolean>? = null

    private var onVolumeUpListener: Consumer<Boolean>? = null

    private var onKeyLeftListener: Consumer<Boolean>? = null

    private var onKeyRightListener: Consumer<Boolean>? = null

    private var onBackListener: Consumer<Boolean>? = null

    // Internal variables
    private var nextNotifyTime = Long.MAX_VALUE
    private val simpleTapDebouncer: DebouncerK<Consumer<Boolean>>
    private val longPressTimeout = ViewConfiguration.getLongPressTimeout()

    init {
        simpleTapDebouncer =
            DebouncerK(scope, longPressTimeout.toLong()) { consumer: Consumer<Boolean> ->
                consumer.accept(false)
            }
    }

    fun setOnVolumeDownListener(onVolumeDownListener: Consumer<Boolean>?): ReaderKeyListener {
        this.onVolumeDownListener = onVolumeDownListener
        return this
    }

    fun setOnVolumeUpListener(onVolumeUpListener: Consumer<Boolean>?): ReaderKeyListener {
        this.onVolumeUpListener = onVolumeUpListener
        return this
    }

    fun setOnKeyLeftListener(onKeyLeftListener: Consumer<Boolean>?): ReaderKeyListener {
        this.onKeyLeftListener = onKeyLeftListener
        return this
    }

    fun setOnKeyRightListener(onKeyRightListener: Consumer<Boolean>?): ReaderKeyListener {
        this.onKeyRightListener = onKeyRightListener
        return this
    }

    fun setOnBackListener(onBackListener: Consumer<Boolean>?): ReaderKeyListener {
        this.onBackListener = onBackListener
        return this
    }

    private fun isTurboEnabled(): Boolean {
        return !Preferences.isReaderVolumeToSwitchBooks()
    }

    private fun isDetectLongPress(): Boolean {
        return Preferences.isReaderVolumeToSwitchBooks()
    }

    private fun isVolumeKey(keyCode: Int, targetKeyCode: Int): Boolean {
        // Ignore volume keys when disabled in preferences
        if (!Preferences.isReaderVolumeToTurn()) return false
        if (Preferences.isReaderInvertVolumeRocker()) {
            if (targetKeyCode == KeyEvent.KEYCODE_VOLUME_DOWN) return keyCode == KeyEvent.KEYCODE_VOLUME_UP else if (targetKeyCode == KeyEvent.KEYCODE_VOLUME_UP) return keyCode == KeyEvent.KEYCODE_VOLUME_DOWN
        }
        return keyCode == targetKeyCode
    }

    override fun onKey(v: View?, keyCode: Int, event: KeyEvent): Boolean {
        if (event.action != KeyEvent.ACTION_DOWN) return false
        val listener: Consumer<Boolean>? = if (isVolumeKey(keyCode, KeyEvent.KEYCODE_VOLUME_DOWN)) {
            onVolumeDownListener
        } else if (isVolumeKey(keyCode, KeyEvent.KEYCODE_VOLUME_UP)) {
            onVolumeUpListener
        } else if (keyCode == KeyEvent.KEYCODE_DPAD_LEFT && Preferences.isReaderKeyboardToTurn()) {
            onKeyLeftListener
        } else if (keyCode == KeyEvent.KEYCODE_DPAD_RIGHT && Preferences.isReaderKeyboardToTurn()) {
            onKeyRightListener
        } else if (keyCode == KeyEvent.KEYCODE_BACK) {
            onBackListener
        } else {
            return false
        }
        if (null == listener) return false
        if (event.repeatCount == 0) { // Simple down
            nextNotifyTime = if (isDetectLongPress()) {
                simpleTapDebouncer.submit(listener)
                event.eventTime + longPressTimeout
            } else {
                listener.accept(false)
                event.eventTime + COOLDOWN
            }
        } else if (event.eventTime >= nextNotifyTime) { // Long down
            simpleTapDebouncer.clear()
            listener.accept(true)
            nextNotifyTime = event.eventTime + if (isTurboEnabled()) TURBO_COOLDOWN else COOLDOWN
        }
        return true
    }

    fun clear() {
        onVolumeDownListener = null
        onVolumeUpListener = null
        onKeyLeftListener = null
        onKeyRightListener = null
        onBackListener = null
        simpleTapDebouncer.clear()
    }

    companion object {
        const val COOLDOWN = 1000
        const val TURBO_COOLDOWN = 500
    }
}