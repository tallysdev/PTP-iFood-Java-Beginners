import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Vendas sapato = new Vendas();
        sapato.setData("dd/mm/aaaa");
        sapato.setDesconto(20);
        sapato.setJuros(2);
        sapato.setParcelas(8);
        sapato.setPedido("sapato social");
        sapato.setValorPeca(150);

        System.out.println(sapato.getData());
        System.out.println(sapato.getDesconto());
        System.out.println(sapato.getJuros());
        System.out.println(sapato.getParcelas());
        System.out.println(sapato.getPedido());
        System.out.println(sapato.getValorPeca());
        
        Vendas.pagamento(sapato.valorPeca);
        Vendas.pagamento(sapato.valorPeca, sapato.desconto);
        Vendas.pagamento(sapato.valorPeca,sapato.parcelas,sapato.juros);
    }
}
