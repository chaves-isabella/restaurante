package com.seduc2.restaurante.services;

import com.seduc2.restaurante.entities.Reserva;
import com.seduc2.restaurante.repositories.ReservaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ReservaService {

    private final ReservaRepository repository;

    public ReservaService(ReservaRepository repository) {
        this.repository = repository;
    }

    public Reserva salvar (Reserva reserva){
        Reserva r = new Reserva(reserva.getNome(), reserva.getTelefone(), reserva.getCpf(), reserva.getEmail(), reserva.getNumPessoas());
        return repository.save(reserva);
    }

    public List<Reserva> listar (){
        return repository.findAll();
    }

    public void deletar (@PathVariable Long id){
        repository.deleteById(id);
    }

    public void alterar (@PathVariable Long id, @RequestBody Reserva reserva){
        Reserva r = repository.getReferenceById(id);
        r.setNome(reserva.getNome());
        r.setEmail(reserva.getEmail());
        r.setCpf(reserva.getCpf());
        r.setTelefone(reserva.getTelefone());
        r.setNumPessoas(reserva.getNumPessoas());
    }
}
