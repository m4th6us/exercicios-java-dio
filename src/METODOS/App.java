import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        //Instanciando classe Scanner para ler a entrada do usuário
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo a Calculadora, insira dois valores, para ser somado, subtraido, dividido e multiplicado");
        System.out.println(" ");
        
        //Pegando os valores

        System.out.println("Primeiro Valor: ");
        double num = scan.nextDouble();
        System.out.println("Segundo Valor: ");
        double num_2 = scan.nextDouble();
        
        scan.close();
        
        //Instanciando a classe Metodos e instanciando sua subclasse Calculadora
        Metodos metodos = new Metodos();
        Metodos.Calculadora calculadora = metodos.new Calculadora(num, num_2);

        //Chamando os métodos
        double soma = calculadora.Soma();
        double subtracao = calculadora.Subtrair();
        double multiplicacao = calculadora.Multiplicacao();
        double dividir = calculadora.Dividir();

        //Mostrando so resultados
        System.out.println("Os números são: " + calculadora.num + " e " + calculadora.num_2 );
        System.out.println("A soma fica: " + soma);
        System.out.println("A subtração fica: " + subtracao);
        System.out.println("A divisão fica: " + dividir);
        System.out.println("A multiplicação fica: " + multiplicacao);


        //Instanciando a subclasse Saudacao
        Metodos.Saudacao saudacao = metodos.new Saudacao();

        //Chamando métodos
        String textoSaudacao = saudacao.SaudacaoData();
        System.out.println(textoSaudacao + " São " + saudacao.hours);
    }

}
