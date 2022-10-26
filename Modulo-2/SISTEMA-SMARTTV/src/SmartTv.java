public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;



    public void amentarV(){
        volume++;
    }
    public void diminuirV(){
        --volume;
    }
    public void passarCanal(){
        canal++;
    }
    public void voltarCanal(){
        --canal;
    }
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
}