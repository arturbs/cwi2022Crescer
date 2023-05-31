public class Celular {

    private final double NIVEL_INICIAL_BATERIA = 100;
    private final double CUSTO_ENERGETICO_LIGACAO = 10;
    private String nome;
    protected double nivelBateria;

    public Celular(String  nome) {
        this.nome = nome;
        this.nivelBateria = NIVEL_INICIAL_BATERIA;
    }

    public void chamar() {
        this.nivelBateria -= CUSTO_ENERGETICO_LIGACAO;

    }

    public String getNome() {
        return nome;
    }

    public double getNivelBateria() {
        return nivelBateria;
    }

    public void gastaEnergiaBateria(double energiaGasta) {
         this.nivelBateria -= energiaGasta;
    }

}
