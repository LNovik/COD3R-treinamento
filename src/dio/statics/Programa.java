package dio.statics;

public class Programa {
    public static void main(String[] args) {


        final Cachorro viralata = new Cachorro();
        final Cachorro pitbull = new Cachorro();

        //Não é recomendável
        viralata.zoologia = "Bipede";
        pitbull.zoologia = "Biípede";

        // O jeito ceerto
        Cachorro.zoologia = "Bapede";


        System.out.println(pitbull.zoologia);
        System.out.println(viralata.zoologia);

        System.out.println(Cachorro.late());


    }
}
