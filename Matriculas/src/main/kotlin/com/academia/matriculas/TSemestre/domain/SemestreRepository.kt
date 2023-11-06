package com.academia.matriculas.TSemestre.domain

interface SemestreRepository {
    fun save(semestre: Semestre): Semestre
    fun findAll():List<Semestre>
    fun update(semestre: Semestre): Semestre
    fun findById(id: Long): Semestre?
    fun deleteById(id: Long):Boolean
}