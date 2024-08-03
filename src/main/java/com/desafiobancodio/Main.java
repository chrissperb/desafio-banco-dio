package com.desafiobancodio;

public class Main {
    public static void main(String[] args) {
        // Criação do cliente com nome e CPF
        Cliente christian = new Cliente();
        christian.setNome("Christian Sperb");
        christian.setCpf("80764029053");

        Banco banco = new Banco();
        banco.setNome("Banco DIO");

        // Criação de contas Corrente e Poupança para o cliente
        Conta cc = new ContaCorrente(christian);
        Conta poupanca = new ContaPoupanca(christian);

        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);

        cc.depositar(100);
        poupanca.depositar(500);
        poupanca.sacar(70);
        poupanca.transferir(100, cc);

        // Impressão dos extratos das contas
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}