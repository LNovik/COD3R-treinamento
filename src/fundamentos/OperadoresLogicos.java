package fundamentos;

public class OperadoresLogicos {
    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = 3 > 4; //Operação relacional

        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!condicao1);
        System.out.println(!condicao2);


    }
}
// Operadores lógicos: = ex2: &&, ||, ^, !
// Operadores relacionais: Ex: 3 > 7 ou 4 == 5;