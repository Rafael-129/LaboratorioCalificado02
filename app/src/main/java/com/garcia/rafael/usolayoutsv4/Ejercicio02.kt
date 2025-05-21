package com.garcia.rafael.usolayoutsv4

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Ejercicio02 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio02)

        val nombre = findViewById<EditText>(R.id.etNombre)
        val productos = findViewById<EditText>(R.id.etProductos)
        val direccion = findViewById<EditText>(R.id.etDireccion)

        findViewById<Button>(R.id.btnRegistrar).setOnClickListener {
            if (nombre.text.isEmpty() || productos.text.isEmpty() || direccion.text.isEmpty()) {
                Toast.makeText(this, "Completa todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, ResultadoActivity::class.java).apply {
                    putExtra("nombre", nombre.text.toString())
                    putExtra("productos", productos.text.toString())
                    putExtra("direccion", direccion.text.toString())
                }
                startActivity(intent)
            }
        }

        findViewById<Button>(R.id.btnLlamar).setOnClickListener {
            Toast.makeText(this, "Llamando a ${nombre.text}, Dirección: ${direccion.text}", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.btnWhatsapp).setOnClickListener {
            Toast.makeText(this, "Hola ${nombre.text}, tus productos: ${productos.text} están en camino a la dirección: ${direccion.text}", Toast.LENGTH_LONG).show()
        }

        findViewById<Button>(R.id.btnMaps).setOnClickListener {
            Toast.makeText(this, "Ubicación del cliente: ${direccion.text}", Toast.LENGTH_SHORT).show()
        }
    }
}
