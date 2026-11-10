package saborexpress.modelo;

import saborexpress.excecao.SaborExpressException;

public class PratoEspecial extends Prato {
    private double custoIngrediente;

    public PratoEspecial(String n, double p, int t, double custoIngrediente) {
        super(n, p, t);
        if (custoIngrediente < 0) {
            throw new SaborExpressException("Custo adicional negativo");
        }
        this.custoIngrediente = custoIngrediente;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() + custoIngrediente;
    }
}
