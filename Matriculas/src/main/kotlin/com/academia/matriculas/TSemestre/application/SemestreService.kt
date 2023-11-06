package com.academia.matriculas.TSemestre.application

import com.academia.matriculas.TSemestre.domain.Semestre
import com.academia.matriculas.TSemestre.domain.SemestreRepository

class SemestreService (private val semestreRepository: SemestreRepository){

    fun createSemestre(semestre: Semestre): Semestre {
        return semestreRepository.save(Semestre(semestre.idsemestre,semestre.semestre,
            semestre.fechaInicio,semestre.fechaFin,semestre.Activo))
    }

    fun getSemestres(): List<Semestre> {
        return semestreRepository.findAll()
    }

    fun updateSemestre(semestre: Semestre):Semestre {
        return semestreRepository.update(Semestre(semestre.idsemestre,semestre.semestre,
             semestre.fechaInicio,semestre.fechaFin,semestre.Activo))
    }

    fun getSemestreById( id: Long): Semestre? =
        semestreRepository.findById(id)

    fun deleteSemestre(id: Long)=
        semestreRepository.deleteById(id)
}