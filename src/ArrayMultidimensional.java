/*
 * Gere e imprima uma matriz 4x4 com valores aleatórios entre 0 - 9
 */

import java.util.Random;

public class ArrayMultidimensional {
    
    public static void main(String[] args) {
        
        
        Random numeroAletorios = new Random();
        int[][] arrayMultidimensional = new int[4][4];


        for (int i = 0; i < arrayMultidimensional.length; i ++){

            for (int j = 0; j < arrayMultidimensional[i].length; j ++) {

                arrayMultidimensional[i][j] = numeroAletorios.nextInt(9);

            }

        }

        System.out.println("Matriz: ");
        for (int[] linha : arrayMultidimensional) {

            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

    }

}
