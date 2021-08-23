package fundamentos;

public class ConversaoNumeroString {
    public static void main(String[] args) {

        //Usando um wrapper do tipo integer(tipo associado a um inteiro(int))
        Integer num1 = 10000;
        System.out.println(num1.toString().length()); //Convertendo um numero (Integer) em uma String

        // Usando tipo primitivo
        int num2 = 10000;
        System.out.println(Integer.toString(num2)); //Diretamente pelo Integer


        //Um exemplo concatenando com uma String vazia..
        System.out.println((num1 + " ").toLowerCase());
        System.out.println((num2 + " ").toUpperCase());

        String a = (num1 + " ").concat("oi");
        System.out.println(a);


    }
}
