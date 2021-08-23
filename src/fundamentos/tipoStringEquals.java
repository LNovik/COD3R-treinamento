package fundamentos;


import java.util.Scanner;

public class tipoStringEquals {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        // 1° Exemplo
        System.out.println("2" == "2"); // Dará uma falsa sensação de estar certa, pois são dois valores literais

        // Outros exemplos em que passa a sensação de estar certo
        String s1 = "2";
        String s2 = "2";
        System.out.println(s1 == "2");
        System.out.println(s1 == s1);
        System.out.println(s1 == s2);

        // 2° Exemplo
        String s3 = new String("2");
        System.out.println("2" == s3); // Dará falso, o jeito certo não seria esse
        System.out.println(s1 == s3); // Também dará falso

        // O jeito certo é utilizando o equals
        System.out.println("2".equals(s3));

        // Um exemplo de um jeito que dará errado
        String s4 = entrada.next(); // Espera-se o nº 2;
        System.out.println(s4.trim() == "2"); // dará falso
        System.out.println("2".equals(s4.trim())); // O Jeito certo sempre é usando o equals


// O grande objetivo desse código é mostrar que sempre deve-se comparar strings usando o equals



    }
}
