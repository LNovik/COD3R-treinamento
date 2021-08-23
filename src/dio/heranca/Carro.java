package dio.heranca;

public class Carro extends Veiculo {

    private int quantidadePortas;

    public Carro(String marca, String modelo, double valorVernal, int quantidadePortas) {
        super(marca, modelo, valorVernal);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void acelerar() {
       super.acelerar();
    }

    @Override
    public double calcularImposto() {
        return super.getValorVernal() * 0.03;
    }

}
