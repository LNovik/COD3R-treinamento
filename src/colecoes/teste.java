package colecoes;

import java.util.HashSet;
import java.util.Set;

public class teste {
    public static void main(String[] args) {

        System.out.println("Exemplo 1");
        Set conjunto1 = new HashSet();
        conjunto1.add(1);
        conjunto1.add(5);
        conjunto1.add(2);

        System.out.println(conjunto1);

        System.out.println("Exemplo 2");
        Set<Integer> conjunto2 = new HashSet();
        conjunto2.add(2);
        conjunto2.add(5);
        conjunto2.add(1);

        System.out.println(conjunto2);

        System.out.println("Exemplo 3");
        HashSet conjunto3 = new HashSet();
        conjunto3.add(5);
        conjunto3.add(1);
        conjunto3.add(2);

        System.out.println(conjunto3);

        System.out.println("Exemplo 4");
        HashSet<Integer> conjunto4 = new HashSet();
        conjunto4.add(5);
        conjunto4.add(2);
        conjunto4.add(1);

        System.out.println(conjunto4);


    }
}
