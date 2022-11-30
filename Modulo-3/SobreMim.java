import java.util.Locale;
import java.util.Scanner;

public class SobreMim {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);


        String nome = sc.next();
        String sobrenome = sc.next();
        int idade = sc.nextInt();
        double altura =sc.nextDouble();

        System.out.println("Olá me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");
    }
}





