import org.junit.Assert;
import org.junit.Test;
import pessoa.Funcionario;
import pessoa.Gerente;
import pessoa.Vendedor;
import relatorio.Relatorio;

public class RelatorioTest {

    @Test
    public void exemplo() {
        //arrange
        Funcionario ferrero = new Funcionario("Ferrero", "08895638764", "113946-99", 10000.0, 8000, "40555", 40.0);

        Gerente alfredo = new Gerente("alfredo", "08895638764", "113946-99", 30000.0, 18000, "40555", true);

        Vendedor luciuz = new Vendedor("luciuz", "08895638764", "113946-99", 25000.0, 12000, "40555", 600);

        Relatorio relatorio = new Relatorio();
        relatorio.imprimirDados(ferrero);
        relatorio.imprimirDados(alfredo);
        relatorio.imprimirDados(luciuz);


    }
}
