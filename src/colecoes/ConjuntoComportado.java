package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        // Dados homogenios...
        // Por ser um set, ele não respeita a ordenação
        //Set<String> listaAprovados = new HashSet<>();
        // Nesse caso ele aceita ordenação .. Pode ser TreeSet nos dois lados tb
        SortedSet<String> listaAprovados = new TreeSet<>();  // Esse permite a ordenação
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");


        System.out.println(listaAprovados); // Pode printar só o objeto;

        // Por ser um conjunto ordenado, é possivel utilizar o foreach
        for (String candidato : listaAprovados) {
            System.out.println(candidato);
        }

        //Neste caso ele permitirá ordenação por fato de ser números
        Set<Integer> numeros = new HashSet<>(); // Outro exemplo de conjunto ordenado

        numeros.add(4);
        numeros.add(3);
        numeros.add(2);
        numeros.add(1);

        System.out.println(numeros);

        for (int num : numeros) {
            System.out.println(num);
        }


    }

}
