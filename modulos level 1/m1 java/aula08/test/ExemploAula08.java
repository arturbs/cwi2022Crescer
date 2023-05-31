import org.junit.Assert;
import org.junit.Test;

public class ExemploAula08 {
    @Test
    public void abstracao() {
        //Qual o problema ? Criar uma pessoa que se apresente
        //quais são os dados nescessários ? Informações da pessoa (nome, idade)
        // Quais as operações nescessárias ? Printar as informações.


        String nome = "Escobar";
        int idade = 77;
        double altura = 1.78;
        char sexo = 'M';
        boolean possuiDeficiecncia = true;

        System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos. Minha altura é "
         + altura + " e eu sou do sexo " + sexo + ((possuiDeficiecncia)?". Eu possuo deficiencia.":". Eu " +
                "não possuo deficiencia"));
    }

    @Test
    public void testClassePessoa() {
        Pessoa escobar = new Pessoa("Escobar",77, 1.78,  'M', true);
        escobar.apresentarsse();
        Pessoa chiquinha = new Pessoa("Chiquinha", 17, 1.53, 'F', false);
        chiquinha.apresentarsse();
    }

    @Test
    public void testClasseComissao() {
        //Qual o problema ? Criar um sistema que calcule a comissão de um vendedor a partir do valor da venda.
        //quais são os dados nescessários ? Informações do valor da venda e da % da comissão.
        // Quais as operações nescessárias ? calcular pela formula -> (valorVendido * percentualComissao) / 100

        //arrange
        CalculadorComissao calculadorComissao = new CalculadorComissao();
        double valorVenda1 = 1000;
        double percentualComissao1 = 30;
        double valorEsperado = 300;

        //act
        double valorCalculado1 = calculadorComissao.calcularValorComissao(valorVenda1, percentualComissao1);

        //assert
        Assert.assertEquals(valorEsperado, valorCalculado1, 0.001);
    }

    @Test
    public void testContaBnacaria() {
        //Qual o problema ? Criar um sistema que efetue as operações entre contas bancárias
        // Quais as operações nescessárias ? sacra, depositar
        //quais são os dados nescessários ? (valor da operação, saldo da conta, quem é o dono da conta)

        //arrange
        ContaBancaria contaBancariaEscobar = new ContaBancaria();
        contaBancariaEscobar.saldo = 1000;
        double valorEsperadoNaConta1 = 1000;
        double valorEsperadoNaConta2 = 550;
        double valorEsperadoNaConta3 = 1300;

        //act & assert
        contaBancariaEscobar.sacar(4500);
        Assert.assertEquals(valorEsperadoNaConta1, contaBancariaEscobar.saldo, 0.01);
        contaBancariaEscobar.sacar(450);
        Assert.assertEquals(valorEsperadoNaConta2, contaBancariaEscobar.saldo, 0.01);
        contaBancariaEscobar.depositar(750);
        Assert.assertEquals(valorEsperadoNaConta3, contaBancariaEscobar.saldo, 0.01);
    }

    //Organizando por teste
    @Test
    public void  deveAtualizarOSaldoQuandoOcorreUmSaque() {
        ContaBancaria contaBancariaEscobar = new ContaBancaria();
        ContaBancaria contaBancariaChiquinha = new ContaBancaria();

        contaBancariaChiquinha.saldo = 7500;
        contaBancariaEscobar.saldo = 1000;

        double valorEsperadoNaConta1 = 250;
        double valorEsperadoNaConta2 = 550;

        contaBancariaEscobar.sacar(450);
        contaBancariaChiquinha.sacar(7250);

        Assert.assertEquals(valorEsperadoNaConta2, contaBancariaEscobar.saldo, 0.01);
        Assert.assertEquals(valorEsperadoNaConta1, contaBancariaChiquinha.saldo, 0.01);
    }

    @Test
    public void  naoDeveAtualizarOSaldoQuandoOcorreUmSaqueComValorMaiorQueOSaldo() {
        ContaBancaria contaBancariaEscobar = new ContaBancaria();
        ContaBancaria contaBancariaChiquinha = new ContaBancaria();

        contaBancariaChiquinha.saldo = 7500;
        contaBancariaEscobar.saldo = 1000;

        double valorEsperadoNaConta1 = 7500;
        double valorEsperadoNaConta2 = 1000;

        contaBancariaChiquinha.sacar(10000);
        contaBancariaEscobar.sacar(2500);

        Assert.assertEquals(valorEsperadoNaConta2, contaBancariaEscobar.saldo, 0.01);
        Assert.assertEquals(valorEsperadoNaConta1, contaBancariaChiquinha.saldo, 0.01);

    }

    @Test
    public void  deveAtualizarOSaldoQuandoOcorreUmDeposito() {
        ContaBancaria contaBancariaEscobar = new ContaBancaria();
        ContaBancaria contaBancariaChiquinha = new ContaBancaria();

        contaBancariaChiquinha.saldo = 7500;
        contaBancariaEscobar.saldo = 1000;

        double valorEsperadoNaConta1 = 8250;
        double valorEsperadoNaConta2 = 1550;

        contaBancariaEscobar.depositar(550);
        contaBancariaChiquinha.depositar(750);

        Assert.assertEquals(valorEsperadoNaConta2, contaBancariaEscobar.saldo, 0.01);
        Assert.assertEquals(valorEsperadoNaConta1, contaBancariaChiquinha.saldo, 0.01);
    }

}


