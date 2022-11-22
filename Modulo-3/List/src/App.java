import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class App {
    private static ArrayList<Object> arrayList;

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
    
        arrayList = new ArrayList<>();
        arrayList.add(4);
        List<Double> notas = new ArrayList<Double>();
        notas.add(1d);
        notas.add(2d);
        notas.add(3d);
        notas.add(4d);
        notas.add(5d);
        System.out.println(arrayList);
        System.out.println(notas);

        System.out.println("posicao do numero 4 é" + notas.indexOf(4d));
        notas.add(1, 12d);
        System.out.println(notas);
        notas.set(4, 23d);
        System.out.println(notas);
        System.out.println(notas.contains(23d));
        for (Double double1 : notas) {
            System.out.println(double1);
        }

        System.out.println(notas.get(0));

        System.out.println(Collections.min(notas));
        System.out.println(Collections.max(notas));
        Iterator<Double> iteretor = notas.iterator();
        Double soma = 0d;
        while (iteretor.hasNext()) {
            double valor = iteretor.next();
            soma = soma + valor;
        }
        System.out.println(soma);
        notas.remove(0);
        notas.remove(23d);
        System.out.println(notas);
        
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next<5) {
                iterator1.remove();
            }
        }
        System.out.println(notas);

        notas.clear();
        System.out.println(notas);
    }   

}
 