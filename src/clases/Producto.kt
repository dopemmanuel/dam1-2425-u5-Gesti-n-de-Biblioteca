package com.dam1.eju5.src.clases

open class Producto(val nombre: String, var precio: Double, var cantidadStock: Int) {
    open fun aplicarDescuento() {
        println("No hay descuento aplicado para $nombre.")
    }

    open fun mostrarInformacion() {
        println("Producto: $nombre, Precio: $precio, Stock: $cantidadStock")
    }
}