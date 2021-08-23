package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBagunçado {
    public static void main(String[] args) {

        //O Hashset é a implementação da interface Set mais utilizada..
        //Coleções não aceitam tipos primitivos
        //Aceitam apenas valores únicos
        //É o mais rápido

        HashSet conjunto = new HashSet();
        conjunto.add(1.2);  //--> Double
        conjunto.add(true);
        conjunto.add("Jantar");
        conjunto.add('x');
        conjunto.add(1);

        // Printa todos os objetos em forma de String
        System.out.println(conjunto);
        System.out.println(conjunto.toString());

        System.out.println("Tamanho do conjunto -> " + conjunto.size());
        System.out.println(conjunto.add(1.2)); // Como não aceita objetos duplicados: false
        System.out.println(conjunto.add("teste")); // Objetos diferentes, logo : true
        System.out.println(conjunto.remove(true));
        System.out.println(conjunto.contains(1)); // Verifica determinado objeto

        // Criando o novo objeto
        Set conjunto2 = new HashSet();
        conjunto2.add("Luan Novik");
        conjunto2.add(3);
        conjunto2.add(1.3);
        conjunto2.add('A');

        System.out.println(conjunto2); // Mostrando como String

        System.out.println("Usando o equals -> " + conjunto.equals(conjunto2));
        System.out.println("União de dois conjuntos - > " + conjunto.addAll(conjunto2));
        System.out.println(conjunto); // Após a união
        System.out.println("Interseção de dois conjuntos -> " + conjunto.retainAll(conjunto2));
        System.out.println(conjunto2);

        Set<String> conjunto3 = new HashSet<>();
        conjunto3.add("Roberto");
        conjunto3.add("Carlos");
        conjunto3.add("Ricardo");
        conjunto3.add("Sérgio");

        System.out.println(conjunto3); // Mostrando como String






    }


}


