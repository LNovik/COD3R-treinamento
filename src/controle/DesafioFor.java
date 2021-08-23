package controle;

public class DesafioFor {
    public static void main(String[] args) {

        String texto = "#";
        for (int i = 0; i <= 10; i++) {
            System.out.println(texto);
            texto += "#";
        }

        for (String v = "#"; !v.equals("######"); v += "#") {
            System.out.println(v);
        }


    }
}
