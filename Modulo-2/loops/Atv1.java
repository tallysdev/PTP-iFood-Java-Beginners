// package loops;

import java.util.Scanner;

class Atv1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome");
        String nome = sc.next();
        System.out.println("Idade:");
        int idade = sc.nextInt();

        while (nome.equals(nome) != nome.equals("0")) {

            System.out.println("Informe o nome");
            nome = sc.next();
            System.out.println("Idade:");
            idade = sc.nextInt();

        }
    }
}