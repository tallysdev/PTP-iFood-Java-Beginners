import java.util.LinkedHashSet;
import java.util.Set;

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
    }
}