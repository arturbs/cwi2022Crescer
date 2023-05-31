package relatorio;

import pessoa.Funcionario;
import pessoa.Gerente;
import pessoa.Vendedor;

public class Relatorio {
    public void imprimirDados(Funcionario funcionario) {
        System.out.println("Nome Funcionario: " + funcionario.getNome() + " | Salario: " + funcionario.getSalario() + " | Salario com bonificação: " + funcionario.getSalarioComBonificacao());
    }



}
