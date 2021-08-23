package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        // Lista do tipo usuario
        ArrayList<Usuario> lista = new ArrayList<>();

        // Instanciando objetos e adicionando
        Usuario u1 = new Usuario("Ana");
        lista.add(u1);

        // Melhor forma
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        // Chamando o objeto com o metodo toString aplicado
        System.out.println(u1);

        // Acessando pelo indice
        // Se o metodo toString estiver criado, n precisará especificar o atributo
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));

        // Usando o método toString dentro de um foreach
        // Se o método toString n for aplicado, será necessario obter o nome no objeto
        // Obs: o método to String é especifico do objeto
        for (Usuario u : lista) {
            System.out.println(u);
        }


        // Método contains
        System.out.println("Contem o nome Ana ? " + lista.contains(new Usuario("Ana")));


        // Removendo
        System.out.println(lista.remove(u1)); // Pelo objeto tem duas formas
        System.out.println(lista.remove(new Usuario("Carlos")));
        System.out.println(lista.remove(2)); // Pelo índice: vai retornar o usuario...


    }
}
