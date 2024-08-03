package com.desafiobancodio;

public abstract class Conta implements IConta {

    // Constantes e variáveis de classe
    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1;

    // Atributos protegidos
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    // Construtor da classe
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    // Implementação dos métodos da interface com.desafiobancodio.IConta
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    // Métodos getter, setter não adicionados propositalmente
    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    // Método para exibir informações comuns das contas
    protected void exibirInfosComuns() {
        System.out.println("Titular: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("com.desafiobancodio.Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}

