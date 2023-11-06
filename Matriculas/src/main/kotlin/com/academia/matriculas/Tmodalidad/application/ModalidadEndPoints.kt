package com.academia.matriculas.Tmodalidad.application

import com.academia.matriculas.Tmodalidad.domain.Modalidad

class ModalidadEndPoints (private val modalidadService: ModalidadService){

    fun createModalidad(modalidad: Modalidad): Modalidad =
        modalidadService.createModalidad(modalidad)

    fun updateModalidad(modalidad: Modalidad): Modalidad =
        modalidadService.updateModalidad(modalidad)

    fun getModalidadById(id: Long): Modalidad =
        modalidadService.getModalidadById(id)

    fun getModalidades(): List<Modalidad> =
        modalidadService.getModalidades()
    fun deleteModalidad(id: Long)=
        modalidadService.deleteModalidad(id)
}