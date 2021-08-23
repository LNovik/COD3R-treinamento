package excecao.personalizadaA;

public class StringVaziaExcepetion extends RuntimeException {

    private String nomeDoAtributo;

    public StringVaziaExcepetion(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo '%s' está vazio", nomeDoAtributo);
    }
}
