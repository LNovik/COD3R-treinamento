package streams;

import com.sun.jdi.IntegerType;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {

        /**
         * 1. Número para String binária... 6 >= "110";
         * 2. Inverter a string... "110" => "011"
         * 3. Converter de volta para inteiro => "011" => 3
         */

        Consumer<Integer> println = System.out::println;

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        UnaryOperator<String> inversao = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converter = texto -> Integer.parseInt(texto, 2);

        numeros.stream()
                .map(Integer::toBinaryString)
                .map(inversao)
                .map(converter)
                .forEach(println);


    }
}



