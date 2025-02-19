package com.dam1.eju5.src



import com.dam1.eju5.src.clases.Ropa
import com.dam1.eju5.src.clases.Electronico
import com.dam1.eju5.src.clases.Producto
import com.dam1.eju5.src.clases.Alimento

/**
Ejercicio 5: Sistema de Inventario de Tienda
Diseña un sistema donde los productos de una tienda se gestionen mediante una clase Producto, con atributos como nombre,
precio y cantidadStock.
Crea subclases Electronico, Alimento y Ropa, con atributos específicos y un método aplicarDescuento() que varíe según
el tipo de producto.

Ejemplo:

Electronico puede aplicar un 10% de descuento si el precio es mayor a $500.
Alimento puede aplicar un 5% de descuento si está próximo a vencerse.
Ropa puede aplicar un 15% de descuento si es de la temporada pasada.
Objetivos:
Implementar herencia y métodos sobreescritos.
Manejar atributos y comportamientos específicos de cada tipo de producto.
Usar listas para administrar el inventario.
 * */

/**
Ejercicio 5: Sistema de Inventario de Tienda
 */


fun main() {
    val inventario = mutableListOf<Producto>()

    // Agregar productos al inventario
    inventario.add(Electronico("Laptop", 800.0, 10, 2))
    inventario.add(Alimento("Leche", 2.5, 50, "2025-02-28", true))
    inventario.add(Ropa("Camiseta", 20.0, 30, "M", true))

    // Mostrar información y aplicar descuentos
    for (producto in inventario) {
        producto.mostrarInformacion()
        producto.aplicarDescuento()
        println()
    }
}