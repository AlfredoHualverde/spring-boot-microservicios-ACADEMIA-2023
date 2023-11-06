package com.academia.matriculas.Tcarrera.application

import com.academia.matriculas.Tcarrera.domain.Carrera
import com.academia.matriculas.Tcarrera.domain.CarreraRepository

class CarreraService (private val carreraRepository: CarreraRepository){
    fun createCarrera(carrera: Carrera): Carrera {
        return carreraRepository.save(Carrera(carrera.idcarrera,carrera.carrera,
            carrera.grupo))
    }

    fun getCarreraById(id: Long): Carrera {
        return carreraRepository.findById(id)
            ?: throw RuntimeException("no existe carrera con id $id")
    }

    fun getCarreras(): List<Carrera> {
        return  carreraRepository.findAll()
    }

    fun deleteCarrera(id: Long) : Boolean{
        return carreraRepository.deleteById(id)
    }

    fun updateCarrera(carrera: Carrera): Carrera {
        return carreraRepository.update(Carrera(carrera.idcarrera,
            carrera.carrera,carrera.grupo))
    }
}