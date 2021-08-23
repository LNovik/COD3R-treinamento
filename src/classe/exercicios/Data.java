package classe.exercicios;

public class Data {
    int dia;
    int mes;
    int ano;

    // Costrutor padrao inicialiando os atributos por padrao no construtor
    Data() {
        this(1, 3, 4); // Esse construtor esta chamando o construtor de baixo
    }

    // Construtor explicito
    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }


    String imprimirDataFormatada1() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }

    String imprimirDataFormatada2() {
        return dia + "/" + mes + "/" + ano;
    }

    void imprimirDataFormatada3() {
        System.out.printf("%d/%d/%d\n", dia, mes, ano);
    }

     void imprimirDataFormatada4() {
        System.out.println(imprimirDataFormatada1());
    }
}
