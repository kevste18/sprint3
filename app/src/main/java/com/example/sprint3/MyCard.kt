package com.example.sprint3

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.annotation.DrawableRes
import com.example.sprint3.databinding.ViewMyCardBinding

class MyCard @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : LinearLayout(context, attrs) {
    private val binding = ViewMyCardBinding.inflate(
        LayoutInflater.from(context), this, true
    )

    fun setTitulo(titulo: String) {
        binding.txtTitulo.text = titulo
    }

    fun setSubtitulo(subtitulo: String) {
        binding.txtSubtitulo.text = subtitulo
    }

    fun setDescripcion(descripcion: String) {
        binding.txtDescripcion.text = descripcion
    }

    fun setImagen(@DrawableRes identificador : Int, descripcion: String) {
        binding.imgCard.setImageResource(identificador)
        binding.imgCard.contentDescription = descripcion
    }


}
