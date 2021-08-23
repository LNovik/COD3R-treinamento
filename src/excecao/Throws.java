package excecao;

public class Throws {
    public static void main(String[] args) {


       try{
           divisaoPorZero();
       }catch (Exception exception){
           System.out.println(exception.getMessage());
           exception.printStackTrace();
       }




    }

    public static void divisaoPorZero() throws Exception{
        System.out.println(7 / 0);
    }








}
