import java.util.Scanner;

public class SomaPares {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*Elabore um algoritmo que solicite um número N ao usuário e calcule
        a soma dos números pares de 1 até N. */

        int n = 0; int soma = 0;

        System.out.println("Some numeros pares");
        System.out.println("Digite um número N: ");
        n = scn.nextInt();

        System.out.println("Números pares somados: ");
        for (int num = 1; num <= n; num++) {
            if (num % 2 == 0) { 
                System.out.println(num);
                soma += num; 
            }
        }
        
        System.out.println("A soma dos números pares de 1 até " + n + " é: " + soma);

        scn.close();
        
    }
}
