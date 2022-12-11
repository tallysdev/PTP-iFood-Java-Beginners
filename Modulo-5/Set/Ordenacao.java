import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class Ordenacao {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // Vamos ordenar series dentro de um conjunto
        // Serie: got, genero: fantisa, ep: 60
        // Serie:Sandman, genero: fantasia, ep: 8
        // Serie: Wandinha, genero: fantasia, ep:8


        System.out.println("Ordem aleatoria");
        Set<Serie> minhasSeries = new HashSet<Serie>(){{
            add(new Serie("got","fantasia",60));
            add(new Serie("Sandman","fantasia",10));
            add(new Serie("Wandinha","fantasia",8));
        }};
        System.out.println();
        for (Serie serie : minhasSeries) {
            System.out.println(serie.getNome());
            System.out.println(serie.getGenero());
            System.out.println(serie.getEp());
            System.out.println(" ");
        }

        Set<Serie> minhaSeries2 = new LinkedHashSet<Serie>(){{
            add(new Serie("got","fantasia",60));
            add(new Serie("Sandman","fantasia",10));
            add(new Serie("Wandinha","fantasia",8));
        }};
        System.out.println("Ordem por add");
        System.out.println();
        for (Serie serie : minhaSeries2) {
            System.out.println(serie.getNome());
            System.out.println(serie.getGenero());
            System.out.println(serie.getEp());
            System.out.println(" ");
        }
    }
}
