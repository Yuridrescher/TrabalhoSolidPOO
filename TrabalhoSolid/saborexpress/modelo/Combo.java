package saborexpress.modelo;

public class Combo extends Prato {
    public Combo(String n, double p, int t) {
        super(n, p, t);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() * 0.85;
    }
}
