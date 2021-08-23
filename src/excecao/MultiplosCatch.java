package excecao;

public class MultiplosCatch {
    public static void main(String[] args) {


        //Primeiro exemplo
        int[] numeros1 = {4, 8, 16, 32, 64, 128};
        int[] denom1 = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros1.length; i++) {
            try {
                System.out.println(numeros1[i] + "/" + denom1[i] + " = " + (numeros1[i] / denom1[i]));
            } catch (ArithmeticException exception) {
                System.out.println(exception.getMessage());
            } catch (Throwable exception) { //Não é uma boa prática
                System.out.println(exception.getMessage());
            }
        }

        //Segundo exemplo
        int[] numeros2 = {4, 8, 16, 32, 64, 128};
        int[] denom2 = {2, 0, 8, 0};

        for (int i = 0; i < numeros2.length; i++) {
            try{
                System.out.println(numeros2[i] + "/" + denom2[i] + " = " + (numeros2[i] / denom2[i]));
            }catch (ArithmeticException | ArrayIndexOutOfBoundsException exception){
                System.out.println(exception.getMessage());
            }
        }


    }
}
