import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
class Exercicio1 {
    

    /**
     * @param args
     */
    public static void main(String[] args) {
        

        Set<String> arcoiris = new LinkedHashSet<String>() {{ 
            add("vermelho");
            add("laranja");
            add("amarelo");
            add("verde");
            add("azul");
            add("anil");
            add("violeta");
        }};
        System.out.println("Letra A");
        for (String string : arcoiris) {
            System.out.println(string);
        }
        System.out.println("Letra B");
        System.out.println(arcoiris.size());
        
        System.out.println("Letra C");
        Set<String> arcoiris2 = new TreeSet<>(arcoiris);
        System.out.println(arcoiris2);

        System.out.println("Letra D");
        Set<String> arcoires3 = new LinkedHashSet<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"));
        System.out.println(arcoires3);
        List<String> coresList = new ArrayList<>(arcoires3);
        Collections.reverse(coresList);
        System.out.println(coresList);

        System.out.println("Letra E");
        for (String string : arcoiris) {
            if (string.startsWith("v")) System.out.println(string);
        }

        System.out.println("letra F ");
        Iterator<String> iterator2 = arcoiris.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(arcoiris);

        System.out.println("Letra G");
        arcoiris.clear();

        System.out.println("Letra H " + arcoiris.isEmpty());
    }
}

class Ordenacao {


}