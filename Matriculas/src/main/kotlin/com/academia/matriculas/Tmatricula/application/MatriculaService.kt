package com.academia.matriculas.Tmatricula.application

import com.academia.matriculas.Talumno.domain.AlumnoRepository
import com.academia.matriculas.Tmatricula.domain.Matricula
import com.academia.matriculas.Tmatricula.domain.MatriculaRepository

class MatriculaService (
    private val matriculaRepository:MatriculaRepository,
    private val alumnoRepository: AlumnoRepository
    ){

    fun createMatricula(matricula: Matricula): Matricula {
       val idAlu = alumnoRepository.findById(matricula.alumno.id)

        return matriculaRepository.save(Matricula(matricula.idmatricula,
            matricula.semestre,matricula.modalidad,matricula.grupo,matricula.aula,
            matricula.turno,matricula.carrera,matricula.observacion,matricula.anulado,
            matricula.alumno))

    }
    fun getMatriculados():List<Matricula>{
        return matriculaRepository.findAll()
    }

    fun updateMatricula(matricula: Matricula):Matricula{
        return matriculaRepository.update(Matricula(matricula.idmatricula,
            matricula.semestre,matricula.modalidad,matricula.grupo,matricula.aula,
            matricula.turno,matricula.carrera,matricula.observacion,matricula.anulado,
            matricula.alumno))
    }

    fun getMatriculaById (id:Long):Matricula? {
        return matriculaRepository.findById(id)
    }

    fun deleteMatricula (id: Long):Boolean {
        return matriculaRepository.deleteById(id)
    }

}
