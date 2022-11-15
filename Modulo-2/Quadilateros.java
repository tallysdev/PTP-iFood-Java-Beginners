import java.util.Scanner;

public class Quadilateros {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double areaQuadrado = quadilaterosNoatveis(12.0);
        double areaRetangulo = quadilaterosNoatveis(12.0, 5);
        float areaTriangulo = quadilaterosNoatveis(2.5f, 5.5f);

        System.out.println("Area do quadrado " + areaQuadrado + " Area do retangulo " + areaRetangulo + " Area do triangulo " + areaTriangulo);

    }

    public static double quadilaterosNoatveis(double lado){

        double area = lado*lado;

        return area;

    }

    public static double quadilaterosNoatveis(double lado1, double lado2){

        double area = lado1*lado2;

        return area;
        
    }

    public static float quadilaterosNoatveis(float lado1, float lado2){

        float area = (lado1*lado2)/2;

        return area;
        
    }
}