package com.academia.matriculas.Tmodalidad.infrastructure.repository.model

import jakarta.persistence.*

@Entity
@Table(name = "Tmodalidad")
class ModalidadEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val idmodalidad: Long,
    val modalidad: String,
    val activo: String
){
}