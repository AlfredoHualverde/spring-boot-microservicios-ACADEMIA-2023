package com.academia.matriculas.Talumno.infrastructure.configuration

import com.academia.matriculas.Talumno.application.AlumnoEndPoints
import com.academia.matriculas.Talumno.application.AlumnoService
import com.academia.matriculas.Talumno.application.FotoAlumnoEndPoints
import com.academia.matriculas.Talumno.application.FotoAlumnoService
import com.academia.matriculas.Talumno.domain.AlumnoRepository
import com.academia.matriculas.Talumno.infrastructure.repository.adapter.AlumnoAdapterRepository
import com.academia.matriculas.Talumno.infrastructure.repository.adapter.ModelMapperAlumno
import com.academia.matriculas.Talumno.infrastructure.repository.dao.AlumnoDao
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

class AlumnoBeans {
    @Bean
    fun modelMapperAlumno() = ModelMapperAlumno()

    @Bean
    fun alumnoRepository(alumnoDao: AlumnoDao,modelMapperAlumno: ModelMapperAlumno)=
        AlumnoAdapterRepository(alumnoDao,modelMapperAlumno)

    @Bean
    fun alumnoService(alumnoRepository: AlumnoRepository)=
        AlumnoService(alumnoRepository)

    @Bean
    fun alumnoController(alumnoService: AlumnoService) =
        AlumnoEndPoints(alumnoService)

//foto
    @Bean
    fun fotoalumnoService(alumnoRepository: AlumnoRepository)=
        FotoAlumnoService(alumnoRepository)

    @Bean
    fun fotoalumnoController(fotoAlumnoService: FotoAlumnoService) =
        FotoAlumnoEndPoints(fotoAlumnoService)

}