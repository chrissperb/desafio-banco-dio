public class ContaCorrente extends Conta {

    // Construtor da classe ContaCorrente
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    // Implementação do método imprimirExtrato
    @Override
    public void imprimirExtrato() {
        System.out.println("===== EXTRATO CONTA CORRENTE =====");
        super.exibirInfosComuns();
    }
}
