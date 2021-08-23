package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informações do funcionário

        // Tipos primitivos numéricos inteiros
        byte anosEmpresa = 23;
        short numerosVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L; // Precisa converter pra long, pois o padrão dos inteiros é o tipo INT

        // Tipos primitivos numéricos reais
        float salario = 11_445.44F; // Precisa converter pra float, pois o padrão é double
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo booleano
        boolean estaDeFerias = true;

        // Tipo caractere
        char status = 'A';

        // Dias de empresa
        System.out.println("Dias de empresas: " + anosEmpresa * 365);

        // Números de viajens
        System.out.println("Números de viajens: " + numerosVoos / 2);

        // Pontos por real
        System.out.println("Pontos por real: " + pontosAcumulados / vendasAcumuladas);

        // Está de férias
        System.out.println("Está de férias: " + estaDeFerias);

        // Status
        System.out.println("Status do funcionaio " + status + ": ATIVO");

        // ID
        System.out.println(id + ": ganha --> " + salario);


    }
}
