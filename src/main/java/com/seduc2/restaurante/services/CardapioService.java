package com.seduc2.restaurante.services;

import com.seduc2.restaurante.entities.Cardapio;
import com.seduc2.restaurante.entities.Reserva;
import com.seduc2.restaurante.repositories.CardapioRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CardapioService {

    private final CardapioRepository repository;

    public CardapioService(CardapioRepository repository) {
        this.repository = repository;
    }

    public Cardapio salvar (Cardapio cardapio){
        Cardapio c = new Cardapio(cardapio.getNome(), cardapio.getPreco(), cardapio.getDescricao());
        return repository.save(cardapio);
    }

    public List<Cardapio> listar (){
        return repository.findAll();
    }

    public void deletar (@PathVariable Long id){
        repository.deleteById(id);
    }

    public void alterar (@PathVariable Long id, @RequestBody Cardapio cardapio){
        Cardapio c = repository.getReferenceById(id);
        c.setNome(cardapio.getNome());
        c.setDescricao(cardapio.getDescricao());
        c.setPreco(cardapio.getPreco());
    }
}
