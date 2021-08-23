package classe.exercicios;

import java.util.Locale;

public class ProdutoTeste {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Produto.desconto = 0;

        Produto p1 = new Produto();
        p1.nome = "Moto G8 Power";
        p1.preco = 1299.00;
        // p1.desconto = 3; não é muito aconselhavel por ser um membro de classe

        Produto p2 = new Produto("Processador i7 8° Geração", 1999.00);
        Produto p3 = new Produto("Caixa de Som JBL", 299.00);
        Produto p4 = new Produto("Bicicleta Caloi Shimano", 1999.00);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

        System.out.printf("Desconto para o produto %s: %.2f\n", p1.nome, p1.descontoProduto());
        System.out.printf("Desconto para o produto %s: %.2f\n", p2.nome, p2.descontoProduto());
        System.out.printf("Desconto para o produto %s: %.2f\n", p3.nome, p3.descontoProduto());
        System.out.printf("Desconto para o produto %s: %.2f\n", p4.nome, p4.descontoProduto());


        System.out.printf("O desconto para essa loja são de %.2f por cento", Produto.desconto());


    }
}
