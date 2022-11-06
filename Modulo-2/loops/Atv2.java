// package loops;

import java.util.Scanner;

class Atv2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int notas = sc.nextInt();

        while (notas < 0 || notas >10) {
            
            System.out.println("Valor invalido, digit notas novamente");
            notas = sc.nextInt();

        }
    }
}