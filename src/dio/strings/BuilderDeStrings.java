package dio.strings;

public class BuilderDeStrings {
    public static void main(String[] args) {

        String nome = "Luan";

        StringBuilder builder = new StringBuilder(nome);

        StringBuilder append = builder.append(" Novik");
        System.out.println(append);

        StringBuilder reverse = builder.reverse();
        System.out.println(reverse);

        StringBuilder insert = builder.insert(0, "[").insert(builder.length(), "]");
        System.out.println(insert);




    }
}
