package com.academia.matriculas.Tcarrera.infrastructure.repository.adapter

import com.academia.matriculas.Tcarrera.domain.Carrera
import com.academia.matriculas.Tcarrera.infrastructure.repository.model.CarreraEntity

class ModelMapperCarrera {

    fun toEntity(carrera: Carrera): CarreraEntity =
        CarreraEntity(carrera.idcarrera,carrera.carrera,carrera.grupo)

    fun toDto(carreraEntity: CarreraEntity): Carrera =
        Carrera(carreraEntity.idcarrera,carreraEntity.carrera,carreraEntity.grupo)
}