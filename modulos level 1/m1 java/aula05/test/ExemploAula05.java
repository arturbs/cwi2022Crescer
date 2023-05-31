import org.junit.Assert;
import org.junit.Test;

public class ExemploAula05 {
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
        final double PI = 3.14159;
        double area = PI * raio * raio;
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

    @Test
    public void operadoresAritimeticos() {
        System.out.println(2 + 2);

        int soma = 2 + 2;
        System.out.println("Imprimindo a soma " + soma);

        int subtracao = 2 - 2;
        System.out.println("Imprimindo a subtração " + subtracao);

        System.out.println("Imprimindo os operadores aritiméticos com inteiros");
        int a = 6;
        int b = 65;
        System.out.println("soma " + a + b);
        System.out.println(a - b);
        System.out.println("multiplicação " + a * b);
        System.out.println("divisão " + a / b);
        System.out.println("modulo " + a % b);

        System.out.println("Imprimindo os operadores aritiméticos com double");
        double c = 3.2;
        double d = 2.1;
        System.out.println("soma " + c + d);
        System.out.println(c - d);
        System.out.println("multiplicação " + c * d);
        System.out.println("divisão " + c / d);
        System.out.println("modulo " + c % d);
    }

    @Test
    public void deveSomarCorretamenteQuandoOsNumerosForemInterios() {
        //triple A -> AAA (Arrange, Act, Assert)

        ///Arrange
        int a = 8;
        int b = 2;
        int resultadoEsperado = 10;

        //Act
        int soma = a + b;

        //Assert
        Assert.assertEquals(resultadoEsperado, soma);
    }

    @Test
    public void  delta() {
        //Arrange
        double a = 1.5;
        double b = 2;
        double resultadoEsperado = 3.5;

        //Act
        double soma = a + b;

        //Assert
        Assert.assertEquals(resultadoEsperado, soma, 0);
    }

    @Test
    public void  testDelta() {
        //Arrange
        double pi = 3.14159;
        double valorComparacao = 3.14;

        //Assert
        Assert.assertEquals(pi, valorComparacao, 0.01);
    }

    @Test
    public void operadoresLogicos() {

        boolean umEhMaiorQueZero = 1 > 0;
        boolean umEhMaiorQueMenosUm = 1 > -1;
        boolean umEhMaiorQueDois = 1 > 2;
        boolean umEhMaiorQueUm = 1 > 1;

        //TABELA DA VERDADE E (AND) - CONDIÇÃO E CONDIÇÃO
        System.out.println("TABELA DA VERDADE E (AND) - CONDIÇÃO E CONDIÇÃO");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println(umEhMaiorQueZero && umEhMaiorQueMenosUm);
        System.out.println(umEhMaiorQueZero && umEhMaiorQueDois);
        System.out.println(umEhMaiorQueZero && umEhMaiorQueMenosUm && umEhMaiorQueDois);
        System.out.println(umEhMaiorQueDois && umEhMaiorQueUm);





        //TABELA DA VERDADE OU (OR) - CONDIÇÃO OU CONDIÇÃO
        System.out.println("TABELA DA VERDADE OU (OR) - CONDIÇÃO OU CONDIÇÃO");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println(umEhMaiorQueZero || umEhMaiorQueMenosUm);
        System.out.println(umEhMaiorQueZero || umEhMaiorQueDois);
        System.out.println(umEhMaiorQueZero || umEhMaiorQueMenosUm || umEhMaiorQueDois);
        System.out.println(umEhMaiorQueDois || umEhMaiorQueUm);

        //TABELA DA VERDADE OU EXCLUSIVO (XOR) - CONDIÇÃO OU CONDIÇÃO
        System.out.println("TABELA DA VERDADE OU EXCLUSIVO (XOR) - CONDIÇÃO XOR CONDIÇÃO");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
        System.out.println(umEhMaiorQueZero ^ umEhMaiorQueMenosUm);
        System.out.println(umEhMaiorQueZero ^ umEhMaiorQueDois);
        System.out.println(umEhMaiorQueZero ^ umEhMaiorQueMenosUm ^ umEhMaiorQueDois);
        System.out.println(umEhMaiorQueDois ^ umEhMaiorQueUm);

        //TABELA DA VERDADE NEGAÇÃO (NOT)
        System.out.println("TABELA DA VERDADE NEGAÇÃO (NOT)");
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!umEhMaiorQueMenosUm);
        System.out.println(!umEhMaiorQueDois);
    }

}


