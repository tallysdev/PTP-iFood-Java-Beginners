import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Exemplos {
    
    public static void main(String[] args) {
        
        System.out.println("criando um conjunto com notas adicionadas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8d,9d,0d,4d,3d,2d));
        System.out.println(notas.toString());

    }
}