import java.util.Scanner;

public class EventosDoAno {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*Elabore um programa que solicita um mês do ano e utiliza switch case para informar
        eventos especiais que ocorrem nesse mês.
        */

        int mes = 0;

        System.out.println("Digite o numero do mês (1 a 12) do ano: ");
        mes = scn.nextInt();

        switch(mes){
            case 1:
                System.out.println("Janeiro:");
                System.out.println("* Confraternização Universal e Ano Novo (01/01)");
                System.out.println("* Dia de Reis (06/01)");
                System.out.println("* Aniversario de São Paulo (25/01)");
                break;

            case 2:
                System.out.println("Fevereiro:");
                System.out.println("* Dia Mundial do Câncer (04/02)");
                System.out.println("* Dia de São Valentim 14/02");
                break;

            case 3:
                System.out.println("Março:");
                System.out.println("* Carnaval (01/03 a 04/03)");
                System.out.println("* Cinzas (05/03)");
                System.out.println("* Dia Internacional da Mulher (08/03)");
                break;

            case 4:
                System.out.println("Abril:");
                System.out.println("* Paixão de Cristo (18/04)");
                System.out.println("* Páscoa (20/04)");
                System.out.println("* Tiradentes (21/04)");
                break;

            case 5:
                System.out.println("Maio:");
                System.out.println("* Dia do trabalho (01/05)");
                System.out.println("* Dia das Mães (11/05)");
                break;

            case 6:
                System.out.println("Junho:"); 
                System.out.println("* Corpus Christi (19/06)");
                System.out.println("* Dia de São João (24/06)"); 
                break;

            case 7:
                System.out.println("Julho:");
                System.out.println("* Férias escolares em muitas escolas data pode ser variável"); 
                break;

            case 8:
                System.out.println("Agosto:");
                System.out.println("* Dia dos País (10/08)");
                break;  
                 
            case 9:
                System.out.println("Setembro:");  
                System.out.println("* Dia da Independência do Brasil (07/09)"); 
                System.out.println("* Dia da Árvore (21/09)");
                break;

            case 10:
                System.out.println("Outubro:");
                System.out.println("* Dia das Crianças e Nossa Senhora Aparecida (12/10)");
                System.out.println("* Dia do Professor (15/10)");
                System.out.println("* Dia Comerciário (17/10)");
                System.out.println("* Dia do Servidor Público (28/10)");
                System.out.println("* Dia das Bruxas ou Halloween (31/10)");
                break;

            case 11:
                System.out.println("Novembro:"); 
                System.out.println("* Finados (02/11)");
                System.out.println("* Proclamação da República (15/11)");
                System.out.println("* Dia da Consciência Negra (20/11)");
                break;

            case 12:
                System.out.println("Dezembro:");
                System.out.println("* Véspera de Natal (24/12)");
                System.out.println("* Natal (25/12)");
                System.out.println("* Véspera de Ano Novo (31/12)");
                break;
                
            default:
                System.out.println("Mês inválido. Por favor, digite um número de 1 a 12.");        
       
        }

        scn.close();
    }
}