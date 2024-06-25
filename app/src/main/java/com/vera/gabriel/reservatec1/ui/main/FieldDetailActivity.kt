package com.vera.gabriel.reservatec1.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vera.gabriel.reservatec1.R
import com.vera.gabriel.reservatec1.databinding.ActivityFieldDetailBinding

class FieldDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFieldDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFieldDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar el header y footer
        binding.tvHeader.text = getString(R.string.reservatec_title)

        binding.ivHome.setOnClickListener {
            finish()
        }

        // Obtener datos del campo y actualizar la UI si es necesario
        val fieldId = intent.getIntExtra("FIELD_ID", -1)
        // Actualizar la UI basado en el fieldId si es necesario

        // Configurar el botón "Ver Disponibilidad"
        binding.btnVerDisponibilidad.setOnClickListener {
            val intent = Intent(this, FieldAvailabilityActivity::class.java)
            intent.putExtra("FIELD_ID", fieldId)
            startActivity(intent)
        }
    }
}
