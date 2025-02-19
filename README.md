# Ejercicio 5: Sistema de Inventario de Tienda

Diseña un sistema donde los productos de una tienda se gestionen mediante una clase `Producto`, con atributos como `nombre`, `precio` y `cantidadStock`.  
Crea subclases `Electronico`, `Alimento` y `Ropa`, con atributos específicos y un método `aplicarDescuento()` que varíe según el tipo de producto.

Ejemplo:
- `Electronico` puede aplicar un `10%` de descuento si el precio es mayor a $500.
- `Alimento` puede aplicar un `5%` de descuento si está próximo a vencerse.
- `Ropa` puede aplicar un `15%` de descuento si es de la temporada pasada.

## Objetivos:
- Implementar herencia y métodos sobreescritos.
- Manejar atributos y comportamientos específicos de cada tipo de producto.
- Usar listas para administrar el inventario.