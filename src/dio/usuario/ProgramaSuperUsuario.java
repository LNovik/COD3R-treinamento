package dio.usuario;

public class ProgramaSuperUsuario {
    public static void main(String[] args) {

        final var superUsuario = new SuperUsuario("root", "24gaec");

        System.out.println(superUsuario.getLogin());
        System.out.println(superUsuario.getSenha());

        String root = superUsuario.nome;


    }
}
