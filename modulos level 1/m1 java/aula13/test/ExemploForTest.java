import org.junit.Test;

import java.math.BigInteger;

public class ExemploForTest {
    @Test
    public void  exemploForBasico() {
        for (int indice = 1; indice <= 5; indice++) {
            System.out.println(indice);
        }


    }

    @Test
    public void exemploForArrayChar(){
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

    //yes
    @Test
    public void infinitoQuestionMark() {
        BigInteger infinito = BigInteger.ZERO;
        for(;;) {
            infinito = infinito.add(BigInteger.ONE);
            System.out.println(infinito);
        }
    }


}
