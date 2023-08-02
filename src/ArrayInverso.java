/*
 * Faça um programa que pegue um array e inverta sua ordem.
 * 
 */

import java.util.Arrays;


public class ArrayInverso{

    public static void main(String[] args) {
        int[] arrayNumeros = {1, 4, 7};
        int[] arrayInvertido = new int[arrayNumeros.length];

        for (int i = arrayNumeros.length - 1; i >= 0; i--) {
            int indiceInvertido = arrayNumeros.length - 1 - i;
            arrayInvertido[indiceInvertido] = arrayNumeros[i];
        }

        System.out.println("Array original: " + Arrays.toString(arrayNumeros));
        System.out.println("Array invertido: " + Arrays.toString(arrayInvertido));
    }

}