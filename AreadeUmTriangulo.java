import java.util.Scanner;

public class AreadeUmTriangulo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*Elabore um algoritmo para calcular a área de um triangulo. Ao final, a
        mensagem que deve ser exibida é: A área do triangulo com base X e
        altura Y é: área”; (base*altura / 2). */

        int base = 0;
        int altura = 0;
       
        System.out.println("Calculo da área de um triangulo");
        System.out.println("Digite o valor da base X: ");
        base = scn.nextInt();
        
        System.out.println("Digite o valor da altura Y: ");
        altura = scn.nextInt();

        int resultado = (base * altura) / 2;
        System.out.println("A área do triangulo com a base X " + base + " e altura Y " + altura + " é: " + resultado );
    
        scn.close();

    }
}