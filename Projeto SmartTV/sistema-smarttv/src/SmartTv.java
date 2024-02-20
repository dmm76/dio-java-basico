public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarCanal(){
        //canal = canal + 1
        canal++;
    }

    public void diminuirCanal(){
        //canal = canal - 1
        canal--;
    }

    public void selecionarCanal(int novoCanal){
        //escolher canal;
        canal = novoCanal;
    }
    public void aumentarVolume(){
        //volume = volume +1
        volume++;
        System.out.println("Aumentando Volume: " + volume);
    }

    public void diminuirVolume(){
        //volume = volume -1
        volume--;
        System.out.println("Diminuindo Volume: " + volume);
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
}
