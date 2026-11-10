package saborexpress.app;

import saborexpress.modelo.*;
import saborexpress.servico.*;
import saborexpress.interfaces.GravadorRelatorio;
import saborexpress.excecao.SaborExpressException;
import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        GravadorRelatorio g = new GravadorConsole();
        ControlePedidos controle = new ControlePedidos(g);

        LocalDate d = LocalDate.now();

        try {
            Cliente c1 = new Cliente("Carlos", "Rua A", "11999999999");
            Cliente c2 = new Cliente("Ana", "Rua B", "11888888888");

            Prato p1 = new PratoExecutivo("Frango Grelhado", 30.0, 15);
            Prato p2 = new Combo("Combo Burger", 50.0, 20);
            Prato p3 = new PratoEspecial("Camarao", 70.0, 30, 25.0);

            Pedido ped1 = new Pedido(c1, d);
            ped1.adicionarPrato(p1);
            ped1.adicionarPrato(p2);

            Pedido ped2 = new Pedido(c2, d);
            ped1.adicionarPrato(p3);
            ped2.adicionarPrato(p3);

            controle.registrarPedido(ped1);
            controle.registrarPedido(ped2);

        } catch (SaborExpressException e) {
            System.out.println("Erro tratado: " + e.getMessage());
        }

        controle.gerarRelatorioDiario();
    }
}
