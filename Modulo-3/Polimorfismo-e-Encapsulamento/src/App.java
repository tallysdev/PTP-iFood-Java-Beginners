public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        Mae[] classes = new Mae[]{new filha1(), new filha2(), new Mae()};

        for (Mae mae : classes) {
            mae.metodo1();
        }

        for (Mae mae : classes) {
            mae.metodo2();
        }


        System.out.println(" ");

        filha2 filha2 = new filha2();
        filha2.metodo2();

    }
}
