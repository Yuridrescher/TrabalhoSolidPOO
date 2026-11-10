package saborexpress.servico;

import saborexpress.interfaces.GravadorRelatorio;
import java.io.FileWriter;
import java.io.PrintWriter;

public class GravadorArquivo implements GravadorRelatorio {
    private String arquivo;

    public GravadorArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    @Override
    public void gravar(String texto) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(arquivo));
            pw.println(texto);
            pw.close();
        } catch (Exception e) {
            System.out.println("Erro ao gravar");
        }
    }
}
