package com.academia.matriculas.Tcarrera.infrastructure.controller

import com.academia.matriculas.Tcarrera.application.CarreraEndPoints
import com.academia.matriculas.Tcarrera.domain.Carrera
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RequestMapping("/api/v1/matriculas/")
@RestController
class SpringCarreraController (@Autowired private val carreraEndPoints: CarreraEndPoints) {

    @PostMapping("carrera")
    fun createCarrera(@RequestBody carrera: Carrera) =
        carreraEndPoints.createCarrera(carrera)

    @PutMapping("carrera/update")
    fun updateCarrera(@RequestBody carrera: Carrera)=
        carreraEndPoints.updateCarrera(carrera)

    @GetMapping("carrera/{id}")
    fun getCarrera(@PathVariable id: Long): Carrera =
        carreraEndPoints.getCarreraById(id)

    @GetMapping("carrera/all")
    fun getCarrera(): List<Carrera> =
        carreraEndPoints.getCarreras()

    @DeleteMapping("carrera/{id}")
    fun deleteCarrera(@PathVariable id: Long)=
        carreraEndPoints.deleteCarrera(id)
}