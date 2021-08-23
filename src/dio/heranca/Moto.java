package dio.heranca;

public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String marca, String modelo, double valorVernal, int cilindradas) {
        super(marca, modelo, valorVernal);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando a moto");
    }

    @Override
    public double calcularImposto() {
        return super.getValorVernal() * 0.07;
    }
}
