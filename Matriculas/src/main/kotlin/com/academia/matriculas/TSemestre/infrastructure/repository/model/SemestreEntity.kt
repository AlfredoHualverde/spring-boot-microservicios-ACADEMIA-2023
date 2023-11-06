package com.academia.matriculas.TSemestre.infrastructure.repository.model

import com.fasterxml.jackson.annotation.JsonFormat
import jakarta.persistence.*

@Entity
@Table(name = "Tsemestre")
class SemestreEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val idsemestre: Long,
    val semestre: String,
    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    val fechaInicio: String,
    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    val fechaFin: String,
    val Activo: Int
)