package fundamentos;

public class Aritmeticos {
    public static void main(String[] args) {
        System.out.println(2 + 3);
        //Operações aritmeticas usando operadores binarios.(dois operandos)

        var x = 34.56;
        double y = 2.2;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x / y);
        System.out.println(x * y);

        int a = 8;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * (double) b);


    }
}


// Operadores unarios: Um unico operando.. Ex: ++3 (pré fixada) / 3++ (pós fixada)
// Operadores binarios: Dois operando: Ex: 2 + 2..
// Operadores ternarios: Três operando: Ex: condicional ? : operando1 : operando2;