import java.util.Scanner;

public class NomeIdade {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        String name = "";
        int idade = 0;

        while(true){

            System.out.println("Escreva seu nome: ");
            name = leitor.nextLine();

            if (name.equals("0")){
                break;
            }
            System.out.println("Escreva sua idade: ");
            idade = leitor.nextInt();

            leitor.nextLine();


        }

        leitor.close();

    }

}
