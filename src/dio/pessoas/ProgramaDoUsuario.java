package dio.pessoas;


import dio.usuario.SuperUsuario;

public class ProgramaDoUsuario {
    public static void main(String[] args) {

        final SuperUsuario batman = new SuperUsuario("Batman", "1234131");
        System.out.println(batman.getLogin());
        System.out.println(batman.getSenha());

        // String nomeCliente = batman.nome:  //Erro



    }
}
