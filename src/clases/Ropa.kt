package com.dam1.eju5.src.clases

class Ropa(nombre: String, precio: Double, cantidadStock: Int, val talla: String, val esTemporadaPasada: Boolean) : Producto(nombre, precio, cantidadStock) {
    override fun aplicarDescuento() {
        if (esTemporadaPasada) {
            precio *= 0.85
            println("Descuento del 15% aplicado en $nombre por ser de la temporada pasada. Nuevo precio: $precio")
        } else {
            println("No aplica descuento para $nombre.")
        }
    }

    override fun mostrarInformacion() {
        println("Ropa: $nombre, Precio: $precio, Stock: $cantidadStock, Talla: $talla")
    }
}
