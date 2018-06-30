/*
 *     Copyright (c) 2018.
 *     This file is part of facebook-tracking-exposed-android.
 *
 *     facebook-tracking-exposed-android is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     facebook-tracking-exposed-android is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with facebook-tracking-exposed-android.  If not, see <https://www.gnu.org/licenses/>.
 *
 */

package exposed.tracking.facebook.android;

import android.accessibilityservice.AccessibilityService;
import android.util.Log
import android.view.accessibility.AccessibilityEvent

class FacebookScrapingService : AccessibilityService() {
	companion object {
		private const val TAG = "FacebookScrapingService"
	}

	override fun onAccessibilityEvent(event: AccessibilityEvent?) {
		var msg: String = when (event!!.eventType) {
			AccessibilityEvent.TYPE_VIEW_CLICKED -> "Clicked: ${event!!.contentDescription.toString()}"
			AccessibilityEvent.TYPE_VIEW_FOCUSED -> "Focused: ${event!!.contentDescription.toString()}"
			else -> "Type View ${event!!.eventType} not managed!!"
		}
		Log.d(TAG, msg)
	}

	override fun onInterrupt() {
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}
}
