package COLLECTIONS.SET;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Dadas as seguintes informações sobre minhas séries favoritas, crie um conjunto e ordene este conjunto exibindo:
 * (nome - genero - tempo de episódio);
 * 
 * Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
 * Série 2 = Nome: dark, genero: drama, tempoEpisodio: 60
 * Série 3 = Nome: 13 reasons why, genero: drama, tempoEpisodio: 60
 */
public class ExercicioSet {
    
    public static void main(String[] args) {
        
        Set<Filmes> filmes = new HashSet<Filmes>(){{
            add(new Filmes("Inazuma Eleven", "Futebol", 25));
            add(new Filmes("Dragon Ball", "Luta", 20));
            add(new Filmes("Naruto", "Drama", 20));
        }};

        System.out.println("-- Ordem Aleatória --");
        System.out.println(filmes);

        System.out.println("-- Ordem Natural (Tempo Episódio) --");
        Set<Filmes> filmes2 = new TreeSet<>(filmes);
        System.out.println(filmes2);

    }

}

class Filmes implements Comparable<Filmes>{

    private String nome, genero;
    private int tempoEpisodio;

    Filmes(String nome, String genero, int tempoEpisodio) {

        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;

    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTempoEpisodio(int tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    public String toString() {

        return "{" + "Nome: " + this.nome + ", Gênero: " + this.genero + ", Tempo de episódio: " + this.tempoEpisodio + "}";

    }

    @Override
    public int compareTo(Filmes f1) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), f1.getTempoEpisodio());
        int genero = this.getGenero().compareTo(f1.genero);

        if (tempoEpisodio != 0) return tempoEpisodio;

        return genero;

    }

}

