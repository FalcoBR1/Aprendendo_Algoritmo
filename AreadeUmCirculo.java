import java.util.Scanner;

public class AreadeUmCirculo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        /*Elabore um algoritmo para calcular a área de um círculo. O cálculo é
        pi*raio ^ 2. Considere pi = 3,14. */
        
        double pi = 3.14;
        double raio = 0;

        System.out.println("Calcule a área de um circulo");
        System.out.println("Digite o valor do raio:");
        raio = scn.nextInt();

        double area = pi * (raio * raio);
        System.out.println("Multiplicando o Pi e raio " + raio + " ao quadrado o valor da area é: " + area);

        scn.close();
    }
    
}
