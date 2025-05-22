import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*Desenvolva um algoritmo que imprima a tabuada de um número
        fornecido pelo usuário, indo de 1 a 10. */

        int res = 0;
        int numero = 0;

        System.out.println("Digite um número para ver a tabuada de 1 ao 10: ");
        numero = scn.nextInt();
        System.out.println("Tabuada do : " + numero);

        for (int mul = 1; mul <= 10; mul++) {
            res = numero * mul;
            System.out.println(numero + " x " + mul + " = " + res);
        }

        scn.close();
    }
    
}