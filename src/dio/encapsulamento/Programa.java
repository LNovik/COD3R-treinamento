package dio.encapsulamento;

public class Programa {
    public static void main(String[] args) {

        final var p1 = new Pessoa("Luan", 19, 06, 1992);

        System.out.println(p1.getNome());
        p1.setNome("Luan Novik");
        System.out.println(p1.getNome());
        System.out.println(p1.getDataNascimento());
        System.out.println(p1.calcularIdade());








    }
}
