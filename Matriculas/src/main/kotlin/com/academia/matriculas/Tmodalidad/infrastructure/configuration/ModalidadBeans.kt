package com.academia.matriculas.Tmodalidad.infrastructure.configuration

import com.academia.matriculas.Tmodalidad.application.ModalidadEndPoints
import com.academia.matriculas.Tmodalidad.application.ModalidadService
import com.academia.matriculas.Tmodalidad.domain.ModalidadRepository
import com.academia.matriculas.Tmodalidad.infrastructure.repository.adapter.ModalidadAdapterRepository
import com.academia.matriculas.Tmodalidad.infrastructure.repository.adapter.ModelMapperModalidad
import com.academia.matriculas.Tmodalidad.infrastructure.repository.dao.ModalidadDao
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
class ModalidadBeans {
    @Bean
    fun modelMapperModalidad() = ModelMapperModalidad()

    @Bean
    fun modalidadRepository(modalidadDao: ModalidadDao, modelMapperModalidad: ModelMapperModalidad)=
        ModalidadAdapterRepository(modalidadDao,modelMapperModalidad)

    @Bean
    fun modalidadService(modalidadRepository: ModalidadRepository)=
        ModalidadService(modalidadRepository)

    @Bean
    fun modalidadController(modalidadService: ModalidadService) =
        ModalidadEndPoints(modalidadService)
}