import org.junit.Assert;
import org.junit.Test;

public class ContaBnacariaTest {
    @Test
    public void  deveAtualizarOSaldoQuandoOcorreUmSaque() {
        ContaBancaria contaBancariaEscobar = new ContaBancaria();
        ContaBancaria contaBancariaChiquinha = new ContaBancaria();

        contaBancariaChiquinha.depositar(7500);
        contaBancariaEscobar.depositar(1000);

        double valorEsperadoNaConta1 = 250;
        double valorEsperadoNaConta2 = 550;

        contaBancariaEscobar.sacar(450);
        contaBancariaChiquinha.sacar(7250);

        Assert.assertEquals(valorEsperadoNaConta2, contaBancariaEscobar.getSaldo(), 0.01);
        Assert.assertEquals(valorEsperadoNaConta1, contaBancariaChiquinha.getSaldo(), 0.01);
    }

    @Test
    public void  naoDeveAtualizarOSaldoQuandoOcorreUmSaqueComValorMaiorQueOSaldo() {
        ContaBancaria contaBancariaEscobar = new ContaBancaria();
        ContaBancaria contaBancariaChiquinha = new ContaBancaria();

        contaBancariaChiquinha.depositar(7500);
        contaBancariaEscobar.depositar(1000);

        double valorEsperadoNaConta1 = 7500;
        double valorEsperadoNaConta2 = 1000;

        contaBancariaChiquinha.sacar(10000);
        contaBancariaEscobar.sacar(2500);

        Assert.assertEquals(valorEsperadoNaConta2, contaBancariaEscobar.getSaldo(), 0.01);
        Assert.assertEquals(valorEsperadoNaConta1, contaBancariaChiquinha.getSaldo(), 0.01);

    }

    @Test
    public void  deveAtualizarOSaldoQuandoOcorreUmDeposito() {
        ContaBancaria contaBancariaEscobar = new ContaBancaria();
        ContaBancaria contaBancariaChiquinha = new ContaBancaria();

        contaBancariaChiquinha.depositar(7500);
        contaBancariaEscobar.depositar(1000);

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
        ContaBancaria contaBancariaEscobar = new ContaBancaria();
        ContaBancaria contaBancariaChiquinha = new ContaBancaria();
        contaBancariaEscobar.depositar(1000);
        contaBancariaChiquinha.depositar(2500);
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
