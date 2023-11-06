package com.academia.matriculas.Tmatricula.infrastructure.repository.adapter

import com.academia.matriculas.Tmatricula.domain.Matricula
import com.academia.matriculas.Tmatricula.infrastructure.repository.model.MatriculaEntity

class ModelMapperMatricula {

    fun toEntity(matricula: Matricula): MatriculaEntity =
        MatriculaEntity(matricula.idmatricula,matricula.semestre,
            matricula.modalidad,matricula.grupo,matricula.aula,matricula.turno,
            matricula.carrera,matricula.observacion,matricula.anulado,
            matricula.alumno)

    fun toDto(matriculaEntity: MatriculaEntity): Matricula =
        Matricula(matriculaEntity.idmatricula,matriculaEntity.semestre,matriculaEntity.modalidad,
            matriculaEntity.grupo,matriculaEntity.aula,matriculaEntity.turno,
            matriculaEntity.carrera,matriculaEntity.observacion,matriculaEntity.anulado,
            matriculaEntity.alumno)

}
