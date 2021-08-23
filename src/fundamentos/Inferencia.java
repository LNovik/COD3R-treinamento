package fundamentos;

public class Inferencia {
    public static void main(String[] args) {
        double a = 4.5; // Declaração e inicialização normal
        System.out.println(a);

        // Usando a inferencia
        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        c = "Outro Texto";
        System.out.println(c);

        // var c; // Não é possivel declarar uma variavel do tipo Var sem inicializa-la


        double d; //Variável declarada
        d = 123.45; // Variável inicializada
        System.out.println(d); // Variável usada


    }

}
