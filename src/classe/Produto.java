package classe;

// Classe do tipo Produto
public class Produto {

    // Atributos que pertecem a instancia (objeto)
    String nome;
    double preco;
    double desconto;


    // Métodos que pertecem ao objeto
    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoAdicional) {
        return preco * (1 - (desconto + descontoAdicional));
    }


}
