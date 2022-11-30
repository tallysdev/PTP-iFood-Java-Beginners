import java.util.Scanner;
public class Desafio4 {
    
    public static void main(String[] args) {
        
        Scanner number = new Scanner(System.in);

        int num = number.nextInt();
        fizzbuzz(num);
        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num". 
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.


    }

    public static void fizzbuzz(int num) {
        if (num%3 == 0 && num%5 == 0) {
            
            System.out.println("FizzBuzz");

        } else if (num%5 == 0) {
            System.out.println("Buzz");
        
        } else if (num%3 == 0) {
            System.out.println("Fizz");           
        } else {
            System.out.println(num);
        } 
    }
}