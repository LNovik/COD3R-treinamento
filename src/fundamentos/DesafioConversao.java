package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número:");
        String numero1 = entrada.next().replace(",", ".");

        System.out.print("\nDigite o segundo número:");
        String numero2 = entrada.next().replace(",", ".");

        System.out.print("\nDigite o terceiro número:");
        String numero3 = entrada.next().replace(",", ".");
        entrada.close();

        double valor1 = Double.parseDouble(numero1);
        double valor2 = Double.parseDouble(numero2);
        double valor3 = Double.parseDouble(numero3);


        double media = ((valor1 + valor2 + valor3) / 2);
        System.out.println("A média deu: " + media);


    }

}
