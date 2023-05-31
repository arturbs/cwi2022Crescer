package conta;

import pessoa.Pessoa;

public class ContaBancaria {
    private Pessoa titular;
    private double saldo;
    private int id;

    public ContaBancaria() {}

     public ContaBancaria(int id, Pessoa titular, double saldo) {
         this.id = id; this.saldo = saldo; this.titular = titular;
     }

     public ContaBancaria(int id, Pessoa titular) {
        this.id = id;
        this.titular = titular;
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

     public Pessoa getTitular() {
         return titular;
     }

     public void setTitular(Pessoa titular) {
         this.titular = titular;
     }
 }