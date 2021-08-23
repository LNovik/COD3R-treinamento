package controle;

public class For1 {
    public static void main(String[] args) {

        // 1° exemplo
        for (int contador = 0; contador <= 10; contador++) {
            System.out.printf("Contador de n° %d\n", contador);
        }

        // 2° exemplo - Não obrigatoriamente vc precisa das tres partes no laço for

        int contador = 1;
        for (; contador <= 10; ) {
            System.out.printf("Contador = %d\n", contador);
            contador += 2;
        }

        // 3° exemplo - Criando um laço infinito
        for (; ;) {
            System.out.println("BAIT");
            break;
        }


    }
}
// O For é o mais indicado para estruturas determinadas



