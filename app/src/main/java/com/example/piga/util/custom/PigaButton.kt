package com.example.piga.util.custom

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.example.piga.R
import com.example.piga.databinding.PigaButtonBinding

class PigaButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    val binding by lazy {
        PigaButtonBinding.inflate(
            LayoutInflater.from(context),
            this,
            true
        )
    }

    init {
        val values = context.obtainStyledAttributes(attrs, R.styleable.PigaButton)

        val textResourceId = R.styleable.PigaButton_android_text
        values.getString(textResourceId)?.let {
            binding.button.text = it
        } ?: run {
            val textResource = values.getResourceId(textResourceId, 0)
            if (textResource != 0) {
                binding.button.text = resources?.getText(textResource)
            }
        }

        values.recycle()
    }
}