package classe;

public class PrimeiroTrauma {

    int b = 5; // Pertence a instancia
    static int a = 3; // Pertence a classe


    public static void main(String[] args) {


        PrimeiroTrauma p1 = new PrimeiroTrauma();
        System.out.println(p1.b);

        System.out.println(a); // Método static acessa qualquer coisa static

    }
}
