package Pessoa;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private String documento;

    public Pessoa(String nome, String dataNascimento, String documento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public String getDocumento() {
        return documento;
    }
}
