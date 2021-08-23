package classe;

public class ValorVsReferencia {
    public static void main(String[] args) {

        int a = 2;
        int b = a; // Atribuição por valor

        a++;
        b--;

        System.out.println(a + " " + b); // Concatenando as duas variaveis

        Data d1 = new Data();
        Data d2 = d1;   // Atribuição por referencia ( está compartilhando a mesma referencia (objeto)...)

        d1.dia = 19;
        d2.mes = 6;
        d1.ano = 1992;

        // Por ter a mesma referencia, ambos exibirão o mesmo resultado, pois compartilham o mesmo objeto...
        System.out.println(d1.imprimirDataFormatada1());
        System.out.println(d2.imprimirDataFormatada1());


        voltarDataParaValorPadrao(d1);
        System.out.println(d1.imprimirDataFormatada1());
        System.out.println(d2.imprimirDataFormatada1());

        //Esse código nao dará certo, pois não esta passando a referencia e sim uma cópia do valor
        int c = 4;
        alterarPrimitivo(c);
        System.out.println(c);

    }

    // Se passar um objeto como parametro pra um método, esse objeto também é passado como referencia ( e não cópia)..
    //Um método static acessa outro método static

    static void voltarDataParaValorPadrao(Data d) { // Método de alteração..
        d.dia = 0;
        d.mes = 0;
        d.ano = 0;
    }

    static void alterarPrimitivo(int a) { // Passou uma cópia...
        a++;
    }


}

