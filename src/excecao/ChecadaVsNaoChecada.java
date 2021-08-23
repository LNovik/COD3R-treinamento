package excecao;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) /*throws Exception*/ {

        //Decidindo tratar o erro
        try {
            geraErro1();
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            geraErro2(); //Por ser uma exceção checada..
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        geraErro3();

        System.out.println("Fim :)");

    }

    //Não verificada/Checada: não é obrigatório tratá-la
    static void geraErro1() {
        throw new RuntimeException("Erro encontrado aqui #01"); //unchecked
    }

    //Excecão checada: é obritarório fazer o tratamento
    static void geraErro2() throws Exception { //Deixando claro na assinatura do método que está lançando uma exc
        throw new Exception("Erro encontrado aqui #02"); //checked
    }

    static void geraErro3() {
        try {
            throw new Exception("Erro encontrado aqui #03");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }


}
// Todo erro precisa ser lançado
// Throw serve pra lançar algo.. No caso throw new RuntimeException lançará uma excessao...
