import java.util.Scanner;

public class CalculodeUmQuadrado {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        /*Escreva um algoritmo que atribua um valor a uma variável num,
        calcule o quadrado desse número e atribua o resultado à mesma
        variável num, e imprima num.
        */

        int num = 0;
                
        System.out.println("digite um numero: ");
        num = scn.nextInt();

        int resultado = num * num;
        System.out.println("o valor ao quadrado e: " + resultado);
       
        scn.close();

    } 
}
