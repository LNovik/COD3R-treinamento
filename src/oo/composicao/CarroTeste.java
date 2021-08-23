package oo.composicao;

public class CarroTeste {

    public static void main(String[] args) {

        Carro c1 = new Carro();
        c1.ligar();
        System.out.println(c1.estarLigado());

        System.out.println(c1.motor.giro());// O objeto do tipo carro acessando outro objeto que tem um metodo
        System.out.println(c1.motor.ligado); // Acessando o atributo ligado do objeto motor que pertence ao objeto carro

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println(c1.motor.giro());
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        System.out.println(c1.motor.giro());

        // Relação bidirecional


        //c1.motor.fatorInjecao = 300; -> não esta encapsulado, Perigo!


    }


}
