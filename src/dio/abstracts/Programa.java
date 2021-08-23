package dio.abstracts;

public class Programa {
    public static void main(String[] args) {

        FormaGeometrica quadrado = new Quadrado("Quadrado", 82.3);
        System.out.println(quadrado.getNome());
        System.out.println(quadrado.getArea());
        System.out.println(quadrado.desenha(8,4));
        System.out.println(quadrado);


    }
}
