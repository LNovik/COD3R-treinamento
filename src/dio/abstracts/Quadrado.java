package dio.abstracts;

public class Quadrado extends FormaGeometrica{
    private String nome;
    private Double area;

    Quadrado(final String nome, final Double area){
        this.nome = nome;
        this.area = area;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public Double getArea(){
        return  area;
    }



    @Override
    public String toString() {
        return "Quadrado{" +
                "nome='" + nome + '\'' +
                ", area=" + area +
                '}';
    }
}
