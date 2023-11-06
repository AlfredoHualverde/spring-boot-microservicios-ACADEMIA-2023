package com.academia.matriculas.Tmodalidad.application

import com.academia.matriculas.Tmodalidad.domain.Modalidad
import com.academia.matriculas.Tmodalidad.domain.ModalidadRepository

class ModalidadService (private val modalidadRepository: ModalidadRepository){

    fun createModalidad(modalidad: Modalidad): Modalidad {
        return modalidadRepository.save(Modalidad(modalidad.idmodalidad,modalidad.modalidad,modalidad.activo))
    }

    fun getModalidadById(id: Long): Modalidad {
        return modalidadRepository.findById(id)
            ?: throw RuntimeException("no existe modalidad con id $id")
    }

    fun getModalidades(): List<Modalidad> {
        return  modalidadRepository.findAll()
    }

    fun deleteModalidad(id: Long) : Boolean{
        return modalidadRepository.deleteById(id)
    }

    fun updateModalidad(modalidad: Modalidad): Modalidad {
        return modalidadRepository.update(Modalidad(modalidad.idmodalidad,modalidad.modalidad,modalidad.activo))
    }

}