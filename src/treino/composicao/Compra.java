package treino.composicao;

import java.util.ArrayList;

public class Compra {

    final ArrayList<Item> listaItem = new ArrayList<>();

   void adicionarItem1(Item item){
       this.listaItem.add(item);
   }

   void adicionarItem2(Produto produto, int quantidade){
       this.adicionarItem1(new Item(produto, quantidade));
   }

   void adicionarItem3(String nomeProduto, double preco, int quantidade){
       this.adicionarItem1(new Item(new Produto(nomeProduto, preco), quantidade));
   }

    double getValorTotal(){
       double total = 0;
       for(Item item: this.listaItem){
           total = item.produto.preco * item.quantidade;
       }
       return total;
    }






}
