import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

class Exemplos {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Map<String, Double> carrosp = new HashMap<String, Double>(){{
            put("F gol", 12d);
            put("savero", 11d);
            put("uno", 10d);
            put("mobi", 9d);
            put("pampa", 8d);
        }};
        System.out.println(carrosp);

        carrosp.put("F gol", 11d);
        System.out.println(carrosp);

        System.out.println("Vendo se tem algum carro com o nome d20 " +carrosp.containsKey("d20"));

        System.out.println("Consumo do  uno " + carrosp.get("uno"));

        Set<String> modelos = carrosp.keySet();
        System.out.println(modelos);

        Collection<Double> consumos = carrosp.values();
        System.out.println(consumos);

        Double eco = Collections.max(carrosp.values());
        Set<Map.Entry<String, Double>> entries =carrosp.entrySet();   
        System.out.println(entries);
        String modelo2 = "";
        for (Map.Entry<String,Double> entry : entries) {
            if (entry.getValue().equals(eco)) {
                modelo2 = entry.getKey();
                System.out.println(modelo2 + " " + eco);
            }
        }
        
    }
}