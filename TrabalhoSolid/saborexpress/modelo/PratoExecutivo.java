package saborexpress.modelo;

public class PratoExecutivo extends Prato {
    public PratoExecutivo(String n, double p, int t) {
        super(n, p, t);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase();
    }
}
