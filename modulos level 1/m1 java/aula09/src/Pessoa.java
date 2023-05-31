public class Pessoa {
    private String nome;
    private int idade ;
    private double altura;
    private char sexo;
    private boolean possuiDeficiecncia;

    public Pessoa (String nome, int idade, double altura, char sexo, boolean possuiDeficiecncia) {
        this.altura = altura;
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
        this.possuiDeficiecncia = possuiDeficiecncia;
    }

    public void apresentarsse() {
        System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos. Minha altura é "
                + altura + " e eu sou do sexo " + sexo + ((possuiDeficiecncia)?". Eu possuo deficiencia.":". Eu " +
                "não possuo deficiencia"));



    }





}
