package oo.composicao;

public class Carro {
    // Relação 1 para 1 bilateral
    // Motor motor = new Motor(); // Motor pertence a classe carro... // Se fosse unilateral
    Motor motor;

    // Relação bilateral
    Carro() {
        this.motor = new Motor(this);
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean estarLigado() {
        return motor.ligado;
    }

    void acelerar() {
        if (motor.fatorInjecao < 2.6) {
            motor.fatorInjecao += 0.4;
        }
    }

    void frear() {
        if (motor.fatorInjecao > 0.5) {
            motor.fatorInjecao -= 0.4;
        }
    }


}

