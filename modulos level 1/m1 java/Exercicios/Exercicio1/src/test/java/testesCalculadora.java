import org.junit.Assert;
import org.junit.Test;

public class testesCalculadora {

    @Test
    public void deveSomarCorretamenteQuandoOsValoresForemInteiros() {
        //Arrange
        double valor1 = 6;
        double valor2 = 2;
        double valorEsperado = 8;
        Calculadora calculadora = new Calculadora();

        //Act
        double valorCalculado = calculadora.soma(valor1, valor2);

        //Assert
        Assert.assertEquals(valorEsperado, valorCalculado, 0.001);

    }
    @Test
    public void deveMultiplicarCorretamenteQuandoNumerosForemInteiros() {
        //Arrange
        double valor1 = 6;
        double valor2 = 2;
        double valorEsperado = 12;
        Calculadora calculadora = new Calculadora();

        //Act
        double valorCalculado = calculadora.multiplicação(valor1, valor2);

        //Assert
        Assert.assertEquals(valorEsperado, valorCalculado, 0.001);

    }
    @Test
    public void deveSubtrairCorretamenteQuandoOsValoresForemInteiros() {
        //Arrange
        double valor1 = 6;
        double valor2 = 2;
        double valorEsperado = 4;
        Calculadora calculadora = new Calculadora();

        //Act
        double valorCalculado = calculadora.subtração(valor1, valor2);

        //Assert
        Assert.assertEquals(valorEsperado, valorCalculado, 0.001);

    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosForemInteiros() {
        //Arrange
        double valor1 = 6;
        double valor2 = 2;
        double valorEsperado = 3;
        Calculadora calculadora = new Calculadora();

        //Act
        double valorCalculado = calculadora.divisão(valor1, valor2);

        //Assert
        Assert.assertEquals(valorEsperado, valorCalculado, 0.001);
    }

    @Test
    public void deveSomarCorretamenteQuandoOsValoresForemComPontosFlutuantes() {
        //Arrange
        double valor1 = 19.61;
        double valor2 = 5.30;
        double valorEsperado = 24.91;
        Calculadora calculadora = new Calculadora();

        //Act
        double valorCalculado = calculadora.soma(valor1, valor2);

        //Assert
        Assert.assertEquals(valorEsperado, valorCalculado, 0.001);

    }
    @Test
    public void deveMultiplicarCorretamenteQuandoNumerosPossuemPontosFlutuantes() {
        //Arrange
        double valor1 = 19.61;
        double valor2 = 5.30;
        double valorEsperado = 103.933;
        Calculadora calculadora = new Calculadora();

        //Act
        double valorCalculado = calculadora.multiplicação(valor1, valor2);

        //Assert
        Assert.assertEquals(valorEsperado, valorCalculado, 0.001);

    }
    @Test
    public void deveSubtrairCorretamenteQuandoOsValoresForemComPontosFlutuantes() {
        //Arrange
        double valor1 = 19.61;
        double valor2 = 5.30;
        double valorEsperado = 14.31;
        Calculadora calculadora = new Calculadora();

        //Act
        double valorCalculado = calculadora.subtração(valor1, valor2);

        //Assert
        Assert.assertEquals(valorEsperado, valorCalculado, 0.001);
    }


    @Test
    public void deveDividirCorretamenteQuandoNumerosPossuemPontosFlutuantes() {
        //Arrange
        double valor1 = 19.61;
        double valor2 = 5.30;
        double valorEsperado = 3.70;
        Calculadora calculadora = new Calculadora();

        //Act
        double valorCalculado = calculadora.divisão(valor1, valor2);

        //Assert
        Assert.assertEquals(valorEsperado, valorCalculado, 0.001);
    }

    @Test
    public void deveFazerRaizQuadradaCorretamenteQuandoNumerosForemInteiros() {
        //Arrange
        double valor = 25;
        double valorEsperado = 5;
        Calculadora calculadora = new Calculadora();

        //Act
        double valorCalculado = calculadora.raizQuadrada(valor);

        //Assert
        Assert.assertEquals(valorEsperado, valorCalculado, 0.001);
    }

    @Test
    public void deveFazerRaizQuadradaCorretamenteQuandoNumerosPossuemPontosFlutuantes() {
        //Arrange
        double valor = 12.96;
        double valorEsperado = 3.6;
        Calculadora calculadora = new Calculadora();

        //Act
        double valorCalculado = calculadora.raizQuadrada(valor);

        //Assert
        Assert.assertEquals(valorEsperado, valorCalculado, 0.001);
    }

    @Test
    public void deveFazerExponenciaçãoCorretamenteQuandoNumerosForemInteiros() {
        //Arrange
        double valor1 = 25;
        int valor2 = 3;
        double valorEsperado = 15625;
        Calculadora calculadora = new Calculadora();

        //Act
        double valorCalculado = calculadora.exponenciação(valor1, valor2);

        //Assert
        Assert.assertEquals(valorEsperado, valorCalculado, 0.001);
    }

    @Test
    public void deveFazerExponenciaçãoCorretamenteQuandoNumeroDaBasePossuePontoFlutuante() {
        //Arrange
        double valor1 = 196.2;
        int valor2 = 2;
        double valorEsperado = 38494.44;
        Calculadora calculadora = new Calculadora();

        //Act
        double valorCalculado = calculadora.exponenciação(valor1, valor2);

        //Assert
        Assert.assertEquals(valorEsperado, valorCalculado, 0.001);
    }

    @Test
    public void deveFazerBhaskaraCorretamenteQuandoDeltaForIgualAZero() {
        //Arrange
        double a = 1;
        double b = 12;
        double c = -13;
        double valorEsperado = -12;
        Calculadora calculadora = new Calculadora();

        //Act
        double valorCalculado = calculadora.bhaskara(a, b, c);

        //Assert
        Assert.assertEquals(valorEsperado, valorCalculado, 0.001);
    }

    @Test
    public void deveFazerBhaskaraCorretamenteQuandoDeltaForMaiorQueZero() {
        //Arrange
        double a = 4;
        double b = -4;
        double c = 1;
        double valorEsperado = 1;
        Calculadora calculadora = new Calculadora();

        //Act
        double valorCalculado = calculadora.bhaskara(a, b, c);

        //Assert
        Assert.assertEquals(valorEsperado, valorCalculado, 0.001);
    }

}
