package COLLECTIONS.STREAM_API;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExerciciosStreamApi {
    
    public static void main(String[] args) {
        
        List<String> numerosAleatorios = Arrays.asList(
            "5",
            "0",
            "4",
            "1",
            "2",
            "3",
            "9",
            "9",
            "6",
            "5" 
        );
        

        // Imprima todos os elementos dessa lista de string
        // numerosAleatorios.stream().forEach(s -> System.out.println(s));

        // Pegue os 5 primeiro números e coloque dentro de um set
        Set<String> collectSet =  numerosAleatorios.stream()
            .limit(5)
            .collect(Collectors.toSet());

        // Transforme a lista de strings em uma lista de inteiros 
        List<Integer> collectList =  numerosAleatorios.stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList());
        
        // Criando filtros
        List<Integer> collectFilter = numerosAleatorios.stream()
            .map(Integer::parseInt)
            .filter(number -> number % 2 == 0 && number > 2)
            .collect(Collectors.toList());
        
        

    }

}
