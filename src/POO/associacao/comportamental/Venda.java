package associacao.comportamental;

// Nesse exemplo a associação é realizada nos métodos, quando um depende do outro.

public class Venda {
    
    public static void finalizarVenda(Cupom cupom) {

        System.out.println(cupom);

    }

    public static void main(String[] args) {
        
        Cupom cupom = new Cupom();
        finalizarVenda(cupom);

    }

}
