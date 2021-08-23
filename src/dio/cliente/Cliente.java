package dio.cliente;


import dio.pessoas.Pessoa;

//acesso pelo pacote
public class Cliente extends Pessoa {

    public Cliente(final Integer idade, final float peso) {
        super(idade, peso);

    }

    public static void main(String[] args) {

        final Cliente cliente = new Cliente(29, 91.f);
        System.out.println(cliente.getIdade());
        System.out.println(cliente.getPeso());
        System.out.println(cliente.relatorio());//Metodo protected aqui foi por herança..


    }


}
