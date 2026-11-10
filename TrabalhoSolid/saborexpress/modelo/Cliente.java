package saborexpress.modelo;

public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;

    public Cliente(String n, String e, String t) {
        if (n == null || n.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = n;
        this.endereco = e;
        this.telefone = t;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }
}
