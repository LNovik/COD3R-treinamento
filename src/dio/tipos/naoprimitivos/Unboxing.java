package dio.tipos.naoprimitivos;

public class Unboxing {
    public static void main(String[] args) {

        Integer in = 20;      //Autoboxing

        //Normal
        int i1 = 1;  //Normal
        Boolean bo = Boolean.TRUE;

        //Unboxing
        int i2 = new Integer(2);
        int i3 = Integer.valueOf(3);
        int i4 = Integer.getInteger("4");

        int i5 = Integer.parseInt("5");
        int i6 = Integer.MAX_VALUE;




    }
}
