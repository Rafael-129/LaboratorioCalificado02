package com.garcia.rafael.usolayoutsv4

data class Contacto(val nombre: String, val telefono: String)

class Agenda {
    private val contactos = mutableListOf<Contacto>()

    fun agregarContacto(contacto: Contacto) {
        contactos.add(contacto)
        println("Contacto agregado: $contacto")
    }

    fun listarContactos() {
        if (contactos.isEmpty()) {
            println("No hay contactos en la agenda.")
        } else {
            println("Lista de contactos:")
            contactos.forEach { println("- ${it.nombre}: ${it.telefono}") }
        }
    }

    fun buscarContacto(nombre: String) {
        val resultado = contactos.filter { it.nombre.contains(nombre, ignoreCase = true) }
        if (resultado.isEmpty()) {
            println("No se encontró ningún contacto con el nombre \"$nombre\"")
        } else {
            println("Resultado de búsqueda:")
            resultado.forEach { println("- ${it.nombre}: ${it.telefono}") }
        }
    }
}

fun main() {
    val agenda = Agenda()

    agenda.agregarContacto(Contacto("Rafael", "987654321"))
    agenda.agregarContacto(Contacto("Piero", "912345678"))
    agenda.listarContactos()
    agenda.buscarContacto("rafa")
}
