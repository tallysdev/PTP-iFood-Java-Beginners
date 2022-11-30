package arry;

import java.util.Scanner;

class atv1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = {11,34,-76,32,5};
        
        System.out.println("Ordem original");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("\nOrdem inversa");
        for (int i = vetor.length-1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}
