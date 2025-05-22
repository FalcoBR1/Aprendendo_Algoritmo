import java.util.Scanner;
public class Media3Valores{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*Elabore um algoritmo para calcular a média de 3 valores,
        porém utilizando apenas duas variáveis.
        */

        double soma = 0.0;
        int valor = 0;

        System.out.println("Digie o primeiro numero");
        valor = scn.nextInt();
        soma = valor;

        System.out.println("Digite o segundo valor");
        valor = scn.nextInt();
        soma = valor + soma;

        System.out.println("Digite o tercdero");
        valor = scn.nextInt();
        soma = valor + soma;
        soma = soma / 3;
        
        System.out.println("Media: " + soma);
        
        scn.close();
    }   
}
