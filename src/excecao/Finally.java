package excecao;

//Sempre executado após o bloco try ou o catch
public class Finally {
    public static void main(String[] args) {

        int[] numero = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 8, 0};

        for(int i = 0; i < numero.length; i++){
            try{
                System.out.println(numero[i] + "/" + denom[i] + " = " + (numero[i] / denom[i]));
            }catch (ArithmeticException | ArrayIndexOutOfBoundsException exception){
                System.out.println("Erro encontrado: " + exception.getMessage());
                System.exit(0);//Após o catch, sairá do programa...
            }finally {
                System.out.println("Essa linha será impressa sempre após o try ou o catch");
            }
        }
        //Mesmo se o código for executado com sucesso ou acontecer uma exception o finally sempre será executado...








    }
}
