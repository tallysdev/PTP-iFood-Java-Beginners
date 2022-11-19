import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Vendas.pagamento(150);
        Vendas.pagamento(150, 25);
        Vendas.pagamento(150.0f,5.0f,1.07f);
    }
}
