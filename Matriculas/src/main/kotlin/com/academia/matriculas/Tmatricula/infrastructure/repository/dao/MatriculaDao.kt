package com.academia.matriculas.Tmatricula.infrastructure.repository.dao

import com.academia.matriculas.Tmatricula.infrastructure.repository.model.MatriculaEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MatriculaDao : JpaRepository<MatriculaEntity, Long> {
}