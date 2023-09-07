package COLLECTIONS.HASH;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Exemplo {
    
    public static void main(String[] args) {
        
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos elementos");

        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 18.4);
            put("mobi", 16.4);
            put("hb20", 18.4);
            put("kwid", 11.4);
        }};

        System.out.println(carrosPopulares.toString());

        System.out.println();
        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println();
        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("uno"));

        System.out.println();
        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println();
        System.out.println("Exiba os modelos: ");
        Set<String> modelos =  carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println();
        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> valores = carrosPopulares.values();
        System.out.println(valores);

        System.out.println();
        System.out.println("Exiba o modelo mais econômico: ");

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries =  carrosPopulares.entrySet();
        String modelosMaisEficiente = "";

        for (Map.Entry<String, Double> entry: entries) {

            if (entry.getValue().equals(consumoMaisEficiente)) {
                modelosMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modelosMaisEficiente + " - " + consumoMaisEficiente);
            }

        }

        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";

        Set<Map.Entry<String, Double>> entries2 =  carrosPopulares.entrySet();

        for (Map.Entry<String, Double> entry: entries2) {

            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelos menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }

        }

        System.out.println();
        System.out.println("Retorne a soma dos consumos: ");
        int soma = 0;

        Iterator<Double> iteratorValues = carrosPopulares.values().iterator();

        while (iteratorValues.hasNext()) {
            soma += iteratorValues.next();
        }
        System.out.println(soma);

        System.out.println();
        System.out.println("Remova os modelos com o consumo igual a 15.6 km/L: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();

        while (iterator.hasNext()) {

            if (iterator.next().equals(16.4)) iterator.remove();

        }
        System.out.println(carrosPopulares);

        System.out.println();
        System.out.println("Imprima todos os carros na ordem que foram informados: ");
        // Ordem de inserção LinkedHashMap
        HashMap<String, Double> linkedHashMap = new LinkedHashMap<String, Double>(){{
            put("gol", 14.4);
            put("uno", 18.4);
            put("mobi", 16.4);
            put("hb20", 18.4);
            put("kwid", 11.4);
        }};
        System.out.println(linkedHashMap.toString());

        System.out.println();
        System.out.println("Imprima todos os carros na ordem por modelo: ");
        // Ordem de inserção LinkedHashMap
        Map<String, Double> treeMap = new TreeMap<>(linkedHashMap);
        System.out.println(treeMap.toString());

        System.out.println("Apague o dicionário de carros: ");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);

        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());

    }

}
