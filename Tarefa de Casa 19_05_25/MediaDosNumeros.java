import java.util.Scanner;

public class MediaDosNumeros {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*Escreva um algoritmo que solicite ao usuário que insira 5 números inteiros e
        armazene esses números em um vetor. Em seguida, o programa deve exibir a
        média dos números inseridos */

        int[] numeros = new int[5];
        int soma = 0;
        double media = 0;

        // leitura dos números
        for (int i = 0; i < 5; i++) {
            System.out.println("digite um número inteiro: ");
            numeros[i] = scn.nextInt();
            soma += numeros[i];
        }

        // Cálculo da média
        media = soma / 5.0;
        
        // Exibição do resultado
        System.out.println("A média dos números é: " + media);

        scn.close();

    }
}