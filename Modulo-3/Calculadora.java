import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo a calculadora");
        int op = 10;
        while (op != 0) {
            
            System.out.println("Digite o primeiro numero");
            double num1 = sc.nextInt();
            System.out.println("\nDeseja realizar qual operação?");
            System.out.println("\n1 - Soma");
            System.out.println("\n2 - Subitração");
            System.out.println("\n3 - Mutiplicação");
            System.out.println("\n4 - Divisão");
            System.out.println("\n0 - Sair");
            op = sc.nextInt();
            System.out.println("\nDigite o segundo numero");
            double num2 = sc.nextInt();

            if (op == 1) {
                soma(num1,num2);
            }
            else if (op == 2) {
                sub(num1,num2);
            } else if (op == 3) {
                mult(num1,num2);
            } else if (op == 2) {
                divisao(num1,num2);
            } else {
                op = 0;
            }
        }

    }

    public static void soma(double i, double j) {

        double resultado = i + j;
        System.out.println("A soma de " + i + " + " + j + " é " + resultado);
    }

    public static void sub(double i, double j) {

        double resultado = i - j;
        System.out.println("A subitração de " + i + " - " + j + " é " + resultado);
    }

    public static void divisao(double i, double j) {

        double resultado = i / j;
        System.out.println("A divisao de " + i + " / " + j + " é " + resultado);
    }

    public static void mult(double i, double j) {

        double resultado = i * j;
        System.out.println("A multiplicação de " + i + " * " + j + " é " + resultado);
    }


}