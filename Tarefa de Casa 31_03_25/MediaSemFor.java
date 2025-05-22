import java.util.Scanner;

public class MediaSemFor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*Elabore um algoritmo para calcular a média de 3 valores, porém
        utilizando apenas duas variáveis. */
        
        double valor = 0; double soma = 0;

        System.out.println("Digite o 1 valor: ");
        valor = scn.nextDouble();
        soma += valor;

        System.out.println("Digite o 2 valor: ");
        valor = scn.nextDouble();
        soma += valor;

        System.out.println("Digite o 3 valor: ");
        valor = scn.nextDouble();
        soma += valor;

        System.out.println("A média dos 3 valores é:" + (soma / 3));
 
        scn.close();
    }
}