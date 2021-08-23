package dio.encapsulamento;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private  String nome;
    private LocalDate dataNascimento;

    public Pessoa(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.dataNascimento = LocalDate.of(dia, mes, ano);
    }

    public int calcularIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
    public LocalDate getDataNascimento(){
        return dataNascimento;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(final String nome){
        this.nome = nome;
    }



}
