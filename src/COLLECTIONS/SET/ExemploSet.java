package COLLECTIONS.SET;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploSet {
    
    
    public static void main(String[] args) {
        
        System.out.println("Imprimindo nossa coleção do tipo SET");
        Set<Double> notas = new HashSet<Double>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0));
        System.out.println(notas.toString());


        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5.0));
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator =  notas.iterator();
        double soma = 0;


        while (iterator.hasNext()) {

            Double next = iterator.next();

            soma+= next;
        }
        System.out.println("Imprima a soma dos elementos da coleção: " + soma);
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));
        System.out.println("Remova a nota 1.0: ");
        notas.remove(1.0);
        System.out.println(notas);

        System.out.println("Remova as notas menores do que 7 e exiba a lista: ");
        Iterator<Double> iterator2 = notas.iterator();

        while (iterator2.hasNext()) {

            double nextVal = iterator2.next();

            if (nextVal < 7) iterator2.remove();


        }
        System.out.println(notas);

        System.out.println("Uma coleção LinkedHashSet (ordenada por ordem de inserção): ");
        Set<Double> notas2 = new LinkedHashSet<Double>(Arrays.asList(1.0, 2.0, 23.0, 40.0, 43.0, 6.0, -7.0, 8.0, 9.0, 10.0));
        System.out.println(notas2);

        System.out.println("Imprima na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
    }

}
