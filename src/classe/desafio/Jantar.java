package classe.desafio;

public class Jantar {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Luan", 82.3);
        Comida c1 = new Comida("Arroz", 0.3);
        Comida c2 = new Comida("Feijão", 0.5);
        Comida c3 = new Comida("Carne", 0.2);


        System.out.println(p1.apresentar());
        p1.comer(c1);
        p1.comer(c2);
        p1.comer(c3);
        System.out.println(p1.apresentar());


    }
}
