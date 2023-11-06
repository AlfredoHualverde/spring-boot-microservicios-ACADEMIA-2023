package com.academia.matriculas.Tmodalidad.infrastructure.repository.dao

import com.academia.matriculas.Tmodalidad.infrastructure.repository.model.ModalidadEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ModalidadDao: JpaRepository<ModalidadEntity,Long> {
}