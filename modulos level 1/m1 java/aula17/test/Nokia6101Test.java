import org.junit.Assert;
import org.junit.Test;

public class Nokia6101Test {

    @Test
    public void deveAtivarCameraQuandoAcionada() {
        Nokia6101 nokia = new Nokia6101("Nokia de pedro");
        nokia.ativarCamera();
        Assert.assertTrue(nokia.isCameraAtiva());

    }

    @Test
    public void deveDesativarCameraQuandoEncerrada() {
        Nokia6101 nokia = new Nokia6101("Nokia de pedro");
        nokia.desativarCamera();
        Assert.assertFalse(nokia.isCameraAtiva());
    }

    @Test
    public void deveAtualizarNivelDeBateriaQuandoCapturarUmaFoto() {
        Nokia6101 nokia = new Nokia6101("Nokia de pedro");
        nokia.capturarUmaImagem();

        double nivelDeBateriaEsperado = 98;

        Assert.assertEquals(nivelDeBateriaEsperado, nokia.getNivelBateria(), 0.01);

    }

    @Test
    public void deveAtualizarNivelDeBateriaProporcionalmenteQuandoCapturarMaidDeUmaFoto() {

        Nokia6101 nokia = new Nokia6101("Nokia de pedro");
        nokia.capturarUmaImagem();
        nokia.capturarUmaImagem();
        nokia.capturarUmaImagem();

        double nivelDeBateriaEsperado = 94;

        Assert.assertEquals(nivelDeBateriaEsperado, nokia.getNivelBateria(), 0.01);
    }
}
