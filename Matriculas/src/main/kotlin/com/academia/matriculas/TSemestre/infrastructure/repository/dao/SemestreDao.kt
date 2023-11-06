package com.academia.matriculas.TSemestre.infrastructure.repository.dao

import com.academia.matriculas.TSemestre.infrastructure.repository.model.SemestreEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SemestreDao : JpaRepository<SemestreEntity,Long> {
}