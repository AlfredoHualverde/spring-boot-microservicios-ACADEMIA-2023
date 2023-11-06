package com.academia.matriculas.Tmatricula.infrastructure.configuration

import com.academia.matriculas.Talumno.domain.AlumnoRepository
import com.academia.matriculas.Tmatricula.application.MatriculaEndPoints
import com.academia.matriculas.Tmatricula.application.MatriculaService
import com.academia.matriculas.Tmatricula.domain.MatriculaRepository
import com.academia.matriculas.Tmatricula.infrastructure.repository.adapter.MatriculaAdapterRepository
import com.academia.matriculas.Tmatricula.infrastructure.repository.adapter.ModelMapperMatricula
import com.academia.matriculas.Tmatricula.infrastructure.repository.dao.MatriculaDao
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories("com")
@EntityScan("com")
@ComponentScan(basePackages = ["com"])
class MatriculaBeans {
    @Bean
    fun modelMapperMatricula() = ModelMapperMatricula()

    @Bean
    fun matriculaRepository(matriculaDao: MatriculaDao, modelMapperMatricula: ModelMapperMatricula)=
        MatriculaAdapterRepository(matriculaDao,modelMapperMatricula)

    @Bean
    fun matriculaService(matriculaRepository: MatriculaRepository,alumnoRepository: AlumnoRepository)=
        MatriculaService(matriculaRepository,alumnoRepository)

    @Bean
    fun matriculaController(matriculaService: MatriculaService) =
        MatriculaEndPoints(matriculaService)
}