import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*Faça um algoritmo que solicita um número de 1 a 7 representando um dia da semana e
        informa o nome do dia correspondente.
        */

        int dia = 0;
        
        System.out.println("Digite um número de 1 a 7:");
        dia = scn.nextInt();

        switch(dia){
            case 1:
                System.out.println("Hoje é domingo.");
                break;

            case 2:
                System.out.println("Hoje é segunda-feira.");
                break;

            case 3:
                System.out.println("Hoje é terça-feira.");
                break;

            case 4:
                System.out.println("Hoje é quarta-feira.");
                break;

            case 5:
                System.out.println("Hoje é quinta-feira.");
                break;

            case 6:
                System.out.println("Hoje é sexta-feira.");
                break;

            case 7:
                System.out.println("Hoje é Sábado");
                break;

            default:
                System.out.println("Número inválido digite entre 1 a 7.");
                break;                  

        }

        scn.close();
    }
}
