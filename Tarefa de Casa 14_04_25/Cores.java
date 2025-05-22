import java.util.Scanner;

public class Cores {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*Desenvolva um algoritmo que solicita ao usuário inserir o nome de uma cor
        (representado por uma string, por exemplo, "vermelho", "azul", "verde") e utiliza switch
        case para informar características específicas sobre essa cor. (Ex: Azul é cor do céu e dos
        mares)
        */

        String cores = "";

        System.out.println("Digite um nome de uma cor dentre elas voce pode escolher:");
        System.out.println("* vermelho");
        System.out.println("* laranja");
        System.out.println("* amarelo");
        System.out.println("* verde");
        System.out.println("* azul");
        System.out.println("* roxo");
        System.out.println("* branco");
        System.out.println("* preto");
        System.out.println("* rosa");
        System.out.println("* marrom");
        cores = scn.next();

        switch(cores){
            case "vermelho":
                System.out.println("Significa: Paixão, amor, energia, força, coragem, perigo");
                System.out.println("Usado em: Datas românticas, alertas, sinalizações de atenção");
                break;

            case "laranja":
                System.out.println("Significa: Criatividade, entusiasmo, diversão, ação, juventude");
                System.out.println("Usado em: Campanhas animadas, marcas alegres, esportes");
                break;

            case "amarelo":
                System.out.println("Significa: Alegria, otimismo, luz, inteligência, prosperidade");
                System.out.println("Usado em: Campanhas publicitárias, sinalizações de alerta, felicidade");
                break;

            case "Verde":
                System.out.println("Significa: Natureza, esperança, saúde, equilíbrio, renovação");
                System.out.println("Usado em: Sustentabilidade, saúde, meio ambiente");
                break;

            case "Azul":
                System.out.println("Significa: Tranquilidade, confiança, sabedoria, lealdade, paz");
                System.out.println("Usado em: Empresas sérias, tecnologia, segurança");
                break;

            case "roxo":
                System.out.println("Significa: Espiritualidade, mistério, luxo, criatividade, introspecção");
                System.out.println("Usado em: Marcas de beleza, meditação, temas espirituais");
                break;

            case "branco":
                System.out.println("Significa: Paz, pureza, inocência, limpeza, simplicidade");
                System.out.println("Usado em: Casamentos, hospitais, Ano Novo");
                break;

            case "preto":
                System.out.println("Significa: Elegância, poder, sofisticação, mistério, luto");
                System.out.println("Usado em: Moda, marcas de luxo, eventos formais");
                break;

            case "rosa":
                System.out.println("Significa: Amor, carinho, delicadeza, romantismo, feminilidade");
                System.out.println("Usado em: Campanhas de saúde feminina (como Outubro Rosa), produtos infantis");
                break; 

            case "marrom":
                System.out.println("Significa: Estabilidade, seriedade, natureza, conforto");
                System.out.println("Usado em: Produtos naturais, café, madeira, rusticidade");
                break;

            default:
                System.out.println("Cor não reconhecida. Tente novamente digite alguma cor que esta listado na lista");

        }

        scn.close();
    }
}
