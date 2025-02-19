package com.dam1.eju5.src.clases

class Alimento(nombre: String, precio: Double, cantidadStock: Int, val fechaVencimiento: String, val proximidadVencimiento: Boolean) : Producto(nombre, precio, cantidadStock) {
    override fun aplicarDescuento() {
        if (proximidadVencimiento) {
            precio *= 0.95
            println("Descuento del 5% aplicado en $nombre por proximidad de vencimiento. Nuevo precio: $precio")
        } else {
            println("No aplica descuento para $nombre.")
        }
    }

    override fun mostrarInformacion() {
        println("Alimento: $nombre, Precio: $precio, Stock: $cantidadStock, Vence el: $fechaVencimiento")
    }
}