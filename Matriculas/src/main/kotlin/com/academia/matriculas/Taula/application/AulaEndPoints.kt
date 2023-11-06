package com.academia.matriculas.Taula.application

import com.academia.matriculas.Taula.domain.Aula

class AulaEndPoints (private val aulaService: AulaService) {

    fun createAula(aula: Aula):Aula =
        aulaService.createAula(aula)
    fun updateAula(aula: Aula):Aula =
        aulaService.updateAula(aula)

    fun getAulaById(id: Long): Aula =
        aulaService.getAulaById(id)
    fun getAulas(): List<Aula> =
        aulaService.getAulas()
    fun deleteAula(id: Long)=
        aulaService.deleteAula(id)
}