package com.academia.matriculas.Taula.domain

interface AulaRepository {
    fun save(aula: Aula):Aula
    fun findById(id: Long):Aula?
    fun findAll():List<Aula>
    fun deleteById(id: Long):Boolean
    fun update(aula: Aula):Aula
}