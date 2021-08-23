package classe;

public class AreaCirc {

    double area;
    static double pi = 3.1415; // Variável pertencente a classe.. Será compartilhada para todos os objetos


    AreaCirc(double area) {
        this.area = area;
    }


    double area() {
        return Math.pow(area, 2) * pi;
    }


}
