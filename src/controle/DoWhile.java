package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // A estrutura do/while, pelo menos uma vez é executada

        Scanner entrada = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("Deseja sair?");
            texto = entrada.nextLine();
        } while (!texto.equalsIgnoreCase("sim"));


        entrada.close();


    }
}
