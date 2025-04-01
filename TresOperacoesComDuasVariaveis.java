import java.util.Scanner;

public class TresOperacoesComDuasVariaveis {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int num1 = 0;
        int num2 = 0;
       //duas variaveis
        System.out.println("Digite o primeiro valor:");
        num1 = scn.nextInt();
        System.out.println("Digite o segundo valor:");
        num2 = scn.nextInt();
        //tres operacoes
        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        
        System.out.println("um valor de Soma: " + soma);
        System.out.println("um valor de Subtração: " + subtracao);
        System.out.println("um valor de Multiplicação: " + multiplicacao);
    }    
}
