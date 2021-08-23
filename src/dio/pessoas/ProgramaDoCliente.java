package dio.pessoas;


import dio.cliente.Cliente;

//Acesso pela classe do main pertencer ao mesmo pacote
public class ProgramaDoCliente {
    public static void main(String[] args) {

        final Cliente cliente = new Cliente(29, 82.0f);
        System.out.println(cliente.getIdade());
        System.out.println(cliente.getPeso());
        System.out.println(cliente.relatorio());


    }
}
