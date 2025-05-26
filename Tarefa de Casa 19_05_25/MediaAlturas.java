import java.util.Scanner;

public class MediaAlturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Faça um algoritmo que solicite ao usuário que digite a altura de 5 pessoas.
        Armazene essas alturas em um vetor e, em seguida, exiba a altura média. */

        double[] alturas = new double[5];
        double soma = 0, media = 0;

        // ler as 5 alturas
        for(int i = 0; i < 5; i++) {
            System.out.println("Digite a altura da " + (i + 1) + "º pessoa:");
            alturas[i] = sc.nextDouble();
        }

        // Calcular a média
        media = soma / 5;
        
        // Mostrar a média
        System.out.println("A altura média é: " + media);

        sc.close();

    }
}
