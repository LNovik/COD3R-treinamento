package fundamentos;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Informe um número: ");
        double num2 = entrada.nextDouble();

        System.out.print("Informe uma operação ");
        String op = entrada.next();

        // Operador ternario...
        double resultado = op.equals("+") ? num1 + num1 : 0;
        resultado = op.equals("-") ? num1 - num2 : resultado;
        resultado = op.equals("*") ? num1 * num2 : resultado;
        resultado = op.equals("/") ? num1 / num2 : resultado;
        resultado = op.equals("%") ? num1 % num2 : resultado;

        if (resultado == 0) {
            System.out.println("Ops, operação inválida.");
        } else {
            System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
        }


    }
}
