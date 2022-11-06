package arry;

import java.util.Scanner;

class atv1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = {11,34,-76,32,5};
        for (int i = vetor.length-1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}
