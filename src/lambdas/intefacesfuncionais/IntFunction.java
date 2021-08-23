package lambdas.intefacesfuncionais;


import java.util.function.Function;

public class IntFunction {
    public static void main(String[] args) {

        // Recebe um tipo e pode retornar outro
        Function<Integer, String> resultadoEscola = nota -> {
            if (nota >= 7) {
                return "Aprovado";
            } else if (nota >= 5) {
                return "Recuperação";
            } else {
                return "Reprovado";
            }

        };
        System.out.println(resultadoEscola.apply(5));

        Function<Integer, String> parOuImpar = numero ->
                numero % 2 == 0 ? "Par" : "Impar";

        System.out.println(parOuImpar.apply(2));

        Function<String, String> oResultadoE = valor -> "O resultado é " + valor;

        Function<String, String> empolgado = valor -> valor + "!!";

        String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);

        System.out.println(resultadoFinal);


    }
}
