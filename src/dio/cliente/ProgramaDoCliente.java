package dio.cliente;


// Não é possivel, pois a classe do main não pertence ao mesmo pacote

public class ProgramaDoCliente {
    public static void main(String[] args) {

        final Cliente cliente = new Cliente(29, 92.0f);
        System.out.println(cliente.getIdade());
        System.out.println(cliente.getPeso());
        //System.out.println(cliente.relatorio());


    }
}
