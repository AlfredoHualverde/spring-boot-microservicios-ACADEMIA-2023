package com.academia.matriculas.TSemestre.infrastructure.controller

import com.academia.matriculas.TSemestre.application.SemestreEndPoints
import com.academia.matriculas.TSemestre.domain.Semestre
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RequestMapping("/api/v1/matriculas/semestre")
@RestController
class SpringSemestreController(@Autowired private val semestreEndPoints: SemestreEndPoints) {
    @PostMapping("/nuevo")
    fun createSemestre(@RequestBody semestre: Semestre) =
        semestreEndPoints.createSemestre(semestre)

    @GetMapping("/all")
    fun getSemestres(): List<Semestre> =
        semestreEndPoints.getSemestres()

    @PutMapping("/update")
    fun updateMatricula(@RequestBody semestre: Semestre)=
        semestreEndPoints.updateSemestre(semestre)

    @GetMapping("/{id}")
    fun getSemestre(@PathVariable id: Long): Semestre? =
        semestreEndPoints.getSemestre(id)

    @DeleteMapping("/delete/{id}")
    fun deleteSemestre(@PathVariable id: Long)=
        semestreEndPoints.deleteSemestre(id)
}