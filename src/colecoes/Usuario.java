package colecoes;

import java.util.Objects;

public class Usuario {
    String nome;

    Usuario(String nome) { // Em caso de lista é necessario passar no construtor
        this.nome = nome;
    }

    public String toString() {
        return "Meu nome é " + nome;
    }


    @Override
    public boolean equals(Object objeto) {
        if (objeto instanceof Usuario) {
            Usuario outro = (Usuario) objeto;
            return outro.nome.equals(this.nome);
        } else {
            return false;
        }
    }


    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
