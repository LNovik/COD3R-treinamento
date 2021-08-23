package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        // Tipo String: Atribuindo comportamentos (métodos) aos objetos do tipo String(classe)

        String texto = "Bom dia";


        // charAt : Retorna um caractere pelo índice
        System.out.println(texto.charAt(2));
        System.out.println("Meu nome é Luan".charAt(5)); // pelo valor literal;
        char caracter = texto.charAt(4);
        System.out.println(caracter);

        // concat: Concatena Strings
        System.out.println(texto.concat(texto));
        System.out.println("Olá".concat(", Meu nome é fulano"));
        String concatenar = texto.concat("!!");
        System.out.println(concatenar);
        // Uma forma  de concatenar
        System.out.println(texto + "!!"); // Da no mesmo..


        // starsWith e endsWith: Começa com e termina com
        System.out.println(texto.startsWith("Bom"));
        System.out.println(texto.endsWith("Dia"));
        System.out.println("e ai cara".startsWith("e")); // Pelo valor literal;
        boolean comecaCom = "olá, tudo bem?".startsWith("Olá");
        boolean terminaCom = "Olá, tudo bem?".endsWith("tudo");
        System.out.println("Começa com: " + comecaCom + "\nTermina Com: " + terminaCom);


        // Length: Retorna o número de caracteres
        System.out.println(texto.length());
        System.out.println("e ai cara".length());
        int numCarac = texto.length();
        System.out.println(numCarac);

        // indexOf: Retorna o índice pelo caractere
        System.out.println(texto.indexOf("t"));
        System.out.println("e ai cara".indexOf("c"));
        int caracInformado = texto.indexOf("B");
        System.out.println(caracInformado);

        // subsString: Retorna um trecho de uma String informado pelo índice
        System.out.println(texto.substring(3));
        System.out.println(texto.substring(3, 4)); // Com dois indices
        String textoString = texto.substring(0);
        System.out.println(textoString);

        //equals: Consulta se as Strings são iguais
        System.out.println(texto.equals(texto));
        System.out.println("ola".equals("ola"));
        boolean iguais = texto.equals("Boa tarde");
        System.out.println(iguais);

        // contains: Consulta se determinado trecho ou caractere tem na string
        System.out.println(texto.contains("tarde"));
        System.out.println("Olá".contains("O"));
        boolean contem = "Luan".contains("Luan");
        System.out.println(contem);

        // toUpperCase e toLowerCase: Caixa alta e caixa baixa
        System.out.println("ola".toUpperCase());
        System.out.println(texto.toUpperCase());


        // Exemplo printlns
        var nome = "Luan";
        String sobreNome = " Novik Silva";
        var idade = 28;

        // 1° Exemplo: Usando a concatenação de string usando o println
        System.out.println("Meu nome é " + nome + sobreNome + ", e a minha idade é: " + idade);

        // 2° Exemplo: Usando uma variavel

        String frase = "Meu nome é " + nome + sobreNome + ", e a minha idade é: " + idade;
        System.out.println(frase);

        // 3° Exemplo: Usando o printf: Formatação
        System.out.printf("Meu nome é %s %s e tenho %d anos", nome, sobreNome, idade);

        // 4° Exemplo: Usando o String.format
        String format = "Meu nome é %s %s e tenho %d anos";
        String outraFrase = String.format(format, nome, sobreNome, idade);
        System.out.println(outraFrase);


    }
}
