import conta.ContaBancaria;
import org.junit.Assert;
import org.junit.Test;
import pessoa.Pessoa;

public class ContaBnacariaTest {
    @Test
    public void  deveAtualizarOSaldoQuandoOcorreUmSaque() {
        Pessoa escobar = new Pessoa("Escobar", "08895634648", "467946-99", 1000.0);
        Pessoa chiquinha = new Pessoa("Chiquinha", "08895573848", "460046-54", 3500.0);
        ContaBancaria contaBancariaEscobar = new ContaBancaria(2, escobar, 1000);
        ContaBancaria contaBancariaChiquinha = new ContaBancaria(1, chiquinha, 7500);

        double valorEsperadoNaConta1 = 250;
        double valorEsperadoNaConta2 = 550;

        contaBancariaEscobar.sacar(450);
        contaBancariaChiquinha.sacar(7250);

        Assert.assertEquals(valorEsperadoNaConta2, contaBancariaEscobar.getSaldo(), 0.01);
        Assert.assertEquals(valorEsperadoNaConta1, contaBancariaChiquinha.getSaldo(), 0.01);
    }

    @Test
    public void  naoDeveAtualizarOSaldoQuandoOcorreUmSaqueComValorMaiorQueOSaldo() {
        Pessoa escobar = new Pessoa("Escobar", "08895634648", "467946-99", 1000.0);
        Pessoa chiquinha = new Pessoa("Chiquinha", "08895573848", "460046-54", 3500.0);
        ContaBancaria contaBancariaEscobar = new ContaBancaria(2, escobar, 1000);
        ContaBancaria contaBancariaChiquinha = new ContaBancaria(1, chiquinha, 7500);

        double valorEsperadoNaConta1 = 7500;
        double valorEsperadoNaConta2 = 1000;

        contaBancariaChiquinha.sacar(10000);
        contaBancariaEscobar.sacar(2500);

        Assert.assertEquals(valorEsperadoNaConta2, contaBancariaEscobar.getSaldo(), 0.01);
        Assert.assertEquals(valorEsperadoNaConta1, contaBancariaChiquinha.getSaldo(), 0.01);

    }

    @Test
    public void  deveAtualizarOSaldoQuandoOcorreUmDeposito() {
        Pessoa escobar = new Pessoa("Escobar", "08895634648", "467946-99", 1000.0);
        Pessoa chiquinha = new Pessoa("Chiquinha", "08895573848", "460046-54", 3500.0);
        ContaBancaria contaBancariaEscobar = new ContaBancaria(2, escobar, 1000);
        ContaBancaria contaBancariaChiquinha = new ContaBancaria(1, chiquinha, 7500);

        double valorEsperadoNaConta1 = 8250;
        double valorEsperadoNaConta2 = 1550;

        contaBancariaEscobar.depositar(550);
        contaBancariaChiquinha.depositar(750);

        Assert.assertEquals(valorEsperadoNaConta2, contaBancariaEscobar.getSaldo(), 0.01);
        Assert.assertEquals(valorEsperadoNaConta1, contaBancariaChiquinha.getSaldo(), 0.01);
    }

    @Test
    public void deveAtualizarOSaldoDaContaOrigemQuandoOcorrerUmaTranferencia() {
        //Arrange
        Pessoa escobar = new Pessoa("Escobar", "08895634648", "467946-99", 1000.0);
        Pessoa chiquinha = new Pessoa("Chiquinha", "08895573848", "460046-54", 3500.0);
        ContaBancaria contaBancariaEscobar = new ContaBancaria(2, escobar, 1000);
        ContaBancaria contaBancariaChiquinha = new ContaBancaria(1, chiquinha, 7500);
        double saldoEsperadoContaOrigem = 400;
        //act
        contaBancariaEscobar.tranferir(contaBancariaEscobar, contaBancariaChiquinha, 600);

        //assert
        Assert.assertEquals(saldoEsperadoContaOrigem, contaBancariaEscobar.getSaldo(), 0.01);
    }

    @Test
    public void exemploEncapsulamento() {
        ContaBancaria contaBancariaEscobar = new ContaBancaria();
        contaBancariaEscobar.depositar(1000);
        contaBancariaEscobar.setId(9876);
    }
}
