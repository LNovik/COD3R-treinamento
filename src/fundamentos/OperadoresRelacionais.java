package fundamentos;

// Sempre será do tipo binario, pois tem 2 operandos
// O operador é indefixado
// O resultado sempre será booleano
// Relacionais: >, <,  >=, <=, !=, ==;
public class OperadoresRelacionais {
    public static void main(String[] args) {

        int a = 97;
        int b = 'a'; // O caractere a dentro de uma variavel int corresponde ao valor primitivo 97
        System.out.println(a + " " + b);

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a != b);
        System.out.println(a == b);

        double nota = 7.0;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;   // Operação relacional
        boolean temDesconto = bomComportamento && passouPorMedia; // Operacão lógica

        System.out.println("Tem Desconto? " + temDesconto);


    }
}
