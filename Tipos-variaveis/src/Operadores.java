import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
          // com o "%" eu checo se existe o resto da seguinte divisão:
          double modulo = 18 % 6;

          // concatenação de variaveis em um unico resultado:
          // o "+" ele serve para unir, concatenar, igual o caso abaixo:
          String nomeCompleto = "GABRIEL" + "FELIPE";

          System.out.println("nome completo:\t" + nomeCompleto);

          double num1, num2;

          System.out.println("Digite um Valor para o Numero 1:\t");
          num1 = leitura.nextDouble();

          System.out.println("Digite um Valor para o Numero 2:\t");
          num2 = leitura.nextDouble();

          double soma = num1 + num2;

          System.out.println("soma:\t" + soma);

          double divisao = num1/num2;

          System.out.println("divisao:\t" + divisao);

          double multiplicacao = num1 * num2;

          System.out.println("multiplicacao:\t" + multiplicacao);

          double subtracao = num1 - num2;

          System.out.println("subtração:\t" + subtracao);

    }
}
