package com.academia.matriculas.Talumno.infrastructure.repository.adapter

import com.academia.matriculas.Talumno.domain.AlumnoRepository
import com.academia.matriculas.Talumno.domain.Alumnos
import com.academia.matriculas.Talumno.infrastructure.repository.dao.AlumnoDao
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.data.repository.findByIdOrNull

class AlumnoAdapterRepository (private val alumnoDao: AlumnoDao, private val modelMapperAlumno: ModelMapperAlumno ):
    AlumnoRepository
{
    override fun save(alumno: Alumnos): Alumnos {
        return alumnoDao.save(modelMapperAlumno.toEntity(alumno)).let {modelMapperAlumno.toDto(it) }
    }

    override fun update(alumno: Alumnos): Alumnos {
        return alumnoDao.save(modelMapperAlumno.toEntity(alumno)).let { modelMapperAlumno.toDto(it) }
    }

    override fun findById(id: Long): Alumnos? {
        return alumnoDao.findByIdOrNull(id)?.let { modelMapperAlumno.toDto(it) }
            ?: throw RuntimeException("no existe usuario con id $id")
    }

    override fun findByDni(dni: String): Alumnos? {
        return alumnoDao.findByDni(dni)?.let { modelMapperAlumno.toDto(it) }
    }

    override fun deleteById(id: Long): Boolean {
        alumnoDao.deleteById(id)
        return true
    }

    override fun findAll(): List<Alumnos> {
        return alumnoDao.findAll().map { modelMapperAlumno.toDto(it) }
    }

    override fun findAlumnosWithSorting(field: String): List<Alumnos> {
        return alumnoDao.findAll(Sort.by(Sort.Direction.ASC,field)).map { modelMapperAlumno.toDto(it) }

    }

    override fun findAlumnosWithPagination(offset: Int, pageSize: Int): Page<Alumnos> {
        return alumnoDao.findAll(PageRequest.of(offset,pageSize)).map { modelMapperAlumno.toDto(it) }
    }

}