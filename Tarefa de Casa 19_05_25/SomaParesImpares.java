import java.util.Scanner;

public class SomaParesImpares {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        /*Escreva um algoritmo que leia quantos números inteiros o usuário quiser
        informar, e os armazene em um vetor. Em seguida, o programa deve exibir a
        soma dos números pares e a soma dos números ímpares.
        */

        // Perguntar a quantidade de números a serem informados
        System.out.println("Quantos números você quer informar? ");
        int quantidade = scn.nextInt();

        int[] numeros = new int[quantidade];
        int somaPares = 0;
        int somaImpares = 0;
        
        // Ler os números e calcular as somas
        for(int i = 0; i < quantidade; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scn.nextInt();

            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];

            } else {
                somaImpares += numeros[i];
            }
        }

        // Mostrar os resultados
        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);

        scn.close();
    }
}
