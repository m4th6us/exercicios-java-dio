package veiculos_exercicios;

public class Caminhao extends Veiculo {
    
    String descricao;

    public Caminhao(String nome, String marca, double tanque, String descricao) {

        super(marca, nome, tanque);
        this.descricao = descricao;


    }

    public static void main(String[] args) {
        
        Caminhao carro = new Caminhao("Grand", "BMW", 250.0, "Esse é um Caminhao muito legal");
        carro.ChamarCarro();

    }

    public void ChamarCarro() {
       System.out.println("O nome do Caminhao é: " + super.nome + " A marca é: " + super.marca + " A capacidade do tanque é: " + this.tanque + " E sua descrição é: " + this.descricao);
    }


}
