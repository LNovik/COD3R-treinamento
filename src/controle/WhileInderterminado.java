package controle;

import java.util.Scanner;

public class WhileInderterminado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String texto = "";

        while (!texto.equalsIgnoreCase("sair")) {
            System.out.print("Digite algo: ");
            texto = entrada.nextLine();
        }


    }
}
// É o melhor para o uso do while, pois quem controla o laço é o proprio usuario