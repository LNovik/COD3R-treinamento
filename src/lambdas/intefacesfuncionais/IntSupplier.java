package lambdas.intefacesfuncionais;


import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class IntSupplier {
    public static void main(String[] args) {

        // Não recebe nenhum parametro e retorna algo
        Supplier<String> nome = () -> "Lista de jogadores do Flamengo";
        System.out.println(nome.get());

        Supplier<Double> valor = () -> 2.1;
        System.out.println(valor.get());

        Supplier<List<String>> jogadoresFlamengo = () -> Arrays.asList("Gerson", "Pedro", "Rodrigo Caio", "Arrascaeta", "Diego", "Gabigol");

        System.out.println(jogadoresFlamengo.get());


    }


}
