package br.com.heiderlopes.trainningapi.controller

import br.com.heiderlopes.trainningapi.model.Contato
import br.com.heiderlopes.trainningapi.service.ContatoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/quemliga")
class ContatoController {

    @Autowired
    lateinit var contatoService: ContatoService

    @GetMapping("/check")
    fun checkHealth(): String {
        return "OK"
    }

    @GetMapping("/{numero}")
    fun buscarTodos(@PathVariable("numero") numero: String): Contato {
        return contatoService.pesquisarPor(numero)
    }

    @PostMapping
    fun salvar(@RequestBody contato: Contato): Contato {
        return contatoService.salvar(contato)
    }


}