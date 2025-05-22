import java.util.Scanner;

public class ConversorDeMedidas {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*Desenvolva um algoritmo que recebe uma opção do usuário (metros, quilômetros,
        centímetros) e converte uma quantidade para a unidade escolhida usando 
        */

        double metros = 0.0; double km = 0.0; double cm = 0.0;
        String unidade = "";

        System.out.println("Digite a quantidade em metros: ");
        metros = scn.nextDouble();

        System.out.println("Converta a unidade a se escolher (km/m/cm): ");
        unidade = scn.next();

        // Conversão usando switch case
        //1 km equivale a 1000km e 1 metro equivale a 100m
        switch(unidade){
            case "km":
                km = metros / 1000;
                System.out.println(metros + " metros é igual a " + km + " quilômetros.");
                break;

            case "m":
                System.out.println("Você escolheu manter em metros: " + metros + " metros.");
                break;

            case "cm":
                cm = metros * 100;
                System.out.println(metros + " metros é igual a " + cm + " centímetros.");
                break;

            default:
                System.out.println("Unidade inválida use apenas: km, m ou cm.");
                break;
        }

        scn.close();
    }
}
