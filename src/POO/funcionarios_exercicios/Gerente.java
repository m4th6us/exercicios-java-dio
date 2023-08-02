package funcionarios_exercicios;

public class Gerente extends Funcionario {
    

    String horario;

    Gerente(String nome, String cpf, double salario, String funcao, String horario) {

        super(nome, cpf, salario, funcao);

        this.horario = horario;
    }

    public static void main(String[] args) {
        
        Gerente gerente = new Gerente("Roberto", "38473938", 2000, "Gerente", "12-18");

        gerente.funcaoFuncionario();
        gerente.salarioFuncionario();
        gerente.horarioGerente();

    }

    public void horarioGerente() {

        System.out.println("O horário do Gerente é: " + this.horario);

    }


}
