package loops;

import java.util.Scanner;

class atv6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numero que voce deseja saber o fatoria");
        int numero = sc.nextInt();
        int fatorial = 1;

        for (int i = numero; i > 0; i--) {

            fatorial = fatorial * i;

        }
        
        System.out.println("Fatoria de " + numero + " é " + fatorial);

    }
}