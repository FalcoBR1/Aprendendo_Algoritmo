import java.util.Scanner;

public class HoraDoDia {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*Crie um algoritmo que pergunta a hora do dia e informa se é manhã, 
        tarde ou noite. 
        */

        int hora = 0;
        	    
        System.out.println("Digite a hora do dia (0 a 23): ");
        hora = scn.nextInt();
    
        if (hora >= 0 && hora < 6) {
            System.out.println(hora + " é Boa madrugada! ");
        } 
        else if (hora >= 6 && hora < 12) {
            System.out.println(hora + " horas é bom dia! É de manhã ");
        } 
        else if (hora >= 12 && hora < 18) {
            System.out.println(hora + " horas é boa tarde! ");
        } 
        else if (hora >= 18 && hora < 23) {
            System.out.println(hora + " horas é boa noite! ");
        } else {
            System.out.println("Hora inválida! Digite um valor entre 0 e 23.");
        }

        scn.close();
    }
}