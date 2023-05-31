import org.junit.Assert;
import org.junit.Test;

public class CelularTest {

    @Test
    public void deveReduzirONivelDaBateriaQuandoEfetuarUmaChamada() {

        Celular nokia = new Celular("nokia 6969");
        double nivelDeBateriaEsperado = 90;

        nokia.chamar();

        Assert.assertEquals(nivelDeBateriaEsperado, nokia.getNivelBateria(), 0.01);

    }

    @Test
    public void deveReduzirProporcionalmenteONivelDaBateriaQuandoEfetuarMaisUmaChamada() {

        Celular nokia = new Celular("nokia 6969");
        double nivelDeBateriaEsperado = 80;

        nokia.chamar();
        nokia.chamar();

        Assert.assertEquals(nivelDeBateriaEsperado, nokia.getNivelBateria(), 0.01);
    }
}
