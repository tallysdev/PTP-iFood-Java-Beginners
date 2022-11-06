package loops;

import java.util.Scanner;

class atv5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual numero deseja ver a tabuada?");
        int numero = sc.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.println(numero + " x " + i + " = " + numero*i + "\n");
        }
    }
}