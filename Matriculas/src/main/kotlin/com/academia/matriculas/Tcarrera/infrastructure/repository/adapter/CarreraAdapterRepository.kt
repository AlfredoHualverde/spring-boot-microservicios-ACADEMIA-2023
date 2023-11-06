package com.academia.matriculas.Tcarrera.infrastructure.repository.adapter

import com.academia.matriculas.Tcarrera.domain.Carrera
import com.academia.matriculas.Tcarrera.domain.CarreraRepository
import com.academia.matriculas.Tcarrera.infrastructure.repository.dao.CarreraDao
import org.springframework.data.repository.findByIdOrNull

class CarreraAdapterRepository (private val carreraDao: CarreraDao, private val modelMapperCarrera: ModelMapperCarrera):
    CarreraRepository {
    override fun save(carrera: Carrera): Carrera {
        return carreraDao.save(modelMapperCarrera.toEntity(carrera)).let {modelMapperCarrera.toDto(it) }
    }

    override fun findById(id: Long): Carrera? {
        return carreraDao.findByIdOrNull(id)?.let {modelMapperCarrera.toDto(it) }
            ?: throw RuntimeException("no existe Carrera con id $id")
    }

    override fun findAll(): List<Carrera> {
        return carreraDao.findAll().map { modelMapperCarrera.toDto(it) }
    }

    override fun deleteById(id: Long): Boolean {
        carreraDao.deleteById(id)
        return true
    }

    override fun update(carrera: Carrera): Carrera {
        return carreraDao.save(modelMapperCarrera.toEntity(carrera)).let { modelMapperCarrera.toDto(it) }

    }

}