package fundamentos;


// Usando métodos estaticos: Não precisa instanciar um objeto
public class ManipulacaoStrings {
    public static void main(String[] args) {
        lenght();
        concat();
        comparacao();
        verificar();
        charAt();
        indexOf();
        subsTring();
        replace();


    }

    public static void lenght() {
        String nome = "Luan";
        var sobreNome = "Novik";
        System.out.printf("Meu nome é %s %s", nome, sobreNome);
        int qntLetras = nome.length() + sobreNome.length();
        System.out.println("A quantidade de letras é: " + qntLetras);
    }

    public static void concat() {
        String nome = "Luan";
        String sobreNome = "Novik Silva";
        String nomeCompleto = nome.concat(" ").concat(sobreNome);
        //String nomeCompleto2 = nome + " " + sobreNome; // Pode ser dessa forma também...
        System.out.println("Nome do usuário: " + nomeCompleto);

    }

    public static void comparacao() {
        String nome = "Luan";
        if (nome.equals("Luan")) {
            System.out.println("A String da variavel tem o nome de: " + nome);
        } else {
            System.out.println("A String não possui o valor");
        }
        if (nome.equalsIgnoreCase("LUAN")) {
            System.out.println("Nome: " + nome);
        } else {
            System.out.println("O nome verdadeiro é: " + nome);
        }
    }

    public static void verificar() {
        String nome = "Luan Novik Silva";
        if (nome.startsWith("Luan")) {
            System.out.println("O nome começa com " + nome);
        } else {
            System.out.println("Não começa com esse nome e sim com:" + nome);
        }
        if (nome.endsWith("Paulo")) {
            System.out.println("O nome termina com esse nome. Nome completo: " + nome);
        } else {
            System.out.println("O nome não termina com esse nome.");
        }
    }

    public static void charAt() {
        String nome = "Luan Novik Silva";
        char letra = nome.charAt(4);
        System.out.println("A quarta letra do nome " + nome + " é a letra " + letra);
    }

    public static void indexOf() {
        String nome = "Luan Novik Silva";
        int indice = nome.indexOf("N");
        System.out.println("O índice da letra N, é o índice " + indice);
        indice = nome.indexOf(" ");
        System.out.println("O primeiro espaço do nome  " + nome + " fica na posição " + indice);
        indice = nome.lastIndexOf(" ");
        System.out.println("A  posição da ultima vez que aparece um espaço " + indice);
    }

    public static void subsTring() {
        String nome = "Luan Novik Silva";
        int indice = nome.indexOf(" ");
        String primeiroNome = nome.substring(0, indice);
        System.out.println("O primeiro nome é " + primeiroNome);
        indice = nome.lastIndexOf(" ");
        String ultimoNome = nome.substring(indice);
        System.out.println("O ultimo nome é " + ultimoNome);
    }

    public static void replace() {
        String valor = "50,50";
        valor = valor.replace(",", ".");
        double valorReal = Double.parseDouble(valor);
        System.out.println(valorReal);
    }
}






