import org.junit.Assert;
import org.junit.Test;

public class OperadoraTest {
    @Test
    public void deveAtualizarQuantidadeAparelhosConectadosQuandoUmAparelhoForConectado() {
        Operadora tim = new Operadora();
        GalaxyS20 ga = new GalaxyS20("celular roubado");
        tim.conectaAparelho(ga);

        int quantidadeDeAparelhosEsperados = 1;

        Assert.assertEquals(quantidadeDeAparelhosEsperados, tim.getQuantidadeDeAparelhosConectados());

    }

    @Test

    public void deveAtualizarQuantidadeAparelhosConectadosQuandoMaidDeUmAparelhoForConectado() {

        Operadora tim = new Operadora();
        GalaxyS20 ga = new GalaxyS20("celular roubado");
        GalaxyS20 la = new GalaxyS20("celular roubado");
        GalaxyS20 xy = new GalaxyS20("celular roubado");
        tim.conectaAparelho(ga);
        tim.conectaAparelho(la);
        tim.conectaAparelho(xy);

        int quantidadeDeAparelhosEsperados = 3;

        Assert.assertEquals(quantidadeDeAparelhosEsperados, tim.getQuantidadeDeAparelhosConectados());


    }
}


