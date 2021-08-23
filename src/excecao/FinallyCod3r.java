package excecao;

import java.util.Scanner;

public class FinallyCod3r {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        try{
            System.out.print("Insira um valor: ");
            System.out.println( 7 / entrada.nextInt());

        }catch(Exception exception){
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }finally {
            System.out.println("Programa finalizado");
            entrada.close();
        }














    }
}
