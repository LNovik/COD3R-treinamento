package controle;

import javax.swing.*;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String valor = JOptionPane.showInputDialog("Informe um número: ");
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0) {
            System.out.println("Número par..");
        } else {
            System.out.println("Número ímpar...");
        }


        // O else é quando nao passa por nenhuma das expressões anteriores

    }
}
