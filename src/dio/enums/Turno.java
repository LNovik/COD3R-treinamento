package dio.enums;

public enum Turno {
    MANHA("MANHA"),
    TARDE("TARDE"),
    NOITE("NOITE");


    private String descricao;

    Turno(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }


}
