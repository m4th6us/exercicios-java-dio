/*
 * Crie um vetor de 6 caracteres
 * conte a quantidade de consoantes e imprima as mesmas
 */


public class Consoantes {
    
    public static void main(String[] args) {
        
        String[] arrayCaracteres = {"a", "b", "c", "d", "e", "f"};
        int somaConsoantes = 0;

    
        for (String elemento : arrayCaracteres) {

            if (
                elemento != "a" &&
                elemento != "e" && 
                elemento != "i" && 
                elemento != "o" && 
                elemento != "u"
            ){

                somaConsoantes += 1;

                System.out.println(elemento);
            }

        }

        System.out.println("[SOMA DAS CONSOANTES]: " + somaConsoantes);

    }

}
