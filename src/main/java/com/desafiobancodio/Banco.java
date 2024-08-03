package com.desafiobancodio;

import java.util.List;

public class Banco {
    // Nome do banco
    public String nome;

    // Lista de contas do banco
    private List<Conta> contas;

    // Métodos getter e setter para o nome do banco
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos getter e setter para a lista de contas
    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
