package controle;

public class WhileDeterminado {
    public static void main(String[] args) {

        int contador = 1;
        while (contador <= 10) {
            System.out.printf("Contador de n° %d\n", contador);
            contador++;
        }

        while (true) {
            System.out.println("BAIT");
            //System.exit(0); // Serve para sair do programa...
            break; // O jeito mais certo de sair de um laço..
        }


    }
    // Este while é determinado, pois sabemos quantas vezes o while irá repetir...
    // O While é mais indicado quando vc quer usar uma estrutura indeterminada de repetições
    // A melhor estrutura para laços determinados é a estrutura for
}
