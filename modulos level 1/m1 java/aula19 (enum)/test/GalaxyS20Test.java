import org.junit.Assert;
import org.junit.Test;

public class GalaxyS20Test  {

    @Test
    public void deveAtivarWifiQuandoAcionada() {
        GalaxyS20 galaxyS20 = new GalaxyS20("samsung de Laura");
        galaxyS20.ativarWifi();
        Assert.assertTrue(galaxyS20.isWifiAtiva());

    }

    @Test
    public void deveDesativarWifiQuandoEncerrada() {
        GalaxyS20 galaxyS20 = new GalaxyS20("samsung de Laura");
        galaxyS20.desativarWifi();
        Assert.assertFalse(galaxyS20.isWifiAtiva());
    }

    @Test
    public void deveAtivarDadosMoveisQuandoAcionado() {
        GalaxyS20 galaxyS20 = new GalaxyS20("samsung de Laura");
        galaxyS20.ativarDadosMoveis();
        Assert.assertTrue(galaxyS20.isDadosMoveisAtivo());

    }

    @Test
    public void deveDesativarDadosMoveisQuandoEncerrado() {
        GalaxyS20 galaxyS20 = new GalaxyS20("samsung de Laura");
        galaxyS20.desativarDadosMoveis();
        Assert.assertFalse(galaxyS20.isDadosMoveisAtivo());
    }

    @Test
    public void deveAtualizarNivelDeBateriaQuandoConsumirDados() {
        GalaxyS20 galaxyS20 = new GalaxyS20("samsung de Laura");
        galaxyS20.consumirDadosInternet();

        double nivelDeBateriaEsperado = 95;

        Assert.assertEquals(nivelDeBateriaEsperado, galaxyS20.getNivelBateria(), 0.01);

    }

    @Test
    public void deveAtualizarNivelDeBateriaProporcionalmenteQuandoConsumirDadosMaidDeUmaVez() {

        GalaxyS20 galaxyS20 = new GalaxyS20("samsung de Laura");
        galaxyS20.consumirDadosInternet();
        galaxyS20.consumirDadosInternet();
        galaxyS20.consumirDadosInternet();
        galaxyS20.consumirDadosInternet();
        galaxyS20.consumirDadosInternet();


        double nivelDeBateriaEsperado = 75;

        Assert.assertEquals(nivelDeBateriaEsperado, galaxyS20.getNivelBateria(), 0.01);
    }

    @Test
    public void deveAtivarCameraQuandoAcionada() {
        GalaxyS20 galaxyS20 = new GalaxyS20("samsung de Laura");
        galaxyS20.ativarCamera();
        Assert.assertTrue(galaxyS20.isCameraAtiva());

    }

    @Test
    public void deveDesativarCameraQuandoEncerrada() {
        GalaxyS20 galaxyS20 = new GalaxyS20("samsung de Laura");
        galaxyS20.desativarCamera();
        Assert.assertFalse(galaxyS20.isCameraAtiva());
    }

    @Test
    public void deveAtualizarNivelDeBateriaQuandoCapturarUmaFoto() {
        GalaxyS20 galaxyS20 = new GalaxyS20("samsung de Laura");
        galaxyS20.capturarUmaImagem();

        double nivelDeBateriaEsperado = 97;

        Assert.assertEquals(nivelDeBateriaEsperado, galaxyS20.getNivelBateria(), 0.01);

    }

    @Test
    public void deveAtualizarNivelDeBateriaProporcionalmenteQuandoCapturarMaidDeUmaFoto() {

        GalaxyS20 galaxyS20 = new GalaxyS20("samsung de Laura");
        galaxyS20.capturarUmaImagem();
        galaxyS20.capturarUmaImagem();
        galaxyS20.capturarUmaImagem();

        double nivelDeBateriaEsperado = 91;

        Assert.assertEquals(nivelDeBateriaEsperado, galaxyS20.getNivelBateria(), 0.01);
    }

    @Test
    public void deveConectarNaOperadoraQuandoAcionado() {
        GalaxyS20 galaxyS20 = new GalaxyS20("samsung de Laura");
        galaxyS20.conectarOperadora();

        Assert.assertTrue(galaxyS20.isConectadoOperadora());
    }

    @Test
    public void deveDesconectarNaOperadoraQuandoAcionado() {
        GalaxyS20 galaxyS20 = new GalaxyS20("samsung de Laura");
        galaxyS20.desconectarOperadora();

        Assert.assertFalse(galaxyS20.isConectadoOperadora());
    }
}
