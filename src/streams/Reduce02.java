package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce02 {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Ana", 7.1);
        Aluno aluno2 = new Aluno("Luna", 6.1);
        Aluno aluno3 = new Aluno("Gui", 8.1);
        Aluno aluno4 = new Aluno("Gabi", 10);

        List<Aluno> listaAlunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);

        Predicate<Aluno> aprovados = aluno -> aluno.nota >= 6;
        Function<Aluno, Double> getNotas = aluno -> aluno.nota;
        BinaryOperator<Double> soma = (aDouble, aDouble2) -> aDouble + aDouble2;

        //Primeiro exemplo
        double resultado = listaAlunos.stream().filter(aprovados).map(getNotas).reduce(soma).get();
        System.out.println("Resultado do primeiro exemplo: " + resultado);

        System.out.println();

        //Segundo exemplo
        listaAlunos.stream().filter(aprovados).map(getNotas).reduce(soma).ifPresent(System.out::println);


    }
}
