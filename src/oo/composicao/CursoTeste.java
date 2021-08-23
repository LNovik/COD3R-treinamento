package oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {

       Aluno aluno1 = new Aluno("João");
       Aluno aluno2 = new Aluno("Maria");
       Aluno aluno3 = new Aluno("Pedro");

       Curso curso1 = new Curso("JAVA Completo");
       Curso curso2 = new Curso("Web 2021");
       Curso curso3 = new Curso("React Native");

       curso1.adicionarAlunos(aluno1);
       curso1.adicionarAlunos(aluno2);

       curso2.adicionarAlunos(aluno1);
       curso2.adicionarAlunos(aluno3);

       aluno1.adicionarCursos(curso3);
       aluno2.adicionarCursos(curso3);
       aluno3.adicionarCursos(curso3);


      for(Aluno aluno: curso3.alunos){
          System.out.println("Estou matriculado no curso: " + curso3.materia);
          System.out.println(aluno.nomeAluno);
      }

      Curso cursoEncontrado = aluno1.obterCursoPorNome("JAVA Completo");

      if(cursoEncontrado != null){
          System.out.println(cursoEncontrado.alunos);
          System.out.println(cursoEncontrado.materia);
      }
      





    }
}
