/*
 * Desenvolva um gerador de tabuadas,
 * capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10.
 * O usuário deve informar de qual numero ele deseja ver a tabuada.
 * A saída deve ser conforme exemplo abaixo:
 * 
 * Tabuada de 5:
 * 5 X 1 = 5
 * 5 X 2 = 10
 * ...
 * 5 X 10 = 50
 */

import java.util.Scanner;

public class Tabuada {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        int count = 1;
        int numero = 0;

        System.out.println("[============PROGRAMA DE TABUADA=============]");
        System.out.println("Coloque o número para descobrir sua tabuada até o 10: ");

        numero = leitor.nextInt();

        while (count <= 10){

            System.out.println(numero + " X " + count + " = " + (numero * count));

            count ++;
        }


        leitor.close();

    }

}
