package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.cliente = "João Pedro";

        c1.adicionarItens("Caneta", 20, 7.45);
        c1.adicionarItens("Borracha", 12, 3.89);
        c1.adicionarItens3("Caderno", 3, 18.79);

        System.out.println("Tamanho da lista -> " + c1.itens.size());
        System.out.println("Valor total dos itens -> " + c1.obterValorTotal());


    }
}
