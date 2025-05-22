import java.util.Scanner;

public class TipoDeTriangulo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*Escreva um programa que pede três comprimentos e classifica o triângulo
        como equilátero, isósceles ou escaleno. */

        double lado1 = 0; double lado2 = 0; double lado3 = 0;

        System.out.println("Digite o comprimento do lado 1: ");
        lado1 = scn.nextDouble();

        System.out.println("Digite o comprimento do lado 2: ");
        lado2 = scn.nextDouble();
        
        System.out.println("Digite o comprimento do lado 3: ");
        lado3 = scn.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo é equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("O triângulo é isósceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Os valores fornecidos não formam um triângulo válido.");
        }

        scn.close();
    }
}