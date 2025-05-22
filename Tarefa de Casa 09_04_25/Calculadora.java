import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int a = 0; int b = 0;
        double resultado = 0.0;
        String op = "";
        String mensagem = "";
        
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

        scn.close();
    }
}
