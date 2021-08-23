package treino.heranca;

public class Teste {
    public static void main(String[] args) {

        Carro carro1 = new Civic();
        System.out.println("New Civic");
        System.out.println("Velocidade Máxima -> " + carro1.VELOCIDADE_MAXIMA);
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        System.out.println(carro1);

        Carro carro2 = new Ferrari();
        System.out.println("\nFerrari");
        System.out.println("Velocidade Máxima -> " + carro2.VELOCIDADE_MAXIMA);
        carro2.acelerar();
        carro2.acelerar();
        carro2.acelerar();
        carro2.acelerar();
        carro2.acelerar();
        System.out.println(carro2);




    }
}
