package lambdas.intefacesfuncionais;


import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class IntBinaryOperator {
    public static void main(String[] args) {

        //Recebe dois tipos e retorna um
        BinaryOperator<Double> calculo = (a, b) -> {
            return a + b;
        };
        System.out.println(calculo.apply(2.0, 2.5));

        calculo = (a, b) -> a * b;

        System.out.println(calculo.apply(2.0, 2.5));

        //Encadeamento de funções
        BinaryOperator<Double> nota = (nota1, nota2) -> {
            return nota1 + nota2;
        };

        UnaryOperator<Double> media = mediaTotal -> {
            return mediaTotal / 2;
        };

        System.out.println("Média Total ->" + nota.andThen(media).apply(5.3, 6.8));


    }
}


