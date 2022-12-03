import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> resposta = new ArrayList<>();
        String digito;
        System.out.println("Telefonou para a vítima?");
        digito = sc.next();
        resposta.add(digito);
        System.out.println("Esteve no local do crime?");
        digito = sc.next();
        resposta.add(digito);
        System.out.println("Mora perto da vítima?");
        digito = sc.next();
        resposta.add(digito);
        System.out.println("Devia para a vítima?");
        digito = sc.next();
        resposta.add(digito);
        System.out.println("Já trabalhou com a vítima?");
        digito = sc.next();
        resposta.add(digito);
        int contador = 0;
        for (String string : resposta) {
            if (string.equals("S") || string.equals("s")) {
                contador ++;
            }
        }
        if (contador == 2) {
            System.out.println("Suspeita");
        } else if (contador >2 && contador <5) {
            System.out.println("Cúmplice");
        } else if (contador == 5) {
            System.out.println("Assasina");
        } else {
            System.out.println("Inocente");
        }
    }

}


// Utilizando listas, faça um programa que faça 5 perguntas para uma
// pessoa sobre um crime. As perguntas são:

// "Telefonou para a vítima?"

// "Esteve no local do crime?"

// "Mora perto da vítima?"

// "Devia para a vítima?"

// "Já trabalhou com a vítima?"

// Se a pessoa digitoponder positivamente a 2 questões ela deve ser
// classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
// "Assassina". Caso contrário, ela será classificado como "Inocente".