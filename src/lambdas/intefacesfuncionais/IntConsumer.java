package lambdas.intefacesfuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class IntConsumer {
    public static void main(String[] args) {

        //Recebe um tipo e não tem retorno
        //contém uma função que recebe um argumento e tem um retorno void
        Consumer<Produto> imprimir = prod -> System.out.println(prod.nome + "!!");

        Produto p1 = new Produto("Notebook", 2097.99, 0.25);
        Produto p2 = new Produto("Caderno", 19.90, 0.03);
        Produto p3 = new Produto("Borracha", 7.80, 0.18);
        Produto p4 = new Produto("Lapis", 4.39, 0.19);

        imprimir.accept(p1);

        List<Produto> listaProdutos = Arrays.asList(p1, p2, p3, p4);

        //Primeiro exemplo
        listaProdutos.forEach(imprimir);

        //Segundo exemplo
        listaProdutos.forEach(nome -> System.out.println(nome.nome));

        //Terceiro exemplo
        listaProdutos.forEach(System.out::println);


    }
}
