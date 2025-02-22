package com.dam1.eju5.src.funciones

import com.dam1.eju5.src.clases.Libro
import com.dam1.eju5.src.clases.Usuario
import com.dam1.eju5.src.clases.DVD
import com.dam1.eju5.src.clases.Revista

fun verificarPrestamo(usuario: Usuario, cualquierDataclass: Any): String {
    return when (usuario) {
        is Usuario.Estudiante -> when (cualquierDataclass) {
            is Libro -> "${usuario.nombre} (Estudiante) puede tomar prestado '${cualquierDataclass.titulo}'."
            is Revista -> "${usuario.nombre} (Estudiante) puede tomar prestado '${cualquierDataclass.titulo}'."
            is DVD -> "${usuario.nombre} (Estudiante) NO puede tomar prestado '${cualquierDataclass.titulo}'."
            else -> "Tipo de ítem desconocido."
        }
        is Usuario.Profesor -> when (cualquierDataclass) {
            is Libro -> "${usuario.nombre} (Profesor) puede tomar prestado '${cualquierDataclass.titulo}'."
            is Revista -> "${usuario.nombre} (Profesor) puede tomar prestado '${cualquierDataclass.titulo}'."
            is DVD -> "${usuario.nombre} (Profesor) puede tomar prestado '${cualquierDataclass.titulo}'."
            else -> "Tipo de ítem desconocido."
        }
        is Usuario.Visitante -> when (cualquierDataclass) {
            is Libro -> "${usuario.nombre} (Visitante) NO puede tomar prestado '${cualquierDataclass.titulo}'."
            is Revista -> "${usuario.nombre} (Visitante) NO puede tomar prestado '${cualquierDataclass.titulo}'."
            is DVD -> "${usuario.nombre} (Visitante) NO puede tomar prestado '${cualquierDataclass.titulo}'."
            else -> "Tipo de ítem desconocido."
        }
    }
}