package PROYECTO.ARQUITECTURA;

public class NumeroBase {
    private String value;
    private int base;

    public NumeroBase(String value, int base) {
        this.value = value;
        this.base = base;
    }

    public String getValue() {
        return value;
    }

    public int getBase() {
        return base;
    }
}