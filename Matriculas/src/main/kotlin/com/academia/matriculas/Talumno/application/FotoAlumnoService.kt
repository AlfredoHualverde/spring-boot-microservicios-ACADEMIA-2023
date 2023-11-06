package com.academia.matriculas.Talumno.application

import com.academia.matriculas.Talumno.domain.AlumnoRepository
import com.academia.matriculas.Talumno.domain.Alumnos
import org.springframework.web.multipart.MultipartFile

class FotoAlumnoService(private val alumnoRepository: AlumnoRepository) {

    fun subirFotoAlumno(dni: String, file: MultipartFile){
        val alumno: Alumnos? = alumnoRepository.findByDni(dni)
        if (alumno != null) {
            alumno.profilePicture = file.bytes
        }
        if (alumno != null) {
            alumnoRepository.save(alumno)
        }
    }

//    fun subirFotoAlumno(id: Long, file: MultipartFile): Matricula
//        val idAlu = alumnoRepository.findById(matricula.alumno.id)
//
//        return matriculaRepository.save(
//            Matricula(matricula.idmatricula,
//            matricula.semestre,matricula.modalidad,matricula.grupo,matricula.aula,
//            matricula.turno,matricula.carrera,matricula.observacion,matricula.anulado,
//            matricula.alumno)
//        )
}