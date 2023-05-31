package pessoa;

public class Gerente extends  Funcionario{
    private  boolean gerenteRegional;


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
}
