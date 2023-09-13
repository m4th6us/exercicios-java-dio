import javax.swing.*;

public class UncheckedException {
    
    public static void main(String[] args) {
        int sum = 0;

        String valStringA;
        String valStringB;

        while (sum < 3) {

            int valIntegerA = 0;
            int valIntegerB = 0;

            valStringA = JOptionPane.showInputDialog("Numerador: ");
            valStringB = JOptionPane.showInputDialog("Denominador: ");

            // Verificações
            try { 

                sum ++;
                valIntegerA = Integer.parseInt(valStringA);
    
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Os valores informados no numerador não são numericos !");
                sum --;
            }
    
            try {
    
                sum ++;
                valIntegerB = Integer.parseInt(valStringB);
    
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Os valores informados no denominador não são numericos !");
                sum --;
            }

            if (valIntegerA > 0 && valIntegerB > 0) {
                sum++;
                int resultInt = dividir(valIntegerA, valIntegerB);
                JOptionPane.showMessageDialog(null, "O resultado da operação é: " + resultInt);
            } else {
                sum--;
                JOptionPane.showMessageDialog(null, "Algum dos numeros digitados é zero, é menor do que zero ou é um texto!");
            }

        }
        
    }

    public static int dividir(int a, int b) {return a / b;}

    public static double dividir(float a, float b) {return a / b;}

}
