class Vendas {
    int valorPeca, desconto, parcelas, juros;
    String pedido, data;


    Vendas(){

    }

    Vendas(int valorPeca, int desconto, int parcelas, int juros, String pedido, String data){

        this.valorPeca = valorPeca;
        this.desconto = desconto;
        this.parcelas = parcelas;
        this.juros = juros;
        this.pedido = pedido;
        this.data = data;

    }

    void setPedido(String pedido){
        this.pedido = pedido;
    }

    void setValorPeca(int valorPeca){
        this.valorPeca = valorPeca;
    }

    public String getPedido() {
        return pedido;
    }

    public int getValorPeca() {
        return valorPeca;
    }

    public static void pagamento(int valorPeca){

        System.out.println("O valor final da compra é " + valorPeca);

    }

    public static void pagamento(int valorPeca, int desconto){

        System.out.println("O valor final da peça é " + (valorPeca-desconto));
    
    }

    public static void pagamento(int valorPeca, int parcelas, int juros){

        System.out.println("O valor final da peça é " + (((valorPeca/parcelas)*juros)*parcelas) + " em " + parcelas);

    }

}