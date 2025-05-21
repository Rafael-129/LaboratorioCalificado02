package com.garcia.rafael.usolayoutsv4

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val nombre = intent.getStringExtra("nombre")
        val productos = intent.getStringExtra("productos")
        val direccion = intent.getStringExtra("direccion")

        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        tvResultado.text = "Nombre: $nombre\nProductos: $productos\nDirección: $direccion"
    }
}
