package dio.imc;

import dio.pessoa.Pessoa;


public class CalculadoraImc {

    public Double calcular(Pessoa pessoa) {
        final var altura = pessoa.getAltura();
        final var imc = pessoa.getPeso() / Math.pow(altura, 2);

        return imc;
    }


}
