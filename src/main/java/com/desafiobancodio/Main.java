package com.desafiobancodio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criação do cliente com nome e CPF
        Cliente christian = new Cliente();
        christian.setNome("Christian Sperb");
        christian.setCpf("80764029053");

        // Criação de contas Corrente e Poupança para o cliente
        Conta cc = new ContaCorrente(christian);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(christian);
        poupanca.depositar(500);
        poupanca.sacar(70);
        poupanca.transferir(100, cc);

        // Impressão dos extratos das contas
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}