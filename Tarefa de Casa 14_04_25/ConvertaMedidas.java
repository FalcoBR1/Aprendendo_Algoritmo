import java.util.Scanner;

public class ConvertaMedidas {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        /*Desenvolva um algoritmo que converte uma quantidade de metros para
        quilômetros, metros ou centímetros, com base em uma escolha do usuário 
        */

        double metros = 0.0; double km = 0.0; double cm = 0.0;
        int opcao = 0;

        // Entrada do valor em metros
        System.out.println("Digite a quantidade em metros: ");
        metros = scn.nextDouble();

        // Menu de opções
        System.out.println("escolha para qual unidade deseja converter:");
        System.out.println("Digite a opção (1, 2 ou 3):");
        System.out.println("1. Quilômetros");
        System.out.println("2. Centímetros");
        System.out.println("3. Manter em Metros");
        opcao = scn.nextInt();

        //Conversão de acordo com a opção
        //1 km equivale a 1000km e 1 metro equivale a 100m
        if (opcao == 1) {
            km = metros / 1000;
            System.out.println(metros + " metros é igual a " + km + " quilômetros.");
        }
        else if (opcao == 2) {
            cm = metros * 100;
            System.out.println(metros + " metros é igual a " + cm + " centímetros.");
        }
        else if (opcao == 3) {
            System.out.println("Você escolheu manter em metros: " + metros + " metros.");
        } else {
            System.out.println("Opção inválida! Por favor, escolha 1, 2 ou 3. ");
        }

        scn.close();
        
    }
}
