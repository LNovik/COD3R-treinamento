package oo.composicao.relacionamento;

public class Teste {
    public static void main(String[] args) {

        Contato contato = new Contato();

        Endereco endereco = new Endereco();
        endereco.setNomeRua("Av.Celso Malcher");
        endereco.setComplemento("Entre Passagens vilhena e Santa Helena");
        endereco.setNumero("310");

        Telefone telefone1 = new Telefone();
        telefone1.setDdd("91");
        telefone1.setNumero("(91) 9 982799");
        telefone1.setTipo("Pré-Pago");

        Telefone telefone2 = new Telefone();
        telefone2.setDdd("90");
        telefone2.setNumero("(91) 9 91141734");
        telefone2.setTipo("Pós-Pago");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone1;
        telefones[1] = telefone2;

        contato.setTelefone(telefones);



        contato.setEndereco(endereco);

        if(contato != null && contato.getEndereco() != null && contato.getTelefone() != null){
            System.out.println(contato);
        }

        if(contato != null && contato.getTelefone() != null){
            for(Telefone t: contato.getTelefone()){
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }










    }
}
