import java.util.*;

class Exercicio1 {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Random rd = new Random();
        
        List<Integer> semestre = new ArrayList<Integer>();
        int temp;
        for (int i = 0; i < 6; i++) {
            temp = rd.nextInt(45);
            semestre.add(temp);
        }
        System.out.println(semestre);

        int soma = 0;
        int med = 0;
        for (Integer integer : semestre) {
            soma = soma + integer;
            med = soma/6;
        }

        for (int i = 0; i < semestre.size(); i++) {
            
            if (semestre.get(i) > med) {
                
                if (i == 0) {
                    System.out.println("A temperatura em Janeiro foi " + semestre.get(i) + ", maior que a media semestral " + med);
                }   
                else if(i == 1) {
                    System.out.println("A temperatura em Fevereiro foi " + semestre.get(i) + ", maior que a media semestral " + med);    
                }
                else if(i == 2) {
                    System.out.println("A temperatura em Março foi " + semestre.get(i) + ", maior que a media semestral " + med);    
                }
                else if(i == 3) {
                    System.out.println("A temperatura em Abril foi " + semestre.get(i) + ", maior que a media semestral " + med);    
                } 
                else if(i == 4) {
                    System.out.println("A temperatura em Maio foi " + semestre.get(i) + ", maior que a media semestral " + med);    
                } 
                else {
                    System.out.println("A temperatura em Junho foi " + semestre.get(i) + ", maior que a media semestral " + med);    
                }
            }
        }   
    }
}
