package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.print("Informe a quantidade de alunos: ");
        int qntAlunos = entrada.nextInt();  // Quantidade de linhas

        System.out.print("Informe a quantidade de notas que cada aluno tem: ");
        int qntNotas = entrada.nextInt();  // Quantidade de colunas

        // Criando a matriz
        double[][] notasDaTurma = new double[qntAlunos][qntNotas];


        double total = 0;
        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma[a].length; n++) {
                System.out.printf("Informe a a nota %d do aluno %d: ", a + 1, n + 1);
                notasDaTurma[a][n] = entrada.nextDouble();
                total += notasDaTurma[a][n];
            }
        }
        double media = total / (qntAlunos * qntNotas);

        System.out.printf("Media: %.2f", media);


        entrada.close();
    }
}
