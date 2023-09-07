package COLLECTIONS.LIST.EXERCICIOS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crime {
    
    public static void main(String[] args) {
        
        List<String> respostasCrime = listaCrime() ;

        int soma = 0;

        for (String resposta : respostasCrime) {

            if (resposta.contains("s")) {

                soma ++;

            }

        }
        System.out.println(soma);

        if (soma == 2 ) {
            System.out.println("Suspeita");
        }
        else if (soma > 2 && soma < 5) {
            System.out.println("Cúmplice");
        }
        else if (soma == 5) {
            System.out.println("Assasina");
        }
        else {
            System.out.println("Inocente");
        }

    }

    public static List<String> listaCrime() {

        List<String> respostasCrime = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Telefonou para a vítima? ");
        respostasCrime.add(scanner.nextLine());

        System.out.println("Esteve no local do crime? ");
        respostasCrime.add(scanner.nextLine());

        System.out.println("Mora perto da vítima? ");
        respostasCrime.add(scanner.nextLine());

        System.out.println("Devia para a vítima? ");
        respostasCrime.add(scanner.nextLine());

        System.out.println("Já trabalhou com a vítima? ");
        respostasCrime.add(scanner.nextLine());

        scanner.close();

        return respostasCrime;

    }

}
