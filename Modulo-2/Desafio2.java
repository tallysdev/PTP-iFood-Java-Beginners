import java.util.Scanner;
public class Desafio2 {

    public static void main(String[] args) {

        int A, N;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();
        int contador = A;

        for (int i = A+1; i < N+1; i++) {
            
            if ((i%A) == 0) {
                contador = contador + i;
            }
        }
        System.out.println(contador);

    }
}