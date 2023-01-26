public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
       
        byte idade = 123;
        short ano = 2021;
        int cep  = 21070333;
        long cpf = 9878921223L;
        float pi = 3.14F;
        double salario = 1275.33;
        double salarioMinimo = 25000;

        //aula4: tipos de variaveis:
        // exemplos de mudanças de valores recebidos por variaveis:
        int numero = 1;

        numero = 10;

        System.out.println("O Numero a ser printado será o ultimo recebido pela variavel numero:\t");
        System.out.println("Numero:\t" + numero);
        
        // como não deixar o valor recebido ser alterado?
        // o "final" não permite mais que essa variavel (valor) altere:
        final double valor = 2000;

        // se por exemplo eu colocar outro valor já dará um erro na variavel pois nao 
        //é permitido que ela se altere:
        //valor = 2;
        


    }
}
