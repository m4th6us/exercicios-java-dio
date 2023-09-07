package COLLECTIONS.HASH;

import java.util.HashMap;

public class ExemploMap {
    
    public static void main(String[] args) {
        
        HashMap<String, Integer> MapPersons = new HashMap<>();

        Pessoa myPersons = new Pessoa("Matheus", 19, 100);
        
        MapPersons.put(myPersons.nome, myPersons.idade);
        System.out.println(MapPersons.toString());

    }

}


class Pessoa {

    String nome;
    int idade, peso;

    Pessoa(String nome, int idade, int peso) {

        this.nome = nome;
        this.idade = idade;
        this.peso = peso;

    }

    public String toString() {

        return "[" + this.nome + ", " + this.idade + ", " + this.peso + "]";

    }

}
