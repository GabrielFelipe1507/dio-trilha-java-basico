import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner leitura = new Scanner(System.in);

        //Calculadora:
        System.out.println("Calculadora:");
        Calculadora.soma(2, 4);
        Calculadora.subtracao(4, 5);
        Calculadora.multiplicacao(3, 3);
        Calculadora.divisao(2, 1);

        //Mensagem:
        int hora;

        System.out.println("Mensagem:");
        
        do{
        System.out.println("Você pode ganhar um Bom Dia, Boa Tarde ou Boa Noite");
        System.out.println("Digite um Horário do Dia:\t");
        hora = leitura.nextInt();

        Mensagem.obterMensagem(hora);

        }while(hora >= 0 && hora <=24);
        
        //Empréstimo:
        System.out.println("Empréstimo:");

        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 10);

    }
}
