package dio.finals;

public class Programa {
    public static void main(String[] args) {

        final var GAME = "PUGB";
        HardcoreGamer hardcoreGamer = new HardcoreGamer();


        Gamer gamer = new Gamer();
        System.out.println(gamer.keyboard());
        System.out.println(gamer.mouse());

        CasualGamer casualGamer = new CasualGamer();
        System.out.println(casualGamer.keyboard());
        System.out.println(casualGamer.mouse());
        System.out.println(casualGamer.play(GAME));






    }
}
