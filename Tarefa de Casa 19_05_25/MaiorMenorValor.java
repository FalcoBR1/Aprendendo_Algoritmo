import java.util.Scanner;

public class MaiorMenorValor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*Crie um algoritmo que leia 5 valores inteiros e os armazene em um
        vetor. Em seguida, o programa deve encontrar e exibir o maior e o
        menor valor presente no vetor. */

        int[] numeros = new int[5];

        // Leitura dos 5 valores
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            numeros[i] = scn.nextInt();
        }

        // Inicializa maior e menor com o primeiro elemento
        int maior = numeros[0];
        int menor = numeros[0];

        // Verifica o maior e o menor
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Exibe os resultados
        System.out.println("\nO maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
 
        scn.close();

    }
}