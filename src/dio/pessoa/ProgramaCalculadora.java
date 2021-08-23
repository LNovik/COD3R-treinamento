package dio.pessoa;


import dio.imc.CalculadoraImc;

public class ProgramaCalculadora {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Luan Novik", 1.9, 100.00);

        final var calculadoraImc = new CalculadoraImc();

        final var imc = calculadoraImc.calcular(pessoa);
        System.out.println("IMC: " + imc);


    }
}
