package controle;

public class switchSemBreak {
    public static void main(String[] args) {

        // if(boolean)...
        // while(boolean)..
        // for(;boolean)...
        // Switch(valor)... Não recebe expressão  e sim valor

        String faixa = "Preta";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sabe o Bassai-Dai");
            case "marrom":
                System.out.println("Sabe o Tekki Shodan");
            case "roxa":
                System.out.println("Sabe o Heian Godan");
            case "verde":
                System.out.println("Sabe o Heian Yodan");
            case "laranha":
                System.out.println("Sabe o Heian Sandan");
            case "vermelha":
                System.out.println("Sabe o Heian Nidan");
            case "amarela":
                System.out.println("Sabe o Heian Shodan");
                break; // vai sair de todos os cases e não vai executar o default
            default:
                System.out.println("Não sabe");
        }

        // Neste caso faz sentido por que é acumulativo..
        // Não é muito utilizado

        int idade = 3;

        switch (idade) {

            case 3:
                System.out.println("Sabe argumentar");
            case 2:
                System.out.println("Sabe falar");
            case 1:
                System.out.println("Sabe andar");
                break;
            default:
                System.out.println("Não sabe nada");


        }


    }


}
