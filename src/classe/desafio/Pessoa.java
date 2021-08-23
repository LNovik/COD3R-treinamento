package classe.desafio;

public class Pessoa {

    String nome;
    double peso;

    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    String apresentar() {
        return "Nome: " + nome + "\nPeso: " + peso + "KG\n";
    }

    void comer(Comida comida) {
        if (comida != null) {
            this.peso += comida.peso;
        }
    }


}
