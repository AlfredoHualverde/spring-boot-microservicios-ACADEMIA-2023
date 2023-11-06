package com.academia.matriculas.Tmodalidad.infrastructure.repository.adapter

import com.academia.matriculas.Tmodalidad.domain.Modalidad
import com.academia.matriculas.Tmodalidad.infrastructure.repository.model.ModalidadEntity

class ModelMapperModalidad {

    fun toEntity(modalidad: Modalidad): ModalidadEntity =
        ModalidadEntity(modalidad.idmodalidad,modalidad.modalidad,modalidad.activo)

    fun toDto(modalidadEntity: ModalidadEntity): Modalidad =
        Modalidad(modalidadEntity.idmodalidad,modalidadEntity.modalidad,modalidadEntity.activo)

}