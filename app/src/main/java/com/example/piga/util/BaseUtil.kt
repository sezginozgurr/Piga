package com.example.piga.util

import android.os.SystemClock
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

typealias InflateFragmentView<T> = (LayoutInflater, ViewGroup?, Boolean) -> T

fun View.setSafeOnClickListener(onSafeClick: (View) -> Unit) {
    val safeClick = SafeClickListener {
        onSafeClick(it)
    }
    setOnClickListener(safeClick)

}