package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class Teste {
    public static void main(String[] args) {

        Civic carro1 = new Civic(220);
        System.out.println(carro1);


        carro1.acelerar();
        carro1.acelerar();
        System.out.println(carro1);
        carro1.acelerar();
        System.out.println(carro1);
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        System.out.println(carro1);

        Ferrari ferrari1 = new Ferrari(340);
        ferrari1.acelerar();
        ferrari1.acelerar();
        ferrari1.acelerar();
        ferrari1.acelerar();
        ferrari1.acelerar();
        System.out.println(ferrari1);


    }
}

