package dio.tipos.primitivos;

public class DefaultValues {
    public static void main(String[] args) {

        final Default d = new Default();

        System.out.println(d.getI());
        System.out.println(d.isActive());
    }
}


class Default {
    int i = 1;
    boolean active = true;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

