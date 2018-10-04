package br.com.heiderlopes.trainningapi.service

import br.com.heiderlopes.trainningapi.model.Contato
import br.com.heiderlopes.trainningapi.repository.ContatoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ContatoService {

    @Autowired
    lateinit var contatoRepository: ContatoRepository

    fun salvar(contato: Contato): Contato {
        return contatoRepository.save(contato)
    }

    fun pesquisarPor(numero: String): Contato {
        try {
            return contatoRepository.findByNumero(numero)
        } catch (ex: Exception) {
            return Contato("", "", "")
        }
    }
}