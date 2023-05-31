package pessoa;

public class Vendedor extends Funcionario{
    private int quantidadDeVendas;
    public Vendedor(String nome, String cpf, String rg, double renda, double salario, String idFuncionario, int quantidadDeVendas) {
        super(nome, cpf, rg, renda, salario, idFuncionario);
        this.quantidadDeVendas = quantidadDeVendas;
    }

    public int getQuantidadDeVendas() {
        return quantidadDeVendas;
    }

    public void setQuantidadDeVendas(int quantidadDeVendas) {
        this.quantidadDeVendas = quantidadDeVendas;
    }
}
