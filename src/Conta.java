public abstract class Conta implements IConta {
    private int agencia;
    private int numero;
    private double saldo;

    @Override
    public void depositar(double valor) {
    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void transferir(double valor, IConta contaDestino) {

    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }
}
