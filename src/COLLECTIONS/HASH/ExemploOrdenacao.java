package COLLECTIONS.HASH;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExemploOrdenacao {
    public static void main(String[] args) {
        
        System.out.println("--Ordem aleatória--");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};

        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {

            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        }   

        System.out.println();
        System.out.println("-- Ordem de inserção --");
        Map<String, Livro> meusLivros2 = new LinkedHashMap<>();
        meusLivros2.putAll(meusLivros);
        
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {

            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        }

        System.out.println();
        System.out.println("-- Ordem alfabética do autor --");
        Map<String, Livro> treeMapLivros = new TreeMap<>();
        treeMapLivros.putAll(meusLivros2);

        for (Map.Entry<String, Livro> livro : treeMapLivros.entrySet()) {

            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        }


        System.out.println();
        System.out.println("-- Ordem alfabética nomes dos livros --");

        Set<Map.Entry<String, Livro>> meusLivroSet = new TreeSet<>(new ComparatorNome());
        meusLivroSet.addAll(meusLivros2.entrySet());
        
         for (Map.Entry<String, Livro> livro : meusLivroSet) {

            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        } 

        System.out.println();
        System.out.println("-- Ordem por número de páginas --");

        Set<Map.Entry<String, Livro>> meusLivroSetPag = new TreeSet<>(new ComparatorPaginas());
        meusLivroSetPag.addAll(meusLivros2.entrySet());
        
         for (Map.Entry<String, Livro> livro : meusLivroSetPag) {

            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas());

        } 

    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {

        this.nome = nome;
        this.paginas = paginas;

    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare (Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }

}

class ComparatorPaginas implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare (Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return Integer.compare(l1.getValue().getPaginas(), l2.getValue().getPaginas());
    }

}
