package classe;

public class ValorNulo {
    public static void main(String[] args) {


        String s1 = " "; // É um valor vazio, mas não nulo (null)
        System.out.println(s1.concat("!!"));


        // Não será possivel acessar essa variavel
        // Pois ela não está apontando pra nenhum lugar
        // Ou seja, não tem valor dentro dela..
        String s2 = null;
        System.out.println(s2.concat("!!!"));


        // Um teste pra saber se é null
        // antes de inicializar um objeto


        String nome = Math.random() > 0.5 ? "Luan" : null;
        if (nome != null) {
            System.out.println("Nome: " + nome);
        }


    }
}
