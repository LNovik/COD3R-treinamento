package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();
        livros.add("O Pequeno Príncipe"); // Se adicionar, retorna true
        livros.push("Don Quixote"); // Lança uma exc se estiver cheia
        livros.push("O Hobbit");

        // Obtendo usando peek e element
        System.out.println(livros.peek()); // Null
        System.out.println(livros.element()); // Exc

        System.out.println(livros); // Imprimindo a lista


        // Também tem o foreach

        for (String livro : livros) {
            System.out.println("Usando o forEach - > " + livro);
        }


        System.out.println(livros.poll()); // Remove o primeiro - > lança null
        System.out.println(livros.remove()); // Remove o primeiro -> lança ex


        // Usando o pop
        System.out.println(livros.pop()); // Tb remove o primeiro


    }
}
