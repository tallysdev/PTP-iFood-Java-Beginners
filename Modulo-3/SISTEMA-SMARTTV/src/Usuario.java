public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV esta ligada? " +smartTv.ligada);
        System.out.println("Canal da TV: " +smartTv.canal);
        System.out.println("Volume da TV: " +smartTv.volume);

        smartTv.passarCanal();
        smartTv.ligar();
        smartTv.diminuirV();

        smartTv.escolherCanal(19);

        System.out.println("TV esta ligada? " +smartTv.ligada);
        System.out.println("Canal da TV: " +smartTv.canal);
        System.out.println("Volume da TV: " +smartTv.volume);

    
    }
}
