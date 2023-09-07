package COLLECTIONS.STREAM_API;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;

public class Exemplo {
    
    public static void main(String[] args) {
        
        HashMap<Integer, Contato> meusContatos = new HashMap<Integer, Contato>(){{

            put(1, new Contato("Matheus", 11111));
            put(2, new Contato("Roberto", 222222));
            put(3, new Contato("Carlos", 333333));

        }};

        // Set<Map.Entry<Integer, Contato>> setMap = new TreeSet<>(
        //     new Comparator<Map.Entry<Integer, Contato>>() {
                
        //         @Override
        //         public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
        //             return c1.getValue().getContato().compareToIgnoreCase(c2.getValue().getContato());
        //         }

        //     }
        // );

        // Set<Map.Entry<Integer, Contato>> setMap = new TreeSet<>(Comparator.comparing(
        //     new Function<Map.Entry<Integer, Contato>, Integer>() {   

        //         @Override
        //         public Integer apply(Map.Entry<Integer, Contato> c1) {

        //             return c1.getValue().getContato();

        //         }

        //     }
        // ));

        Set<Map.Entry<Integer, Contato>> setMap = new TreeSet<>(
            Comparator.comparing(
                cont -> cont.getValue().getContato()
            )
        );

        setMap.addAll(meusContatos.entrySet());

        // System.out.println(
        //     setMap
        // );


        for (
            Map.Entry<Integer, Contato> elemeEntry : setMap
        ) {

            System.out.println(
                "chave: " + elemeEntry.getKey() + ", valor: " + elemeEntry.getValue()
            );

        }

    }

}

class Contato {

    private String nome;
    private Integer contato;

    public Contato (String nome, Integer contato) {

        this.nome = nome;
        this.contato = contato;

    }

    public Integer getContato() {
        return contato;
    }

    public String getNome() {
        return nome;
    }

    public void setContato(Integer contato) {
        this.contato = contato;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {

        return "{" + "nome: " + this.nome + ", contato: " + this.contato + "}";

    }

}
