package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();


        // Add e Offer - > adicionam elementos na fila
        // A diferença  é o comportamento quando a fila esta cheia...

        fila.add("Ana"); // Se a fila estiver restrinções lança uma exceptions
        fila.offer("Bia"); // lança v ou f
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        System.out.println(fila);

        for (String nomes : fila) {
            System.out.println("Nome: " + nomes);
        }

        // Busca pelo primeiro elemento da fila
        System.out.println(fila.peek()); // Retorna null
        System.out.println(fila.element()); // lanca uma exception

        System.out.println(fila.size()); // tamanho
        System.out.println(fila.isEmpty()); // Faz a consulta se está vazia

        // Obtendo o primeiro elemento da fila e excluindo
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

        // Pelo remove: A diferença é que lança uma exception
        System.out.println(fila.remove());


    }
}
