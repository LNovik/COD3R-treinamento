package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {


    final ArrayList<Item> listaItens = new ArrayList<>();

    void adicionarItem(Produto produto, int quantidade){
        this.listaItens.add(new Item(produto, quantidade));
    }

    void adicionarItem(String nomeItem, double preco, int quantidade ){
        var produto = new Produto(nomeItem, preco);
        this.listaItens.add(new Item(produto, quantidade));
    }


    double obterValorTotal(){
        double total = 0;
        for(Item item: this.listaItens){
            total += item.quantidade * item.protudo.preco;
        }
        return total;
    }



}
