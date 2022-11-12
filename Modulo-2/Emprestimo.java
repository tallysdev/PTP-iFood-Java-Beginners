import java.util.Scanner;

public class Emprestimo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("De quanto voce quer o emprestimo?");
        double emprestimo = sc.nextDouble();
        System.out.println("Em quantas vezes?");
        double taxas = sc.nextDouble();
        valor(emprestimo, taxas);
    }

    public static void valor(double em, double tax) {

        double resultado;

        if (em > 1000) {

            resultado = (em / tax) * 1.2;
            System.out.println("Valor das parcelas " + resultado + " valor final " + resultado * tax);
        }

        else if (em < 1000 && em > 500) {
            resultado = (em / tax) * 1.15;
            System.out.println("Valor das parcelas " + resultado + " valor final " + resultado * tax);
        } else {

            resultado = (em / tax) * 1.07;
            System.out.println("Valor das parcelas " + resultado + " valor final " + resultado * tax);
        }
    }

}