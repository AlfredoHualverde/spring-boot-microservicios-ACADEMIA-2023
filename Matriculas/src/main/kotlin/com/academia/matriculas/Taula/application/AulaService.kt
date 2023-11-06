package com.academia.matriculas.Taula.application

import com.academia.matriculas.Taula.domain.Aula
import com.academia.matriculas.Taula.domain.AulaRepository

class AulaService (private val aulaRepository: AulaRepository){
    fun createAula(aula: Aula): Aula {
        return aulaRepository.save(Aula(aula.idaula,aula.grupo,aula.seccion,aula.turno,aula.cantidad))
    }

    fun getAulaById(id: Long): Aula {
        return aulaRepository.findById(id)
            ?: throw RuntimeException("no existe aula con id $id")
    }

    fun getAulas(): List<Aula> {
        return  aulaRepository.findAll()
    }

    fun deleteAula(id: Long) : Boolean {
        return aulaRepository.deleteById(id)
    }

    fun updateAula(aula: Aula):Aula {
        return aulaRepository.update(Aula(aula.idaula,aula.grupo,aula.seccion,aula.turno,aula.cantidad))
    }

}