package com.desafiobancodio;

public interface IConta {
    // Métodos abstratos para operações bancárias
    void depositar(double valor);

    void sacar(double valor);

    void transferir(double valor, IConta contaDestino);

    void imprimirExtrato();
}
