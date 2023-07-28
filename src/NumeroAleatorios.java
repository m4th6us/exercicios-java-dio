/*
 * Faça um programa que leia 20 números inteiro aleatórios (entre 0 e 100) armazene-os num vetor.
 * ao final mostre os números e seu sucessores
 */

import java.util.Arrays;
import java.util.Scanner;

public class NumeroAleatorios {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int[] arrayNumeros = new int[5];
        int[] arraySucessor = new int[5];

        for (int i = 0; i < arrayNumeros.length; i ++){

            System.out.println("Digite um número: ");
            arrayNumeros[i] = leitor.nextInt();

        }

        for (int i = 0; i < arrayNumeros.length; i ++) {

            arraySucessor[i] = arrayNumeros[i] + 1;

        }

        System.out.println("Seu array original: " + Arrays.toString(arrayNumeros));
        System.out.println("Seu array de sucessores: " + Arrays.toString(arraySucessor));
        leitor.close();

    }

}
