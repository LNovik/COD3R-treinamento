package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // 1° exemplo

        int qntDeNotas1 = 0;
        double nota1 = 0;
        double total1 = 0;

        while (nota1 != -1) {
            System.out.print("Informe sua nota: ");
            nota1 = entrada.nextDouble();
            if (nota1 >= 0 && nota1 <= 10) {
                total1 += nota1;
                qntDeNotas1++;
            } else if (nota1 == -1) {
                break;
            } else {
                System.out.println("Dados inválidos");
            }
        }
        double media1 = total1 / qntDeNotas1;
        System.out.println("Media " + media1);


        // 2° Exemplo
        int qntDeNotas2 = 0;
        double nota2 = 0;
        double total2 = 0;

        System.out.print("Informe sua nota: ");
        nota2 = entrada.nextDouble();

        while (nota2 != -1 && nota2 <= 10) {
            total2 = nota2;
            qntDeNotas2++;
            System.out.print("Informe sua nota: ");
            nota2 = entrada.nextDouble();
        }
        double media2 = total2 / qntDeNotas2;
        System.out.println("Média " + media2);


    }


}



/*// 1° Exemplo
       int qntDeNotas1 = 0;
       double nota1 = 0;
       double total1 = 0;

        System.out.print("Informe sua nota: ");
        nota1 = entrada.nextDouble();

        while( nota1 != -1 && nota1 <= 10){
            total1 += nota1;
            qntDeNotas1++;
            System.out.print("Informe sua nota: ");
            nota1 = entrada.nextDouble();
        }
        double media1 = total1 / qntDeNotas1;
        System.out.println("Média do aluno: " + media1);

*/