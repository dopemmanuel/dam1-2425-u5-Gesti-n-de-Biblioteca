package com.dam1.eju5.src.clases

sealed class Usuario {
    abstract val id: String
    abstract val nombre: String

    override fun toString(): String {
        return "ID: $id, Nombre: $nombre"
    }

    class Estudiante(override val id: String, override val nombre: String, val carrera: String) : Usuario() {
        override fun toString(): String {
            return super.toString() + ", Carrera: $carrera"
        }
    }

    class Profesor(override val id: String, override val nombre: String, val departamento: String) : Usuario() {
        override fun toString(): String {
            return super.toString() + ", Departamento: $departamento"
        }
    }

    class Visitante(override val id: String, override val nombre: String) : Usuario()
}
