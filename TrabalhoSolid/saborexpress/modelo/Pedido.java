package saborexpress.modelo;

import saborexpress.interfaces.Calculavel;
import saborexpress.excecao.SaborExpressException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Calculavel {
    private Cliente cliente;
    private LocalDate data;
    private List<Prato> itens;

    public Pedido(Cliente cliente, LocalDate data) {
        if (cliente == null) {
            throw new SaborExpressException("Pedido exige cliente");
        }
        this.cliente = cliente;
        this.data = data;
        this.itens = new ArrayList<>();
    }

    public void adicionarPrato(Prato prato) {
        if (prato != null) {
            itens.add(prato);
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public List<Prato> getPratos() {
        return itens;
    }

    @Override
    public double calcularPrecoFinal() {
        double soma = 0;
        for (Prato item : itens) {
            soma += item.calcularPrecoFinal();
        }
        return soma;
    }
}
