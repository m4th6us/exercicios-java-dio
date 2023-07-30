import java.util.Calendar;

public class Metodos {

    public class Calculadora {

        public double num, num_2;

        public Calculadora(double num, double num_2) {
            this.num = num;
            this.num_2 = num_2;
        }

        public double Soma(){

            return this.num + this.num_2;

        }

        public double Subtrair() {

            return this.num - this.num_2;

        }

        public double Dividir() {

            return this.num / this.num_2;

        }

        public double Multiplicacao() {

            return this.num * this.num_2;

        }


    }

    public class Saudacao {

        Calendar calendar =  Calendar.getInstance();
        int hours = calendar.get(Calendar.HOUR_OF_DAY);

        public String SaudacaoData() {

            String retorno = "";

            if (this.hours > 6 && this.hours < 12) {
                retorno = "Olá Bom Dia";
            } 
            else if (this.hours >= 12 && this.hours < 18){
                retorno = "Olá Boa tarde";
            }
            else{
                retorno = "Olá Boa noite";
            }

            return retorno;

        }
    
    }

    public class Emprestimo {

        double valor;

        public String EmprestimoMes() {

            return "Com taxa de 1% ao mês, com o valor: " + this.valor + "o empréstimo vai ficar: " + (this.valor + (this.valor * 0.01)) ;

        }

    }

}