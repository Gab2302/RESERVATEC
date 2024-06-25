package com.vera.gabriel.reservatec1.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vera.gabriel.reservatec1.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar los botones del menú
        binding.tvHome.setOnClickListener {
            // Manejar la navegación a la vista principal
            finish() // Cerrar la actividad del menú y volver a la principal
        }

        binding.tvReservations.setOnClickListener {
            // Manejar la navegación a la vista de reservas
        }

        binding.tvLogout.setOnClickListener {
            // Manejar el cierre de sesión
        }
    }
}
