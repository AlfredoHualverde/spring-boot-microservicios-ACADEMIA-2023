package com.academia.matriculas

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@ComponentScan(basePackages = ["com"])
//@EnableJpaRepositories("com")
@EntityScan("com")


@Configuration

//@SpringBootApplication(exclude = [SecurityAutoConfiguration::class])

@SpringBootApplication
class MatriculasApplication

fun main(args: Array<String>) {
    runApplication<MatriculasApplication>(*args)
}