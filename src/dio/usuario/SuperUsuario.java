package dio.usuario;

public class SuperUsuario {

    private String login;
    private String senha;
    String nome; //Mesmo pacote

    public SuperUsuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
}