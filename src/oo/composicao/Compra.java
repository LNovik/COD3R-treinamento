package oo.composicao;

import java.util.ArrayList;

public class Compra {

    String cliente;

    ArrayList<Item> itens = new ArrayList<>();

    void adicionarItens(Item item) {
        this.itens.add(item);
        item.compra = this;
    }

    void adicionarItens(String nome, int quantidade, double preco) {
        this.itens.add(new Item(nome, quantidade, preco));
    }

    void adicionarItens3(String nome, int quantidade, double preco) {
        this.adicionarItens(new Item(nome, quantidade, preco));
    }

    double obterValorTotal() {
        double total = 0;

        for (Item item : itens) {
            total += item.preco * item.quantidade;
        }
        return total;
    }


}
