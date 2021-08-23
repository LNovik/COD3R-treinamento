package oo.heranca.teste;

import oo.heranca.Guerreiro;
import oo.heranca.Mago;
import oo.heranca.Player;
import oo.heranca.Posicao;

public class Jogo {
    public static void main(String[] args) {

        final var cavaleiro = new Guerreiro(150, 10, 10);
        final var paladino = new Guerreiro();
        final var mago = new Mago();


        cavaleiro.andar(Posicao.NORTE);
        mago.andar(Posicao.NORTE);

        System.out.println(cavaleiro.posicaoX);
        System.out.println(mago.posicaoX);


        System.out.println("Vida do Guerreiro -> " + cavaleiro.vida);
        System.out.println("Vida do Mago -> " + mago.vida);

        cavaleiro.atacar(mago);
        mago.atacar(cavaleiro);
        cavaleiro.atacar(mago);
        mago.atacar(cavaleiro);
        cavaleiro.atacar(mago);
        mago.atacar(cavaleiro);
        cavaleiro.atacar(mago);
        mago.atacar(cavaleiro);


        System.out.println("Vida do Guerreiro -> " + cavaleiro.vida);
        System.out.println("Vida do Mago -> " + mago.vida);


    }
}
