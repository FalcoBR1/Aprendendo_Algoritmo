import java.util.Scanner;

public class ContagemDeVogaisConsoantes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*• Contagem de Vogais e Consoantes: Faça um algoritmo que conte o
        número de vogais e consoantes em uma frase inserida pelo usuário.
        Ignore espaços em branco e pontuação. Abaixo algumas coisas que
        podem precisar:
        • char caractere = frase.charAt(i); (Recupera o caracter de uma string pela
        posição dela na string)
        • caractere >= 'a' && caractere <= ‘z’ (essa condição é válida para verificar se
        um caractere é uma letra.
        */

        String frase = "";
        int vogais = 0;
        int consoantes = 0;
        char caractere = 0;

        System.out.println("Digite uma frase: ");
        frase = scn.nextLine().toLowerCase(); // Converte para minúsculas;

        //retorna quantos caracteres há naquela string usando o método length()
        for (int i = 0; i < frase.length(); i++) {
            caractere = frase.charAt(i);
            // Verifica se é uma letra (de 'a' a 'z')
            if (caractere >= 'a' && caractere <= 'z') {
                // Verifica se é vogal ou consoante
                if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                    vogais++;
                } else {
                    consoantes++;
                }
            }   
        }

        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);

        scn.close();

    }
}