package controle;

public class Break {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            if (i == 5) {
                System.out.println("Achei: " + i);
                break;
            }
            System.out.println(i);
        }
        System.out.println("Fim");



    }

}
