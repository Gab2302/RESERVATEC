package com.vera.gabriel.reservatec1.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vera.gabriel.reservatec1.R
import com.vera.gabriel.reservatec1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar los botones del footer
        binding.ivHome.setOnClickListener {
            // Manejar la navegación a la vista principal
        }

        binding.ivReservations.setOnClickListener {
            // Manejar la navegación a la vista de reservas
        }

        binding.ivMenu.setOnClickListener {
            // Navegar a la vista del menú
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}
