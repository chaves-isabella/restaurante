package com.seduc2.restaurante.controllers;

import com.seduc2.restaurante.entities.Reserva;
import com.seduc2.restaurante.services.ReservaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("reservas")
public class ReservaController {

    private final ReservaService service;

    public ReservaController(ReservaService service) {
        this.service = service;
    }

    @PostMapping
    public Reserva salvar (@RequestBody Reserva reserva){
        return service.salvar(reserva);
    }

    @GetMapping
    public List<Reserva> listar (){
        return service.listar();
    }

    @DeleteMapping ("/{id}")
    public void deletar (@PathVariable Long id){
        service.deletar(id);
    }

    @PutMapping ("/{id}")
    public void alterar (@PathVariable Long id, @RequestBody Reserva reserva){
        service.alterar(id, reserva);
    }
}
