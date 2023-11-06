package com.academia.matriculas.Talumno.domain

import org.springframework.data.domain.Page

interface AlumnoRepository {
    fun save(alumno: Alumnos):Alumnos
    fun update(alumno: Alumnos):Alumnos
    fun findById(id:Long): Alumnos?
    fun findByDni(dni:String):Alumnos?
    fun deleteById(id:Long): Boolean
    fun findAll():List<Alumnos>
    fun findAlumnosWithSorting(field:String):List<Alumnos>
    fun findAlumnosWithPagination(offset:Int,pageSize:Int): Page<Alumnos>

}