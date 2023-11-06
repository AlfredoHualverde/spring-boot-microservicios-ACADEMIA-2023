package com.academia.matriculas.Talumno.infrastructure.repository.adapter

import com.academia.matriculas.Talumno.domain.Alumnos
import com.academia.matriculas.Talumno.infrastructure.repository.model.AlumnoEntity

class ModelMapperAlumno {

    fun toEntity(alumno: Alumnos):AlumnoEntity=
        AlumnoEntity(alumno.id,alumno.nombre,alumno.apPaterno,alumno.apMaterno,
            alumno.dni,alumno.email,alumno.celular,alumno.profilePicture)

    fun toDto(alumnoEntity: AlumnoEntity):Alumnos=
        Alumnos(alumnoEntity.id,alumnoEntity.nombre,alumnoEntity.apPaterno,alumnoEntity.apMaterno,
            alumnoEntity.dni,alumnoEntity.email,alumnoEntity.celular,alumnoEntity.profilePicture)


}