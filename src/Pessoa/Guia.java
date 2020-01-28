package Pessoa;

public class Guia extends Pessoa{
    private String identificador;
    private String localidade;
    private String dataDisponivel;
    private String tipoPasseio;
    private String modalidade;
    private Double valor;

    public Guia(String nome, String dataNascimento, String documento, String identificador, String localidade, String dataDisponivel, String tipoPasseio, String modalidade, Double valor) {
        super(nome, dataNascimento, documento);
        this.identificador = identificador;
        this.localidade = localidade;
        this.dataDisponivel = dataDisponivel;
        this.tipoPasseio = tipoPasseio;
        this.modalidade = modalidade;
        this.valor = valor;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getDataDisponivel() {
        return dataDisponivel;
    }

    public String getTipoPasseio() {
        return tipoPasseio;
    }

    public String getModalidade() {
        return modalidade;
    }

    public Double getValor() {
        return valor;
    }
}
