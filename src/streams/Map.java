package streams;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;


public class Map {
    public static void main(String[] args) {

        Consumer<String> print = System.out::println;


        List<String> listaNomes = Arrays.asList("Luan ", "Vânia ", "Fernando");

        UnaryOperator<String> maiuscula = s -> s.toUpperCase();
        Function<String, String> primeiraLetra = s -> s.charAt(0) + " ";
        UnaryOperator<String> primeiraLetra2 = s -> s.charAt(0) + " ";


        listaNomes.stream().map(maiuscula).map(primeiraLetra).map(Map::grito).forEach(print);
        listaNomes.stream().map(Modelo.maiuscula).map(Modelo.primeiraLetra).map(Modelo::grito).forEach(print);


    }

    public static String grito(String nome) {
        return nome;
    }

}
