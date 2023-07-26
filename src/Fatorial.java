/*
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 * Ex: 5! = 120
 */

import java.util.Scanner;

public class Fatorial {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um numero para obter seu fatorial: ");

        int numero = leitor.nextInt();
        int numeroDecrementado = 0;
        int fatorial = 0;

        numeroDecrementado = numero;


        for(int i=1; i < numero; i ++){

            fatorial += numeroDecrementado * i;
            numeroDecrementado = fatorial;
            System.out.println("numero: " + fatorial);

        }
        System.out.println("O fatorial é: " + fatorial);
        leitor.close();

    }

}
