package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ana", 7.1);
        Aluno aluno2 = new Aluno("Luna", 6.1);
        Aluno aluno3 = new Aluno("Gui", 8.1);
        Aluno aluno4 = new Aluno("Gabi", 10);
        Aluno aluno5 = new Aluno("Ana", 7.1);
        Aluno aluno6 = new Aluno("Pedro", 6.1);
        Aluno aluno7 = new Aluno("Gui", 8.1);
        Aluno aluno8 = new Aluno("Maria", 10);

        List<Aluno> listaAlunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8);

        System.out.println("Distinct...");
        listaAlunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit");
        listaAlunos.stream().distinct()
                .skip(2) //pular dois elementos
                .limit(2) //ate 2 elementos
                .forEach(System.out::println);

        System.out.println("\nTakeWhile");
        listaAlunos.stream().distinct()
                .skip(2)
                .limit(2)
                .takeWhile(aluno -> aluno.nota >= 6) // Faz uma condição.. Uma especie de filtro
                .forEach(System.out::println);


    }
}
