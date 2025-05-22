import java.util.Scanner;

public class FatorialDuplo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        /*Fatorial Duplo: Escreva um programa que solicite ao usuário um
        número inteiro positivo N e calcule e exiba o fatorial duplo desse
        número. O fatorial duplo de um número N é dado pela multiplicação
        de todos os números pares menores ou iguais a N */

        int n = 0;
        int fatorialduplo = 0;
    

        System.out.println("Digite um número positivo: ");
        n =  scn.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, digite um número positivo!");
        } else {
            fatorialduplo = 1;
        }

        for (int i = n; i >= 2; i--) {
            if (i % 2 == 0) {
                fatorialduplo *= i;
            }
        }

        System.out.println("Fatorial duplo (apenas pares) de " + n + " é: " + fatorialduplo);

        scn.close(); 

    }
    
}
