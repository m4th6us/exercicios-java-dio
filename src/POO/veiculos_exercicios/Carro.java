package veiculos_exercicios;

public class Carro extends Veiculo {
    

    String descricao;

    public Carro(String nome, String marca, double tanque, String descricao) {

        super(marca, nome, tanque);
        this.descricao = descricao;


    }

    public static void main(String[] args) {
        
        Carro carro = new Carro("Palio", "Volkswagen", 100.0, "Esse é um carro muito legal");
        carro.ChamarCarro();

    }

    public void ChamarCarro() {
       System.out.println("O nome do carro é: " + super.nome + " A marca é: " + super.marca + " A capacidade do tanque é: " + this.tanque + " E sua descrição é: " + this.descricao);
    }

}
