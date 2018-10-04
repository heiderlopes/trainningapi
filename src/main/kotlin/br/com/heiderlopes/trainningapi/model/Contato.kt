package br.com.heiderlopes.trainningapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Contato(
        @Id var id: String?,
        val numero: String,
        val tipo: String
)