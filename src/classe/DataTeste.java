package classe;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();
        d1.dia = 11;
        d1.mes = 6;
        d1.ano = 1972;

        var d2 = new Data();
        d2.dia = 19;
        d2.mes = 6;
        d2.ano = 1992;

        Data d3 = new Data();


        Data d4 = new Data(21, 8, 1990);


        System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
        System.out.printf("%d/%d/%d\n", d2.dia, d2.mes, d2.ano);

        System.out.println(d1.imprimirDataFormatada1());


        String dataFormatada1 = d2.imprimirDataFormatada2();
        System.out.println(dataFormatada1);

        dataFormatada1 = d3.imprimirDataFormatada1();
        System.out.println(dataFormatada1);

        dataFormatada1 = d4.imprimirDataFormatada2();
        System.out.println(dataFormatada1);

        d1.imprimirDataFormatada3();
        d2.imprimirDataFormatada4();


    }


}
