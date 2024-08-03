package com.desafiobancodio;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
public class Banco {
    // Nome do banco
    public String nome;

    // Lista de contas do banco
    private List<Conta> contas;

}
