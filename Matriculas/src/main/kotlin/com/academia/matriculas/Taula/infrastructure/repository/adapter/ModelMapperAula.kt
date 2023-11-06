package com.academia.matriculas.Taula.infrastructure.repository.adapter

import com.academia.matriculas.Taula.domain.Aula
import com.academia.matriculas.Taula.infrastructure.repository.model.AulaEntity

class ModelMapperAula {

    fun toEntity(aula: Aula): AulaEntity =
        AulaEntity(aula.idaula,aula.grupo,aula.seccion,aula.turno,aula.cantidad)

    fun toDto(aulaEntity: AulaEntity): Aula =
        Aula(aulaEntity.idaula,aulaEntity.grupo,aulaEntity.seccion,
            aulaEntity.turno,aulaEntity.cantidad)
}