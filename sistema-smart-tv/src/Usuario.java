public class Usuario {
    public static void main(String[] args) throws Exception {
    
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada:\t"+ smartTv.ligada);
        System.out.println("Canal Atual:\t" + smartTv.canal);
        System.out.println("Volume Atual:\t" + smartTv.volume);

        // ligando a TV atraves do metodo
        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada:\t"+ smartTv.ligada);

        // desligando a TV atraves do metodo
        smartTv.desligada();
        System.out.println("Novo Status -> TV ligada:\t"+ smartTv.ligada);

        // diminuindo volume:
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        //aumentando volume:
        smartTv.aumentarVolume();        
        //smartTv.aumentarVolume();
        //smartTv.aumentarVolume();

        System.out.println("Volume Atual:\t" + smartTv.volume);
        
        //mudando de canal:
        System.out.println("Canal Inicial:\t" + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual:\t" + smartTv.canal);


    }
}
