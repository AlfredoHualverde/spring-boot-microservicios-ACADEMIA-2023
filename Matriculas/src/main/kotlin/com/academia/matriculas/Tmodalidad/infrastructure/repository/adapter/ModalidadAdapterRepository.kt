package com.academia.matriculas.Tmodalidad.infrastructure.repository.adapter

import com.academia.matriculas.Tmodalidad.domain.Modalidad
import com.academia.matriculas.Tmodalidad.domain.ModalidadRepository
import com.academia.matriculas.Tmodalidad.infrastructure.repository.dao.ModalidadDao
import org.springframework.data.repository.findByIdOrNull

class ModalidadAdapterRepository (private val modalidadDao: ModalidadDao, private val modelMapperModalidad: ModelMapperModalidad):
    ModalidadRepository {
    override fun save(modalidad: Modalidad): Modalidad {
        return modalidadDao.save(modelMapperModalidad.toEntity(modalidad)).let {modelMapperModalidad.toDto(it) }

    }

    override fun findById(id: Long): Modalidad? {
        return modalidadDao.findByIdOrNull(id)?.let { modelMapperModalidad.toDto(it) }
            ?: throw RuntimeException("no existe Modalidad con id $id")
    }

    override fun findAll(): List<Modalidad> {
        return modalidadDao.findAll().map { modelMapperModalidad.toDto(it) }
    }

    override fun deleteById(id: Long): Boolean {
        modalidadDao.deleteById(id)
        return true
    }

    override fun update(modalidad: Modalidad): Modalidad {
        return modalidadDao.save(modelMapperModalidad.toEntity(modalidad)).let {modelMapperModalidad.toDto(it) }
    }
}