package saborexpress.servico;

import saborexpress.interfaces.GravadorRelatorio;

public class GravadorConsole implements GravadorRelatorio {
    @Override
    public void gravar(String texto) {
        System.out.println(texto);
    }
}
