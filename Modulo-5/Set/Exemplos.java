import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Exemplos {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        System.out.println("criando um conjunto com notas adicionadas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8d,9d,0d,4d,3d,2d));
        System.out.println(notas.toString());
        
        System.out.println("vendo se nota 7 está no conjunto = " + notas.contains(7d));

        System.out.println("Exibindo menor nota = " + Collections.min(notas));

        System.out.println("Maior nota = " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Soma de todos os valores: " + soma);
        System.out.println("Media das notas = " + soma/notas.size());
        System.out.println("Removendo nota 0");
        notas.remove(0d);
        System.out.println(notas);
        System.out.println("Removendo notas menores que 5");
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if (next < 5) {
                iterator2.remove();
            }
        }
        System.out.println(notas);
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(6d);
        notas2.add(3d);
        notas2.add(4d);
        notas2.add(9d);
        notas2.add(8d);
        notas2.add(7d);
        notas2.add(6d);
        notas2.add(5d);
        System.out.println("Notas por ordem de adição " + notas2);
        System.out.println("Notas por ordem crescente ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apagando conjuntos");
        notas.clear();
        notas2.clear();
        notas3.clear();
        System.out.println(notas + " " + notas2 + " " + notas3);




    }
}