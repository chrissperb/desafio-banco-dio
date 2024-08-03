package com.desafiobancodio;

import com.desafiobancodio.enums.TipoTransacao;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {

    // Constantes e variáveis de classe
    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1;

    // Atributos protegidos
    // Métodos setter não adicionados propositalmente
    @Getter
    protected double saldo;
    @Getter
    protected int agencia;
    @Getter
    protected int numero;
    protected Cliente cliente;
    private List<Transacao> historicoTransacoes;

    // Construtor da classe
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.historicoTransacoes = new ArrayList<>();
    }

    // Implementação dos métodos da interface com.desafiobancodio.IConta
    @Override
    public void depositar(double valor) {
        saldo += valor;
        historicoTransacoes.add(new Transacao(valor, TipoTransacao.DEPOSITO));
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        historicoTransacoes.add(new Transacao(valor, TipoTransacao.SAQUE));
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        historicoTransacoes.add(new Transacao(valor, TipoTransacao.TRANSFERENCIA));
    }

    // Método para exibir informações comuns das contas
    public void exibirInfosComuns() {
        System.out.println("Titular: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    public void imprimirExtrato() {
        exibirInfosComuns();
        for (Transacao transacao : historicoTransacoes) {
            System.out.println(transacao);
        }
    }
}