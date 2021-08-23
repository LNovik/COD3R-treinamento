package treino.composicao;

public class Sistema {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.adicionarItem1(new Item(new Produto("Caneta Preta", 1.1), 1));
        compra1.adicionarItem2(new Produto("Caneta Azul", 1.2), 2   );
        compra1.adicionarItem3("Caneta Vermelha", 1.1, 2);

        Cliente cliente1 = new Cliente("Luan Novik");
        cliente1.adicionarCliente(compra1);

        System.out.println("Valor Total -> " + cliente1.getValorTotal());



    }
}

