package pessoa;

public class Funcionario extends Pessoa{
    private double salario;
    private String idFuncionario;
    private double cargaHoraria;
    public static final double PERCENTUAL_PADRAO_BONIFICACAO = 10;
    public static final double CARGA_HORARIA_PADRAO = 240;
    final double CEM = 100;

    public Funcionario(String nome, String cpf, String rg, double renda, double salario, String idFuncionario, double CARGA_HORARIA_PADRAO) {
        super(nome, cpf, rg, renda);
        this.salario = salario;
        this.idFuncionario = idFuncionario;
        this.cargaHoraria = cargaHoraria;
    }

    public Funcionario(String nome, String cpf, String rg, double renda, double salario, String idFuncionario) {
        super(nome, cpf, rg, renda);
        this.salario = salario;
        this.idFuncionario = idFuncionario;
        this.cargaHoraria = CARGA_HORARIA_PADRAO;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getIdFuncionario() {
        return idFuncionario;
    }


    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getSalarioComBonificacao() {

        double salarioComBonificacao = this.getSalario() + this.getSalario() * (PERCENTUAL_PADRAO_BONIFICACAO/ CEM);
        return salarioComBonificacao;
    }
}
