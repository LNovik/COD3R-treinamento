package dio.heranca;

import java.util.Objects;

public class Veiculo {

    private String marca;
    private String modelo;
    private double valorVernal = 0.4;
    protected String teste = "oi";

    public Veiculo(String marca, String modelo, double valorVernal) {
        this.marca = marca;
        this.modelo = modelo;
        this.valorVernal = valorVernal;
    }

    public double getValorVernal() {
        return valorVernal;
    }

    public void setValorVernal(double valorVernal) {
        this.valorVernal = valorVernal;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println("");
    }

    public double calcularImposto() {
        return this.valorVernal * 0.01;
    }


    public boolean equals(Object objeto) {
        if (objeto == null) {
            return false;
        }
        Veiculo outro;
        if (objeto instanceof Veiculo) {
            outro = (Veiculo) objeto;
        } else {
            return false;
        }
        if (this.hashCode() == objeto.hashCode()) {
            return true;
        } else {
            return false;
        }
    }


    public int hashCode() {
        return Objects.hash(marca, marca, valorVernal);
    }


}








