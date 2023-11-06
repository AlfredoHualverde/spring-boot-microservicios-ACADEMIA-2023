package com.academia.matriculas.Tmodalidad.domain

interface ModalidadRepository {
    fun save(modalidad: Modalidad): Modalidad
    fun findById(id: Long): Modalidad?
    fun findAll():List<Modalidad>
    fun deleteById(id: Long):Boolean
    fun update(modalidad: Modalidad): Modalidad
}