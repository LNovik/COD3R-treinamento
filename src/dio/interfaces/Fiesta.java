package dio.interfaces;

public class Fiesta implements Carro, Registro {
    @Override
    public String marca() {
        return "Ford";
    }

    @Override
    public String numeracao() {
        return "1231231";
    }

    @Override
    public String ano() {
        return "2001";
    }

    @Override
    public String cor() {
        return "Preto";
    }

    public String tipo() {
        return "Carro Popular";
    }

    public void ligar() {
        System.out.println("Está ligando");
//        Carro.super.ligar();
//        Carro.super.ligar();
    }


}
