package arry;

import java.util.Random;
class atv3 {
    
    public static void main(String[] args) {
        
        Random random = new Random();

        int[] numeroAleatorios = new int[20];

        for (int i = 0; i < numeroAleatorios.length; i++) {
            numeroAleatorios[i] = random.nextInt(100);
        }
        
        for (int i : numeroAleatorios) {
            System.out.print(" " + i);
        }
        System.out.println("\n");
        for (int i : numeroAleatorios) {
            System.out.print(" " + (i + 1));
        }
    }
}