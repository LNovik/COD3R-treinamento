package controle;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String conceito = " ";

        System.out.print("Informe sua nota: ");
        int nota = entrada.nextInt();

        switch (nota) {
            case 10:
                conceito = "A";
                break;
            case 9:
            case 8:
                conceito = "B";
                break;
            case 7:
                conceito = "C";
                break;
            case 6:
                conceito = "D";
                break;
            case 5:
            case 4:
                conceito = "E";
                break;
            case 3:
            case 2:
            case 1:
                conceito = "D";
                break;
            default:
                conceito = "Sem conceito";
                // o default pode ser colocado em qualquer posição, desde que tenha o break...

        }
        System.out.println("Conceito : " + conceito);


        entrada.close();


    }
}
