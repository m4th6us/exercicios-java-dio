/*
 * Faça um programa que peça uma nota, entre zero e dez.
 * Mostre uma mensagem caso o valor seja inválido
 * e continue pedindo
 * até que o usuário informe um valor válido
 */

import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);

        int nota;

        System.out.println("Digite uma nota: ");
        nota = leitor.nextInt();

        while ((nota < 0 || nota >10)){
            System.out.println("Opa nota inválida, digite novamente ....");
            nota = leitor.nextInt();
        }

        System.out.println("Finalizando programa ...");

        leitor.close();
    }
    
}
