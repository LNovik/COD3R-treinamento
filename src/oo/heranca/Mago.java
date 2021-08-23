package oo.heranca;

public class Mago extends Player {

    public Mago(){
        super(98, 10, 11);
    }




    public boolean atacar(Player jogador) {
        boolean ataque1 = super.atacar(jogador);
        boolean ataque2 = super.atacar(jogador);
        boolean ataque3 = super.atacar(jogador);
        return ataque1 || ataque2 || ataque3;
    }


}




