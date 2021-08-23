package streams;

public class MediaTeste {
    public static void main(String[] args) {

        Media media1 = new Media().adicionar(8.3).adicionar(6.7);
        Media media2 = new Media().adicionar(7.9).adicionar(6.6);

        System.out.println("Média 1: " + media1.getMedia());
        System.out.println("Média 2: " + media2.getMedia());

        double mediaResultante = Media.combinar(media1,media2).getMedia();
        System.out.println("Média resultante: " + mediaResultante);

    }
}
