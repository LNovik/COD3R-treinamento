package dio.abstracts;

public abstract class FormaGeometrica {

    // Métodos abstratos não tem corpo
    // Classes abstratas não podem ser instanciadas
    public abstract String getNome();
    public abstract Double getArea();


    public String desenha(int x, int y){
        return "Desenhando as coordenadas X= " + x + " Y= " + y;
    }






}
