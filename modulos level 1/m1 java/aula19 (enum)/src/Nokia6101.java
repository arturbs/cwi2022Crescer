public class Nokia6101 extends Celular implements Camera{
    private final double CUSTO_ENERGETICO_FOTOGRAFAR = 2;
    private boolean cameraAtiva;

    public Nokia6101(String nome) {
        super(nome, TipoAparelho.COMUM);
    }

    @Override
    public void conectarOperadora() {
        this.conectadoOperadora = true;
    }

    @Override
    public void desconectarOperadora() {
        this.conectadoOperadora = false;
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
