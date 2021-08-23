package classe.exercicios;

import java.util.Locale;

public class LojaDesconto {

    public static void main(String[] args) {

        int valor = 1;


        Locale.setDefault(Locale.US);


        Loja p1 = new Loja();
        p1.nomeProduto = "Copo descatável";
        p1.preco = 2.99;
        p1.qtidade = 34;


        Loja p2 = new Loja();
        p2.nomeProduto = "Lãmina de barbear";
        p2.preco = 4.30;
        p2.qtidade = 39;


        System.out.println("*** Informações dos Produtos ***");
        System.out.println("Produto 1:");
        System.out.printf("Nome: %s\n", p1.nomeProduto);
        System.out.printf("Preço: %.2f\n", p1.preco);
        System.out.printf("Quantidade no estoque: %d\n", p1.qtidade);
        System.out.println("Produto 2:\n");
        System.out.printf("Nome: %s\n", p2.nomeProduto);
        System.out.printf("Preço: %.2f\n", p2.preco);
        System.out.printf("Quantidade no estoque: %d\n", p2.qtidade);


        System.out.printf("Preço total do produto %s: %.2f\n", p1.nomeProduto, p1.qtidade * p1.preco);
        double precoTotal = p1.qtidade * p1.preco;
        System.out.printf("Preço total: %.2f\n", precoTotal);

        System.out.printf("Preço total do produto %s: %.2f\n", p1.nomeProduto, p1.precoTotal());
        double preoTotalV = p1.precoTotal();
        System.out.printf("Preço total do produto %s: %.2f\n\n", p1.nomeProduto, preoTotalV);


        System.out.printf("Desconto do produto %s: %.2f\n", p1.nomeProduto, p1.desconto());
        System.out.printf("Desconto do produto %s: %.2f\n", p1.nomeProduto, p1.desconto(0.3));
        double descontoProduto2 = p1.desconto(0.9);
        System.out.printf("Desconto do produto %s: %.2f\n", p1.nomeProduto, descontoProduto2);

        // Manipulando métodos estaticos

        Loja.nome("oi");
        System.out.println();

        Loja.preco(p1);
        System.out.println();

        preco(p1);

    }

    public static void preco(Loja p) {
        System.out.println(p.preco);


    }
}


