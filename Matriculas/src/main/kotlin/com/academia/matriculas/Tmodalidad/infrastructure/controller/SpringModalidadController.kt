package com.academia.matriculas.Tmodalidad.infrastructure.controller

import com.academia.matriculas.Tmodalidad.application.ModalidadEndPoints
import com.academia.matriculas.Tmodalidad.domain.Modalidad
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RequestMapping("/api/v1/matriculas/")
@RestController
class SpringModalidadController (@Autowired private val modalidadEndPoints: ModalidadEndPoints){

    //@PreAuthorize("hasAuthority('admin:create')")
    @PostMapping("modalidad")
    fun createModalidad(@RequestBody modalidad: Modalidad) =
        modalidadEndPoints.createModalidad(modalidad)

    @PutMapping("modalidad/update")
    fun updateModalidad(@RequestBody modalidad: Modalidad)=
        modalidadEndPoints.updateModalidad(modalidad)

    @GetMapping("modalidad/{id}")
    fun getAula(@PathVariable id: Long): Modalidad =
        modalidadEndPoints.getModalidadById(id)

    @GetMapping("modalidad/all")
    fun getModalidad(): List<Modalidad> =
        modalidadEndPoints.getModalidades()

    @DeleteMapping("modalidad/{id}")
    fun deleteModalidad(@PathVariable id: Long)=
        modalidadEndPoints.deleteModalidad(id)
}