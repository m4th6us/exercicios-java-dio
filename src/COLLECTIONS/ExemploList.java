package COLLECTIONS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<Double> notas = new ArrayList<Double>();       
        List<Double> adicionar = new ArrayList<Double>(Arrays.asList(1.0, 2.0, 3.0, 4.0));
        LinkedList<Double> nota2 = new LinkedList<Double>();
        nota2.addAll(adicionar);

        notas.addAll(adicionar);
        System.out.println("Essas são as notas dos alunos: " + notas);
        System.out.println("A nota 2.0 está no índice: " + notas.indexOf(2.0));
        System.out.println("Adicione na lista a nota 8.0 na posição 3 ");
        notas.add(3, 8.0);
        System.out.println(notas);
        System.out.println("Substitua a nota 1.0 pela nota 7.0");
        notas.set(0, 7.0);
        System.out.println(notas);
        System.out.println("Confira se a nota 8.0 está na lista: " + notas.contains(8.0));
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println("Retorne a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        System.out.println("Exiba a soma das notas: ");
        
        Double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        System.out.println(soma);
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));
        System.out.println("Remova a nota 2.0: ");
        notas.remove(2.0);
        System.out.println(notas);
        System.out.println("Remova as notas menores do que 7.0: ");
        Iterator<Double> iterator = notas.iterator();

        while(iterator.hasNext()) {
            Double next = iterator.next();
            if (next < 7) iterator.remove();
        }

        System.out.println(notas);

        System.out.println("Limpando toda lista: " );
        notas.clear();
        System.out.println(notas);

        System.out.println("Utilizando LINKEDLIST: " + nota2);
        System.out.println("Mostre a primeira nota da nova Lista sem removê-lo: " + nota2.getFirst() );
        System.out.println("Mostre a primeira nota da nova lista removendo-o: " + nota2.removeFirst());
        System.out.println(nota2);

    }

}