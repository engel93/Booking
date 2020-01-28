package Pessoa;

public class Viajante extends Pessoa {
    private String identificador;
    private String viagemDestino;
    private String periodoViagem;

    public Viajante(String nome, String dataNascimento, String documento, String identificador, String viagemDestino, String periodoViagem) {
        super(nome, dataNascimento, documento);
        this.identificador = identificador;
        this.viagemDestino = viagemDestino;
        this.periodoViagem = periodoViagem;
    }
}
