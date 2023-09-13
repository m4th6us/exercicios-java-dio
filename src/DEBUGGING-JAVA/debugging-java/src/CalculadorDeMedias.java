import java.util.Scanner;

public class CalculadorDeMedias {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        int media = CalcumaMediaTurma(alunos, scanner);
        
        System.out.println("Média da turma: " + media);

    }

    public static int CalcumaMediaTurma(String[] alunos, Scanner scanner){

        int soma = 0;
        for (String aluno: alunos){
            System.out.printf("Nota do aluno %s: ", aluno);
            int nota = scanner.nextInt();
            soma += nota;
        }

        return soma / alunos.length;

    }

}
