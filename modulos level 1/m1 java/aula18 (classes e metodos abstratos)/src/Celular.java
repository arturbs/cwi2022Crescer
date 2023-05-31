public abstract class Celular {

    private final double NIVEL_INICIAL_BATERIA = 100;
    private final double CUSTO_ENERGETICO_LIGACAO = 10;
    private String nome;
    protected double nivelBateria;
    protected boolean conectadoOperadora;

    public Celular(String  nome) {
        this.nome = nome;
        this.nivelBateria = NIVEL_INICIAL_BATERIA;
    }

    public void chamar() {
        this.nivelBateria -= CUSTO_ENERGETICO_LIGACAO;

    }

    public abstract void conectarOperadora();

    public abstract void desconectarOperadora();

    public String getNome() {
        return nome;
    }

    public double getNivelBateria() {
        return nivelBateria;
    }

    public void gastaEnergiaBateria(double energiaGasta) {
         this.nivelBateria -= energiaGasta;
    }

    public boolean isConectadoOperadora() {
        return conectadoOperadora;
    }
}
