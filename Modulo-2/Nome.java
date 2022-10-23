public class Nome {
    public static void main(String[] args) {
        
        String nome1 = "Tallys";
        String nome2 = "Aureliano";
    
        String nomeCompleto = nomeCompleto(nome1, nome2);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Meu nome " + primeiroNome.concat(" ").concat(segundoNome);
    }
}