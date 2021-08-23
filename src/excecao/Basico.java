package excecao;

public class Basico {
    public static void main(String[] args) {

        Aluno aluno1 = null;

        try{
            imprimirAluno(aluno1);
        }catch(NullPointerException exception){
            System.out.println("Erro encontrado: " + exception);
        }

        try{
            System.out.println(7 / 0);
        }catch (ArithmeticException exception){
            System.out.println("Erro encontrado: " + exception.getMessage());
        }



    }
    public static void imprimirAluno(Aluno aluno){
        System.out.printf(aluno.nome);
    }
}
