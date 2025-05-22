import java.util.Scanner;

public class CalculoFatorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*Crie um algoritmo que solicite um número e calcule o fatorial desse
        número. */

        int n = 0 ; int fatorial = 1;
        System.out.println("Digite um número para calcular o fatorial: ");
        n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println(n + "! = " + fatorial);
        
        scn.close();

    }
}
