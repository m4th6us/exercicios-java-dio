package COLLECTIONS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    
    public static void main(String[] args) {
        
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", "preto", 18));
            add(new Gato("Simba", "tigrado", 6));
            add(new Gato("Jon", "preto", 12));
        }};

        System.out.println(" -- Ordem de inserção --");
        System.out.println(meusGatos);

        System.out.println(" -- Ordem de inserção aleatória --");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("-- Ordem Natural (Nome) --");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("-- Ordem Natural (Idade) --");
        Collections.sort(meusGatos, new ComparatorIdade());
        System.out.println(meusGatos);

        // meusGatos.sort(null);

        System.out.println("-- Order Natural (Cor) --");
        Collections.sort(meusGatos, new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("-- Order Natural (Nome/Cor/Idade) --");
        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }

}

class Gato implements Comparable<Gato> {

    private String nome, cor;
    private Integer idade;

    public Gato(String nome, String cor, Integer idade) {

        this.nome = nome;
        this.cor = cor;
        this.idade = idade;

    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    public String toString() {
        return "{" + 
        "nome='" + nome + '\'' +
        ", idade=" + idade +
        ", cor='" + cor + '\'' +
        '}';
    }

    @Override
    public int compareTo(Gato gato) {

        return this.getNome().compareToIgnoreCase(gato.getNome());

    }

}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {

        return Integer.compare(g1.getIdade(), g2.getIdade());

    }

}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {

        return g1.getCor().compareToIgnoreCase(g2.getCor());

    }

}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    public int compare(Gato g1, Gato g2) {

        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());



    }

}