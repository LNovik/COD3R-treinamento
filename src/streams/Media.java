package streams;

public class Media {

    private double total;
    private int quantidade;

    public Media adicionar(double valor){
        total += valor;
        quantidade++;
        return this;
    }
    public double getMedia(){
        return total / quantidade;
    }
    public static Media combinar(Media media1, Media media2){
        Media resultante = new Media();
        resultante.total = media1.total + media2.total;
        resultante.quantidade = media1.quantidade + media2.quantidade;
        return resultante;
    }


}
