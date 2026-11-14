package com.example.sprint3

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sprint3.databinding.ActivityHomeBinding


/*
 * Principios y consideraciones de diseño:
 * - He utilizado View Binding para que sea más cómodo y seguro trabajar con las vistas del XML.
 * - He centralizado todos los textos en strings.xml, también el del Toast, en vez de dejarlos hardcodeados.
 * - He puesto los tamaños de texto en sp para que respeten el tamaño de fuente del usuario (accesibilidad).
 * - La imagen tiene contentDescription, porque es informativa y así TalkBack puede describirla.
 * - La imagen ocupa el ancho disponible (match_parent) en vez de un tamaño fijo, para que se adapte a cualquier pantalla.
 * - He asignado ids con prefijo (img, txt, btn) a todos los componentes para saber qué tipo de vista es cada uno.
 * - He usado un LinearLayout vertical porque la pantalla es una sola columna y no hace falta anidar layouts.
 * - Texto blanco sobre fondo negro para que haya buen contraste y se lea bien.
 * - Jerarquía visual: el título es grande y en negrita, y el subtítulo más pequeño, para que se vea qué es lo importante.
 * - Los botones tienen un shape propio (esquinas redondeadas y borde blanco) para personalizarlos y que destaquen sobre el fondo.
 * - Al pulsar el botón sale un Toast que avisa de que la función aún no está implementada, para que el usuario tenga feedback.
 * - He usado layout_marginEnd en vez de marginRight para que la separación se mantenga en idiomas que se leen de derecha a izquierda
 */
class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityHomeBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnComprar.setOnClickListener {
            Toast.makeText(this, getString(R.string.comprar), Toast.LENGTH_SHORT).show()
        }

        binding.btnVerCartelera.setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }
    }
}