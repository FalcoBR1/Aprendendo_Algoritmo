import java.util.Scanner;

public class Qual_Numero_E_Maior {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //Crie um algoritmo que diga qual é o maior de dois números.
        
        int num1 = 0; int num2 = 0;

        System.out.println("Digite dois números e veja qual e o maior entre eles ou se são iguais:");
        System.out.println("Digite o primeiro número: ");
        num1 = scn.nextInt();
        
        System.out.println("Digite o segundo número:  ");
        num2 = scn.nextInt();

        if (num1 == num2) {
            System.out.println("Os dois números são iguais");
        } else {
            if (num1 > num2) {
                System.out.println("O número maior é: " + num1);
            } else {
                System.out.println("O número maior é: " + num2);
            }
        }
        
        System.out.println("Espero ter ajudado você saber qual é o número maior ou se ele é igual :)");
        
        scn.close();
    }
}

