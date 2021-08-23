package fundamentos;

public class Unarios {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        // pós fixada
        a++;  // a = a + 1;
        a--;  // a = a - 1;

        // pré fixada
        ++b; // b = b + 1;
        --b;  // b = b - 1;

        System.out.println(a);
        System.out.println(b);

        System.out.println("Mini Desafio...");
        System.out.println(++a == b--); // Questão de pré-cedencia: a variavel b não será decrementada nessa linha
        System.out.println(a == b);


    }
}
