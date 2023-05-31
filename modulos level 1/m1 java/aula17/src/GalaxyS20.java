public class GalaxyS20 extends Celular implements ConexaoInternet, Camera{
    private boolean wifiAtiva;
    private boolean dadosMoveisAtivo;
    private double dadosInternet;
    private boolean cameraAtiva;

    private final double CUSTO_ENERGETICO_FOTOGRAFAR = 3;
    private final double CUSTO_ENERGETICO_CONSUMIR_DADOS = 5;

    public GalaxyS20(String nome) {
        super(nome);
    }

    @Override
    public void ativarWifi() {
        this.wifiAtiva = true;

    }

    @Override
    public void desativarWifi() {
        this.wifiAtiva = false;
    }

    @Override
    public void ativarDadosMoveis() {
        this.dadosMoveisAtivo = true;

    }

    @Override
    public void desativarDadosMoveis() {
        this.dadosMoveisAtivo = false;

    }

    @Override
    public void consumirDadosInternet() {
        this.gastaEnergiaBateria(CUSTO_ENERGETICO_CONSUMIR_DADOS);
    }

    public boolean isWifiAtiva() {
        return wifiAtiva;
    }

    public boolean isDadosMoveisAtivo() {
        return dadosMoveisAtivo;
    }

    public double getDadosInternet() {
        return dadosInternet;
    }

    @Override
    public void ativarCamera() {
        cameraAtiva = true;
    }

    @Override
    public void desativarCamera() {
        cameraAtiva = false;
    }

    @Override
    public void capturarUmaImagem() {
        this.gastaEnergiaBateria(CUSTO_ENERGETICO_FOTOGRAFAR);

    }

    public boolean isCameraAtiva() {
        return cameraAtiva;
    }
}
