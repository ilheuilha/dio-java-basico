public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal ++;
    }

    public void diminuirCanal() {
        canal --;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentou volume para:" + volume);
    }

    public void dimunirVolume() {
        volume--;
        System.out.println("Dimunuiu volume para:" + volume);
    }
    

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }




}
