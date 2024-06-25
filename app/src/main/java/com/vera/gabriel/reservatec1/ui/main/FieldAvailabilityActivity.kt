package com.vera.gabriel.reservatec1.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vera.gabriel.reservatec1.R
import com.vera.gabriel.reservatec1.databinding.ActivityFieldAvailabilityBinding

class FieldAvailabilityActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFieldAvailabilityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFieldAvailabilityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar el header y footer
        binding.tvHeader.text = getString(R.string.reservatec_title)

        binding.ivHome.setOnClickListener {
            finish()
        }

        // Configurar el calendario
        binding.calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->
            // Manejar la selección de la fecha si es necesario
        }
    }
}
