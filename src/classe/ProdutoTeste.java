package classe;


import java.util.Locale;

public class ProdutoTeste {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);


        Produto p1 = new Produto();
        p1.nome = "Moto G8 Power";
        p1.preco = 1299.00;
        p1.desconto = 0.1;

        System.out.println("Nome do Produto: " + p1.nome);
        System.out.println("Preço do Produto: " + p1.preco);
        System.out.println("Desconto: " + p1.desconto);

        Produto p2 = new Produto();
        p2.nome = "Acer Aspire";
        p2.preco = 3700;
        p2.desconto = 0.05;

        System.out.println("Nome do Produto: " + p2.nome);
        System.out.println("Preço do Produto: " + p2.preco);
        System.out.println("Desconto: " + p2.desconto);

        // Pelo print
        System.out.println("Preço com desconto do produto 1:" + p1.preco * (1 - p1.desconto));
        System.out.println("Preço com desconto do produto 2:" + p2.preco * (1 - p2.desconto));

        //Colocando dentro de uma variavel
        double precoComDescontoVariavel1 = p1.preco * (1 - p1.desconto);
        double precoComDescontoVariavel2 = p2.preco * (1 - p2.desconto);

        System.out.println("Preço com desconto do produto 1:" + precoComDescontoVariavel1);
        System.out.println("Preço com desconto do produto 2:" + precoComDescontoVariavel2);

        // Usando métodos

        double precomComDescontoMetodos1 = p1.precoComDesconto();
        double precomComDescontoMetodos2 = p2.precoComDesconto();
        double precomComDescontoMetodosParametro = p1.precoComDesconto(0.5);

        System.out.println("Preço com desconto do produto 1:" + precomComDescontoMetodos1);
        System.out.println("Preço com desconto do produto 2:" + precomComDescontoMetodos2);
        System.out.println("Preço com desconto do produto 1:" + precomComDescontoMetodosParametro);

        System.out.println("Média dos dos descontos: " + mediaStatic(p1, p2));

    }
    public static double mediaStatic(Produto p1, Produto p2){
        return (p1.precoComDesconto() + p2.precoComDesconto()) / 2;
    }

}
