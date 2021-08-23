package oo.heranca;

public class Player {


    public int vida;
    public int posicaoX;
    public int posicaoY;


    //Construtor padrao
    public Player() {
        vida = 0;
        posicaoX = 0;
        posicaoY = 0;
    }
//    Player(){
//        this(0,0,0);
//    }

    public Player(int vida, int posicaoX, int posicaoY) {
        this.vida = vida;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }

    public boolean andar(Posicao posicao) {
        switch (posicao) {
            case NORTE:
                posicaoX++;
                break;
            case SUL:
                posicaoX--;
                break;
            case LESTE:
                posicaoY++;
                break;
            case OESTE:
                posicaoY--;
                break;
        }
        return true;
    }

    boolean atacar(Player jogador) {
        int deltaX = Math.abs(posicaoX - jogador.posicaoX);
        int deltaY = Math.abs(posicaoY - jogador.posicaoY);
        if (deltaX == 0 && deltaY == 1) {
            jogador.vida -= 10;
        } else if (deltaX == 1 && deltaY == 0) {
            jogador.vida -= 10;
        }
        return true;
    }


}
