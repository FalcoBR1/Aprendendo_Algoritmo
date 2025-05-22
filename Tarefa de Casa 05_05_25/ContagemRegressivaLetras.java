import java.util.Scanner;

public class ContagemRegressivaLetras {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*Contagem Regressiva de Letras: Faça um programa que solicite ao
        usuário uma letra e imprima uma contagem regressiva, começando
        pela letra fornecida e indo até a letra 'A'.
        */


        System.out.println("Digite uma letra entre A e Z: ");
        char letra = scn.next().toLowerCase().charAt(0);

        if (letra < 'a' || letra > 'z') {
            System.out.println("Por favor, digite uma letra válida entre A e Z.");
        } else {
            System.out.println("Contagem regressiva:");
            for (char c = letra; c >= 'a'; c--) {
                System.out.print(c + " ");
            }
        }


        scn.close();

    }
}
