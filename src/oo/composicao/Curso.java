package oo.composicao;

import java.util.ArrayList;

public class Curso {

    String materia;

    public Curso(String materia) {
        this.materia = materia;
    }

    final ArrayList<Aluno> alunos = new ArrayList<>();

    void adicionarAlunos(Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }






}
