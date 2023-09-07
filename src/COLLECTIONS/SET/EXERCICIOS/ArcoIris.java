package COLLECTIONS.SET.EXERCICIOS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Iterator;

/*
 * Crie um conjunto contendo as cores do arco-íris e:
 * Exiba todas as cores uma abaixo da outra
 * A quantidade de cores que o arco-íris tem
 * Exiba as cores em ordem alfabética
 * Exiba as cores em ordem inversa da que foi informada
 * Exiba todas as cores que começam com a letra "v"
 * Remova todas as cores que não começam com a letra "v"
 * Limpe o conjunto
 * Confira se o conjunto está vazio
 */
public class ArcoIris {

    public static void main(String[] args) {
        
        Set<String> arcoIris = new HashSet<String>();
        arcoIris.add("Vermelho");
        arcoIris.add("Laranja");
        arcoIris.add("Amarelo");
        arcoIris.add("Verde");
        arcoIris.add("Azul");
        arcoIris.add("Anil");
        arcoIris.add("Violeta");

        // ex1
        System.out.println(arcoIris);

        // ex2
        System.out.println(arcoIris.size());

        // ex3 e 4
        // Set não permitem ordem, transformei em uma List para poder utilizar o método reverse da classe Collections na List

        List<String> reverseSet = new ArrayList<String>();
        reverseSet.addAll(arcoIris);

        Collections.reverse(reverseSet);
        System.out.println(reverseSet);

        // ex5 e ex6
        Iterator<String> iterator = arcoIris.iterator();
        while (iterator.hasNext()) {

            String next = iterator.next();

            if (!next.startsWith("V")){
                iterator.remove();
            }

        }
        System.out.println(arcoIris);

        // ex7 e ex8
        arcoIris.clear();
        System.out.println(arcoIris);
        System.out.println("O Set está vazio? " + arcoIris.isEmpty());

    }

}


