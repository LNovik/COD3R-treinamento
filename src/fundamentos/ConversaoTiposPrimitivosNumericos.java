package fundamentos;

public class
ConversaoTiposPrimitivosNumericos {
    public static void main(String[] args) {

        // Conversão entre tipos primitivos numéricos

        //Conversão implicita: de um tipo menor para o um tipo maior ( não precisará fazer o cast)
        byte a = 12;
        int b = a;
        System.out.println(b);

        //Conversão explicita: Conversão de um tipo maior para o tipo menor
        int c = 53;
        short d = (short) c; //Necessário fazer o casting

        //Conversão onde há perca de informações(dados)
        double e = 1.5;
        int f = (int) e;
        System.out.println(f); //Conversão explicita, onde houve perca de informação

        //Conversão onde o range ultrapassa seu limite
        float g = (float) 12.6784423254364252; //A variavel não conseguira armanezar todo o valor, pois nao cabe no tipo
        System.out.println(g);   // Nesse caso, o melhor seria passar o valor para uma variavel com um range maior


    }
}
