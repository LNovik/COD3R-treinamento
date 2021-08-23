package lambdas.intefacesfuncionais;


import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class IntBinaryEUnary {
    public static void main(String[] args) {


        BinaryOperator<Double> notas = (nota1, nota2) -> {
            double somaNotas = nota1 + nota2;
            return somaNotas;
        };

        UnaryOperator<Double> media = nota -> nota / 2;

        Double resultados = notas.andThen(media).apply(2.0, 2.3);
        System.out.println(resultados);

        BiFunction<Double, Double, String> resultado = (nota1, nota2) -> {
            double resultadoFinal = (nota1 + nota2) / 2;
            String resultadoS = resultadoFinal >= 7 ? "Aprovado" : "Reprovado";
            return resultadoS;
        };


    }
}
