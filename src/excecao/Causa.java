package excecao;

public class Causa {
    public static void main(String[] args) {

        try {
            metodoA(null);
        } catch (IllegalArgumentException exception) {
            if (exception.getCause() != null) {
                System.out.println(exception.getCause().getMessage());
            }
        }

    }

    static void metodoA(Aluno aluno) {
        try {
            metodoB(aluno);
        } catch (NullPointerException exception) {
            throw new IllegalArgumentException(exception);
        }
    }

    static void metodoB(Aluno aluno) {
        if (aluno == null) {
            throw new NullPointerException("O aluno está nulo.");
        }
    }
}
