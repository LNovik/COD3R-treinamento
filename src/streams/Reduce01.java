package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce01 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

        //Primeiro Exemplo
        int total1 = numeros.stream().reduce(soma).get();
        System.out.println("Primeiro exemplo: " + total1);

        //Segundo Exemplo
        numeros.stream().reduce(soma).ifPresent(System.out::println);

        //Terceiro exemplo
        int total3 = numeros.stream().reduce(1,soma);
        System.out.println("Segundo exemplo: " + total3);

        //Quarto Exemplo

        numeros.stream().filter(numero -> numero > 8).reduce(soma).ifPresent(System.out::println);


    }
}
