package com.academia.matriculas.TSemestre.infrastructure.repository.adapter

import com.academia.matriculas.TSemestre.domain.Semestre
import com.academia.matriculas.TSemestre.infrastructure.repository.model.SemestreEntity

class ModelMapperSemestre {
    fun toEntity(semestre: Semestre): SemestreEntity =
        SemestreEntity(semestre.idsemestre,semestre.semestre,
            semestre.fechaInicio,semestre.fechaFin,semestre.Activo)

    fun toDto(semestreEntity: SemestreEntity): Semestre =
        Semestre(semestreEntity.idsemestre,semestreEntity.semestre,
            semestreEntity.fechaInicio,semestreEntity.fechaFin,semestreEntity.Activo)
}