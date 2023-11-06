package com.academia.matriculas.Tmatricula.application

import com.academia.matriculas.Tmatricula.domain.Matricula

class MatriculaEndPoints (private val matriculaService: MatriculaService) {

    fun createMatricula(matricula: Matricula): Matricula =
        matriculaService.createMatricula(matricula)

    fun getMatriculados():List<Matricula> =
    matriculaService.getMatriculados()

    fun updateMatricula(matricula: Matricula):Matricula =
    matriculaService.updateMatricula(matricula)

    fun getMatriculaById(id:Long):Matricula? =
    matriculaService.getMatriculaById(id)

    fun deleteMatricula(id: Long)=
        matriculaService.deleteMatricula(id)

}