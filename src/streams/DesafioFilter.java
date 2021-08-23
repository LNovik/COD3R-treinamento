package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class DesafioFilter {
    public static void main(String[] args) {

        Produto p1 = new Produto("Lápis", 1.99, 0.35, 0);
        Produto p2 = new Produto("Notebook", 4890.89, 0.32, 0 );
        Produto p3 = new Produto("Caderno", 30, 0.45, 0);
        Produto p4 = new Produto("Impressora", 1200 , 0.40, 0);
        Produto p5 = new Produto("iPad", 3100, 0.29, 0);
        Produto p6 = new Produto("Relógio", 900, 0.12, 0);
        Produto p7 = new Produto("Impressora", 800, 0.31 , 0);


        List<Produto> listaProdutos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        Predicate<Produto> grandeDesconto = produto -> produto.desconto >= 0.30;
        Predicate<Produto> freGratis = produto -> produto.valorFrete == 0;
        Predicate<Produto> produtoRelevante = produto -> produto.preco >= 500;

        Function<Produto, String> chamadaPromocional = produto -> "Aproveite!" + produto.nome + " por R$ " + produto.preco;

        listaProdutos.stream()
                .filter(grandeDesconto)
                .filter(freGratis)
                .filter(produtoRelevante)
                .map(chamadaPromocional).forEach(System.out::println);





    }


}
