package br.com.heiderlopes.trainningapi.repository

import br.com.heiderlopes.trainningapi.model.Contato
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ContatoRepository : MongoRepository<Contato, String> {
    fun findByNumero(numero: String): Contato
}