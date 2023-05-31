public class CalculadorComissao {
    //Qual o problema ? Criar um sistema que calcule a comissão de um vendedor a partir do valor da venda.
    //quais são os dados nescessários ? Informações do valor da venda e da % da comissão.
    // Quais as operações nescessárias ? calcular pela formula -> (valorVendido * percentualComissao) / 100

    double valorVenda;
    double percentualComissao;

    public double calcularValorComissao(double valorVenda, double percentualComissao) {
        double valorFinalDaComissao = (valorVenda * percentualComissao) / 100;
        return valorFinalDaComissao;
    }

}
