package com.iliazusik.youtubeapi.ui.helper

import android.view.View
import androidx.core.view.isVisible

object UiHelper {

    fun changeVisibility(isVisible: Boolean, vararg views: View) {
        for (view in views) {
            view.isVisible = isVisible
        }
    }
}