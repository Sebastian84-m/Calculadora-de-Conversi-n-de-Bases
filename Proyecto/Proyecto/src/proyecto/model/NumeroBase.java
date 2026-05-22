package proyecto.model;

public class NumeroBase {

    private String valor;
    private int base;

    // Constructor
    public NumeroBase(String valor, int base) {
        this.valor = valor.toUpperCase();
        this.base = base;
    }

    // Getter del valor
    public String getValor() {
        return valor;
    }

    // Setter del valor
    public void setValor(String valor) {
        this.valor = valor.toUpperCase();
    }

    // Getter de la base
    public int getBase() {
        return base;
    }

    // Setter de la base
    public void setBase(int base) {
        this.base = base;
    }
}