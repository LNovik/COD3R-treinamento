package classe.exercicios;

public class Construtores {

    String nome;
    double preco;
    double desconto;

    // Inicializando o construtor padrão com os atributos inicialiados
    Construtores() {
        nome = "Caneta Azul";
        preco = 3.00;
        desconto = 0.0;
    }

    // Passando apenas um atributo
    Construtores(String nome) {
        this.nome = nome;

    }

    // Passando todos os atributos
    Construtores(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", desconto=" + desconto +
                '}';
    }
}
