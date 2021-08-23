package dio.enums;

public class Programa {
    public static void main(String[] args) {

        System.out.println(TipoVeiuculo.TERRESTRE);
        System.out.println(TipoVeiuculo.AQUATICO);
        System.out.println(TipoVeiuculo.AERO);

        for(TipoVeiuculo tipo: TipoVeiuculo.values()){
            System.out.println(tipo);
        }

        System.out.println(Status.OPEN.getCodigo() + Status.OPEN.getInf());
        System.out.println(Status.CLOSED.getCodigo() + Status.CLOSED.getInf());




    }
}
