package excecao;

public class TryCatch {
    public static void main(String[] args) {


        int[] vetor = new int[4];
        System.out.println("Antes da exception");

        try {
            vetor[4] = 10;
            System.out.println("Esse trexo não será impresso..");

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Erro encontrado: " + exception.getMessage());
        }
        System.out.println("Fim");


    }
}
