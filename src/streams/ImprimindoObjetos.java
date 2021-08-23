package streams;


import lambdas.foreach.Foreach;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {

        List<String> listaAprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");

        //Usando for - Forma tradicional
        System.out.println("Usando for tradicional");
        for (int i = 0; i < listaAprovados.size(); i++) {
            System.out.println(listaAprovados.get(i));
        }

        //Usando ForEach
        System.out.println("\nUsando forEach");
        for (String nomesAprovados : listaAprovados) {
            System.out.println(nomesAprovados);
        }

        //Usando lambdas #01
        System.out.println("\nUsando lambda");
        listaAprovados.forEach(nome -> System.out.println(nome));

        //Usando lambdas #02
        System.out.println("\nUsando lambda reference #01");
        listaAprovados.forEach(nome -> imprimirAprovados(nome));

        //Usando method reference #01
        System.out.println("\nUsando Method reference");
        listaAprovados.forEach(System.out::println);

        //Usando method reference #02
        System.out.println("\nusando Method reference");
        listaAprovados.forEach(Foreach::meuImprimir);

        //Usando o itereator
        System.out.println("\nUsando Iterator");

        Iterator<String> iterator = listaAprovados.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        //Usando stream
        System.out.println("\nUsando stream");

        Stream<String> stream = listaAprovados.stream();
        stream.forEach(System.out::println);

        // Outra forma
        listaAprovados.stream().forEach(nome -> System.out.println(nome));
        Stream.of(listaAprovados).forEach(System.out::println);


    }

    static void imprimirAprovados(String nome) {
        System.out.println(nome);
    }

}
