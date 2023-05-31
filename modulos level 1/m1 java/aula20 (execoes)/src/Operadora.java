import java.util.ArrayList;
import java.util.List;

public class Operadora {

    private List<Celular> aparelhosComunsConectados;
    private List<Celular> aparelhosSmartsConectados;

    public  Operadora() {
        this.aparelhosComunsConectados = new ArrayList<Celular>();
        this.aparelhosSmartsConectados = new ArrayList<Celular>();
    }

    public void conectaAparelho(Celular celular) {
        switch (celular.getTipoAparelho()) {
            case COMUM:
                aparelhosComunsConectados.add(celular);
                break;
            case SMARTPHONE:
                aparelhosSmartsConectados.add(celular);
                break;
        }
    }

    public int getQuantidadeDeAparelhosConectados() {
        return (aparelhosComunsConectados.size() + aparelhosSmartsConectados.size());
    }
}
