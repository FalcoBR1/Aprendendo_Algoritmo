import java.util.Scanner;

public class Faixa_Etaria {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*Desenvolva um algoritmo que informa se uma pessoa é criança,
        adolescente, adulto ou idoso. */

        int idade = 0;

        System.out.println("Digite a idade: ");
        idade = scn.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.println("É uma criança. ");
        }
        else if (idade >= 13 && idade <= 17) {
            System.out.println("É um(a) adolescente. ");
        }
        else if (idade >= 18 && idade <= 59) {
            System.out.println("É um(a) adulto(a). ");
        }
        else if (idade >= 60) {
            System.out.println("É um(a) idoso(a). ");
        } else {
            System.out.println("Idade inválida. ");
        } 

        scn.close();
    }   
}
