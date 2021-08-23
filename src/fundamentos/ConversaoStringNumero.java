package fundamentos;

import javax.swing.*;

public class ConversaoStringNumero {
    public static void main(String[] args) {

        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");

        System.out.println(valor1 + valor2); // Concatenando as duas String

        //Convertendo uma String em uma variavel do tipo primitivo, usando o método parse..
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2;
        System.out.println("Resultado da soma: " + soma);

        double media = soma / 2;
        System.out.println("Resultado da media: " + media);


    }

}
//Todo número pode ser convertido em String, mas nem toda String pode ser convertida em numero.. Por isso é mais dificil