package com.academia.matriculas.Taula.infrastructure.controller

import com.academia.matriculas.Taula.application.AulaEndPoints
import com.academia.matriculas.Taula.domain.Aula
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RequestMapping("/api/v1/matriculas/")
@RestController
class SpringAulaController (@Autowired private val aulaEndPoints: AulaEndPoints){
    //@PreAuthorize("hasAuthority('admin:create')")

    //@PreAuthorize("hasAuthority('admin:create')")
    @PostMapping("aula")
    fun createAula(@RequestBody aula: Aula) =
        aulaEndPoints.createAula(aula)

    @PutMapping("aula/update")
    fun updateAula(@RequestBody aula: Aula)=
        aulaEndPoints.updateAula(aula)

    @GetMapping("aula/{id}")
    fun getAula(@PathVariable id: Long): Aula =
        aulaEndPoints.getAulaById(id)

    @GetMapping("aula/all")
    fun getAula(): List<Aula> =
        aulaEndPoints.getAulas()

    @DeleteMapping("aula/{id}")
    fun deleteAula(@PathVariable id: Long)=
        aulaEndPoints.deleteAula(id)
}