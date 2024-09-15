public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();

        System.out.println("Smart TV ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        
        
        smartTv.dimunirVolume();
        smartTv.dimunirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Canal mudou para: " + smartTv.canal);

        smartTv.ligar ();
        System.out.println("novo status -> Tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("novo status -> Tv ligada? " + smartTv.ligada);

    }
}
