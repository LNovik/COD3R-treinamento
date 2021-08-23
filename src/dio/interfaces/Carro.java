package dio.interfaces;

public interface Carro extends Automovel {

    public abstract String marca();

    default void ligar() {
        System.out.println("Ligando o carro...");
    }
}
