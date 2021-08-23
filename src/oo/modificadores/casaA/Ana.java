package oo.modificadores.casaA;

public class Ana {

    @SuppressWarnings("unised")
    private String segredo;  // Protegido: apenas classe
    String facoDentroDeCasa;   //Default ou pacote
    protected String formadeFalar;  //Pacote ou Heranca
    public String todosSabem;

    protected String getFormadeFalar(){
        return formadeFalar;
    }


}
