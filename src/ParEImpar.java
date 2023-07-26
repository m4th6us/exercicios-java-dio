
import java.util.Scanner;


public class ParEImpar {
    
    /*
    * Faça um programa que peça N numeros inteiros,
    * calcule e mostre a quantidade de números pares
    * e a quantidade de números impares
    */
    public static void main(String[] args) {

        System.out.println("[PROGRAMA PARA IMPRIMIR PARES E IMPARES]");
        
        Scanner leitor = new Scanner(System.in);

        int count = 0;
        int numero = 0;
        int pares = 0;
        int impares = 0;

        while (count < 5){

            System.out.println("Digite um número: ");
            numero = leitor.nextInt();
            
            if (numero % 2 == 0){
                pares += 1;
            }
            else {
                impares += 1;
            }
            
            count ++;
        };

        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de impares: " + impares);
        System.out.println("Finalizando programa ...");
        leitor.close();

    }

}
