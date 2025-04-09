import java.util.Scanner;

public class AreaDeUmCirculo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double pi = 3.14;
        int raio = 0;

        System.out.println("Calcule a área de um circulo:");
        System.out.println("Digite o valor do raio:");
        raio = scn.nextInt();
         /*Java não possui um operador aritmético direto para exponenciação,
         como ^ em algumas outras linguagens. Para calcular potências,
         você pode usar o método Math.pow(base, expoente)*/
        double area = pi * Math.pow(raio, 2);
        System.out.println("Multiplicando o Pi e raio " + raio + " e depois elevado a 2 o valor da area é: " + area);





        
    }
    
}
