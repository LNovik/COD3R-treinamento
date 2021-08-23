package treino.heranca;

public class Ferrari extends  Carro {

    Ferrari(){
        super(340);
    }
    void acelerar(){
        if(velocidadeAtual + delta > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += 15;
        }
    }

}
