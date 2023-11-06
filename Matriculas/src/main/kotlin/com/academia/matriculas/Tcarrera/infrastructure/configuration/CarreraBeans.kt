package com.academia.matriculas.Tcarrera.infrastructure.configuration

import com.academia.matriculas.Tcarrera.application.CarreraEndPoints
import com.academia.matriculas.Tcarrera.application.CarreraService
import com.academia.matriculas.Tcarrera.domain.CarreraRepository
import com.academia.matriculas.Tcarrera.infrastructure.repository.adapter.CarreraAdapterRepository
import com.academia.matriculas.Tcarrera.infrastructure.repository.adapter.ModelMapperCarrera
import com.academia.matriculas.Tcarrera.infrastructure.repository.dao.CarreraDao
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
class CarreraBeans {
    @Bean
    fun modelMapperCarrera() = ModelMapperCarrera()

    @Bean
    fun carreraRepository(carreraDao: CarreraDao, modelMapperCarrera: ModelMapperCarrera)=
        CarreraAdapterRepository(carreraDao,modelMapperCarrera)

    @Bean
    fun carreraService(carreraRepository: CarreraRepository)=
        CarreraService(carreraRepository)

    @Bean
    fun carreraController(carreraService: CarreraService) =
        CarreraEndPoints(carreraService)

}