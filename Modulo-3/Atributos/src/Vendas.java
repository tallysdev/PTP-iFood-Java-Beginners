class Vendas {
    int valorPeca, pedido, desconto, parcelas;
    String data;

    public static void pagamento(int valorPeca){

        System.out.println("O valor final da compra é " + valorPeca);

    }

    public static void pagamento(int valorPeca2, int desconto){

        System.out.println("O valor final da peça é " + (valorPeca2-desconto));
    
    }

    public static void pagamento(float valorPeca3, float parcelas, float juros){

        System.out.println("O valor final da peça é " + (((valorPeca3/parcelas)*juros)*parcelas) + " em " + parcelas);

    }

}