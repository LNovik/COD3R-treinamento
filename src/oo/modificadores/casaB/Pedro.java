package oo.modificadores.casaB;

import oo.modificadores.casaA.Ana;

public class Pedro extends Ana {

    Ana mae = new Ana();


    void testeAcesso() {
        // Segredo
        // facoDentroDeCasa
         // formaDeFalar
        // tosoSabem
        System.out.println(mae.todosSabem);
        System.out.println(formadeFalar); // Só o objeto pedro conseguirá acessar

    }


}
