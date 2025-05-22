import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*Desenvolva um algoritmo que imprima os primeiros N termos da
        sequência Fibonacci.
        */

        int n = 0; int primeiro = 0; int segundo = 1; int proximo = 0;

        System.out.println("Digite o número de termos da sequência Fibonacci: ");
        n = scn.nextInt();

        System.out.println("Sequência de Fibonacci: ");

        for (int i = 0; i < n; i++) {
            System.out.println(primeiro);
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        scn.close();

    }
}
