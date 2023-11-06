package com.academia.matriculas.Taula.infrastructure.configuration

import com.academia.matriculas.Taula.application.AulaEndPoints
import com.academia.matriculas.Taula.application.AulaService
import com.academia.matriculas.Taula.domain.AulaRepository
import com.academia.matriculas.Taula.infrastructure.repository.adapter.AulaAdapterRepository
import com.academia.matriculas.Taula.infrastructure.repository.adapter.ModelMapperAula
import com.academia.matriculas.Taula.infrastructure.repository.dao.AulaDao
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
class AulaBeans {
    @Bean
    fun modelMapperAula() = ModelMapperAula()

    @Bean
    fun aulaRepository(aulaDao: AulaDao, modelMapperAula: ModelMapperAula)=
        AulaAdapterRepository(aulaDao,modelMapperAula)

    @Bean
    fun aulaService(aulaRepository: AulaRepository)=
        AulaService(aulaRepository)

    @Bean
    fun aulaController(aulaService: AulaService) =
        AulaEndPoints(aulaService)
}