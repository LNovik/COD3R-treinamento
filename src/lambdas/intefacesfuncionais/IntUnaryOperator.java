package lambdas.intefacesfuncionais;

import java.util.function.UnaryOperator;

public class IntUnaryOperator {
    public static void main(String[] args) {

        // Retorna o tipo de parametro de entrada
        UnaryOperator<Double> vaiReceberDouble = valor -> valor;

        System.out.println(vaiReceberDouble.apply(2.4));

        UnaryOperator<Double> recebeOutroDouble = valor -> valor;

        System.out.println(vaiReceberDouble.andThen(recebeOutroDouble).apply(2.7));

        //Exemplo 2
        UnaryOperator<Integer> maisDois = numero -> numero + 2;
        UnaryOperator<Integer> vezesDois = numero -> numero * 2;
        UnaryOperator<Integer> aoQuadrado = numero -> numero * numero;

        int resultado = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
        System.out.println(resultado);

        int resultadoAoContrario = maisDois.compose(vezesDois).compose(aoQuadrado).apply(0);
        System.out.println(resultadoAoContrario);


    }
}
