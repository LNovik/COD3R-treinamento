package excecao.personalizadaA;

import excecao.Aluno;

public class Validar {

    private Validar() {

    }

    public static void aluno(Aluno aluno) {
        if (aluno == null) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (aluno.nome == null || aluno.nome.trim().isEmpty()) {
            throw new StringVaziaExcepetion("nome");
        }
        if (aluno.nota < 0 || aluno.nota > 10) {
            throw new NumeroForaDoIntervaloException("nota");
        }
    }


}
