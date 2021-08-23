package excecao;
//Jeito certo e atualizado
public class ExceptionGenerica {
    public static void main(String[] args) {
        int[] numeros1 = {4, 8, 16, 32, 64, 128};
        int[] denom1 = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros1.length; i++) {
            try {
                System.out.println(numeros1[i] + "/" + denom1[i] + " = " + (numeros1[i] / denom1[i]));
            } catch (Exception exception) {
                System.out.println(exception.getMessage()); //Importante pra verificar log
                exception.printStackTrace();

            }
        }
    }
}
//Não é recomendado verificar varias exception uma por uma, a não ser nas verificadas...
/** throws serve quando não queremos tratar a exception..
 * 1 - Método pode disparar uma Exception
 * 2 - Passa a responsabilidade para quem for utilizar o método
 * 3 - Exceptions disparadas em tempo de execução (ArrayOutOfBounds,Arithmetic) não necessitam de throws explicitamente.
 */