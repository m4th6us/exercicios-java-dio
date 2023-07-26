import java.util.Scanner;

public class MaiorEMedia {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int contador = 0;
        int numero = 0;
        int maiorNumero = 0;
        int media = 0;

        do {

            System.out.println("Digite um número");
            numero = leitor.nextInt();

            if (numero > maiorNumero) maiorNumero = numero;

            media += numero;
            contador++;

        } while (contador < 5);

        System.out.println("O maior número foi: " + maiorNumero);
        System.out.println("A média é: " + (media/contador) );

        leitor.close();

    }

}
