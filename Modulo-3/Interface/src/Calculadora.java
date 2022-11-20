class Calculadora implements OperacoesMaematicas {

    @Override
    public void soma(int num1, int num2) {
        System.out.println("soma " + (num1 + num2));
        
    }

    @Override
    public void sub(int num1, int num2) {
        System.out.println("sub "  + (num1 - num2));
        
    }

    @Override
    public void mult(int num1, int num2) {
        System.out.println("mult " + (num1 * num2));
        
    }

    @Override
    public void div(int num1, int num2) {
        System.out.println("div" + (num1 / num2));
        
    }

}