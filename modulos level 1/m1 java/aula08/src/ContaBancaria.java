public class ContaBancaria {
    double saldo;

    public void sacar(double valorASacar) {
        if (saldo - valorASacar >= 0)
            saldo = saldo - valorASacar;

    }

    public void depositar(double valorADepositar) {
        saldo = saldo + valorADepositar;
    }
}
