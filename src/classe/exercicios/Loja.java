package classe.exercicios;

public class Loja {


    String nomeProduto;
    double preco;
    int qtidade;
    static final double DESCONTO = 0.25;

    double precoTotal() {
        return preco * qtidade;
    }

    double desconto() {
        return preco * (1 - DESCONTO);
    }

    double desconto(double descontoAdicional) {
        return preco * 1 - (descontoAdicional + DESCONTO);

    }


    // Métodos statics
    public static void nome(String nome) {
        System.out.printf(nome);


    }

    //Pra poder ter acesso aos atributos de instancia, precisa passar o objeto como referencia
    public static void preco(Loja p) {
        System.out.printf(p.nomeProduto);

    }


}
