package treino.composicao;

import java.util.ArrayList;

public class Cliente {

    String nomeCliente;

    public Cliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    final ArrayList<Compra> listaCompra = new ArrayList<>();

    double getValorTotal(){
        double total = 0;
        for(Compra compra: listaCompra){
            total += compra.getValorTotal();
        }
        return total;
    }

    void adicionarCliente(Compra compra){
        this.listaCompra.add(compra);
    }

}
