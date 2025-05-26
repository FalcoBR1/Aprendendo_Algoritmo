import java.util.Arrays;
import java.util.Scanner;

public class OrdenaVetor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*Faça um algoritmo que leia 10 números inteiros e armazene-os em um vetor. Em
        seguida, o programa deve ordenar o vetor em ordem crescente e exibir o
        resultado. */

        int[] numeros = new int[10];

        // Leitura dos números
        for(int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scn.nextInt();
        } 

        // Ordenação do vetor: é uma função pronta do Java para ordenar vetores de forma crescente.
        Arrays.sort(numeros);

        // Exibição dos números ordenados
        System.out.println("Os números em ordem crescente:");
        for (int num : numeros) {
            System.out.println(num);
        }

        scn.close();
    }
}
