package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Bom dia, X";
        s = s.replace("X", "senhora");
        s = s.concat("!!");
        s = s.toUpperCase();
        System.out.println(s);

        // 1° Exemplo
        String x = "Luan".toUpperCase(); // Colocando um valor literal com método dentro de uma String
        System.out.println(x);

        // 2° Exemplo
        String texto = x.toUpperCase();
        System.out.println(texto.length());

        // 3° Exemplo
        System.out.println("Oi".concat("!!!"));

        // 4° Exemplo
        System.out.println(s.concat("!!!"));

        // Concatenando
        String y = "Bom dia, x".replace("X", "Senhora").concat("!!!").toUpperCase();
        System.out.println(y);

        // Tipos primitivos não tem operador ponto
        int a = 3;
        System.out.println(a);


    }
}
