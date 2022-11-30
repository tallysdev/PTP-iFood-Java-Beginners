package loops;

import java.util.Scanner;

class atv3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int media = 0;

        do {

            System.out.println("Informe o numero");
            numero = sc.nextInt();
            media = media + numero;
            if (numero > maior) {
                maior = numero;
            }
            count++;

        } while (count < 5);

        media = media /5;

        System.out.println("Maior numero foi " + maior + " a media é " + media);
    }
}