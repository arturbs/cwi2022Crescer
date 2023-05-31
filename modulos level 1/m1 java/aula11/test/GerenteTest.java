import org.junit.Assert;
import org.junit.Test;
import pessoa.Funcionario;
import pessoa.Gerente;

public class GerenteTest  {

    @Test
    public void deveCalcularSalarioComBonusPadraoQuandoNaoForGerenteRegional() {

        //arrange
        Funcionario ferrero = new Funcionario("Ferrero", "08895638764", "113946-99", 10000.0, 8000, "40555", 40.0);
        double salarioComBonificacaoEsperadoFerrero = 8800.0;

        Funcionario rocshe = new Gerente("rocshe", "08895638764", "113946-99", 10000.0, 1000, "40555", false);
        double salarioComBonificacaoEsperadoRocshe = 1100.0;

        //act
        double salarioComBonificacaoFerrero = ferrero.getSalarioComBonificacao();
        double salarioComBonificacaoRocshe = rocshe.getSalarioComBonificacao();

        //assert
        Assert.assertEquals(salarioComBonificacaoEsperadoFerrero, salarioComBonificacaoFerrero, 0.001);
        Assert.assertEquals(salarioComBonificacaoEsperadoRocshe, salarioComBonificacaoRocshe, 0.001);
    }

    @Test
    public void deveCalcularSalarioComBonusDeGerenteQuandoForGerenteRegional() {

        //arrange
        Funcionario ferrero = new Gerente("Ferrero", "08895638764", "113946-99", 10000.0, 8000, "40555", true);
        double salarioComBonificacaoEsperado = 9600.0;

        //act
        double salarioComBonificacao = ferrero.getSalarioComBonificacao();

        //assert
        Assert.assertEquals(salarioComBonificacaoEsperado, salarioComBonificacao, 0.001);

    }
}
