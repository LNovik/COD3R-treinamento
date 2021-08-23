package classe.exercicios;

public class ConstrutoresTeste {
    public static void main(String[] args) {

        Construtores p1 = new Construtores();
        System.out.println(p1.nome);

        Construtores p2 = new Construtores("Notebook");
        System.out.println(p2.nome);

        Construtores p3 = new Construtores("Lápis", 1.00, 0.1);
        System.out.println(p3.toString());


    }
}
