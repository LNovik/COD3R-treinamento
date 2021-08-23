package oo.composicao;

public class Motor {

    boolean ligado = true;
    double fatorInjecao = 1;

    // Relação bilateral
    Carro carro;

    Motor(Carro carro) {
        this.carro = carro;
    }


    int giro() {
        if (!ligado) {
            return 0;
        } else {
            return (int) Math.round(fatorInjecao * 3000);
        }
    }


}
