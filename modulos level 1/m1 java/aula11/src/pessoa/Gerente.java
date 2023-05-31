package pessoa;

public class Gerente extends  Funcionario{
    private  boolean gerenteRegional;
    public static final double PERCENTUAL_PADRAO_BONIFICACAO_GERENTE = 20;



    public Gerente(String nome, String cpf, String rg, double renda, double salario, String idFuncionario, boolean gerenteRegional) {
        super(nome, cpf, rg, renda, salario, idFuncionario);
        this.gerenteRegional = gerenteRegional;
    }

    public boolean isGerenteRegional() {
        return gerenteRegional;
    }

    public void setGerenteRegional(boolean gerenteRegional) {
        this.gerenteRegional = gerenteRegional;
    }

    public double getSalarioComBonificacao() {

        if (isGerenteRegional()) {
            double salarioComBonificacao = this.getSalario() + this.getSalario() * (PERCENTUAL_PADRAO_BONIFICACAO_GERENTE/ CEM);
            return salarioComBonificacao;
        }
        double salarioComBonificacao = super.getSalarioComBonificacao();
        return salarioComBonificacao;
    }
}
