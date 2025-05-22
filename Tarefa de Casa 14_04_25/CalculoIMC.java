import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        /*Elabore um programa que recebe o peso e a altura de uma pessoa e calcula o
        Índice de Massa Corporal (IMC), informando se está abaixo do peso, normal,
        sobrepeso ou obeso.
        */

        double peso = 0.0; double altura = 0.0; double imc = 0.0;

        System.out.println("Calcule o valor do seu indice de massa corporal (IMC):");
        System.out.println("digite seu peso: ");
        peso = scn.nextDouble();

        System.out.println("digite sua altura: ");
        altura = scn.nextDouble();
        
        imc = peso / (altura * altura);
        System.out.println("o valor do seu IMC é de: " + imc);

        if (imc < 18.5) {
            System.out.println("Classificação - IMC inferior a 18,5 kg/m2: baixo peso.");
        } 
        else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Classificação - IMC entre 18,5 e 24,9 kg/m2: peso adequado.");
        } 
        else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Classificação - IMC entre 25,0 e 29,9 kg/m2: sobrepeso.");
        } 
        else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Classificação - IMC entre 30,0 e 34,9 kg/m2: obesidade grau I.");
        } 
        else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Classificação - IMC entre 35,0 e 39,9 kg/m2: obesidade grau II.");
        } else {
            System.out.println("Classificação - IMC igual ou superior a 40 kg/m2: obesidade grau III.");
        }
        
        scn.close();
        
    }
    
}