package excecao.personalizadaB;

import excecao.Aluno;

import static excecao.personalizadaB.Validar.*;

public class Teste {
    public static void main(String[] args)throws NumeroForaDoIntervaloException, StringVaziaException, IllegalArgumentException{

        Aluno aluno = new Aluno("a", 7);

     try {
         Validar.aluno(null);
     }catch (IllegalArgumentException e){
         System.out.println(e.getMessage());
         e.printStackTrace();
     }


    }
}
