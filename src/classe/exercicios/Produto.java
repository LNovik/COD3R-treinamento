package classe.exercicios;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25; // Não fará sentido passar no construtor;

    Produto() {

    }


    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public static double desconto() {
        return desconto;
    }

    public double descontoProduto() {
        return preco * (1 - desconto);
    }

// Não tem problema um método de instancia acessar um atributo estatico
}
