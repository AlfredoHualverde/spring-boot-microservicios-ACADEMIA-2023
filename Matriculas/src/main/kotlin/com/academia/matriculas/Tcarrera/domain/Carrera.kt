package com.academia.matriculas.Tcarrera.domain

class Carrera(
    val idcarrera: Long,
    val carrera: String,
    val grupo: Grupo
)

enum class Grupo {A,B,C,D}
