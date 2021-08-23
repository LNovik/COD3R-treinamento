package lambdas.intefacesfuncionais;

import java.util.function.Predicate;

public class IntPredicate {
    public static void main(String[] args) {

//       Predicate<Produto> isExpensive2 = prod -> {
//           return  prod.preco * ( 1 - prod.desconto) >= 1.325;
//       };

        // Recebe um tipo e retorna booleano
        Predicate<Produto> isExpensive = prod ->
                prod.preco * (1 - prod.desconto) >= 1.325;

        Produto produto = new Produto("Moto G8 Power", 1.394, 0.05);

        System.out.println(isExpensive.test(produto));


    }
}
