package com.academia.matriculas.TSemestre.infrastructure.repository.adapter

import com.academia.matriculas.TSemestre.domain.Semestre
import com.academia.matriculas.TSemestre.domain.SemestreRepository
import com.academia.matriculas.TSemestre.infrastructure.repository.dao.SemestreDao
import org.springframework.data.repository.findByIdOrNull

class SemestreAdapterRepository(private val semestreDao: SemestreDao, private val modelMapperSemestre: ModelMapperSemestre):SemestreRepository {
    override fun save(semestre: Semestre): Semestre {
        return semestreDao.save(modelMapperSemestre.toEntity(semestre)).let { modelMapperSemestre.toDto(it) }
    }

    override fun findAll(): List<Semestre> {
        return semestreDao.findAll().map { modelMapperSemestre.toDto(it) }
    }

    override fun update(semestre: Semestre): Semestre {
        return semestreDao.save(modelMapperSemestre.toEntity(semestre)).let { modelMapperSemestre.toDto(it) }
    }

    override fun findById(id: Long): Semestre? {
        return semestreDao.findByIdOrNull(id)?.let { modelMapperSemestre.toDto(it) }
            ?: throw RuntimeException("no existe semestre con id $id")
    }

    override fun deleteById(id: Long): Boolean {
        semestreDao.deleteById(id)
        return true
    }
}