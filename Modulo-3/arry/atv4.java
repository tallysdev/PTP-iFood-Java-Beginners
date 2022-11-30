package arry;

import java.util.Random;

class atv4 {
    
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[i].length; j++) {
                
                matriz[i][j] = random.nextInt(9);
            }
        }

        for (int[] is : matriz) {
            for (int is2 : is) {
                System.out.print(is2 + " ");
            };
            System.out.println("\n");
        }
    }
}