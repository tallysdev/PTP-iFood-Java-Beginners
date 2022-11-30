import java.util.Scanner;

public class Menssagem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Poderia me informar a hora por favor?");
        int hora = sc.nextInt();
        dia(hora);
    }

    public static void dia(int hora) {

        if (hora >= 5 && hora <= 12) {
            System.out.println("\tEstá de Manhã");
        } else if (hora >= 13 && hora <= 18) {
            System.out.println("\tEstá de Tarde");
        } else if (hora >= 19 && hora <= 24) {
            System.out.println("\t Está de Noite");
        } else {
            System.out.println("\tEita, Magrugada");

        }
    }

}