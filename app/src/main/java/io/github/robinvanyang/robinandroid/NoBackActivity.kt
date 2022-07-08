package io.github.robinvanyang.robinandroid

import android.view.KeyEvent
import androidx.appcompat.app.AppCompatActivity

/**
 * TODO
 *
 * @author RobinVanYang
 * @since 2022-07-08 17:42
 */
class NoBackActivity : AppCompatActivity() {
	override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
		when (keyCode) {
			KeyEvent.KEYCODE_BACK -> return true
		}
		return super.onKeyDown(keyCode, event)
	}
}