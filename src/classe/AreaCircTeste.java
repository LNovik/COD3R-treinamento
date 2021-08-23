package classe;


public class AreaCircTeste {
    public static void main(String[] args) {


        AreaCirc.pi = 0;
        AreaCirc a1 = new AreaCirc(100);
        //a1.pi = 0; // Não é recomendado alterar pelo objeto, pois a variavel pertence agora a classe
        // Se mudar pelo objeto, o valor sera compartilhado para todos os objetos...
        System.out.println(a1.area());

        AreaCirc a2 = new AreaCirc(20);
        // a2.pi = 0;
        System.out.println(a2.area());


        AreaCirc a3 = new AreaCirc(20);
        System.out.println(a3.area());


        // Mudando o valor da variavel de classe pi
        AreaCirc.pi = 20; // Agora ela está associada a classe...

        System.out.println(Math.PI); // O PI é um atributo constante estatico que pertence a classe math.. (constante)
        System.out.println(AreaCirc.pi);
    }
// O out também é um membro da classe Sytem
}
