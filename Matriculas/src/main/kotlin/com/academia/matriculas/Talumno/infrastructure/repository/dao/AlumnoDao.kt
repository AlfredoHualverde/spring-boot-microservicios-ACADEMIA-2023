package com.academia.matriculas.Talumno.infrastructure.repository.dao

import com.academia.matriculas.Talumno.infrastructure.repository.model.AlumnoEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface AlumnoDao : JpaRepository<AlumnoEntity, Long> {
    fun findByDni(@Param("dni") dni: String): AlumnoEntity?
}