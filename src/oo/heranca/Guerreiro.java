package oo.heranca;

public class Guerreiro extends Player {


    public Guerreiro(int vida, int posicaoX, int posicaoY) {
        super(vida, posicaoX, posicaoY);
    }

    public Guerreiro(){

    }

//    Guerreiro() {
//        super(0, 0, 0);
//    }


    public boolean atacar(Player jogador) {
        int deltaX = Math.abs(posicaoX - jogador.posicaoX);
        int deltaY = Math.abs(posicaoY - jogador.posicaoY);
        if (deltaX == 0 && deltaY == 1) {
            jogador.vida -= 20;
        } else if (deltaX == 1 && deltaY == 0) {
            jogador.vida -= 20;
        }
        return true;
    }


}
