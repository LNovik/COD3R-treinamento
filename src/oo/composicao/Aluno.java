package oo.composicao;

import java.util.ArrayList;

public class Aluno {

    String nomeAluno;

    public Aluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    final ArrayList<Curso> cursos = new ArrayList<>();

    void adicionarCursos(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    Curso obterCursoPorNome(String nome) {
        for (Curso curso : this.cursos) {
            if (curso.materia.equalsIgnoreCase(nome)) {
                return curso;
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "nomeAluno='" + nomeAluno + '\'' +
                '}';
    }
}
