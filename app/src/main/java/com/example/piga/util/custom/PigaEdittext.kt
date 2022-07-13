package com.example.piga.util.custom

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.core.widget.addTextChangedListener
import android.view.inputmethod.EditorInfo
import android.widget.FrameLayout
import com.example.piga.util.custom.PigaEdittext.CustomEditTextImeOptions.*
import com.example.piga.R
import com.example.piga.databinding.CustomPigaEdittextBinding

class PigaEdittext @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : FrameLayout(context, attrs, defStyleAttr, defStyleRes) {

    enum class CustomEditTextImeOptions {
        NEXT, DONE
    }

    private var binding: CustomPigaEdittextBinding =
        CustomPigaEdittextBinding.inflate(LayoutInflater.from(context), this, true)
    private var customEditTextImeOptions: CustomEditTextImeOptions
    private var drawableStart: Drawable? = null
    private var hintText: String? = ""
    private var text: String? = ""

    init {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomEditText, 0, 0)
        try {
            //ime options
            typedArray.let {
                customEditTextImeOptions = values()[it.getInt(
                    R.styleable.CustomEditText_cet_ime_options,
                    0
                )]

                // drawable left for icon
                drawableStart = it.getDrawable(R.styleable.CustomEditText_cet_drawable_start)

                //get hint text
                hintText = it.getString(R.styleable.CustomEditText_cet_hint)

                //get text
                text = it.getString(R.styleable.CustomEditText_cet_text)
            }

        } finally {
            typedArray.recycle()
        }
        setImeOptions()
        setDrawableIcon()
        setEditTextListener()
        setHintText(hintText)
        setText(text)
    }

    fun getText(): String? = text

    private fun setDrawableIcon() {
        binding.cetEdittext.setCompoundDrawablesWithIntrinsicBounds(
            drawableStart, null, null, null
        )
    }

    private fun setEditTextListener() {
        binding.cetEdittext.addTextChangedListener {
            text = it.toString()
        }
    }

    private fun setImeOptions() {
        when (customEditTextImeOptions) {
            NEXT -> binding.cetEdittext.imeOptions = EditorInfo.IME_ACTION_NEXT
            DONE -> binding.cetEdittext.imeOptions = EditorInfo.IME_ACTION_DONE
        }
    }

    private fun setHintText(hintText: String?) {
        binding.cetEdittext.hint = hintText
    }

    private fun setText(text: String?) {
        binding.cetEdittext.setText(text)
    }
}