package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        // Chave e valor
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");  // Add e substitui o valor
        usuarios.put(2, "Rafaela");
        usuarios.put(3, "Ricardo");
        usuarios.put(4, "Ricardo");

        System.out.println("Tamanho da chave - > " + usuarios.size());
        System.out.println("A chave está vazia -> " + usuarios.isEmpty());
        System.out.println("A conjunto das colunas -> " + usuarios.keySet());
        System.out.println("Passando apenas os valores -> " + usuarios.values());

        System.out.println("Obtendo chave e valor -> " + usuarios.entrySet());
        System.out.println("Contém chave -> " + usuarios.containsKey(2));
        System.out.println("Contém valor ->" + usuarios.containsValue("Ricardo"));
        System.out.println("Removendo usuario -> " + usuarios.remove(2));


        // Buscando pela chave
        System.out.println("Buscando pela chave -> " + usuarios.get(3));


        // Formas de percorrer os elementos da chave

        // Percorrendo pela chave
        for (int chave : usuarios.keySet()) {
            System.out.println(chave);
        }
        // Percorrendo pelo valor
        for (String valor : usuarios.values()) {
            System.out.println(valor);
        }
        // Usando o entryset

        for (Map.Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.println(registro.getKey() + ":" + registro.getValue());

        }

    }
}
