package com.academia.matriculas.Tmatricula.infrastructure.controller

import com.academia.matriculas.Tmatricula.application.MatriculaEndPoints
import com.academia.matriculas.Tmatricula.domain.Matricula
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RequestMapping("/api/v1/matriculas")
@RestController
class SpringMatriculaController (@Autowired private val matriculaEndpoints: MatriculaEndPoints)
{
//    @PreAuthorize("hasAuthority('admin:create')")


    @PostMapping("/matricula")
    fun createMatricula(@RequestBody matricula:Matricula) =
        matriculaEndpoints.createMatricula(matricula)

    @GetMapping("/matricula/all")
    fun getMatriculados(): List<Matricula> =
        matriculaEndpoints.getMatriculados()

    @PutMapping("/matricula/update")
    fun updateMatricula(@RequestBody matricula: Matricula)=
        matriculaEndpoints.updateMatricula(matricula)

    @GetMapping("/matricula/{id}")
    fun getMatricula(@PathVariable id: Long): Matricula? =
        matriculaEndpoints.getMatriculaById(id)

    @DeleteMapping("/matricula/delete/{id}")
    fun deleteMatricula(@PathVariable id: Long)=
        matriculaEndpoints.deleteMatricula(id)
}