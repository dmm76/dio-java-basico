public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("Volume atual: " + smartTv.volume + "\n");

        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume + "\n");

        System.out.println("Smart TV ligada ? " + smartTv.ligada);

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.selecionarCanal(22);
        System.out.println("Canal atual: " + smartTv.canal + "\n");
        

        smartTv.ligar();
        System.out.println("Novo Status -> Smart TV ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Smart TV ligada ? " + smartTv.ligada);
    }
    
}
