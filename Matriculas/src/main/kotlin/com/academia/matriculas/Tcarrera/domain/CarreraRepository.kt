package com.academia.matriculas.Tcarrera.domain

interface CarreraRepository {
    fun save(carrera: Carrera): Carrera
    fun findById(id: Long): Carrera?
    fun findAll():List<Carrera>
    fun deleteById(id: Long):Boolean
    fun update(carrera: Carrera): Carrera
}