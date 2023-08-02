package veiculos_exercicios;

public class Moto extends Veiculo {


    String descricao;

    public Moto(String nome, String marca, double tanque, String descricao) {

        super(marca, nome, tanque);
        this.descricao = descricao;


    }

    public static void main(String[] args) {
        
        Moto carro = new Moto("Twister", "Honda", 15.0, "Essa é uma moto muito legal");
        carro.ChamarCarro();

    }

    public void ChamarCarro() {
       System.out.println("O nome da moto é: " + super.nome + " A marca é: " + super.marca + " A capacidade do tanque é: " + this.tanque + " E sua descrição é: " + this.descricao);
    }

}

