import java.util.Scanner;

public class Desafio5 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = { 64, 137, -16, 43, 67, 81, -90, 212, 10, 75 };

        int num = leitor.nextInt();
        busca(elementos, num);
        // TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.

    }

    public static void busca(int[] ele, int num) {

        boolean achou = false;

        for (int i = 0; i < ele.length; i++) {

            if (num == ele[i]) {

                System.out.println("Achei " + num + " na posicao " + i);
                achou = true;
                break;    
            }

        } 
        if (!achou) {
            System.out.println("Numero " + num + " nao encontrado!");    
        }
    }
}