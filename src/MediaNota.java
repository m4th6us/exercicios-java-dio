import java.util.Scanner;

public class MediaNota {
    
    public static void main(String[] args) {
        
        // Inicializando a classe Scanner para ler a entrada do usuário
        Scanner leitor = new Scanner(System.in);
        
        // Trasnformando a entrada em um array de strings
        System.out.println("Digite as notas: ");
        String notas = leitor.nextLine();
        String[] arrayNotas = notas.split(" ");

        int soma = 0;
        int quantidadeNotas = 0;
        
        for (int i=0; i<arrayNotas.length; i++){
            
            // Armazenar a quantidade de notas
            quantidadeNotas += 1;

            // Transformando as strings do array para int
            int nota = Integer.parseInt(arrayNotas[i]);
            soma += nota;

        }

        int media = soma / quantidadeNotas;
        System.out.println("Sua média é: " + media);
        leitor.close();

    }

}