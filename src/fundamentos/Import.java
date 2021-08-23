package fundamentos;

import javax.swing.*;
import java.util.Date;

public class Import {
    public static void main(String[] args) {
        // Assim que o java faz qnd se usa códigos que pertecem ao java.lang

        java.lang.String nome = "Meu nome é fulano";
        System.out.println(nome);


        String s = "Bom dia"; // O String é uma classe do java.lang e o "s" se torna um objeto do tipo dela
        System.out.println(s);

        // Usando os imports
        Date data = new Date(); // import: java.util.Date;
        System.out.println(data);

        JButton botao = new JButton(); // import: javax.swing.JButton ou javax.swing.*;
        System.out.println(botao);

    }
}
