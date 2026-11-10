package saborexpress.modelo;

import saborexpress.interfaces.Calculavel;
import saborexpress.excecao.SaborExpressException;

public abstract class Prato implements Calculavel {
    private String nome;
    private double precoBase;
    private int tempoPreparo;

    public Prato(String nome, double precoBase, int tempoPreparo) {
        if (precoBase < 0) {
            throw new SaborExpressException("Preco nao pode ser negativo");
        }
        this.nome = nome;
        this.precoBase = precoBase;
        this.tempoPreparo = tempoPreparo;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }

    @Override
    public abstract double calcularPrecoFinal();
}
