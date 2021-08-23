package excecao.personalizadaA;

import excecao.Aluno;

public class Teste {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Abner", -7);

        try {
            Validar.aluno(aluno);
            Validar.aluno(null);
        } catch (StringVaziaExcepetion | NumeroForaDoIntervaloException | IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }

        System.out.println("Fim");


    }
}
