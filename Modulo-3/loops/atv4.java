package loops;

import java.util.Scanner;

class atv4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numero deseja colocar?");
        int count = sc.nextInt();
        int numero;
        int impar = 0;
        int par = 0;

        while (count > 0) {
            
        System.out.println("Informe o numero ");
        numero = sc.nextInt();
        int verificador = numero%2;
        if (verificador == 0) {
            par ++;
        } else {
            impar ++;
        }
            count --;
        }

        System.out.println("Teve " + par + " numeros pares e " + impar + " numeros impares");
    }
}