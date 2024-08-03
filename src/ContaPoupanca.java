public class ContaPoupanca extends Conta {

    // Construtor da classe ContaPoupanca
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    // Implementação do método imprimirExtrato
    @Override
    public void imprimirExtrato() {
        System.out.println("===== EXTRATO CONTA POUPANCA =====");
        super.exibirInfosComuns();
    }
}
