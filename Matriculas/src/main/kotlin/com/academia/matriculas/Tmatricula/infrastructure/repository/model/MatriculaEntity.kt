package com.academia.matriculas.Tmatricula.infrastructure.repository.model

import com.academia.matriculas.TSemestre.infrastructure.repository.model.SemestreEntity
import com.academia.matriculas.Talumno.infrastructure.repository.model.AlumnoEntity
import com.academia.matriculas.Taula.infrastructure.repository.model.AulaEntity
import com.academia.matriculas.Tcarrera.infrastructure.repository.model.CarreraEntity
import com.academia.matriculas.Tmatricula.domain.Grupo
import com.academia.matriculas.Tmodalidad.infrastructure.repository.model.ModalidadEntity
import jakarta.persistence.*

@Entity
@Table(name = "TMatricula")
class MatriculaEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val idmatricula: Long,
    @ManyToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name="id_semestre")
    val semestre: SemestreEntity,
    @ManyToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name="id_modalidad")
    val modalidad: ModalidadEntity,
    val grupo: Grupo,
    @ManyToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name="id_aula")
    val aula: AulaEntity,
    val turno: String,
    @ManyToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name="id_carrera")
    val carrera: CarreraEntity,
    val observacion: String,
    val anulado: String,
    //val alumnoId: Long,
    @ManyToOne(optional = false)
    @JoinColumn(name="id_alumno")
    val alumno: AlumnoEntity
)
{
//    @ManyToOne(optional = false,cascade = [CascadeType.ALL])
//    @JoinColumn(name="id_alumno")
//    open lateinit var alumno: AlumnoEntity
}

//{
//    @ManyToOne
//    @JoinColumn(name = "id_alumno")
//   open lateinit var alumno:AlumnoEntity
//}
