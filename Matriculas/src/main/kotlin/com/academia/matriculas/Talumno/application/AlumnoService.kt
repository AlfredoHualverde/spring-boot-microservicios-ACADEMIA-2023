package com.academia.matriculas.Talumno.application

import com.academia.matriculas.Talumno.domain.AlumnoRepository
import com.academia.matriculas.Talumno.domain.Alumnos
import org.springframework.data.domain.Page


class AlumnoService(private val alumnoRepository: AlumnoRepository){

    fun createAlumno(alumno: Alumnos): Alumnos {
       return alumnoRepository.save(Alumnos(alumno.id,alumno.nombre,alumno.apPaterno,alumno.apMaterno,alumno.dni,alumno.email,alumno.celular,alumno.profilePicture))
    }

    fun getAlumnoById(id: Long):Alumnos {
        return alumnoRepository.findById(id) ?: throw RuntimeException("no existe alumno con id $id")
    }

    fun getAlumnoByDni(dni:String):Alumnos {
        val findByDni = alumnoRepository.findByDni(dni)
        return if (findByDni != null) findByDni else throw RuntimeException("no existe alumno con dni $dni")
    }

    fun getAlumnos(): List<Alumnos> {
        return  alumnoRepository.findAll()
    }

    fun findAlumnosWithSorting(field: String): List<Alumnos> {
        return alumnoRepository.findAlumnosWithSorting(field)
    }

    fun findAlumnosWithPagination(offset:Int,pageSize:Int): Page<Alumnos> {
        return alumnoRepository.findAlumnosWithPagination(offset,pageSize)
    }

    fun deleteAlumno(id: Long) : Boolean{
        return alumnoRepository.deleteById(id)
    }

    fun updateAlumno(alumno: Alumnos): Alumnos {
        return alumnoRepository.update(Alumnos(alumno.id,alumno.nombre,alumno.apPaterno,alumno.apMaterno,alumno.dni,alumno.email,alumno.celular,alumno.profilePicture))
    }

}




