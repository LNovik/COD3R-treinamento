package arrays;

import java.util.Arrays;
import java.util.Locale;

public class Array1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        // Definição de um array unidimensional
        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 9.7;
        notasAlunoA[1] = 7.5;
        notasAlunoA[2] = 8.3;

        // Imprimindo pelo indice
        System.out.println(notasAlunoA[1]); // Imprimindo a indice 1 da array
        // Usando a classe Arrays e transformando o objeto da arrays em uma String..
        System.out.println(Arrays.toString(notasAlunoA));

        // Usando o for
        double totalAlunosA = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            System.out.printf("Nota %d: %.2f\n", i + 1, notasAlunoA[i]);
            totalAlunosA += notasAlunoA[i];
        }
        System.out.printf("A média dos alunos A é: %.2f\n", totalAlunosA / notasAlunoA.length);

        // Segundo exemplo
        double notaArmazenadaB = 8.3;

        double[] notasAlunoB = {notaArmazenadaB, 7.8, 5.8, 8.9};
        System.out.printf("Tamanho da array: %d\n", notasAlunoB.length);

        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            System.out.printf("Nota %d: %.2f\n", i + 1, notasAlunoB[i]);
            totalAlunoB += notasAlunoB[i];
        }

        System.out.printf("Media dos alunos B é: %.2f", totalAlunoB / notasAlunoB.length);


    }
    //No caso dos arrays, o lenght é um atributo da array
    //Arrays são indexado: acessado por um determinado indice
    //Arrays é um objeto


}