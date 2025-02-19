package com.dam1.eju5.src.clases

class Electronico(nombre: String, precio: Double, cantidadStock: Int, val garantia: Int): Producto(nombre, precio, cantidadStock) {
    override fun aplicarDescuento() {
        if (precio > 500) {
            precio *= 0.9
            println("Descuento del 10% aplicado en $nombre. Nuevo precio: $precio")
        } else {
            println("No aplica descuento para $nombre.")
        }
    }

    override fun mostrarInformacion() {
        println("Electrónico: $nombre, Precio: $precio, Stock: $cantidadStock, Garantía: $garantia años")
    }
}