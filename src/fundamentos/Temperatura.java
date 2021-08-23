package fundamentos;

public class Temperatura {
    public static void main(String[] args) {

        // (°F - 32 ) X 5.0 / 9.0;

        // Variáveis do tipo constante: Não podem ser mudadas
        final int AJUSTE = 32;
        final double FATOR = 5.0 / 9.0;

        double fahrenheit = 86;

        double celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("A área em Celsius é: " + celsius + " °C");

        fahrenheit = 0;
        celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("A área em Celsius é: " + celsius + " °C");


    }
}
