package arrays;

public class Foreach {
    public static void main(String[] args) {


        double notaArmazenada = 8.9;
        double[] notas = {7.9, 3.7, 9.5, notaArmazenada};

        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }

        System.out.println();

        for (double nota : notas) {
            System.out.println(nota);
        }


    }

}
