public class ContaBancaria {
    private double saldo;
    private int id;

    public ContaBancaria() {

    }
    public ContaBancaria(int id) {
        this.id = id;
    }

    public void sacar(double valorASacar) {
        if (saldo - valorASacar >= 0)
            saldo = saldo - valorASacar;

    }

    public void depositar(double valorADepositar) {
        saldo = saldo + valorADepositar;
    }

    public void tranferir(ContaBancaria contaOrigem, ContaBancaria contaDestino, double valorATranferir) {
        contaOrigem.sacar(valorATranferir);
        contaDestino.depositar(valorATranferir );

    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int newId) {
        this.id = newId;
    }
}