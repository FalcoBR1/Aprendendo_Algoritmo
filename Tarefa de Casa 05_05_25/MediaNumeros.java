import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*Faça um algoritmo que peça para o usuário digitar vários números e
        calcule a média desses números. O algoritmo deve parar quando o
        usuário digitar zero. */
        
        double numero = 0, soma = 0, media = 0;
        int contador = 0;

        System.out.println("digite números para calcular a média");
        System.out.println("Digite 0 para encerrar");
        System.out.println("digite um número:");
        numero = scn.nextDouble();

        while (numero != 0) {
            soma += numero;
            contador++;

            System.out.println("digite um número:");
            numero = scn.nextDouble();
        }

        if (contador == 0) {
            System.out.println("nenhum número foi inserido.");
        } else {
            media = soma / contador;
            System.out.println("A média dos números digitados é: " + media);
        }

        scn.close();
    }
}
