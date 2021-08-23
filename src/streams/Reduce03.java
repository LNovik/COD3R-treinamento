package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce03 {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Ana", 7.1);
        Aluno aluno2 = new Aluno("Luna", 6.1);
        Aluno aluno3 = new Aluno("Gui", 8.1);
        Aluno aluno4 = new Aluno("Gabi", 10);

        List<Aluno> listaAlunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);

        Predicate<Aluno> aprovados = aluno -> aluno.nota >= 6;
        Function<Aluno, Double> getNotas = aluno -> aluno.nota;

       BiFunction<Media, Double, Media> calcularMedia =
                (media, nota) -> media.adicionar(nota);
        BinaryOperator<Media> combinarMedia =
                (media1, media2) -> Media.combinar(media1, media2);

        Media media = listaAlunos.stream().filter(aprovados).map(getNotas).reduce(new Media(), calcularMedia, combinarMedia);
        System.out.println("Média total: " + media.getMedia());


    }
}
