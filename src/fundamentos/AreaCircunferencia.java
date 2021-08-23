package fundamentos;

public class AreaCircunferencia {

    public static void main(String[] args) {

        double raio = 3.4;
        final double PI = 3.14159; // Variáveis do tipo constante: Não podem ser mudadas


        // 1° Exemplo
        double area = Math.pow(3.4, 2) * 3.14159; // Apenas com valores literais...
        System.out.println("A Aera é: " + area);

        // 2° Exemplo
        area = 3.4 * 3.4 * 3.14159;  // Apenas com valores literais...
        System.out.println("A Area é: " + area);

        // 3° Exemplo
        area = raio * raio * PI;
        System.out.println("A Area é: " + area);

        // 4° Exemplo

        raio = 0;
        area = raio * raio * PI;
        System.out.println("A Area é: " + area);

        // 5° Exemplo
        System.out.println("A Area é: " + raio * raio * PI);

        // 6° Exemplo
        System.out.println("A Area é: " + 3.4 * 3.4 * 3.1415);

        // 7° Exemplo
        System.out.println("A Area é: " + Math.pow(3.4, 2) * 3.14159);

    }
}


