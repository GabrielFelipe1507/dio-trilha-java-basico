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

          // estruturas condicionais:

            int a, b;

            a= 5;
            b= 6;

                String resultado = "";
                    if(a==b)
                        resultado = "verdadeiro";
                    else{
                        resultado = "falso";
                    }
            System.out.println(resultado);

        // exemplo 2 com boolean:
            int numero1 = 1;
            int numero2 = 2;

            boolean simNao = numero1 == numero2;
            boolean simNao1 = numero2 > numero1;

            System.out.println("Número 1 é Igual ao Número 2?:\t" + simNao);                    
            System.out.println("Número 2 é Maior que o Número 2?:\t" + simNao1); 

        // exemplo 3 com String e boolean:

            String nomeUm = "Gabriel";
            String nomeDois = "Gustavo";

            boolean simNao2 = nomeUm == nomeDois;

            System.out.println("Nome 1 é igual a Nome 2?:\t" +simNao2);
        
        // exemplo 4 condição verdadeira sim  ou nao ?: utilizando o "&&" e o "||" no if:
            boolean number1 = true;
            boolean number2 = false;

            // aqui vai checar se as duas condições acima são verdadeiras:
            if(number1 && number2){
                System.out.println("AS DUAS SÃO VERDADEIRAS");
            }else if(number1 || number2){
                System.out.println("UMA SÓ É FALSA");
            }else{
                System.out.println("AS DUAS SÃO FALSAS");
            }      

    }
}
