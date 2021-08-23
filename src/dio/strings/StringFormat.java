package dio.strings;

public class StringFormat {
    public static void main(String[] args) {

        String nome = "Luan";
        String sobreNome = "Novik";
        String nomeCompleto = nome.concat(" ").concat(sobreNome);
        System.out.println(nomeCompleto);


        String mensagemNome = String.format("O nome dele é %s %s", nome, sobreNome);
        System.out.println(mensagemNome);

        System.out.println(String.format("Ele pesa %.2f", 2.13333d));









    }
}
