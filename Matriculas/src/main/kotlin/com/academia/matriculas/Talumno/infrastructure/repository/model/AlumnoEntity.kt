package com.academia.matriculas.Talumno.infrastructure.repository.model

import jakarta.persistence.*

@Entity
@Table(name = "TAlumnos")
class AlumnoEntity (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name="id_alumno")
        val id: Long,
        val nombre: String,
        val apPaterno: String,
        val apMaterno:String,
        @Column(name="dni")
        val dni: String,
        val email: String,
        val celular:String,
        // the database column is called "profile_picture" and it has a type of BLOB
        @Lob
        @Column(name="profile_picture")
        var profilePicture: ByteArray

//   @OneToMany(mappedBy = "alumnoId", orphanRemoval = true)
//   val matricula:MutableSet<MatriculaEntity> = mutableSetOf()

)
//{
//        @OneToMany(mappedBy = "alumno")
//        open val matricula:List<MatriculaEntity> = listOf()
//      }


