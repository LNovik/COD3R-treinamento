package dio.etc;

public class While {
    public static void main(String[] args) {

        var x = 0;

        while( x < 1 ){
            System.out.println("Dentro do While");
            x++;
        }

        var y = 0;

        do{
            System.out.println("Dentro do Do");
        }while (y++ < 1);





    }
}
