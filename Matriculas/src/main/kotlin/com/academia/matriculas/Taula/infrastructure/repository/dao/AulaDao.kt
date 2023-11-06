package com.academia.matriculas.Taula.infrastructure.repository.dao

import com.academia.matriculas.Taula.infrastructure.repository.model.AulaEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AulaDao :JpaRepository<AulaEntity,Long>{

}