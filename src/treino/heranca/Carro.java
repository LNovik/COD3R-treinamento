package treino.heranca;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;
    int delta = 5;

    Carro(){
        this(200);
    }

    public Carro(int VELOCIDADE_MAXIMA) {
        this.VELOCIDADE_MAXIMA = VELOCIDADE_MAXIMA;
    }

    void acelerar(){
        if(velocidadeAtual + delta > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += 5;
        }
    }

    void frear(){
        if(velocidadeAtual >= 5){
            velocidadeAtual -= 5;
        }
    }


    public String toString(){
        return String.format("A velocidade atual é de  %d Km/h", velocidadeAtual);

    }


}
