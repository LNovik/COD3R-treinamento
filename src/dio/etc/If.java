package dio.etc;

public class If {
    public static void main(String[] args) {

        String letra = "A";
        Integer numero = 2;

        if(verifica(letra)){
            System.out.println("Letra verdadeira");
        }
        if(verifica(letra) || verifica(2)){
            System.out.println("Os dois são verdadeiros");
        }



    }
     public static boolean verifica(String letra){
        return letra.equals("A");
     }

    public static boolean verifica(Integer numero){
        return numero < 3;
    }


}
