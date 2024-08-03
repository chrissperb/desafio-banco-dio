//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente christian = new Cliente();
        christian.setNome("Christian Sperb");
        christian.setCpf("80764029053");

        Conta cc = new ContaCorrente(christian);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(christian);
        poupanca.depositar(500);
        poupanca.sacar(70);
        poupanca.transferir(100, cc);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}