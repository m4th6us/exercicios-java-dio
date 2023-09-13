package COLLECTIONS.STREAM_API.exercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApi {
    
    public static void main(String[] args) {
        
        List<Integer> numberList = Arrays.asList(
            1,2,3,3,4,5,6,7,8,8,9,10,10
        );

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante: \n");
        
        for (int i=0; i<numberList.size(); i++){

            if (i >= 3){
                System.out.println(numberList.get(i));
            }

        }

        System.out.println("\n");

        System.out.println("Removendo os números repetidos da lista, quantos ficam? \n");

        Set<Integer> numberSet = new HashSet<Integer>(){{
            addAll(numberList);
        }};

        System.out.println(numberSet.size() + "\n");

        System.out.println("Mostre o menor valor da lista: \n");
        System.out.println(Collections.min(numberList));

        System.out.println("\n Mostre o maior valor da lista: \n");
        System.out.println(Collections.max(numberList));

        System.out.println("\n Pegue apenas os números pares e devolva a soma deles: \n");
        int sumPares = numberList.stream()
            .filter(number -> number % 2 == 0)
            .mapToInt(Integer::intValue)
            .sum();

        
        System.out.println(sumPares + "\n");

        System.out.println("\n Pegue apenas os números impares e devolva a soma deles: \n");
        int sumImpar = numberList.stream()
            .filter(number -> number % 2 == 1)
            .mapToInt(Integer::intValue)
            .sum();
        
        System.out.println(sumImpar + "\n");

        System.out.println("Agrupe os valores impares multiplos de 3 e de 5: \n");
        Map<Integer, Long> result = numberList.stream()
            .filter(number -> number % 2 == 0 )
            .collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()
            ));
        
        System.out.println(result);

    }

}
