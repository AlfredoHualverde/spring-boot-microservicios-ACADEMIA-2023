package com.academia.matriculas.Tmatricula.domain

interface MatriculaRepository {
    fun save(matricula: Matricula): Matricula
    fun findAll():List<Matricula>
    fun update(matricula: Matricula):Matricula
    fun findById(id: Long):Matricula?
    fun deleteById(id: Long):Boolean



}