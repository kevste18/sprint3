package com.example.sprint3

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.sprint3.databinding.ViewMyCardBinding

class MyCard @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : LinearLayout(context, attrs) {
    private val binding = ViewMyCardBinding.inflate(
        LayoutInflater.from(context), this, true
    )
}
