package com.academia.matriculas.Talumno.application

import com.academia.matriculas.Talumno.domain.Alumnos
import org.springframework.data.domain.Page

class AlumnoEndPoints (private val alumnoService: AlumnoService) {

    fun createAlumno(alumno: Alumnos):Alumnos =
        alumnoService.createAlumno(alumno)

    fun updateAlumno(alumno: Alumnos):Alumnos =
        alumnoService.updateAlumno(alumno)

    fun getAlumnoById(id: Long) : Alumnos =
        alumnoService.getAlumnoById(id)

    fun getAlumnoByDni(dni:String):Alumnos =
        alumnoService.getAlumnoByDni(dni)

    fun getAlumnos():List<Alumnos> =
        alumnoService.getAlumnos()

    fun findAlumnosWithSorting(field: String):List<Alumnos> =
        alumnoService.findAlumnosWithSorting(field)

    fun findAlumnosWithPagination(offset:Int,pageSize:Int): Page<Alumnos> =
        alumnoService.findAlumnosWithPagination(offset,pageSize)

    fun deleteAlumno(id: Long)=
        alumnoService.deleteAlumno(id)
}