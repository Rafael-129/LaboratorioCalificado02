package com.garcia.rafael.usolayoutsv4

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Ejercicio01 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio01)

        val viewVerde: View = findViewById(R.id.viewVerde)
        val btnMostrar: Button = findViewById(R.id.btnMostrar)
        val btnOcultar: Button = findViewById(R.id.btnOcultar)

        btnMostrar.setOnClickListener {
            viewVerde.visibility = View.VISIBLE
        }

        btnOcultar.setOnClickListener {
            viewVerde.visibility = View.GONE
        }
    }
}
