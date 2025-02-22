# Ejercicio 5: Sistema de Gestión de Biblioteca

Imagina que estás construyendo un sistema para una biblioteca que gestiona libros y usuarios. Este sistema deberá manejar distintos tipos de ítems en la biblioteca (libros, revistas, DVDs) y distintos tipos de usuarios (estudiante, profesor, visitante).

### Parte 1: Definir data class

- **Libro**: Título (`String`), Autor (`String`) y Año de Publicación (`Int`)
- **Revista**: Título (`String`), Issue (`Int`), Año (`Int`)
- **DVD**: Título (`String`), Director (`String`), Año (`Int`)

Estas clases almacenarán la información básica de cada ítem en la biblioteca. Usa `data class` para definir estas clases, ya que son perfectas para almacenar datos sin necesidad de lógica adicional.

### Parte 2: Definir sealed class

Para gestionar los distintos tipos de usuarios, puedes usar una `sealed class`. Esto te permitirá tener una jerarquía de clases cerrada, lo cual es útil cuando se conocen todos los posibles subtipos.

```kotlin
sealed class Usuario {
    class Estudiante(val id: String, val nombre: String, val carrera: String) : Usuario()
    class Profesor(val id: String, val nombre: String, val departamento: String) : Usuario()
    class Visitante(val id: String, val nombre: String) : Usuario()
}
```

### Ejercicio Propuesto:

- Definir las `data class` para `Libro`, `Revista` y `DVD`.
- Crear una `sealed class Usuario` con las subclases `Estudiante`, `Profesor` y `Visitante`.
- Implementar una función que acepte un `Usuario` y un libro, y devuelva un mensaje indicando si el usuario puede o no tomar prestado el libro.
