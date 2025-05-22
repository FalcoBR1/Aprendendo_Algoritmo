import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*Desenvolva um programa que pede um ano e determina se ele é bissexto
        ou não.*/

        int ano = 0;
     
        System.out.println("Digite um ano: ");
        ano = scn.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
        
        scn.close();
    }
}