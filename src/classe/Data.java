package classe;

public class Data {

    int dia;
    int mes;
    int ano;

    // Costrutor padrao inicialiando os atributos por padrao no construtor
    Data() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    // Construtor explicito
    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String imprimirDataFormatada1() {
        String formato = "%d/%d/%d"; // Variavel local
        return String.format(formato, dia, mes, ano);
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
}// O String.format formata o codigo em print