import java.util.Scanner;

public class InverteNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Crie um algoritmo que leia 10 nomes de pessoas e os armazene em um vetor. Em
        seguida, o programa deve exibir esses nomes em ordem inversa, ou seja, do
        último ao primeiro. */

        String[] nomes = new String[10];
        
        // Ler os 10 nomes
        for(int i = 0; i < 10; i++) {
           System.out.println("Digite o " + (i + 1) + "º nome:"); 
           nomes[i] = sc.nextLine();
        }

        // Exibir os nomes na ordem inversa
        System.out.println("nomes na ordem inversa:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(nomes[i]);
        }

        sc.close();

    }
}
