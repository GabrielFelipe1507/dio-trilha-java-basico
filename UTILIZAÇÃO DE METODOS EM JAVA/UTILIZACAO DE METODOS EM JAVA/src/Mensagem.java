public class Mensagem {
    
    //aqui neste método mostrará uma mensagem de acordo com a hora digitada na classe main
    public static void obterMensagem(int hora){

        if(hora >=0 && hora<13){
            System.out.println("Bom Dia");
        }else if(hora>=13 && hora <19){
            System.out.println("Boa Tarde");
        }else if(hora>=19 && hora <=24){
            System.out.println("Boa Noite");
        }else{
            System.out.println("******** Digite uma Hora Válida ******** - Formato: 0 às 24 horas");
        }
    }
}

