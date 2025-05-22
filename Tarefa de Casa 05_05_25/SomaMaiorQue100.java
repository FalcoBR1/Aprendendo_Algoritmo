import java.util.Scanner;

public class SomaMaiorQue100 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*Escreva um algoritmo que pede para o usuário digitar números até
        que a soma desses números seja maior que 100. */

        double numero = 0, soma = 0;

        System.out.println("digite números até que a soma seja maior que 100");
       
        while (soma <= 100) {
            System.out.println("digite um número:");
            numero = scn.nextDouble();

            soma += numero;
            System.out.println("soma atual: " + soma);       
        }  
        
        System.out.println("A soma ultrapassou 100! soma final: " + soma);

        scn.close();
            
    }
}
