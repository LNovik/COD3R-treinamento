package dio.tipos.wrappers;

public class Wrappers {
    public static void main(String[] args) {

        //AutoBoxing

        Byte b = 127; //byte
        Byte b2 = -128;
        Byte nullByte = null;

        Character c = 'A';  //char
        Character c2 = 15;

        Short s = 32767; //short
        Short s2 = -32768;

        Integer i = 2147483647; //int
        Integer i2 = -2147483648;

        Long l = 923372036854775807L; //long
        Long l2 = -923372036854775809L;

        Float f = 65f; // float
        Float f2 = 65.0f;

        Double d = 1024.99;  //Double
        Double d2 = 10.2456;

        Boolean bo = Boolean.parseBoolean("true");
        Boolean bo2 = Boolean.getBoolean("True".toLowerCase());


    }
}
