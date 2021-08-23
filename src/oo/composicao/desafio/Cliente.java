package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {

    final String nomeCliente;

    public Cliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    final ArrayList<Compra> listaCompras = new ArrayList<>();

    double obterValorTotal(){
        double total = 0;
        for(Compra compra: listaCompras){
            total += compra.obterValorTotal();
        }
        return total;

    }


}
