package com.academia.matriculas.Taula.infrastructure.repository.adapter

import com.academia.matriculas.Taula.domain.Aula
import com.academia.matriculas.Taula.domain.AulaRepository
import com.academia.matriculas.Taula.infrastructure.repository.dao.AulaDao
import org.springframework.data.repository.findByIdOrNull

class AulaAdapterRepository (private val aulaDao: AulaDao, private val modelMapperAula: ModelMapperAula):
    AulaRepository
{
    override fun save(aula: Aula): Aula {
        return aulaDao.save(modelMapperAula.toEntity(aula)).let {modelMapperAula.toDto(it) }
    }

    override fun findById(id: Long): Aula? {
        return aulaDao.findByIdOrNull(id)?.let { modelMapperAula.toDto(it) }
            ?: throw RuntimeException("no existe Aula con id $id")
    }

    override fun findAll(): List<Aula> {
        return aulaDao.findAll().map { modelMapperAula.toDto(it) }
    }

    override fun deleteById(id: Long): Boolean {
        aulaDao.deleteById(id)
        return true
    }

    override fun update(aula: Aula): Aula {
        return aulaDao.save(modelMapperAula.toEntity(aula)).let { modelMapperAula.toDto(it) }
    }
}