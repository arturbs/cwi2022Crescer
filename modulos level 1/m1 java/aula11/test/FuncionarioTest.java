import org.junit.Assert;
import org.junit.Test;
import pessoa.Funcionario;
import pessoa.Gerente;
import pessoa.Vendedor;

public class FuncionarioTest {
    //deve calcular o salario com acrescimo de 10 %  quando consutado salario com bonificação
    @Test
    public void deveCalcularSalarioAcrescidoDe10PorcentoQuandoConsultadoOSalarioComBonificacao() {
        //arrange
        Funcionario ferrero = new Funcionario("Ferrero", "08895638764", "113946-99", 10000.0, 8000, "40555", 40.0);
        double salarioComBonificacaoEsperado = 8800.0;

        //act
        double salarioComBonificacao = ferrero.getSalarioComBonificacao();

        //assert
        Assert.assertEquals(salarioComBonificacaoEsperado, salarioComBonificacao, 0.001);
    }

    @Test
    public void exemploVendedor() {}
    Vendedor klever = new Vendedor ("klever", "87654378944", "75849039", 5000, 3000, "463738", 75);

    @Test
    public void deveCalcularSalarioCorretamenteQuandoOBonusForDinamico() {
        //arrange
        Funcionario ferrero = new Funcionario("Ferrero", "08895638764", "113946-99", 10000.0, 8000, "40555", 40.0);
        double salarioComBonificacaoEsperado = 10000.0;

        //act
        double salarioComBonificacao = ferrero.getSalarioComBonificacao(25);

        //assert
        Assert.assertEquals(salarioComBonificacaoEsperado, salarioComBonificacao, 0.001);

    }

    @Test
    public void exemploGerente() {}
    Funcionario kleber = new Gerente("kleber", "87654378944", "75849039", 5000, 3000, "463738", true);

}
