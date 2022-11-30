package arry;

import java.util.Scanner;

class atv2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] consoantes = new String[6];
        int contador = 0;
        int resultado = 0;
        for (int i = 0; i < consoantes.length; i++) {
            
            System.out.print("Informe um letra\t");
            String letra = sc.next();
            
            if (!(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u") )) {
                consoantes[contador] = letra;
                
            }

            contador++;

        }

        for (String string : consoantes) {
            if (string != null) {
                resultado++;
                System.out.println(string);    
            }
        }

        System.out.println("\n"+resultado);

    }
}