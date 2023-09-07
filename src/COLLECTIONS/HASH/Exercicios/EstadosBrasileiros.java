package COLLECTIONS.HASH.Exercicios;

import java.util.HashMap;
import java.util.Map;

public class EstadosBrasileiros {
    
    public static void main(String[] args) {
        
        Map<String, Integer> estadosBrasileirosPopulacao = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println("Crie um dicionário com os estados e suas populações: ");
        System.out.println(estadosBrasileirosPopulacao);

        System.out.println();
        System.out.println("Substitua a população do estado do RN: ");
        estadosBrasileirosPopulacao.put("RN", 3534165);
        System.out.println(estadosBrasileirosPopulacao);

        System.out.println();
        System.out.println("Confira se o estado PB está no dicionario, caso não houver adicione: ");
        
        if (estadosBrasileirosPopulacao.containsKey("PB")) {
            System.out.println("O estado PB já existe");
        }
        else {
            estadosBrasileirosPopulacao.put("PB", 4039277);
        }
        System.out.println(estadosBrasileirosPopulacao);

        System.out.println();
        System.out.println("Exiba a população de PE: ");
        System.out.println(estadosBrasileirosPopulacao.get("PE"));

    }

}
