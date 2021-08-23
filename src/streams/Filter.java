package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.9);
        Aluno a2 = new Aluno("Bia", 5.8);
        Aluno a3 = new Aluno("Daniel", 9.8);
        Aluno a4 = new Aluno("Gui", 6.8);
        Aluno a5 = new Aluno("Rebeca", 7.1);
        Aluno a6 = new Aluno("Pedro", 7.8);

        List<Aluno> listaAlunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 6.5;
        Function<Aluno, String> mensagem = aluno -> "Parabéns, " + aluno.nome + ", sua nota foi de: " + aluno.nota;

        listaAlunos.stream().filter(aprovado).map(mensagem).forEach(System.out::println);
        listaAlunos.stream().filter(Aluno -> a1.nota >= 0).map(s -> "Parabéns").forEach(System.out::println);
    }

}
