import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ExemploListaTest {
    @Test
    public void criaLista() {
        List<String> nomes = new ArrayList<String>();
        nomes.add("Artur");
        nomes.add("Brito");
        nomes.add("Souza");
        System.out.println(nomes.size());
    }

    @Test
    public void imprimeLista() {
        List<String> nomes = new ArrayList<String>();
        nomes.add("Artur");
        nomes.add("Brito");
        nomes.add("Souza");
        System.out.println("Tamanho da lista: " + nomes.size());

        System.out.println("Imprimindo via for tradicional");
        for (int d = 0; d < nomes.size(); d++) {
            System.out.print(nomes.get(d) + " ");
        }

        System.out.println(" ");
        System.out.println("Imprimindo via for each");
        for (String nome : nomes) {
            System.out.print(nome + " ");
        }
    }

    @Test
    public void excluiLista() {
        List<String> nomes = new ArrayList<String>();
        nomes.add("Artur");
        nomes.add("Brito");
        nomes.add("Souza");
        System.out.println("Tamanho da lista: " + nomes.size());

        System.out.println(" ");
        System.out.println("Imprimindo via for each");
        for (String nome : nomes) {
            System.out.print(nome + " ");
        }

        nomes.remove(1);

        System.out.println("Tamanho da lista: " + nomes.size());

        System.out.println(" ");
        System.out.println("Imprimindo via for each");
        for (String nome : nomes) {
            System.out.print(nome + " ");
        }

    }
}
