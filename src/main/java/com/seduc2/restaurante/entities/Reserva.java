package com.seduc2.restaurante.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

@Entity
public class Reserva {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nome;
    @NotBlank
    private String telefone;
    @CPF
    private String cpf;
    @Email
    private String email;
    @NotBlank
    private String numPessoas;

    public Reserva(Long id, String nome, String telefone, String cpf, String email, String numPessoas) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
        this.numPessoas = numPessoas;
    }

    public Reserva(String nome, String telefone, String cpf, String email, String numPessoas) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
        this.numPessoas = numPessoas;
    }

    public Reserva(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(String numPessoas) {
        this.numPessoas = numPessoas;
    }
}
