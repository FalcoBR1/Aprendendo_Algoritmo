import java.util.Scanner;

public class PadraoDeEstrelas {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*Padrão de Estrelas: Escreva um programa que imprima um padrão de
        estrelas conforme o exemplo a seguir. Quantidade de linhas é variavel
        e informado pelo usuário.
        *
        **
        ***
        ****
        *****
        */
        
        int linhas = 0;

        System.out.println("Digite o número de linhas: ");
        linhas = scn.nextInt();

        for (int i = 1; i <= linhas; i++) {
            for (int estrelas = 1; estrelas <= i; estrelas++) {
                System.out.print("* ");
            }
            System.out.println(); // Pula para a próxima linha após imprimir as estrelas
        }

        scn.close();

    
        
    }
}