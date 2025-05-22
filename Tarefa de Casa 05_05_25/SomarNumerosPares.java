import java.util.Scanner;

public class SomarNumerosPares {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /* Soma de Números Pares: Escreva um programa que calcule a soma
        dos primeiros N números pares. O valor de N é fornecido pelo
        usuário. */
        
        int n = 0;
        int soma = 0;

        System.out.println("Digite o valor de n: ");
        n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
           soma += i * 2; // Multiplica o número por 2 para obter o próximo par  
        }

        System.out.println("A soma dos primeiros " + n + " números pares é: " + soma);
            
        scn.close();
        
    }
} 