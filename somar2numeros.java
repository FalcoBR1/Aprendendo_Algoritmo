import java.util.Scanner;

public class somar2numeros {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        
        //aqui e uma soma
        System.out.println("Somar dois numeros");
        System.out.println("Digite o primeiro:");
        num1 = scn.nextInt();
        System.out.println("digite o segundo numero:");
        num2 = scn.nextInt();
        int resultado = num1 + num2;
        System.out.println("O resultado eh: " + resultado );
        
    
    }
}

