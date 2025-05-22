import java.util.Scanner;

public class Verifica_Numero {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*Escreva um algoritmo que recebe um número e informa se é positivo,
        negativo ou zero. */

        int num = 0;

        System.out.println("Digite um número: ");
        num = scn.nextInt();

        if (num > 0 || num < 0) {
            if (num > 0) {
                System.out.println("O número é positivo. ");
            } else if (num < 0) {
                System.out.println("O número é negativo. ");
            }
        } else {
            System.out.println("O número é zero. ");
        }

        scn.close();

    }
}
