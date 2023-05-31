import org.junit.Test;

public class ExemploAula02 {
    @Test
    public void  exemploVariavel() {
        //imprimindo numero
        System.out.println(25);

        /*
        a variavel do tipo inteiro idade deve ter valor 29
        */
        int idade = 29;

        // imprimindo a idade
        System.out.println(idade);
    }

    @Test
    public void  exemploCalculoAreaQuadrado() {
        int ladoA = 5;
        int ladoB = 7;
        int area = ladoA * ladoB;
        System.out.println(area);
    }

    @Test
    public void exemploCalculoAreaCirculo() {
        double raio = 7.1;
        double pi = 3.14159;
        double area = pi * raio * raio;
        System.out.println(area);
    }

    @Test
    public void  exemploBoolean() {
        boolean informacao = true;
        System.out.println(informacao);

        boolean umEMaiorQueZero = 1 > 0;
        System.out.println(umEMaiorQueZero);
    }

    @Test
    public void exemploChar() {
        char primeiraLetraDoNome = 'A';
        System.out.println(primeiraLetraDoNome);
    }

    @Test
    public void  copiaValoresEntreVariaveisPrimitivas() {
        int i = 5;
        int j = i;
        System.out.println(i);
        System.out.println(j);

        i = 3;
        System.out.println(i);
        System.out.println(j);
    }

    @Test
    public void castVariaveisPrimitivas() {
        double pi = 3.14159;
        int piInteiro = (int) pi;
        System.out.println(pi);
        System.out.println(piInteiro);

        int variavelInteira = 4;
        double variavelFlutuante = variavelInteira;
        System.out.println(variavelInteira);
        System.out.println(variavelFlutuante);
    }

    @Test
    public void texto() {
        System.out.println("Artur");

        String meuNome = "Artur Brito Souza";
        System.out.println(meuNome);
    }




}
