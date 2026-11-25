package com.seduc2.restaurante.controllers;

import com.seduc2.restaurante.entities.Avaliacao;
import com.seduc2.restaurante.services.AvaliacaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("avaliacoes")
public class AvaliacaoController {

    private final AvaliacaoService service;

    public AvaliacaoController(AvaliacaoService service) {
        this.service = service;
    }

    @PostMapping
    public Avaliacao salvar (@RequestBody Avaliacao avaliacao){
        return service.salvar(avaliacao);
    }

    @GetMapping
    public List<Avaliacao> listar (){
        return service.listar();
    }

    @DeleteMapping ("/{id}")
    public void deletar (@PathVariable Long id){
        service.deletar(id);
    }

    @PutMapping ("/{id}")
    public void alterar (@PathVariable Long id, @RequestBody Avaliacao avaliacao){
        service.alterar(id, avaliacao);
    }
}
