package oo.composicao.desafio;

public class Sistema {
    public static void main(String[] args) {


       Cliente cliente = new Cliente("Luan Novik Silva");

       Compra compra1 = new Compra();
       compra1.adicionarItem("Caneta", 9.67, 100);
       compra1.adicionarItem(new Produto("Notebook", 1897.88), 2);

       Compra compra2 = new Compra();
       compra2.adicionarItem("Caderno", 10, 10);
       compra2.adicionarItem(new Produto("Impressora", 999.90), 1);

       cliente.listaCompras.add(compra1);
       cliente.listaCompras.add(compra2);

        System.out.println("Valor de tudo -> " + cliente.obterValorTotal());





    }
}
