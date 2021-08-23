package controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe sua nota: ");
        double nota = entrada.nextDouble();

        if (nota >= 7) {
            System.out.println("Parabéns, você está aprovado...");
        }

        if (nota >= 5 && nota < 7) {
            System.out.println("Você está em recuperação..");
        }

        boolean criterioReprovacao = nota < 5 && nota >= 0;
        if (criterioReprovacao) {
            System.out.println("Você está reprovado...");
        }


    }
}
