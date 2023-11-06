package com.academia.matriculas.Talumno.domain

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class Alumnos(
    val id: Long,
    val nombre: String,
    val apPaterno: String,
    val apMaterno:String,
    val dni: String,
    val email: String,
    val celular: String,
    var profilePicture: ByteArray
)  {

    fun encriptar(password: String):String {
        val passwordEncoder = BCryptPasswordEncoder()
        return passwordEncoder.encode(password)
    }

    /*fun comparePassword(password: String): Boolean {
        return BCryptPasswordEncoder().matches(password,this.password)
    }*/
}

enum class Roles{Administrador,Usuario,Analista}

class LoginDTO {
    val usuario = ""
    val password = ""
}

