import java.util.Scanner;

public class Calculos_Simples {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        /*Crie um algoritmo que pede dois números e uma operação (adição,
        subtração, multiplicação ou divisão) e retorna o resultado da operação. */

        double scan = 0.0;
        int num1 = 0; int num2 = 0;

        System.out.println("CALCULE ALGO SIMPLES :) ");
        System.out.println("Digite um numero das opções que estão abaixo para dar continuidade:");
        System.out.println("1. Adição +");
        System.out.println("2. Subtração -");
        System.out.println("3. Multiplição *");
        System.out.println("4. Divisão /");
        scan = scn.nextDouble();

        System.out.println("Digite o primeiro numero: ");
        num1 = scn.nextInt();

        System.out.println("Digite o segundo numero: ");
        num2 = scn.nextInt();

        if (scan == 1) {
            System.out.println("O resultado da soma é : " + (num1 + num2));
        }
        else if (scan == 2) {
            System.out.println("O resultado da Subtração é : " + (num1 - num2));
        }
        else if (scan == 3) {
            System.out.println("O resultado da multiplição é : " + (num1 * num2));
        }
        else if (scan == 4) {
            if (num2 != 0) {
                System.out.println("O resultado da divisão é: " + ((double) num1 / num2));
            } else {
                System.out.println("Erro: divisão por zero não é permitida.");
            }     
        } else {
            System.out.println("Ops, você digitou uma opção inválida :( ");
            System.out.println("Rode o programa novamente e digite um número de 1 a 4.");
        }
            
        System.out.println("Obrigado por me usar :) ");

        scn.close();
    }

    
}