package COLLECTIONS.STREAM_API.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LAMBDAS {
    
    public static void main(String[] args) {
        
        List<Gatos> meuGatos = new ArrayList<Gatos>(){{
            add(new Gatos("Matilda", "Preto"));
            add(new Gatos("Pedro", "Amarelo"));
            add(new Gatos("Roberto", "Branco"));
        }};

        meuGatos.sort(Comparator.comparing(Gatos::getCor));

        System.out.println(meuGatos.toString());

    }

}

class Gatos {

    private String nome, cor;

    public Gatos(String nome, String cor) {

        this.nome = nome;
        this.cor = cor;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String toString(){

        return "{ " + "nome: " + this.nome + ", cor: " + this.cor + "}";

    }

}
