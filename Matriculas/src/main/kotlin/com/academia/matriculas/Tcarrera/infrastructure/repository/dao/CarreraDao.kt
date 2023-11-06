package com.academia.matriculas.Tcarrera.infrastructure.repository.dao

import com.academia.matriculas.Tcarrera.infrastructure.repository.model.CarreraEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CarreraDao : JpaRepository<CarreraEntity, Long> {
}