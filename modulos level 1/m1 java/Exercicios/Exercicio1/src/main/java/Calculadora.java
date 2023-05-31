public class Calculadora {

    public double soma (double valor1, double valor2) {
        double resultadoDaSoma = valor1 + valor2;
        return resultadoDaSoma;
    }

    public double subtração (double valor1, double valor2) {
        double resultadoDaSubtração = valor1 - valor2;
        return resultadoDaSubtração;
    }

    public double multiplicação (double valor1, double valor2) {
        double resultadoDaMultiplicação = valor1 * valor2;
        return resultadoDaMultiplicação;
    }

    public double divisão (double valor1, double valor2) {
        double resultadoDaDivisão = valor1 / valor2;
        return resultadoDaDivisão;
    }

    public double exponenciação (double base, int expoente) {
        double resultadoExponenciação = Math.pow(base, expoente);
        return resultadoExponenciação;
    }

    public double raizQuadrada (double valor) {
        double resultadoRaizQuadrada = Math.sqrt(valor);
        return resultadoRaizQuadrada;
    }

    public double bhaskara(double a, double b, double c) {
        double resultadoBhaskara = 0;
        double delta = (Math.pow(b, 2) - (4 * a *c));
        if (delta < 0)
            System.out.println("Opção não implementada na calculadora");
        else if (delta == 0) {
            double xUnico = - b / (2 * a);
            resultadoBhaskara = 2 * xUnico;
        }
        else {
            double xUm;
            double xDois;

            xUm = (-b + Math.sqrt(delta))/ (2*a);
            xDois = (-b - Math.sqrt(delta))/ (2*a);
            resultadoBhaskara = xUm + xDois;
        }
        return  resultadoBhaskara;
    }

}
