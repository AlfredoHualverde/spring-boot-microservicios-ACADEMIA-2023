package com.academia.matriculas.Tmatricula.domain

import com.academia.matriculas.TSemestre.infrastructure.repository.model.SemestreEntity
import com.academia.matriculas.Talumno.infrastructure.repository.model.AlumnoEntity
import com.academia.matriculas.Taula.infrastructure.repository.model.AulaEntity
import com.academia.matriculas.Tcarrera.infrastructure.repository.model.CarreraEntity
import com.academia.matriculas.Tmodalidad.infrastructure.repository.model.ModalidadEntity


class Matricula (
    val idmatricula: Long,
    val semestre: SemestreEntity,
    val modalidad: ModalidadEntity,
    val grupo:Grupo,
    val aula: AulaEntity,
    val turno: String,
    val carrera:CarreraEntity,
    val observacion:String,
    val anulado:String,
    //val alumnoId:Long,
     val alumno: AlumnoEntity


)

enum class Grupo {A,B,C,D}

