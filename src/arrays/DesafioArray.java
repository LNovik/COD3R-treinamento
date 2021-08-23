package arrays;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade de notas: ");
        int qntNotas = entrada.nextInt();

        double[] notasAlunos = new double[qntNotas];

        // Preenchenco a array
        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.print("Informe a nota: " + (i + 1) + ": ");
            notasAlunos[i] = entrada.nextDouble();
        }
        double total = 0;

        for (double nota : notasAlunos) {
            total += nota;
        }
        double media = total / notasAlunos.length;

        System.out.printf("Média geral: %.2f", media);


        entrada.close();
    }
}
