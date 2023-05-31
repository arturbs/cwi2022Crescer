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
}
