package COLLECTIONS.HASH.Exercicios;

import java.util.Random;

public class Dados {
    
    public static void main(String[] args) {

         // Criar um objeto Random para gerar números aleatórios
         Random random = new Random();

         // Inicializar um array para armazenar as contagens de cada valor do dado
         int[] contagens = new int[6];
 
         // Simular o lançamento do dado 100 vezes
         for (int i = 0; i < 100; i++) {
             // Gerar um número aleatório entre 1 e 6 (representando os valores do dado)
             int valorDado = random.nextInt(6) + 1;
 
             // Incrementar a contagem para o valor do dado gerado
             contagens[valorDado - 1]++;
         }
 
         // Exibir as contagens de cada valor
         for (int i = 0; i < 6; i++) {
             System.out.println("Valor " + (i + 1) + " foi inserido " + contagens[i] + " vezes");
         }
    }

}
