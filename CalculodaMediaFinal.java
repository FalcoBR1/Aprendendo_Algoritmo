import java.util.Scanner;

public class CalculoDaMediaFinal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int AC1 = 0; int AC2 = 0; int AG = 0; int AF = 0;
        double resultado = 0;

        System.out.println("Calcule sua media final :)");
        System.out.println("Digite a sua nota da AC1:");
        AC1 = scn.nextInt();
        System.out.println("Digite a sua nota da AC2:");
        AC2 = scn.nextInt();
        System.out.println("Digite a sua nota da AG:");
        AG = scn.nextInt();
        System.out.println("Digite a sua nota da AF:");
        AF = scn.nextInt();
        
        //usei a conversão (cast)
        resultado = (double)(AC1 * 0.15) + (AC2 * 0.30) + (AG * 0.10) + (AF * 0.45);

        System.out.println("A soma da nota da AC1, AC2, AG, AF o resultado da sua média final é: " + resultado);
        System.out.println("Se você tirou uma nota mínima que é: 5.0");
        System.out.println("Parabéns você passou :)");




    }
}
