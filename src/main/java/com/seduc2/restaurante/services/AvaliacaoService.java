package com.seduc2.restaurante.services;

import com.seduc2.restaurante.entities.Avaliacao;
import com.seduc2.restaurante.repositories.AvaliacaoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AvaliacaoService {

    private final AvaliacaoRepository repository;

    public AvaliacaoService(AvaliacaoRepository repository) {
        this.repository = repository;
    }

    public Avaliacao salvar (Avaliacao avaliacao){
        Avaliacao a = new Avaliacao(avaliacao.getNome(), avaliacao.getDescricao(), avaliacao.getDataCriacao());
        return repository.save(avaliacao);
    }

    public List<Avaliacao> listar (){
        return repository.findAll();
    }

    public void deletar (@PathVariable Long id){
        repository.deleteById(id);
    }

    @Transactional
    public void alterar (@PathVariable Long id, @RequestBody Avaliacao avaliacao){
        Avaliacao a = repository.getReferenceById(id);
        a.setNome(avaliacao.getNome());
        a.setDescricao(avaliacao.getDescricao());
        a.setDataCriacao(avaliacao.getDataCriacao());
    }
}
