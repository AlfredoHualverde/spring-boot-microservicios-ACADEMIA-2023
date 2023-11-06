package com.academia.matriculas.TSemestre.infrastructure.configuration

import com.academia.matriculas.TSemestre.application.SemestreEndPoints
import com.academia.matriculas.TSemestre.application.SemestreService
import com.academia.matriculas.TSemestre.domain.SemestreRepository
import com.academia.matriculas.TSemestre.infrastructure.repository.adapter.ModelMapperSemestre
import com.academia.matriculas.TSemestre.infrastructure.repository.adapter.SemestreAdapterRepository
import com.academia.matriculas.TSemestre.infrastructure.repository.dao.SemestreDao
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
class SemestreBeans {
    @Bean
    fun modelMapperSemestre() = ModelMapperSemestre()

    @Bean
    fun semestreRepository(semestreDao: SemestreDao, modelMapperSemestre: ModelMapperSemestre)=
        SemestreAdapterRepository(semestreDao,modelMapperSemestre)

    @Bean
    fun semestreService(semestreRepository: SemestreRepository)=
        SemestreService(semestreRepository)

    @Bean
    fun semestreController(semestreService: SemestreService) =
        SemestreEndPoints(semestreService)

}