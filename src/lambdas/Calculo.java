package lambdas;

@FunctionalInterface // Só pode 1 método;
public interface Calculo {

    double executar(double a, double b);

    default double executarDefault() {
        return executar(1, 2);
    }

    default String legal() {
        return "Legal";
    }

    static String muitoLegal() {
        return "Muito legal";
    }

}
