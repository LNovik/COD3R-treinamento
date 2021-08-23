package controle;

import java.util.Scanner;

public class DesafioIf {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o dia da semana: ");
        String dia = entrada.nextLine();

        if (dia.equalsIgnoreCase("segunda")) {
            System.out.println("Dia 1");
        } else if (dia.equalsIgnoreCase("terca") || dia.equalsIgnoreCase("terça")) {
            System.out.println("Dia 2");
        } else if (dia.equalsIgnoreCase("quarta")) {
            System.out.println("Dia 3");
        } else if (dia.equalsIgnoreCase("quinta")) {
            System.out.println("Dia 4");
        } else if (dia.equalsIgnoreCase("sexta")) {
            System.out.println("Dia 5");
        } else if (dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("sábado")) {
            System.out.println("Dia 6");
        } else if (dia.equalsIgnoreCase("domingo")) {
            System.out.println("Dia 7");
        }


    }
}
