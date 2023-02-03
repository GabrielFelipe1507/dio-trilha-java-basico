public class SmartTv {

    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void ligar(){
        ligada = true;
    }

    public void desligada(){
        ligada = false;        
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando Volume para:\t" +  volume);
        //ou volume = volume + 1;
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo Volume para:\t" +  volume);
        //ou volume = volume - 1;
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
