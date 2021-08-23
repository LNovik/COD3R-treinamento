package dio.interfaces;

public class Programa {
    public static void main(String[] args) {

        final Gol gol = new Gol();

        System.out.println(gol.marca());
        System.out.println(gol.tipo());
        gol.ligar();

        final Trator trator = new Trator();

        System.out.println(trator.numeracao());
        System.out.println(trator.cor());
        System.out.println(trator.ano());
        trator.ligar();

        final Fiesta fiesta = new Fiesta();

        System.out.println(fiesta.marca());
        System.out.println(fiesta.numeracao());
        System.out.println(fiesta.cor());
        System.out.println(fiesta.ano());
        fiesta.ligar();




    }
}
