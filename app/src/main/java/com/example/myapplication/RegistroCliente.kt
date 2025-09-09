package com.example.myapplication

// Clase que representa el registro de un cliente
class RegistroCliente(
    var nombre: String = "",
    var apellido: String = "",
    var correo: String = "",
    var telefono: String = ""
) {

    // Método para mostrar los datos del cliente en consola
    fun mostrarDatos() {
        println("=== Datos del Cliente ===")
        println("Nombre: $nombre $apellido")
        println("Correo: $correo")
        println("Teléfono: $telefono")
        println("=========================")
    }

    // Método para validar que el correo tenga formato básico
    fun esCorreoValido(): Boolean {
        return correo.contains("@") && correo.contains(".")
    }
}
