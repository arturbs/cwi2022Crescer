import org.junit.Test;

public class ArrayTest {

    @Test
    public void exemploArrayChar(){
        char[] nomePessoa = new char[8];
        nomePessoa[0] = 'f';
        nomePessoa[1] = 'e';
        nomePessoa[2] = 'r';
        nomePessoa[3] = 'n';
        nomePessoa[4] = 'a';
        nomePessoa[5] = 'n';
        nomePessoa[6] = 'd';
        nomePessoa[7] = 'o';
        for (int i = 0; i < nomePessoa.length; i++) {
            System.out.println(nomePessoa[i]);
        }
    }

    @Test
    public void exemploArrayInt() {
        int[] numerosMegaSena = new int[6];
        numerosMegaSena[0] = 6;
        numerosMegaSena[1] = 12;
        numerosMegaSena[2] = 19;
        numerosMegaSena[3] = 56;
        numerosMegaSena[4] = 44;
        numerosMegaSena[5] = 59;
        System.out.println(numerosMegaSena);
        for (int i = 0; i < numerosMegaSena.length; i++) {
            System.out.println(numerosMegaSena[i]);
        }
    }

    @Test
    public void exemploArrayString() {
        String[] nomeCompleto = new String[5];
        nomeCompleto[0] = "Artur";
        nomeCompleto[1] = " ";
        nomeCompleto[2] = "Brito";
        nomeCompleto[3] = " ";
        nomeCompleto[4] = "Souza";
        System.out.println(nomeCompleto);
        for (int i = 0; i < nomeCompleto.length; i++) {
            System.out.println(nomeCompleto[i]);
        }
    }

}
