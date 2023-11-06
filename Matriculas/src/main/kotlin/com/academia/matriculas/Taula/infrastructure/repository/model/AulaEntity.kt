package com.academia.matriculas.Taula.infrastructure.repository.model

import jakarta.persistence.*

@Entity
@Table(name = "Taula")
class AulaEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val idaula: Long,
    val grupo: String,
    val seccion: String,
    val turno:String,
    val cantidad: Int
){



}