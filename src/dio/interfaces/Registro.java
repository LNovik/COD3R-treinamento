package dio.interfaces;

public interface Registro {

    String numeracao();

    String ano();

    String cor();


    default void ligar() {
        System.out.println("Está ligando..");
    }


}
