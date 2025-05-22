public class ImparPar{
    public static void main(String[] args) {
        int valor = 52;
        int resto = valor % 2;
        int potencia = 0;

        if (resto == 0) {
            System.out.println("Par");
            potencia = valor * valor;
            if (potencia > 50) {
                System.out.println("Maior que 50");
            } else {
                System.out.println("Menor");
            }
        } else {
            System.out.println("Impar");
            potencia = valor * valor * valor;
            if (potencia % 5 != 0) {
                System.out.println(" nao Multiplo de 5");
            }
        }

        if (potencia >= 200) {
            System.out.println("Maior que 200");
        }

        System.out.println(potencia);
        int x = -1;

        if (x >= 10 && x <= 50) {
            System.out.println("no range");
        } else {
            System.out.println("fora");
        }
        
        if (valor % 2 == 0) {
            System.out.println("Par");
        }
        
        if (valor % 2 != 0) {
            System.out.println("impar");
        }
    }
}
    
