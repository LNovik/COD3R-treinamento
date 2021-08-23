package dio.pessoas;

public class ProgramaPessoaFisica {
    public static void main(String[] args) {

        final PessoaFisica pessoaFisica = new PessoaFisica(29, 81.3f);

        System.out.println(pessoaFisica.getIdade());
        System.out.println(pessoaFisica.getPeso());
        System.out.println(pessoaFisica.relatorio());


    }
}