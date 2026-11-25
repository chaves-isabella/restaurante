package com.seduc2.restaurante.controllers;

import com.seduc2.restaurante.entities.Cardapio;
import com.seduc2.restaurante.services.CardapioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("cardapios")
public class CardapioController {

    private final CardapioService service;

    public CardapioController(CardapioService service) {
        this.service = service;
    }

    @PostMapping
    public Cardapio salvar (@RequestBody Cardapio cardapio){
        return service.salvar(cardapio);
    }

    @GetMapping
    public List<Cardapio> listar (){
        return service.listar();
    }

    @DeleteMapping ("/{id}")
    public void deletar (@PathVariable Long id){
        service.deletar(id);
    }

    @PutMapping ("/{id}")
    public void alterar (@PathVariable Long id, @RequestBody Cardapio cardapio){
        service.alterar(id, cardapio);
    }
}
