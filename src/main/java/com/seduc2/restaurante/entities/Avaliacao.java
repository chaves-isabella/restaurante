package com.seduc2.restaurante.entities;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Avaliacao {

    private Long id;
    private String nome;
    private String descricao;
    private LocalDate dataCriacao;

    public Avaliacao(Long id, String nome, String descricao, LocalDate dataCriacao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
    }

    public Avaliacao(String nome, String descricao, LocalDate dataCriacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
    }

    public Avaliacao(){}

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
