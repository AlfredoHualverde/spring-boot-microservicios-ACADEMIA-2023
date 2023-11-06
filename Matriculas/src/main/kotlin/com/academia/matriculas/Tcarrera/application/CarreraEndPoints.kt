package com.academia.matriculas.Tcarrera.application

import com.academia.matriculas.Tcarrera.domain.Carrera

class CarreraEndPoints (private val carreraService: CarreraService){
    fun createCarrera(carrera: Carrera): Carrera =
        carreraService.createCarrera(carrera)
    fun updateCarrera(carrera: Carrera):Carrera=
        carreraService.updateCarrera(carrera)

    fun getCarreraById(id: Long): Carrera =
        carreraService.getCarreraById(id)
    fun getCarreras(): List<Carrera> =
        carreraService.getCarreras()
    fun deleteCarrera(id: Long)=
        carreraService.deleteCarrera(id)
}