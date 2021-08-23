package oo.polimofirsmo;

public class Jantar {
    public static void main(String[] args) {

        Pessoa luan = new Pessoa(83.2);

        Arroz arroz = new Arroz(0.124);
        Feijao feijao = new Feijao(0.333);
        Sorvete sorvete = new Sorvete(0.150);

        System.out.println(luan);

        luan.comer(arroz);
        luan.comer(feijao);
        luan.comer(sorvete);

        System.out.println(luan);


    }
}
