package saborexpress.servico;

import saborexpress.modelo.Pedido;
import saborexpress.interfaces.GravadorRelatorio;
import java.util.ArrayList;
import java.util.List;

public class ControlePedidos {
    private List<Pedido> lista;
    private GravadorRelatorio gravador;

    public ControlePedidos(GravadorRelatorio gravador) {
        this.lista = new ArrayList<>();
        this.gravador = gravador;
    }

    public void registrarPedido(Pedido p) {
        lista.add(p);
    }

    public double faturamentoTotal() {
        double total = 0;
        for (Pedido p : lista) {
            total += p.calcularPrecoFinal();
        }
        return total;
    }

    public Pedido pedidoMaisCaro() {
        if (lista.isEmpty()) {
            return null;
        }
        Pedido max = lista.get(0);
        for (Pedido p : lista) {
            if (p.calcularPrecoFinal() > max.calcularPrecoFinal()) {
                max = p;
            }
        }
        return max;
    }

    public void gerarRelatorioDiario() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== RELATORIO DIARIO ===\n");
        
        int i = 1;
        for (Pedido p : lista) {
            sb.append("Pedido ").append(i++).append(" - Cliente: ").append(p.getCliente().getNome()).append("\n");
            for (var prato : p.getPratos()) {
                sb.append("  * ").append(prato.getNome()).append(" R$ ").append(prato.calcularPrecoFinal()).append("\n");
            }
            sb.append("  Subtotal: R$ ").append(p.calcularPrecoFinal()).append("\n");
        }
        
        sb.append("Faturamento Total: R$ ").append(faturamentoTotal()).append("\n");
        
        Pedido caro = pedidoMaisCaro();
        if (caro != null) {
            sb.append("Mais caro: ").append(caro.getCliente().getNome()).append(" (R$ ").append(caro.calcularPrecoFinal()).append(")\n");
        }
        
        gravador.gravar(sb.toString());
    }
}
