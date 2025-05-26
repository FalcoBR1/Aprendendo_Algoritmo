import java.util.Scanner;

public class VerificaNumeroDoVetor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*Escreva um algoritmo que leia 5 números inteiros e os armazene em
        um vetor. Depois, o programa deve verificar se um número fornecido
        pelo usuário está presente no vetor e, se estiver, exibir em qual
        posição ele está.
        */

        int[] numeros = new int[5];
        int numeroProcurado = 0;

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            numeros[i] = scn.nextInt();
        }

        // Leitura do número a ser procurado
        System.out.println("Digite um número para verificar se está no vetor: ");
        numeroProcurado = scn.nextInt();

        boolean encontrado = false; // Começa como falso, ainda não achou.

        // Verificação se o número está no vetor
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroProcurado) {
                System.out.println("O número " + numeroProcurado + " está na posição " + i + " do vetor.");
                encontrado = true; // Se achar, muda pra verdadeiro.
                break;
            }
        }

        if (!encontrado) {
            System.out.println("O número " + numeroProcurado + " não foi encontrado no vetor.");
        }

        scn.close();

    }
}
