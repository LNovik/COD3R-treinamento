package fundamentos;

public class DesafioLogicos {
    public static void main(String[] args) {
        // Trabalho na terca (V ou F)
        // Trabalho na quinta (V ou F)

        boolean trabalhoTerca = true;
        boolean trabalhoQuinta = false;

        boolean comprouTv32 = trabalhoTerca ^ trabalhoQuinta;
        boolean comprouTv50 = trabalhoTerca && trabalhoQuinta;
        boolean comprouSorvete = trabalhoTerca || trabalhoQuinta;
        boolean maisSaudavel = !comprouSorvete; // Operador unario


        System.out.println("Comprou tv de 50\"? " + comprouTv50);
        System.out.println("Comprou tv de 32\"? " + comprouTv32);
        System.out.println("Tomou Sorvete? " + comprouSorvete);
        System.out.println("Mais saudável? " + maisSaudavel);


    }
}
