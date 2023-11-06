package com.academia.matriculas.Tmatricula.infrastructure.repository.adapter

import com.academia.matriculas.Tmatricula.domain.Matricula
import com.academia.matriculas.Tmatricula.domain.MatriculaRepository
import com.academia.matriculas.Tmatricula.infrastructure.repository.dao.MatriculaDao
import org.springframework.data.repository.findByIdOrNull

class MatriculaAdapterRepository(private val matriculaDao: MatriculaDao, private val modelMapperMatricula: ModelMapperMatricula):
    MatriculaRepository {
    override fun save(matricula: Matricula): Matricula {
     return matriculaDao.save(modelMapperMatricula.toEntity(matricula)).let { modelMapperMatricula.toDto(it)}
    }

    override fun update(matricula: Matricula): Matricula {
        return matriculaDao.save(modelMapperMatricula.toEntity(matricula)).let { modelMapperMatricula.toDto(it) }
    }
    override fun findAll(): List<Matricula> {
        return matriculaDao.findAll().map { modelMapperMatricula.toDto(it) }
    }

    override fun findById(id: Long): Matricula? {
        return matriculaDao.findByIdOrNull(id)?.let { modelMapperMatricula.toDto(it) }
            ?: throw RuntimeException("no existe matricula $id")
    }

    override fun deleteById(id: Long): Boolean {
        matriculaDao.deleteById(id)
        return true
    }


}
