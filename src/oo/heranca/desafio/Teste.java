package oo.heranca.desafio;

public class Teste {
    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari();

        ferrari.ligarTurbo();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        System.out.println(ferrari.velocidadeAr());
        System.out.println(ferrari);
        ferrari.desligarAr();

    }
}
