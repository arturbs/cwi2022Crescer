import org.junit.Test;

public class ExemploWhileTest {


    @Test
    public void  exemploWhileDeterminado() {
        // Com for
        for (int indice = 1; indice <= 5; indice++) {
            System.out.println(indice);
        }
        // Com while
        int indiceWhile = 0;
        while (indiceWhile < 5) {
            System.out.println(indiceWhile);
            indiceWhile++;
        }
    }

    @Test
    public void  exemploWhileIndeterminado() {
        //sequencia fibonnaci

        int valorMaximo = 1000;
        int ant1 = 0;
        int ant2 = 1;
        int prox = 0;

        while ((prox < valorMaximo)) {
            System.out.println(" - " + ant2);
            prox = ant1 + ant2;
            ant1 = ant2;
            ant2 = prox;
        }

    }

}
