package streams;

import java.util.function.UnaryOperator;

public class Modelo {

    private Modelo() {

    }

    public final static UnaryOperator<String> maiuscula =
            valor -> valor.toUpperCase();
    public final static UnaryOperator<String> primeiraLetra =
            valor -> valor.charAt(0) + " ";

    public final static String grito(String nome) {
        return nome + "!!";
    }


}
