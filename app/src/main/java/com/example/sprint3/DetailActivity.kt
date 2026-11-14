package com.example.sprint3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sprint3.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityDetailBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.cardEvento.setImagen(R.drawable.logo, getString(R.string.logo_velada))
        binding.cardEvento.setTitulo(getString(R.string.velada2))
        binding.cardEvento.setSubtitulo(getString(R.string.evento))
        binding.cardEvento.setDescripcion(getString(R.string.primer_combate))

        binding.cardCombate1.setImagen(R.drawable.fernanfloo, getString(R.string.fernan))
        binding.cardCombate1.setTitulo(getString(R.string.combates))
        binding.cardCombate1.setSubtitulo(getString(R.string.peleadores))
        binding.cardCombate1.setDescripcion(getString(R.string.descripcion_pelea))
    }
}