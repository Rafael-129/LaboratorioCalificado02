package com.garcia.rafael.usolayoutsv4

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

data class Contacto(val nombre: String, val telefono: String, val email: String)

class Agenda {
    private val contactos = mutableListOf<Contacto>()

    fun agregarContacto(contacto: Contacto) {
        contactos.add(contacto)
        println("Contacto agregado correctamente.")
    }

    fun listarContactos() {
        if (contactos.isEmpty()) {
            println("No hay contactos.")
        } else {
            println("Lista de contactos:")
            contactos.forEach { println(it) }
        }
    }

    fun buscarContacto(nombre: String) {
        val resultado = contactos.filter { it.nombre.contains(nombre, ignoreCase = true) }
        if (resultado.isEmpty()) {
            println("No se encontraron contactos con ese nombre.")
        } else {
            println("Contactos encontrados:")
            resultado.forEach { println(it) }
        }
    }
}

fun main() {
    val agenda = Agenda()
    agenda.agregarContacto(Contacto("Juan Perez", "987654321", "juan@gmail.com"))
    agenda.agregarContacto(Contacto("Ana Díaz", "923456789", "ana@gmail.com"))

    agenda.listarContactos()

    println("Buscar contacto: Ana")
    agenda.buscarContacto("Ana")
}
