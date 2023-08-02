package interfaces;

public class UserCalculadora implements Calculadora {
    
    double val1, val2;

    UserCalculadora(double val1, double val2) {

        this.val1 = val1;
        this.val2 = val2;

    }

    @Override
    public double Somar() {

        return this.val1 + this.val2;

    }

    @Override
    public double Subtrair() {
        
        return this.val1 - this.val2;

    }

    @Override
    public double Multiplicar() {
        
        return this.val1 * this.val2;

    }

    @Override
    public double Dividir() {
        
        return this.val1 / this.val2;

    }

    public static void main(String[] args) {
        
        UserCalculadora userCalculadora = new UserCalculadora(10, 2);
        System.out.println("Soma: " + userCalculadora.Somar());
        System.out.println("Subtração: " + userCalculadora.Subtrair());
        System.out.println("Divisão: " + userCalculadora.Dividir());
        System.out.println("Multiplicação: " + userCalculadora.Multiplicar());

    }

}
