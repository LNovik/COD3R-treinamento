package lambdas.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Foreach {
    public static void main(String[] args) {

        List<String> jogadoresFlamengo = Arrays.asList("Gabigol", "Bruno Henrique", "Arrascaeta", "Arão", "Diego");

        System.out.println("\nLambda #01");
        jogadoresFlamengo.forEach(nome -> System.out.println(nome));

        System.out.println("\nLambda #02");
        jogadoresFlamengo.forEach(nome -> meuImprimir(nome));

        System.out.println("\nMethod Reference #01");
        jogadoresFlamengo.forEach(System.out::println);

        System.out.println("\nMethod Reference #02");
        jogadoresFlamengo.forEach(Foreach::meuImprimir);


    }

    public static void meuImprimir(String nome) {
        System.out.println("Oi! Meu nome é " + nome);
    }
}

