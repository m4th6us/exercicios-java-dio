package COLLECTIONS.LIST.EXERCICIOS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Temperatura {

    public static void main(String[] args) {
        
        List<Integer> temp = mediaTemperatura();
        System.out.println("Essas são as temperaturas: " + temp);

        int soma = 0;
        for (int elementos : temp) {
            soma += elementos;
        }

        int mediaTemperaturas = soma/temp.size();
        System.out.println("A média das temperaturas é essa: " + mediaTemperaturas);
        System.out.println("Temperaturas que são maiores do que a média: ");
        
        List<String> meses = new ArrayList<>(Arrays.asList("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"));
        

        
        for (int i = 0; i < temp.size(); i ++) {

            if (temp.get(i) > mediaTemperaturas) {
                String mes = meses.get(i);
                System.out.println(mes + " - " + temp.get(i) + "º");
            }

        }

    }

    public static List<Integer> mediaTemperatura() {

        Scanner scanner = new Scanner(System.in);
    
        List<Integer> temperaturas = new ArrayList<Integer>();
    
        for (int i = 1; i <= 6; i ++) {
    
            System.out.println("Insira a " + i + "º temperatura");
            temperaturas.add(scanner.nextInt());
    
        }

        scanner.close();

        return temperaturas;
    }
    

}
