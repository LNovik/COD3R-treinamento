package classe;



public class EqualsHashcode {
    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Luan Novik Silva";
        u1.email = "luannovik@hotmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Luan Novik Silva";
        u2.email = "luannovik@hotmail.com";

        System.out.println(u1 == u2); // Dois objetos distintos na mémoria ( possuem referencias distintas)
        System.out.println(u1.equals(u2));
        System.out.println(u1.hashCode());


    }
}
