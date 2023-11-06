package com.academia.matriculas.Tcarrera.infrastructure.repository.model

import com.academia.matriculas.Tcarrera.domain.Grupo
import jakarta.persistence.*

@Entity
@Table(name = "Tcarrera")
class CarreraEntity (
        @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
        val idcarrera: Long,
        val carrera: String,
        val grupo: Grupo
)

{
}