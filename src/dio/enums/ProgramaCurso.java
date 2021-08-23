package dio.enums;

public class ProgramaCurso {
    public static void main(String[] args) {


        Curso c1 = new Curso();
        c1.setNome("Matemática");
        c1.setTurno(Turno.MANHA);
        c1.setHoras(3500);

        System.out.println(c1.getTurno());
        System.out.println(Turno.MANHA);







    }
}
