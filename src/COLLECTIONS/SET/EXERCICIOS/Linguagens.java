package COLLECTIONS.SET.EXERCICIOS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Atributos nome, anoDeCriacao e ide
 * crie um conjunto com 3 linguagens e ordene por:
 * Ordem de Inserção
 * Ordem Natural (nome)
 * IDE
 * Ano de criação e nome
 * Nome, ano de criacao e IDE
 * Exiba as linguagens uma abaixo da outra no final
 */
public class Linguagens {
    
    
    public static void main(String[] args) {

        Set<LinguagensFavoritas> linguagensFavoritas = new HashSet<LinguagensFavoritas>(){{
            add(new LinguagensFavoritas("Python", "1993", "PyCharm"));
            add(new LinguagensFavoritas("java", "1999", "Intellij"));
            add(new LinguagensFavoritas("PHP", "1995", "PHPStorm"));
        }};

        // ex01
        System.out.println(linguagensFavoritas);

        // ex02 (nome)
        List<LinguagensFavoritas> listaLinguagensFavoritas = new ArrayList<LinguagensFavoritas>(linguagensFavoritas);

        System.out.println("[COMPARATOR NOME]");
        System.out.println(listaLinguagensFavoritas);

        // ex03
        System.out.println("[COMPARATOR IDE]");
        Collections.sort(listaLinguagensFavoritas, new ComparatorIDE());
        System.out.println(listaLinguagensFavoritas);

        // ex04
        System.out.println("[COMPARATOR ANO NOME]");
        Collections.sort(listaLinguagensFavoritas, new ComparatorAnoNome());
        System.out.println(listaLinguagensFavoritas);

        // ex05
        System.out.println("[COMPARATOR NOME IDADE IDE]");
        Collections.sort(listaLinguagensFavoritas, new ComparatorNomeAnoIde());
        System.out.println(listaLinguagensFavoritas);

        // ex06
        System.out.println("[UM EMBAIXO DO OUTRO]");
        for (LinguagensFavoritas elemento : listaLinguagensFavoritas) {
            System.out.println(elemento);
        }
        
    }

}

class LinguagensFavoritas implements Comparable<LinguagensFavoritas>{

    private String nome, anoDeCriacao, ide;

    LinguagensFavoritas(String nome, String anoDeCriacao, String ide) {

        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;

    }

    public String getNome() {
        return nome;
    }

    public String getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public int compareTo(LinguagensFavoritas lf){

        int nome = this.getNome().compareTo(lf.nome);

        return nome;

    }

    public String toString() {

        return "{" + this.nome + ", " + this.anoDeCriacao + ", " + this.ide + "}";

    }

}

class ComparatorIDE implements Comparator<LinguagensFavoritas> {
    
    public int compare(LinguagensFavoritas l1, LinguagensFavoritas l2) {

        int ide = l1.getIde().compareToIgnoreCase(l2.getIde());
        return ide;


    }

}

class ComparatorAnoNome implements Comparator<LinguagensFavoritas> {

    public int compare(LinguagensFavoritas l1, LinguagensFavoritas l2) {

        int ano = l1.getAnoDeCriacao().compareToIgnoreCase(l2.getAnoDeCriacao());
        if (ano != 0) return ano;

        return l1.getNome().compareToIgnoreCase(l2.getNome());

    }

}

class ComparatorNomeAnoIde implements Comparator<LinguagensFavoritas> {

    public int compare(LinguagensFavoritas l1, LinguagensFavoritas l2) {

        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
        int ano = l1.getAnoDeCriacao().compareToIgnoreCase(l2.getAnoDeCriacao());
        
        if (nome != 0) return nome;
        if (ano != 0) return ano;
        
        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }

}