package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste {
    public static void main(String[] args) {

        Calculo calculo = new Soma();

        System.out.println(calculo.executar(2, 3));
        System.out.println(calculo.legal());


        calculo = new Multiplicacao();

        System.out.println(calculo.executar(2, 3));


        // Usando Lambdas

        calculo = (a, b) -> {
            return a + b;
        };
        System.out.println(calculo.executar(2, 3));

        calculo = (a, b) -> a * b;
        System.out.println(calculo.executar(2, 3));

        System.out.println(Calculo.muitoLegal());

        System.out.println(calculo.executarDefault());


    }
}
