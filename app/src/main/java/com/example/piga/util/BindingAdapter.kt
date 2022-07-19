package com.example.piga.util

import android.view.View
import androidx.annotation.DrawableRes
import androidx.databinding.BindingAdapter

object BindingAdapter {

    @JvmStatic
    @BindingAdapter("setBackgroundResourceCompat")
    fun View.setBackgroundResourceCompat(@DrawableRes drawableId: Int) {
        setBackgroundResource(drawableId)
    }
}