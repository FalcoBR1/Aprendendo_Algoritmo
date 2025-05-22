import java.util.Scanner;

public class CalculadoraComDoWhile{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*Crie um algoritmo que simula uma calculadora simples. O usuário
        deve fornecer dois números e escolher a operação desejada (+, -, *,
        /). O algoritmo deve continuar perguntando ao usuário se deseja
        continuar calculando.
        */

        int a = 0, b = 0, esc = 0;
        double resultado = 0.0;
        String op = "";
        String mensagem = "";

        System.out.println("Calculadora simples");
        System.out.println("Digite um número e depois outro e escolha qual operação vai usar para calcular a conta:");
        
        do {
            System.out.println("Digite o primeiro valor");
            a = scn.nextInt();

            System.out.println("Digite o segundo valor");
            b = scn.nextInt();

            System.out.println("Digite a operação (+ - * /)");
            op = scn.next();

            switch(op){
                case "+":
                    resultado = a + b;
                    mensagem = " da soma ";
                    break;

                case "-":
                    resultado = a - b;
                    mensagem = " da subtracao ";
                    break;

                case "*":
                    resultado = a * b;
                    mensagem = " da multiplicacao ";
                    break;

                case "/":
                    if (b != 0) {
                        resultado = (double) a / b;
                        mensagem = " da divisao ";
                    } else {
                        resultado = -1;
                        System.out.println("Impossivel dividir por 0");
                    }
                    break;
                    
                default:
                    System.out.println("Operacao invalida");
            }

            System.out.println("O resultado" + mensagem + " eh: " + resultado);

            System.out.println("Deseja calcular denovo? 1- sim/ 2- Não");
            esc = scn.nextInt();

        } while (esc != 2);

        System.out.println("Obrigador por usar a calculadora simples :) !!");

        scn.close();
    }
}
