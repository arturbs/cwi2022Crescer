import org.junit.Assert;
import org.junit.Test;

public class CelularTest {

    @Test
    public void deveReduzirONivelDaBateriaQuandoEfetuarUmaChamada() {

        Celular nokia = new GalaxyS20("galaxy baby");
        double nivelDeBateriaEsperado = 90;

        nokia.chamar();

        Assert.assertEquals(nivelDeBateriaEsperado, nokia.getNivelBateria(), 0.01);

    }

    @Test
    public void deveReduzirProporcionalmenteONivelDaBateriaQuandoEfetuarMaisUmaChamada() {

        Celular nokia = new Nokia6101("nokia 6101");
        double nivelDeBateriaEsperado = 80;

        nokia.chamar();
        nokia.chamar();

        Assert.assertEquals(nivelDeBateriaEsperado, nokia.getNivelBateria(), 0.01);
    }

    @Test
    public void deveConsumirBateriaQuandoChamarGastarEnergiaBateria() {
        Celular nokia = new Nokia6101("nokia");
        double nivelBateriaEsperado = 55;

        nokia.gastaEnergiaBateria(45);

        Assert.assertEquals(nivelBateriaEsperado, nokia.getNivelBateria(), 00.1);
    }

    @Test(expected = NivelCriticoDaBateriaException.class)
    public void deveManterNivelDaBateriaSeNivelDaBateriaEstiverAbaixoDoNivelCritico() {
        Celular nokia = new Nokia6101("nokia");
        double nivelBateriaEsperado = 4;

        nokia.gastaEnergiaBateria(96);
        nokia.gastaEnergiaBateria(52);

        Assert.assertEquals(nivelBateriaEsperado, nokia.getNivelBateria(), 00.1);
    }

    @Test(expected = NivelCriticoDaBateriaException.class)
    public void deveNegarOperacaoSeNivelDaBateriaEstiverAbaixoDoNivelCritico() {
        Nokia6101 nokia = new Nokia6101("nokia");
        nokia.gastaEnergiaBateria(96);
        nokia.capturarUmaImagem();


    }

}
