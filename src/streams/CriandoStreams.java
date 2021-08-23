package streams;


import lambdas.foreach.Foreach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::println;


        List<String> listaNomes = Arrays.asList("Luan ", "Vânia", " Fernando", "Fabi\n");
        listaNomes.forEach(nome -> System.out.println(nome));
        listaNomes.forEach(nome -> imprimirNome(nome));
        listaNomes.forEach(Foreach::meuImprimir);
        listaNomes.forEach(System.out::println);

        listaNomes.stream().forEach(print);
        Stream.of(listaNomes).forEach(System.out::println);

        Stream<String> listaNomesStream = listaNomes.stream();
        listaNomesStream.forEach(print);

        String[] outrosNomes = {"Roberto ", "Ricardo ", "João\n"};
        Stream.of(outrosNomes).forEach(print);
        Arrays.stream(outrosNomes).forEach(print);
        Arrays.stream(outrosNomes, 0, 2).forEach(print);

        Stream.generate(() -> "A").forEach(print);
        Stream.iterate(0, n -> n).forEach(println);


    }

    static void imprimirNome(String nome) {
        System.out.println(nome);
    }
}
