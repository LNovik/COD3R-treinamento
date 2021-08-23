package dio.heranca;

public class Programa {
    public static void main(String[] args) {

        final var carro = new Carro("Volkswagem", "Golf", 600, 4);
        final var carro2 = new Carro("Volkswagem", "Golf", 600, 4);

        System.out.println(carro.equals(carro2));

        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getQuantidadePortas());
        carro.acelerar();
        System.out.println(carro.calcularImposto());



        final var moto = new Moto("Honda", "CB 300", 200, 800);
        System.out.println(moto.getMarca());
        System.out.println(moto.getModelo());
        moto.setCilindradas(6000);
        System.out.println(moto.getCilindradas());
        moto.acelerar();
        System.out.println(moto.calcularImposto());


    }
}
