package dio.tipos.primitivos;

public class Primitivos {
    public static void main(String[] args) {


        // byte nullByte = null;

        byte b;   //8 bits
        byte b1 = 127;
        byte b2 = -128;
        //byte b3 = 128    //to large

        char c;  // 16 bits
        char c1 = 'A';
        char c2 = 1555;  //Representa um char na tabela
        //char c3 = 'AA'  //NOK
        //char c4 = '-100' //NOK

        short s;    //16 bits
        short s1 = 32767;
        short s2 = -32768;

        int i;
        int i1 = 2147483647;
        int i2 = -214748648;
        //int i3 = -2147483649;  //to large

        long l;
        long l1 = 9223372036854775807l;  //64 bits
        long l2 = -9223372036854775808l;
        //long l3 = 9223372036854775808l;    //to large

        // FLUTUANTES

        float f;
        float f1 = 65f;  //32 bits  3.402,823,5 E+38
        float f2 = 65.0f;
        float f3 = -0.5f;    //1.4 E-45

        double d;
        double d1 = 1024.99;  //64 bits 1.797,693,134,862,315,7 E+308
        double d2 = 10.2456;  //4.9 E-324

        //Boleano
        boolean bo;
        boolean bo1 = true; //false


        // void v; //palavra reservada


    }
}
