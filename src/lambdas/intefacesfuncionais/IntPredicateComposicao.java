package lambdas.intefacesfuncionais;

import java.util.function.Predicate;

public class IntPredicateComposicao {
    public static void main(String[] args) {

        Predicate<Integer> isPar = numero -> numero % 2 == 0;
        Predicate<Integer> tresDigitos = numero ->
                numero >= 100 && numero <= 999;

        System.out.println(isPar.and(tresDigitos).test(20));
        System.out.println(isPar.and(tresDigitos).negate().test(20));
        System.out.println(isPar.or(tresDigitos).test(300));

    }
}
