package com.academia.matriculas.TSemestre.application

import com.academia.matriculas.TSemestre.domain.Semestre
import org.springframework.web.bind.annotation.*

class SemestreEndPoints(private val semestreService: SemestreService) {

    fun createSemestre(semestre: Semestre):Semestre =
        semestreService.createSemestre(semestre)

    fun getSemestres(): List<Semestre> =
        semestreService.getSemestres()

    fun updateSemestre(semestre: Semestre)=
        semestreService.updateSemestre(semestre)

    fun getSemestre( id: Long): Semestre? =
        semestreService.getSemestreById(id)

    fun deleteSemestre(id: Long)=
        semestreService.deleteSemestre(id)

}