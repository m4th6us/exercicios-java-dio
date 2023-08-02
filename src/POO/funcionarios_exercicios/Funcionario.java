package funcionarios_exercicios;

public class Funcionario {
    
    String nome, cpf, funcao;
    double salario;

    Funcionario(String nome, String cpf, double salario, String funcao) {

        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.funcao = funcao;

    }

    public void funcaoFuncionario() {

        System.out.println("A função do funcionário é: " + this.funcao);

    }

    public void salarioFuncionario() {

        System.out.println("O salário do funcionário é: " + this.salario);

    }


}
