package dio.enums;

public enum Status {
    OPEN(01, "ABERTO"),
    CLOSED(02, "FECHADO");


    private int codigo;
    private String inf;

    Status(final int codigo, final String inf) {
        this.codigo = codigo;
        this.inf = inf;
    }


    public int getCodigo() {
        return codigo;
    }

    public String getInf() {
        return inf;
    }


}
