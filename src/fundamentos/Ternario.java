package fundamentos;

// É uma atribuição condicional
public class
Ternario {
    public static void main(String[] args) {

        double media = 6;

        String resultadoParcial = media >= 5 ? "Em recuperação" : "Reprovado";
        String resultadoFinal = media >= 7 ? "Aprovado" : resultadoParcial;

        System.out.println("Resultado final: " + resultadoFinal);

        double nota = 6;
        boolean passouPorMedia = nota >= 7;  // Operação relacional
        boolean bomComportamento = true;
        boolean temDesconto = passouPorMedia && bomComportamento;   // Operação logica

        // Operação ternaria
        String resultadoDesconto = temDesconto ? "O aluno tem desconto" : "O aluno não tem desconto";
        System.out.println("Resultado sobre o desconto: " + resultadoDesconto);


    }
}
